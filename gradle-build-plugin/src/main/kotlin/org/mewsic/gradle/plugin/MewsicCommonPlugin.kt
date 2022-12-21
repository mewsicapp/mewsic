package org.mewsic.gradle.plugin

import com.github.benmanes.gradle.versions.VersionsPlugin
import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import com.github.gmazzo.gradle.plugins.BuildConfigExtension
import com.github.gmazzo.gradle.plugins.BuildConfigPlugin
import com.github.gmazzo.gradle.plugins.generators.BuildConfigKotlinGenerator
import com.martmists.commons.isStable
import com.martmists.commons.martmists
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ExtraPropertiesExtension
import org.gradle.configurationcache.extensions.capitalized
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinMultiplatformPluginWrapper
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlinx.serialization.gradle.SerializationGradleSubplugin
import org.mewsic.gradle.transformedProperty
import java.io.File
import java.util.*

interface MewsicCommonPlugin : Plugin<Project> {
    fun Project.applyCommon() {
        // Apply plugins and properties
        applyPlugins()
        applyProperties(rootProject.file("local.properties"))
        applyFromRoot()

        // Extensions
        setupBuildConfig()
        setupAndroid()
        setupKotlin()

        // Configure tasks
        setTaskDefaults()

        // Repositories
        repositories {
            martmists()
            mavenCentral()
            google()
        }
    }

    fun Project.applyPlugins() {
        apply<KotlinMultiplatformPluginWrapper>()
        apply<SerializationGradleSubplugin>()
        apply<VersionsPlugin>()
        apply<BuildConfigPlugin>()
    }

    private fun Project.applyProperties(file: File) {
        if (!file.exists()) {
            file.createNewFile()
        }

        Properties().also { it.load(file.reader()) }.forEach { (k, v) ->
            project.the<ExtraPropertiesExtension>().set(k.toString(), v)
        }
    }

    private fun Project.applyFromRoot() {
        group = rootProject.group
        version = rootProject.version
        buildDir = rootProject.buildDir.resolve(name)
    }

    fun Project.setupKotlin() {
        configure<KotlinMultiplatformExtension> {
            jvm("desktop")
            android()
            js("browser", IR) {
                browser()
            }

            sourceSets {
                val commonMain by getting
                val jvmMain by creating {
                    dependsOn(commonMain)
                }
                val desktopMain by getting {
                    dependsOn(commonMain)
                }
                val androidMain by getting {
                    dependsOn(commonMain)
                }
            }
        }
    }

    fun Project.setupAndroid()

    private fun Project.setupBuildConfig() {
        val development = isDevelopment()
        val projectName = project.name.removePrefix("${rootProject.name}-")

        configure<BuildConfigExtension> {
            generator(BuildConfigKotlinGenerator())
            className("${projectName.capitalized()}BuildConfig")
            packageName("$group.${projectName.replace('-', '_')}")
            buildConfigField("String", "VERSION", "\"$version\"")
            buildConfigField("String", "GROUP", "\"$group\"")
            buildConfigField("Boolean", "DEVELOPMENT", "$development")
        }
    }

    private fun Project.setTaskDefaults() {
        val development = isDevelopment()

        tasks {
            withType<KotlinCompile> {
                kotlinOptions {
                    jvmTarget = JavaVersion.VERSION_11.toString()
                    if (!development) {
                        freeCompilerArgs += listOf(
                            "-Xno-call-assertions",
                            "-Xno-param-assertions",
                            "-Xno-receiver-assertions",
                        )
                    }
                }
            }

            withType<Kotlin2JsCompile> {
                kotlinOptions {
                    if (!development) {
                        freeCompilerArgs += listOf(
                            "-Xir-minimized-member-names",
                            "-source-map-embed-sources=never",
                        )
                    } else {
                        freeCompilerArgs += listOf(
                            "-source-map-embed-sources=always",
                        )
                    }
                }
            }

            withType<DependencyUpdatesTask> {
                rejectVersionIf {
                    isStable(currentVersion) && !isStable(candidate.version)
                }
            }

            rootProject.tasks.named("prepareKotlinBuildScriptModel") {
                dependsOn(named("generateBuildConfig"))
            }

            named("preBuild") {
                dependsOn(named("clean"))
            }
        }
    }

    fun Project.isDevelopment(): Boolean {
        val development by transformedProperty { it != "false" }
        return development
    }
}