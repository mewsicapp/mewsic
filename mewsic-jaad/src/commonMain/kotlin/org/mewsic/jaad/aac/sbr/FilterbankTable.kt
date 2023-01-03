package org.mewsic.jaad.aac.sbr

internal interface FilterbankTable {
    companion object {
        val qmf_c = floatArrayOf(
            0f, -0.00055252865047f,
            -0.00056176925738f, -0.00049475180896f,
            -0.00048752279712f, -0.00048937912498f,
            -0.00050407143497f, -0.00052265642972f,
            -0.00054665656337f, -0.00056778025613f,
            -0.00058709304852f, -0.00061327473938f,
            -0.00063124935319f, -0.00065403333621f,
            -0.00067776907764f, -0.00069416146273f,
            -0.00071577364744f, -0.00072550431222f,
            -0.00074409418541f, -0.00074905980532f,
            -0.0007681371927f, -0.00077248485949f,
            -0.00078343322877f, -0.00077798694927f,
            -0.000780366471f, -0.00078014496257f,
            -0.0007757977331f, -0.00076307935757f,
            -0.00075300014201f, -0.00073193571525f,
            -0.00072153919876f, -0.00069179375372f,
            -0.00066504150893f, -0.00063415949025f,
            -0.0005946118933f, -0.00055645763906f,
            -0.00051455722108f, -0.00046063254803f,
            -0.00040951214522f, -0.00035011758756f,
            -0.00028969811748f, -0.0002098337344f,
            -0.00014463809349f, -6.173344072E-005f,
            1.349497418E-005f, 0.00010943831274f,
            0.00020430170688f, 0.00029495311041f,
            0.0004026540216f, 0.00051073884952f,
            0.00062393761391f, 0.00074580258865f,
            0.00086084433262f, 0.00098859883015f,
            0.00112501551307f, 0.00125778846475f,
            0.00139024948272f, 0.00154432198471f,
            0.00168680832531f, 0.00183482654224f,
            0.00198411407369f, 0.00214615835557f,
            0.00230172547746f, 0.00246256169126f,
            0.00262017586902f, 0.00278704643465f,
            0.00294694477165f, 0.00311254206525f,
            0.00327396134847f, 0.00344188741828f,
            0.00360082681231f, 0.00376039229104f,
            0.00392074323703f, 0.00408197531935f,
            0.0042264269227f, 0.00437307196781f,
            0.00452098527825f, 0.00466064606118f,
            0.00479325608498f, 0.00491376035745f,
            0.00503930226013f, 0.00514073539032f,
            0.00524611661324f, 0.00534716811982f,
            0.00541967759307f, 0.00548760401507f,
            0.00554757145088f, 0.00559380230045f,
            0.00562206432097f, 0.00564551969164f,
            0.00563891995151f, 0.00562661141932f,
            0.0055917128663f, 0.005540436394f,
            0.0054753783077f, 0.0053838975897f,
            0.00527157587272f, 0.00513822754514f,
            0.00498396877629f, 0.004810946906f,
            0.00460395301471f, 0.00438018617447f,
            0.0041251642327f, 0.00384564081246f,
            0.00354012465507f, 0.00320918858098f,
            0.00284467578623f, 0.00245085400321f,
            0.0020274176185f, 0.00157846825768f,
            0.00109023290512f, 0.0005832264248f,
            2.760451905E-005f, -0.00054642808664f,
            -0.00115681355227f, -0.00180394725893f,
            -0.00248267236449f, -0.003193377839f,
            -0.00394011240522f, -0.004722259624f,
            -0.00553372111088f, -0.00637922932685f,
            -0.00726158168517f, -0.00817982333726f,
            -0.00913253296085f, -0.01011502154986f,
            -0.01113155480321f, -0.01218499959508f,
            0.01327182200351f, 0.01439046660792f,
            0.01554055533423f, 0.01673247129989f,
            0.01794333813443f, 0.01918724313698f,
            0.02045317933555f, 0.02174675502535f,
            0.02306801692862f, 0.02441609920285f,
            0.02578758475467f, 0.02718594296329f,
            0.02860721736385f, 0.03005026574279f,
            0.03150176087389f, 0.03297540810337f,
            0.03446209487686f, 0.03596975605542f,
            0.03748128504252f, 0.03900536794745f,
            0.04053491705584f, 0.04206490946367f,
            0.04360975421304f, 0.04514884056413f,
            0.04668430272642f, 0.04821657200672f,
            0.04973857556014f, 0.05125561555216f,
            0.05276307465207f, 0.05424527683589f,
            0.05571736482138f, 0.05716164501299f,
            0.0585915683626f, 0.05998374801761f,
            0.06134551717207f, 0.06268578081172f,
            0.06397158980681f, 0.0652247106438f,
            0.06643675122104f, 0.06760759851228f,
            0.06870438283512f, 0.06976302447127f,
            0.07076287107266f, 0.07170026731102f,
            0.07256825833083f, 0.07336202550803f,
            0.07410036424342f, 0.07474525581194f,
            0.07531373362019f, 0.07580083586584f,
            0.07619924793396f, 0.07649921704119f,
            0.07670934904245f, 0.07681739756964f,
            0.07682300113923f, 0.07672049241746f,
            0.07650507183194f, 0.07617483218536f,
            0.07573057565061f, 0.0751576255287f,
            0.07446643947564f, 0.0736406005762f,
            0.07267746427299f, 0.07158263647903f,
            0.07035330735093f, 0.06896640131951f,
            0.06745250215166f, 0.06576906686508f,
            0.06394448059633f, 0.06196027790387f,
            0.0598166570809f, 0.05751526919867f,
            0.05504600343009f, 0.05240938217366f,
            0.04959786763445f, 0.04663033051701f,
            0.04347687821958f, 0.04014582784127f,
            0.03664181168133f, 0.03295839306691f,
            0.02908240060125f, 0.02503075618909f,
            0.02079970728622f, 0.01637012582228f,
            0.01176238327857f, 0.00696368621617f,
            0.00197656014503f, -0.00320868968304f,
            -0.00857117491366f, -0.01412888273558f,
            -0.01988341292573f, -0.02582272888064f,
            -0.03195312745332f, -0.03827765720822f,
            -0.04478068215856f, -0.05148041767934f,
            -0.05837053268336f, -0.06544098531359f,
            -0.07269433008129f, -0.08013729344279f,
            -0.08775475365593f, -0.09555333528914f,
            -0.10353295311463f, -0.1116826931773f,
            -0.120007798468f, -0.12850028503878f,
            -0.13715517611934f, -0.1459766491187f,
            -0.15496070710605f, -0.16409588556669f,
            -0.17338081721706f, -0.18281725485142f,
            -0.19239667457267f, -0.20212501768103f,
            -0.21197358538056f, -0.22196526964149f,
            -0.23206908706791f, -0.24230168845974f,
            -0.25264803095722f, -0.26310532994603f,
            -0.27366340405625f, -0.28432141891085f,
            -0.29507167170646f, -0.30590985751916f,
            -0.31682789136456f, -0.32781137272105f,
            -0.33887226938665f, -0.3499914122931f,
            0.36115899031355f, 0.37237955463061f,
            0.38363500139043f, 0.39492117615675f,
            0.40623176767625f, 0.41756968968409f,
            0.42891199207373f, 0.44025537543665f,
            0.45159965356824f, 0.46293080852757f,
            0.47424532146115f, 0.48552530911099f,
            0.49677082545707f, 0.50798175000434f,
            0.51912349702391f, 0.53022408956855f,
            0.54125534487322f, 0.55220512585061f,
            0.5630789140137f, 0.57385241316923f,
            0.58454032354679f, 0.59511230862496f,
            0.6055783538918f, 0.61591099320291f,
            0.62612426956055f, 0.63619801077286f,
            0.64612696959461f, 0.65590163024671f,
            0.66551398801627f, 0.67496631901712f,
            0.68423532934598f, 0.69332823767032f,
            0.70223887193539f, 0.71094104263095f,
            0.71944626349561f, 0.72774489002994f,
            0.73582117582769f, 0.74368278636488f,
            0.75131374561237f, 0.75870807608242f,
            0.76586748650939f, 0.77277808813327f,
            0.77942875190216f, 0.7858353120392f,
            0.79197358416424f, 0.797846641377f,
            0.80344857518505f, 0.80876950044491f,
            0.81381912706217f, 0.81857760046468f,
            0.82304198905409f, 0.8272275347336f,
            0.8311038457152f, 0.83469373618402f,
            0.83797173378865f, 0.84095413924722f,
            0.84362382812005f, 0.84598184698206f,
            0.84803157770763f, 0.84978051984268f,
            0.85119715249343f, 0.85230470352147f,
            0.85310209497017f, 0.85357205739107f,
            0.85373856005937f /*max*/, 0.85357205739107f,
            0.85310209497017f, 0.85230470352147f,
            0.85119715249343f, 0.84978051984268f,
            0.84803157770763f, 0.84598184698206f,
            0.84362382812005f, 0.84095413924722f,
            0.83797173378865f, 0.83469373618402f,
            0.8311038457152f, 0.8272275347336f,
            0.82304198905409f, 0.81857760046468f,
            0.81381912706217f, 0.80876950044491f,
            0.80344857518505f, 0.797846641377f,
            0.79197358416424f, 0.7858353120392f,
            0.77942875190216f, 0.77277808813327f,
            0.76586748650939f, 0.75870807608242f,
            0.75131374561237f, 0.74368278636488f,
            0.73582117582769f, 0.72774489002994f,
            0.71944626349561f, 0.71094104263095f,
            0.70223887193539f, 0.69332823767032f,
            0.68423532934598f, 0.67496631901712f,
            0.66551398801627f, 0.65590163024671f,
            0.64612696959461f, 0.63619801077286f,
            0.62612426956055f, 0.61591099320291f,
            0.6055783538918f, 0.59511230862496f,
            0.58454032354679f, 0.57385241316923f,
            0.5630789140137f, 0.55220512585061f,
            0.54125534487322f, 0.53022408956855f,
            0.51912349702391f, 0.50798175000434f,
            0.49677082545707f, 0.48552530911099f,
            0.47424532146115f, 0.46293080852757f,
            0.45159965356824f, 0.44025537543665f,
            0.42891199207373f, 0.41756968968409f,
            0.40623176767625f, 0.39492117615675f,
            0.38363500139043f, 0.37237955463061f,
            -0.36115899031355f, -0.3499914122931f,
            -0.33887226938665f, -0.32781137272105f,
            -0.31682789136456f, -0.30590985751916f,
            -0.29507167170646f, -0.28432141891085f,
            -0.27366340405625f, -0.26310532994603f,
            -0.25264803095722f, -0.24230168845974f,
            -0.23206908706791f, -0.22196526964149f,
            -0.21197358538056f, -0.20212501768103f,
            -0.19239667457267f, -0.18281725485142f,
            -0.17338081721706f, -0.16409588556669f,
            -0.15496070710605f, -0.1459766491187f,
            -0.13715517611934f, -0.12850028503878f,
            -0.120007798468f, -0.1116826931773f,
            -0.10353295311463f, -0.09555333528914f,
            -0.08775475365593f, -0.08013729344279f,
            -0.07269433008129f, -0.06544098531359f,
            -0.05837053268336f, -0.05148041767934f,
            -0.04478068215856f, -0.03827765720822f,
            -0.03195312745332f, -0.02582272888064f,
            -0.01988341292573f, -0.01412888273558f,
            -0.00857117491366f, -0.00320868968304f,
            0.00197656014503f, 0.00696368621617f,
            0.01176238327857f, 0.01637012582228f,
            0.02079970728622f, 0.02503075618909f,
            0.02908240060125f, 0.03295839306691f,
            0.03664181168133f, 0.04014582784127f,
            0.04347687821958f, 0.04663033051701f,
            0.04959786763445f, 0.05240938217366f,
            0.05504600343009f, 0.05751526919867f,
            0.0598166570809f, 0.06196027790387f,
            0.06394448059633f, 0.06576906686508f,
            0.06745250215166f, 0.06896640131951f,
            0.07035330735093f, 0.07158263647903f,
            0.07267746427299f, 0.0736406005762f,
            0.07446643947564f, 0.0751576255287f,
            0.07573057565061f, 0.07617483218536f,
            0.07650507183194f, 0.07672049241746f,
            0.07682300113923f, 0.07681739756964f,
            0.07670934904245f, 0.07649921704119f,
            0.07619924793396f, 0.07580083586584f,
            0.07531373362019f, 0.07474525581194f,
            0.07410036424342f, 0.07336202550803f,
            0.07256825833083f, 0.07170026731102f,
            0.07076287107266f, 0.06976302447127f,
            0.06870438283512f, 0.06760759851228f,
            0.06643675122104f, 0.0652247106438f,
            0.06397158980681f, 0.06268578081172f,
            0.06134551717207f, 0.05998374801761f,
            0.0585915683626f, 0.05716164501299f,
            0.05571736482138f, 0.05424527683589f,
            0.05276307465207f, 0.05125561555216f,
            0.04973857556014f, 0.04821657200672f,
            0.04668430272642f, 0.04514884056413f,
            0.04360975421304f, 0.04206490946367f,
            0.04053491705584f, 0.03900536794745f,
            0.03748128504252f, 0.03596975605542f,
            0.03446209487686f, 0.03297540810337f,
            0.03150176087389f, 0.03005026574279f,
            0.02860721736385f, 0.02718594296329f,
            0.02578758475467f, 0.02441609920285f,
            0.02306801692862f, 0.02174675502535f,
            0.02045317933555f, 0.01918724313698f,
            0.01794333813443f, 0.01673247129989f,
            0.01554055533423f, 0.01439046660792f,
            -0.01327182200351f, -0.01218499959508f,
            -0.01113155480321f, -0.01011502154986f,
            -0.00913253296085f, -0.00817982333726f,
            -0.00726158168517f, -0.00637922932685f,
            -0.00553372111088f, -0.004722259624f,
            -0.00394011240522f, -0.003193377839f,
            -0.00248267236449f, -0.00180394725893f,
            -0.00115681355227f, -0.00054642808664f,
            2.760451905E-005f, 0.0005832264248f,
            0.00109023290512f, 0.00157846825768f,
            0.0020274176185f, 0.00245085400321f,
            0.00284467578623f, 0.00320918858098f,
            0.00354012465507f, 0.00384564081246f,
            0.0041251642327f, 0.00438018617447f,
            0.00460395301471f, 0.004810946906f,
            0.00498396877629f, 0.00513822754514f,
            0.00527157587272f, 0.0053838975897f,
            0.0054753783077f, 0.005540436394f,
            0.0055917128663f, 0.00562661141932f,
            0.00563891995151f, 0.00564551969164f,
            0.00562206432097f, 0.00559380230045f,
            0.00554757145088f, 0.00548760401507f,
            0.00541967759307f, 0.00534716811982f,
            0.00524611661324f, 0.00514073539032f,
            0.00503930226013f, 0.00491376035745f,
            0.00479325608498f, 0.00466064606118f,
            0.00452098527825f, 0.00437307196781f,
            0.0042264269227f, 0.00408197531935f,
            0.00392074323703f, 0.00376039229104f,
            0.00360082681231f, 0.00344188741828f,
            0.00327396134847f, 0.00311254206525f,
            0.00294694477165f, 0.00278704643465f,
            0.00262017586902f, 0.00246256169126f,
            0.00230172547746f, 0.00214615835557f,
            0.00198411407369f, 0.00183482654224f,
            0.00168680832531f, 0.00154432198471f,
            0.00139024948272f, 0.00125778846475f,
            0.00112501551307f, 0.00098859883015f,
            0.00086084433262f, 0.00074580258865f,
            0.00062393761391f, 0.00051073884952f,
            0.0004026540216f, 0.00029495311041f,
            0.00020430170688f, 0.00010943831274f,
            1.349497418E-005f, -6.173344072E-005f,
            -0.00014463809349f, -0.0002098337344f,
            -0.00028969811748f, -0.00035011758756f,
            -0.00040951214522f, -0.00046063254803f,
            -0.00051455722108f, -0.00055645763906f,
            -0.0005946118933f, -0.00063415949025f,
            -0.00066504150893f, -0.00069179375372f,
            -0.00072153919876f, -0.00073193571525f,
            -0.00075300014201f, -0.00076307935757f,
            -0.0007757977331f, -0.00078014496257f,
            -0.000780366471f, -0.00077798694927f,
            -0.00078343322877f, -0.00077248485949f,
            -0.0007681371927f, -0.00074905980532f,
            -0.00074409418541f, -0.00072550431222f,
            -0.00071577364744f, -0.00069416146273f,
            -0.00067776907764f, -0.00065403333621f,
            -0.00063124935319f, -0.00061327473938f,
            -0.00058709304852f, -0.00056778025613f,
            -0.00054665656337f, -0.00052265642972f,
            -0.00050407143497f, -0.00048937912498f,
            -0.00048752279712f, -0.00049475180896f,
            -0.00056176925738f, -0.00055252865047f
        )
    }
}
