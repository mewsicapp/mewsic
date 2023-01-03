package net.sourceforge.jaad.aac.sbr
import org.mewsic.commons.lang.Arrays

import org.mewsic.commons.streams.api.OutputStream
import org.mewsic.commons.streams.api.InputStream
internal interface NoiseTable {
    companion object {
        /* Table 1.A.13 Noise table V */
        val NOISE_TABLE = arrayOf(
            floatArrayOf(-0.99948155879974f, -0.59483414888382f),
            floatArrayOf(0.97113454341888f, -0.67528516054153f),
            floatArrayOf(0.14130051434040f, -0.95090985298157f),
            floatArrayOf(-0.47005495429039f, -0.37340548634529f),
            floatArrayOf(0.80705064535141f, 0.29653668403625f),
            floatArrayOf(-0.38981479406357f, 0.89572608470917f),
            floatArrayOf(-0.01053049881011f, -0.66959059238434f),
            floatArrayOf(-0.91266369819641f, -0.11522938311100f),
            floatArrayOf(0.54840421676636f, 0.75221365690231f),
            floatArrayOf(0.40009254217148f, -0.98929399251938f),
            floatArrayOf(-0.99867975711823f, -0.88147068023682f),
            floatArrayOf(-0.95531076192856f, 0.90908759832382f),
            floatArrayOf(-0.45725932717323f, -0.56716322898865f),
            floatArrayOf(-0.72929674386978f, -0.98008275032043f),
            floatArrayOf(0.75622802972794f, 0.20950329303741f),
            floatArrayOf(0.07069442421198f, -0.78247898817062f),
            floatArrayOf(0.74496251344681f, -0.91169005632401f),
            floatArrayOf(-0.96440184116364f, -0.94739919900894f),
            floatArrayOf(0.30424630641937f, -0.49438267946243f),
            floatArrayOf(0.66565030813217f, 0.64652937650681f),
            floatArrayOf(0.91697007417679f, 0.17514097690582f),
            floatArrayOf(-0.70774918794632f, 0.52548652887344f),
            floatArrayOf(-0.70051413774490f, -0.45340028405190f),
            floatArrayOf(-0.99496513605118f, -0.90071910619736f),
            floatArrayOf(0.98164492845535f, -0.77463155984879f),
            floatArrayOf(-0.54671579599380f, -0.02570928446949f),
            floatArrayOf(-0.01689629070461f, 0.00287506449968f),
            floatArrayOf(-0.86110347509384f, 0.42548584938049f),
            floatArrayOf(-0.98892980813980f, -0.87881129980087f),
            floatArrayOf(0.51756626367569f, 0.66926783323288f),
            floatArrayOf(-0.99635028839111f, -0.58107727766037f),
            floatArrayOf(-0.99969369173050f, 0.98369991779327f),
            floatArrayOf(0.55266261100769f, 0.59449058771133f),
            floatArrayOf(0.34581178426743f, 0.94879418611526f),
            floatArrayOf(0.62664210796356f, -0.74402970075607f),
            floatArrayOf(-0.77149701118469f, -0.33883658051491f),
            floatArrayOf(-0.91592246294022f, 0.03687901422381f),
            floatArrayOf(-0.76285493373871f, -0.91371870040894f),
            floatArrayOf(0.79788339138031f, -0.93180972337723f),
            floatArrayOf(0.54473078250885f, -0.11919206380844f),
            floatArrayOf(-0.85639280080795f, 0.42429855465889f),
            floatArrayOf(-0.92882400751114f, 0.27871808409691f),
            floatArrayOf(-0.11708371341228f, -0.99800843000412f),
            floatArrayOf(0.21356749534607f, -0.90716296434402f),
            floatArrayOf(-0.76191693544388f, 0.99768120050430f),
            floatArrayOf(0.98111045360565f, -0.95854461193085f),
            floatArrayOf(-0.85913270711899f, 0.95766568183899f),
            floatArrayOf(-0.93307244777679f, 0.49431759119034f),
            floatArrayOf(0.30485755205154f, -0.70540034770966f),
            floatArrayOf(0.85289651155472f, 0.46766132116318f),
            floatArrayOf(0.91328084468842f, -0.99839597940445f),
            floatArrayOf(-0.05890199914575f, 0.70741826295853f),
            floatArrayOf(0.28398686647415f, 0.34633556008339f),
            floatArrayOf(0.95258164405823f, -0.54893416166306f),
            floatArrayOf(-0.78566324710846f, -0.75568538904190f),
            floatArrayOf(-0.95789498090744f, -0.20423194766045f),
            floatArrayOf(0.82411158084869f, 0.96654617786407f),
            floatArrayOf(-0.65185445547104f, -0.88734990358353f),
            floatArrayOf(-0.93643605709076f, 0.99870789051056f),
            floatArrayOf(0.91427159309387f, -0.98290503025055f),
            floatArrayOf(-0.70395684242249f, 0.58796799182892f),
            floatArrayOf(0.00563771976158f, 0.61768198013306f),
            floatArrayOf(0.89065051078796f, 0.52783352136612f),
            floatArrayOf(-0.68683707714081f, 0.80806946754456f),
            floatArrayOf(0.72165340185165f, -0.69259858131409f),
            floatArrayOf(-0.62928247451782f, 0.13627037405968f),
            floatArrayOf(0.29938435554504f, -0.46051329374313f),
            floatArrayOf(-0.91781955957413f, -0.74012714624405f),
            floatArrayOf(0.99298715591431f, 0.40816611051559f),
            floatArrayOf(0.82368296384811f, -0.74036049842834f),
            floatArrayOf(-0.98512834310532f, -0.99972331523895f),
            floatArrayOf(-0.95915371179581f, -0.99237799644470f),
            floatArrayOf(-0.21411126852036f, -0.93424820899963f),
            floatArrayOf(-0.68821477890015f, -0.26892307400703f),
            floatArrayOf(0.91851997375488f, 0.09358228743076f),
            floatArrayOf(-0.96062767505646f, 0.36099094152451f),
            floatArrayOf(0.51646184921265f, -0.71373331546783f),
            floatArrayOf(0.61130720376968f, 0.46950140595436f),
            floatArrayOf(0.47336128354073f, -0.27333179116249f),
            floatArrayOf(0.90998309850693f, 0.96715664863586f),
            floatArrayOf(0.44844800233841f, 0.99211573600769f),
            floatArrayOf(0.66614890098572f, 0.96590173244476f),
            floatArrayOf(0.74922239780426f, -0.89879858493805f),
            floatArrayOf(-0.99571585655212f, 0.52785521745682f),
            floatArrayOf(0.97401082515717f, -0.16855870187283f),
            floatArrayOf(0.72683745622635f, -0.48060774803162f),
            floatArrayOf(0.95432192087173f, 0.68849605321884f),
            floatArrayOf(-0.72962206602097f, -0.76608443260193f),
            floatArrayOf(-0.85359477996826f, 0.88738125562668f),
            floatArrayOf(-0.81412428617477f, -0.97480767965317f),
            floatArrayOf(-0.87930774688721f, 0.74748307466507f),
            floatArrayOf(-0.71573328971863f, -0.98570609092712f),
            floatArrayOf(0.83524298667908f, 0.83702534437180f),
            floatArrayOf(-0.48086065053940f, -0.98848503828049f),
            floatArrayOf(0.97139126062393f, 0.80093622207642f),
            floatArrayOf(0.51992827653885f, 0.80247628688812f),
            floatArrayOf(-0.00848591234535f, -0.76670128107071f),
            floatArrayOf(-0.70294374227524f, 0.55359911918640f),
            floatArrayOf(-0.95894426107407f, -0.43265503644943f),
            floatArrayOf(0.97079253196716f, 0.09325857460499f),
            floatArrayOf(-0.92404294013977f, 0.85507702827454f),
            floatArrayOf(-0.69506472349167f, 0.98633414506912f),
            floatArrayOf(0.26559203863144f, 0.73314309120178f),
            floatArrayOf(0.28038442134857f, 0.14537914097309f),
            floatArrayOf(-0.74138122797012f, 0.99310338497162f),
            floatArrayOf(-0.01752796024084f, -0.82616633176804f),
            floatArrayOf(-0.55126774311066f, -0.98898541927338f),
            floatArrayOf(0.97960901260376f, -0.94021445512772f),
            floatArrayOf(-0.99196308851242f, 0.67019015550613f),
            floatArrayOf(-0.67684930562973f, 0.12631492316723f),
            floatArrayOf(0.09140039235353f, -0.20537731051445f),
            floatArrayOf(-0.71658962965012f, -0.97788202762604f),
            floatArrayOf(0.81014639139175f, 0.53722649812698f),
            floatArrayOf(0.40616992115974f, -0.26469007134438f),
            floatArrayOf(-0.67680186033249f, 0.94502049684525f),
            floatArrayOf(0.86849772930145f, -0.18333598971367f),
            floatArrayOf(-0.99500381946564f, -0.02634122036397f),
            floatArrayOf(0.84329187870026f, 0.10406957566738f),
            floatArrayOf(-0.09215968847275f, 0.69540011882782f),
            floatArrayOf(0.99956172704697f, -0.12358541786671f),
            floatArrayOf(-0.79732781648636f, -0.91582524776459f),
            floatArrayOf(0.96349972486496f, 0.96640455722809f),
            floatArrayOf(-0.79942780733109f, 0.64323902130127f),
            floatArrayOf(-0.11566039919853f, 0.28587844967842f),
            floatArrayOf(-0.39922955632210f, 0.94129604101181f),
            floatArrayOf(0.99089199304581f, -0.92062628269196f),
            floatArrayOf(0.28631284832954f, -0.91035044193268f),
            floatArrayOf(-0.83302724361420f, -0.67330408096313f),
            floatArrayOf(0.95404446125031f, 0.49162766337395f),
            floatArrayOf(-0.06449863314629f, 0.03250560909510f),
            floatArrayOf(-0.99575054645538f, 0.42389783263206f),
            floatArrayOf(-0.65501141548157f, 0.82546114921570f),
            floatArrayOf(-0.81254440546036f, -0.51627236604691f),
            floatArrayOf(-0.99646371603012f, 0.84490531682968f),
            floatArrayOf(0.00287840608507f, 0.64768260717392f),
            floatArrayOf(0.70176988840103f, -0.20453028380871f),
            floatArrayOf(0.96361881494522f, 0.40706968307495f),
            floatArrayOf(-0.68883758783340f, 0.91338956356049f),
            floatArrayOf(-0.34875586628914f, 0.71472293138504f),
            floatArrayOf(0.91980081796646f, 0.66507452726364f),
            floatArrayOf(-0.99009048938751f, 0.85868018865585f),
            floatArrayOf(0.68865793943405f, 0.55660319328308f),
            floatArrayOf(-0.99484401941299f, -0.20052559673786f),
            floatArrayOf(0.94214510917664f, -0.99696427583694f),
            floatArrayOf(-0.67414629459381f, 0.49548220634460f),
            floatArrayOf(-0.47339352965355f, -0.85904330015182f),
            floatArrayOf(0.14323651790619f, -0.94145596027374f),
            floatArrayOf(-0.29268294572830f, 0.05759225040674f),
            floatArrayOf(0.43793860077858f, -0.78904968500137f),
            floatArrayOf(-0.36345127224922f, 0.64874434471130f),
            floatArrayOf(-0.08750604838133f, 0.97686946392059f),
            floatArrayOf(-0.96495270729065f, -0.53960305452347f),
            floatArrayOf(0.55526942014694f, 0.78891521692276f),
            floatArrayOf(0.73538213968277f, 0.96452075242996f),
            floatArrayOf(-0.30889773368835f, -0.80664390325546f),
            floatArrayOf(0.03574995696545f, -0.97325617074966f),
            floatArrayOf(0.98720687627792f, 0.48409134149551f),
            floatArrayOf(-0.81689298152924f, -0.90827703475952f),
            floatArrayOf(0.67866861820221f, 0.81284505128860f),
            floatArrayOf(-0.15808570384979f, 0.85279554128647f),
            floatArrayOf(0.80723392963409f, -0.24717418849468f),
            floatArrayOf(0.47788757085800f, -0.46333149075508f),
            floatArrayOf(0.96367555856705f, 0.38486748933792f),
            floatArrayOf(-0.99143874645233f, -0.24945276975632f),
            floatArrayOf(0.83081877231598f, -0.94780850410461f),
            floatArrayOf(-0.58753192424774f, 0.01290772389621f),
            floatArrayOf(0.95538109540939f, -0.85557049512863f),
            floatArrayOf(-0.96490919589996f, -0.64020973443985f),
            floatArrayOf(-0.97327101230621f, 0.12378127872944f),
            floatArrayOf(0.91400367021561f, 0.57972472906113f),
            floatArrayOf(-0.99925839900970f, 0.71084845066071f),
            floatArrayOf(-0.86875903606415f, -0.20291699469090f),
            floatArrayOf(-0.26240035891533f, -0.68264555931091f),
            floatArrayOf(-0.24664412438869f, -0.87642270326614f),
            floatArrayOf(0.02416275814176f, 0.27192914485931f),
            floatArrayOf(0.82068622112274f, -0.85087788105011f),
            floatArrayOf(0.88547372817993f, -0.89636802673340f),
            floatArrayOf(-0.18173077702522f, -0.26152145862579f),
            floatArrayOf(0.09355476498604f, 0.54845124483109f),
            floatArrayOf(-0.54668414592743f, 0.95980775356293f),
            floatArrayOf(0.37050989270210f, -0.59910142421722f),
            floatArrayOf(-0.70373594760895f, 0.91227668523788f),
            floatArrayOf(-0.34600785374641f, -0.99441426992416f),
            floatArrayOf(-0.68774479627609f, -0.30238837003708f),
            floatArrayOf(-0.26843291521072f, 0.83115667104721f),
            floatArrayOf(0.49072334170341f, -0.45359709858894f),
            floatArrayOf(0.38975992798805f, 0.95515358448029f),
            floatArrayOf(-0.97757124900818f, 0.05305894464254f),
            floatArrayOf(-0.17325553297997f, -0.92770671844482f),
            floatArrayOf(0.99948036670685f, 0.58285546302795f),
            floatArrayOf(-0.64946246147156f, 0.68645507097244f),
            floatArrayOf(-0.12016920745373f, -0.57147324085236f),
            floatArrayOf(-0.58947455883026f, -0.34847131371498f),
            floatArrayOf(-0.41815140843391f, 0.16276422142982f),
            floatArrayOf(0.99885648488998f, 0.11136095225811f),
            floatArrayOf(-0.56649613380432f, -0.90494865179062f),
            floatArrayOf(0.94138020277023f, 0.35281917452812f),
            floatArrayOf(-0.75725078582764f, 0.53650552034378f),
            floatArrayOf(0.20541973412037f, -0.94435143470764f),
            floatArrayOf(0.99980372190475f, 0.79835915565491f),
            floatArrayOf(0.29078277945518f, 0.35393777489662f),
            floatArrayOf(-0.62858772277832f, 0.38765692710876f),
            floatArrayOf(0.43440905213356f, -0.98546332120895f),
            floatArrayOf(-0.98298585414886f, 0.21021524071693f),
            floatArrayOf(0.19513028860092f, -0.94239830970764f),
            floatArrayOf(-0.95476663112640f, 0.98364555835724f),
            floatArrayOf(0.93379634618759f, -0.70881992578506f),
            floatArrayOf(-0.85235410928726f, -0.08342348039150f),
            floatArrayOf(-0.86425095796585f, -0.45795026421547f),
            floatArrayOf(0.38879778981209f, 0.97274428606033f),
            floatArrayOf(0.92045122385025f, -0.62433654069901f),
            floatArrayOf(0.89162534475327f, 0.54950958490372f),
            floatArrayOf(-0.36834338307381f, 0.96458297967911f),
            floatArrayOf(0.93891763687134f, -0.89968353509903f),
            floatArrayOf(0.99267655611038f, -0.03757034242153f),
            floatArrayOf(-0.94063472747803f, 0.41332337260246f),
            floatArrayOf(0.99740225076675f, -0.16830494999886f),
            floatArrayOf(-0.35899412631989f, -0.46633225679398f),
            floatArrayOf(0.05237237364054f, -0.25640362501144f),
            floatArrayOf(0.36703583598137f, -0.38653266429901f),
            floatArrayOf(0.91653180122375f, -0.30587628483772f),
            floatArrayOf(0.69000804424286f, 0.90952169895172f),
            floatArrayOf(-0.38658750057220f, 0.99501574039459f),
            floatArrayOf(-0.29250815510750f, 0.37444993853569f),
            floatArrayOf(-0.60182201862335f, 0.86779648065567f),
            floatArrayOf(-0.97418588399887f, 0.96468526124954f),
            floatArrayOf(0.88461571931839f, 0.57508403062820f),
            floatArrayOf(0.05198933184147f, 0.21269661188126f),
            floatArrayOf(-0.53499621152878f, 0.97241556644440f),
            floatArrayOf(-0.49429559707642f, 0.98183864355087f),
            floatArrayOf(-0.98935145139694f, -0.40249159932137f),
            floatArrayOf(-0.98081380128860f, -0.72856897115707f),
            floatArrayOf(-0.27338150143623f, 0.99950921535492f),
            floatArrayOf(0.06310802698135f, -0.54539585113525f),
            floatArrayOf(-0.20461677014828f, -0.14209978282452f),
            floatArrayOf(0.66223841905594f, 0.72528582811356f),
            floatArrayOf(-0.84764343500137f, 0.02372316829860f),
            floatArrayOf(-0.89039862155914f, 0.88866579532623f),
            floatArrayOf(0.95903307199478f, 0.76744925975800f),
            floatArrayOf(0.73504126071930f, -0.03747203201056f),
            floatArrayOf(-0.31744435429573f, -0.36834111809731f),
            floatArrayOf(-0.34110826253891f, 0.40211221575737f),
            floatArrayOf(0.47803884744644f, -0.39423218369484f),
            floatArrayOf(0.98299193382263f, 0.01989791356027f),
            floatArrayOf(-0.30963072180748f, -0.18076720833778f),
            floatArrayOf(0.99992591142654f, -0.26281872391701f),
            floatArrayOf(-0.93149733543396f, -0.98313164710999f),
            floatArrayOf(0.99923473596573f, -0.80142992734909f),
            floatArrayOf(-0.26024168729782f, -0.75999760627747f),
            floatArrayOf(-0.35712513327599f, 0.19298963248730f),
            floatArrayOf(-0.99899083375931f, 0.74645155668259f),
            floatArrayOf(0.86557173728943f, 0.55593866109848f),
            floatArrayOf(0.33408042788506f, 0.86185956001282f),
            floatArrayOf(0.99010735750198f, 0.04602397605777f),
            floatArrayOf(-0.66694271564484f, -0.91643613576889f),
            floatArrayOf(0.64016789197922f, 0.15649530291557f),
            floatArrayOf(0.99570536613464f, 0.45844584703445f),
            floatArrayOf(-0.63431465625763f, 0.21079117059708f),
            floatArrayOf(-0.07706847041845f, -0.89581435918808f),
            floatArrayOf(0.98590087890625f, 0.88241720199585f),
            floatArrayOf(0.80099332332611f, -0.36851897835732f),
            floatArrayOf(0.78368133306503f, 0.45506998896599f),
            floatArrayOf(0.08707806468010f, 0.80938994884491f),
            floatArrayOf(-0.86811882257462f, 0.39347308874130f),
            floatArrayOf(-0.39466530084610f, -0.66809433698654f),
            floatArrayOf(0.97875326871872f, -0.72467839717865f),
            floatArrayOf(-0.95038563013077f, 0.89563220739365f),
            floatArrayOf(0.17005239427090f, 0.54683053493500f),
            floatArrayOf(-0.76910793781281f, -0.96226614713669f),
            floatArrayOf(0.99743282794952f, 0.42697158455849f),
            floatArrayOf(0.95437383651733f, 0.97002321481705f),
            floatArrayOf(0.99578905105591f, -0.54106825590134f),
            floatArrayOf(0.28058260679245f, -0.85361421108246f),
            floatArrayOf(0.85256522893906f, -0.64567607641220f),
            floatArrayOf(-0.50608539581299f, -0.65846014022827f),
            floatArrayOf(-0.97210735082626f, -0.23095212876797f),
            floatArrayOf(0.95424050092697f, -0.99240148067474f),
            floatArrayOf(-0.96926569938660f, 0.73775655031204f),
            floatArrayOf(0.30872163176537f, 0.41514959931374f),
            floatArrayOf(-0.24523839354515f, 0.63206630945206f),
            floatArrayOf(-0.33813264966011f, -0.38661777973175f),
            floatArrayOf(-0.05826828256249f, -0.06940773874521f),
            floatArrayOf(-0.22898460924625f, 0.97054851055145f),
            floatArrayOf(-0.18509915471077f, 0.47565764188766f),
            floatArrayOf(-0.10488238185644f, -0.87769949436188f),
            floatArrayOf(-0.71886587142944f, 0.78030979633331f),
            floatArrayOf(0.99793875217438f, 0.90041309595108f),
            floatArrayOf(0.57563304901123f, -0.91034334897995f),
            floatArrayOf(0.28909647464752f, 0.96307784318924f),
            floatArrayOf(0.42188999056816f, 0.48148649930954f),
            floatArrayOf(0.93335050344467f, -0.43537023663521f),
            floatArrayOf(-0.97087377309799f, 0.86636447906494f),
            floatArrayOf(0.36722871661186f, 0.65291655063629f),
            floatArrayOf(-0.81093025207520f, 0.08778370171785f),
            floatArrayOf(-0.26240602135658f, -0.92774093151093f),
            floatArrayOf(0.83996498584747f, 0.55839848518372f),
            floatArrayOf(-0.99909615516663f, -0.96024608612061f),
            floatArrayOf(0.74649465084076f, 0.12144893407822f),
            floatArrayOf(-0.74774593114853f, -0.26898062229156f),
            floatArrayOf(0.95781666040421f, -0.79047924280167f),
            floatArrayOf(0.95472306013107f, -0.08588775992393f),
            floatArrayOf(0.48708331584930f, 0.99999040365219f),
            floatArrayOf(0.46332037448883f, 0.10964126139879f),
            floatArrayOf(-0.76497006416321f, 0.89210927486420f),
            floatArrayOf(0.57397389411926f, 0.35289704799652f),
            floatArrayOf(0.75374317169189f, 0.96705216169357f),
            floatArrayOf(-0.59174400568008f, -0.89405369758606f),
            floatArrayOf(0.75087904930115f, -0.29612672328949f),
            floatArrayOf(-0.98607856035233f, 0.25034910440445f),
            floatArrayOf(-0.40761056542397f, -0.90045571327209f),
            floatArrayOf(0.66929268836975f, 0.98629492521286f),
            floatArrayOf(-0.97463697195053f, -0.00190223299433f),
            floatArrayOf(0.90145510435104f, 0.99781388044357f),
            floatArrayOf(-0.87259286642075f, 0.99233585596085f),
            floatArrayOf(-0.91529458761215f, -0.15698707103729f),
            floatArrayOf(-0.03305738791823f, -0.37205263972282f),
            floatArrayOf(0.07223051041365f, -0.88805001974106f),
            floatArrayOf(0.99498009681702f, 0.97094357013702f),
            floatArrayOf(-0.74904936552048f, 0.99985486268997f),
            floatArrayOf(0.04585228487849f, 0.99812334775925f),
            floatArrayOf(-0.89054954051971f, -0.31791913509369f),
            floatArrayOf(-0.83782142400742f, 0.97637635469437f),
            floatArrayOf(0.33454805612564f, -0.86231517791748f),
            floatArrayOf(-0.99707579612732f, 0.93237990140915f),
            floatArrayOf(-0.22827528417110f, 0.18874759972095f),
            floatArrayOf(0.67248046398163f, -0.03646211326122f),
            floatArrayOf(-0.05146538093686f, -0.92599701881409f),
            floatArrayOf(0.99947297573090f, 0.93625229597092f),
            floatArrayOf(0.66951125860214f, 0.98905825614929f),
            floatArrayOf(-0.99602955579758f, -0.44654715061188f),
            floatArrayOf(0.82104903459549f, 0.99540740251541f),
            floatArrayOf(0.99186509847641f, 0.72022998332977f),
            floatArrayOf(-0.65284591913223f, 0.52186721563339f),
            floatArrayOf(0.93885445594788f, -0.74895310401917f),
            floatArrayOf(0.96735250949860f, 0.90891814231873f),
            floatArrayOf(-0.22225968539715f, 0.57124030590057f),
            floatArrayOf(-0.44132784008980f, -0.92688840627670f),
            floatArrayOf(-0.85694974660873f, 0.88844531774521f),
            floatArrayOf(0.91783040761948f, -0.46356892585754f),
            floatArrayOf(0.72556972503662f, -0.99899554252625f),
            floatArrayOf(-0.99711579084396f, 0.58211559057236f),
            floatArrayOf(0.77638977766037f, 0.94321835041046f),
            floatArrayOf(0.07717324048281f, 0.58638399839401f),
            floatArrayOf(-0.56049829721451f, 0.82522302865982f),
            floatArrayOf(0.98398894071579f, 0.39467439055443f),
            floatArrayOf(0.47546947002411f, 0.68613046407700f),
            floatArrayOf(0.65675091743469f, 0.18331636488438f),
            floatArrayOf(0.03273375332355f, -0.74933111667633f),
            floatArrayOf(-0.38684144616127f, 0.51337349414825f),
            floatArrayOf(-0.97346270084381f, -0.96549361944199f),
            floatArrayOf(-0.53282153606415f, -0.91423267126083f),
            floatArrayOf(0.99817311763763f, 0.61133575439453f),
            floatArrayOf(-0.50254499912262f, -0.88829338550568f),
            floatArrayOf(0.01995873264968f, 0.85223513841629f),
            floatArrayOf(0.99930381774902f, 0.94578897953033f),
            floatArrayOf(0.82907766103745f, -0.06323442608118f),
            floatArrayOf(-0.58660709857941f, 0.96840775012970f),
            floatArrayOf(-0.17573736608028f, -0.48166921734810f),
            floatArrayOf(0.83434289693832f, -0.13023450970650f),
            floatArrayOf(0.05946491286159f, 0.20511047542095f),
            floatArrayOf(0.81505483388901f, -0.94685947895050f),
            floatArrayOf(-0.44976380467415f, 0.40894573926926f),
            floatArrayOf(-0.89746475219727f, 0.99846577644348f),
            floatArrayOf(0.39677256345749f, -0.74854665994644f),
            floatArrayOf(-0.07588948309422f, 0.74096214771271f),
            floatArrayOf(0.76343196630478f, 0.41746628284454f),
            floatArrayOf(-0.74490106105804f, 0.94725912809372f),
            floatArrayOf(0.64880120754242f, 0.41336661577225f),
            floatArrayOf(0.62319535017014f, -0.93098312616348f),
            floatArrayOf(0.42215818166733f, -0.07712787389755f),
            floatArrayOf(0.02704554051161f, -0.05417517945170f),
            floatArrayOf(0.80001771450043f, 0.91542196273804f),
            floatArrayOf(-0.79351830482483f, -0.36208897829056f),
            floatArrayOf(0.63872361183167f, 0.08128252625465f),
            floatArrayOf(0.52890521287918f, 0.60048872232437f),
            floatArrayOf(0.74238550662994f, 0.04491915181279f),
            floatArrayOf(0.99096131324768f, -0.19451183080673f),
            floatArrayOf(-0.80412328243256f, -0.88513815402985f),
            floatArrayOf(-0.64612615108490f, 0.72198677062988f),
            floatArrayOf(0.11657770723104f, -0.83662831783295f),
            floatArrayOf(-0.95053184032440f, -0.96939903497696f),
            floatArrayOf(-0.62228870391846f, 0.82767260074615f),
            floatArrayOf(0.03004475869238f, -0.99738895893097f),
            floatArrayOf(-0.97987216711044f, 0.36526128649712f),
            floatArrayOf(-0.99986982345581f, -0.36021611094475f),
            floatArrayOf(0.89110648632050f, -0.97894251346588f),
            floatArrayOf(0.10407960414886f, 0.77357792854309f),
            floatArrayOf(0.95964735746384f, -0.35435819625854f),
            floatArrayOf(0.50843232870102f, 0.96107691526413f),
            floatArrayOf(0.17006334662437f, -0.76854026317596f),
            floatArrayOf(0.25872674584389f, 0.99893301725388f),
            floatArrayOf(-0.01115998718888f, 0.98496019840240f),
            floatArrayOf(-0.79598701000214f, 0.97138410806656f),
            floatArrayOf(-0.99264711141586f, -0.99542820453644f),
            floatArrayOf(-0.99829661846161f, 0.01877138763666f),
            floatArrayOf(-0.70801013708115f, 0.33680686354637f),
            floatArrayOf(-0.70467054843903f, 0.93272775411606f),
            floatArrayOf(0.99846023321152f, -0.98725748062134f),
            floatArrayOf(-0.63364970684052f, -0.16473594307899f),
            floatArrayOf(-0.16258217394352f, -0.95939123630524f),
            floatArrayOf(-0.43645593523979f, -0.94805032014847f),
            floatArrayOf(-0.99848473072052f, 0.96245169639587f),
            floatArrayOf(-0.16796459257603f, -0.98987513780594f),
            floatArrayOf(-0.87979227304459f, -0.71725726127625f),
            floatArrayOf(0.44183099269867f, -0.93568974733353f),
            floatArrayOf(0.93310177326202f, -0.99913311004639f),
            floatArrayOf(-0.93941932916641f, -0.56409376859665f),
            floatArrayOf(-0.88590002059937f, 0.47624599933624f),
            floatArrayOf(0.99971461296082f, -0.83889955282211f),
            floatArrayOf(-0.75376385450363f, 0.00814643409103f),
            floatArrayOf(0.93887686729431f, -0.11284527927637f),
            floatArrayOf(0.85126435756683f, 0.52349251508713f),
            floatArrayOf(0.39701420068741f, 0.81779634952545f),
            floatArrayOf(-0.37024465203285f, -0.87071657180786f),
            floatArrayOf(-0.36024826765060f, 0.34655734896660f),
            floatArrayOf(-0.93388813734055f, -0.84476542472839f),
            floatArrayOf(-0.65298801660538f, -0.18439576029778f),
            floatArrayOf(0.11960318684578f, 0.99899345636368f),
            floatArrayOf(0.94292563199997f, 0.83163905143738f),
            floatArrayOf(0.75081145763397f, -0.35533222556114f),
            floatArrayOf(0.56721979379654f, -0.24076835811138f),
            floatArrayOf(0.46857765316963f, -0.30140233039856f),
            floatArrayOf(0.97312313318253f, -0.99548190832138f),
            floatArrayOf(-0.38299977779388f, 0.98516911268234f),
            floatArrayOf(0.41025799512863f, 0.02116736955941f),
            floatArrayOf(0.09638062119484f, 0.04411984235048f),
            floatArrayOf(-0.85283249616623f, 0.91475564241409f),
            floatArrayOf(0.88866806030273f, -0.99735265970230f),
            floatArrayOf(-0.48202428221703f, -0.96805608272552f),
            floatArrayOf(0.27572581171989f, 0.58634752035141f),
            floatArrayOf(-0.65889132022858f, 0.58835631608963f),
            floatArrayOf(0.98838084936142f, 0.99994349479675f),
            floatArrayOf(-0.20651349425316f, 0.54593044519424f),
            floatArrayOf(-0.62126415967941f, -0.59893679618835f),
            floatArrayOf(0.20320105552673f, -0.86879181861877f),
            floatArrayOf(-0.97790551185608f, 0.96290808916092f),
            floatArrayOf(0.11112534999847f, 0.21484763920307f),
            floatArrayOf(-0.41368338465691f, 0.28216838836670f),
            floatArrayOf(0.24133038520813f, 0.51294362545013f),
            floatArrayOf(-0.66393411159515f, -0.08249679952860f),
            floatArrayOf(-0.53697830438614f, -0.97649902105331f),
            floatArrayOf(-0.97224736213684f, 0.22081333398819f),
            floatArrayOf(0.87392479181290f, -0.12796173989773f),
            floatArrayOf(0.19050361216068f, 0.01602615416050f),
            floatArrayOf(-0.46353441476822f, -0.95249038934708f),
            floatArrayOf(-0.07064096629620f, -0.94479805231094f),
            floatArrayOf(-0.92444086074829f, -0.10457590222359f),
            floatArrayOf(-0.83822596073151f, -0.01695043221116f),
            floatArrayOf(0.75214684009552f, -0.99955683946609f),
            floatArrayOf(-0.42102998495102f, 0.99720942974091f),
            floatArrayOf(-0.72094786167145f, -0.35008960962296f),
            floatArrayOf(0.78843313455582f, 0.52851396799088f),
            floatArrayOf(0.97394025325775f, -0.26695942878723f),
            floatArrayOf(0.99206465482712f, -0.57010120153427f),
            floatArrayOf(0.76789611577988f, -0.76519358158112f),
            floatArrayOf(-0.82002419233322f, -0.73530179262161f),
            floatArrayOf(0.81924992799759f, 0.99698424339294f),
            floatArrayOf(-0.26719850301743f, 0.68903368711472f),
            floatArrayOf(-0.43311259150505f, 0.85321813821793f),
            floatArrayOf(0.99194979667664f, 0.91876250505447f),
            floatArrayOf(-0.80691999197006f, -0.32627540826797f),
            floatArrayOf(0.43080005049706f, -0.21919095516205f),
            floatArrayOf(0.67709493637085f, -0.95478075742722f),
            floatArrayOf(0.56151771545410f, -0.70693808794022f),
            floatArrayOf(0.10831862688065f, -0.08628837019205f),
            floatArrayOf(0.91229414939880f, -0.65987348556519f),
            floatArrayOf(-0.48972892761230f, 0.56289243698120f),
            floatArrayOf(-0.89033657312393f, -0.71656566858292f),
            floatArrayOf(0.65269446372986f, 0.65916007757187f),
            floatArrayOf(0.67439478635788f, -0.81684380769730f),
            floatArrayOf(-0.47770830988884f, -0.16789555549622f),
            floatArrayOf(-0.99715977907181f, -0.93565785884857f),
            floatArrayOf(-0.90889590978622f, 0.62034398317337f),
            floatArrayOf(-0.06618622690439f, -0.23812216520309f),
            floatArrayOf(0.99430269002914f, 0.18812555074692f),
            floatArrayOf(0.97686403989792f, -0.28664535284042f),
            floatArrayOf(0.94813650846481f, -0.97506642341614f),
            floatArrayOf(-0.95434498786926f, -0.79607981443405f),
            floatArrayOf(-0.49104782938957f, 0.32895213365555f),
            floatArrayOf(0.99881172180176f, 0.88993984460831f),
            floatArrayOf(0.50449168682098f, -0.85995072126389f),
            floatArrayOf(0.47162890434265f, -0.18680204451084f),
            floatArrayOf(-0.62081581354141f, 0.75000673532486f),
            floatArrayOf(-0.43867015838623f, 0.99998068809509f),
            floatArrayOf(0.98630565404892f, -0.53578901290894f),
            floatArrayOf(-0.61510360240936f, -0.89515018463135f),
            floatArrayOf(-0.03841517493129f, -0.69888818264008f),
            floatArrayOf(-0.30102157592773f, -0.07667808979750f),
            floatArrayOf(0.41881284117699f, 0.02188098989427f),
            floatArrayOf(-0.86135452985764f, 0.98947483301163f),
            floatArrayOf(0.67226862907410f, -0.13494388759136f),
            floatArrayOf(-0.70737397670746f, -0.76547348499298f),
            floatArrayOf(0.94044947624207f, 0.09026201069355f),
            floatArrayOf(-0.82386350631714f, 0.08924768865108f),
            floatArrayOf(-0.32070666551590f, 0.50143420696259f),
            floatArrayOf(0.57593160867691f, -0.98966425657272f),
            floatArrayOf(-0.36326017975807f, 0.07440242916346f),
            floatArrayOf(0.99979043006897f, -0.14130286872387f),
            floatArrayOf(-0.92366021871567f, -0.97979295253754f),
            floatArrayOf(-0.44607177376747f, -0.54233253002167f),
            floatArrayOf(0.44226801395416f, 0.71326756477356f),
            floatArrayOf(0.03671907261014f, 0.63606387376785f),
            floatArrayOf(0.52175426483154f, -0.85396826267242f),
            floatArrayOf(-0.94701141119003f, -0.01826348155737f),
            floatArrayOf(-0.98759609460831f, 0.82288712263107f),
            floatArrayOf(0.87434792518616f, 0.89399492740631f),
            floatArrayOf(-0.93412041664124f, 0.41374051570892f),
            floatArrayOf(0.96063941717148f, 0.93116706609726f),
            floatArrayOf(0.97534251213074f, 0.86150932312012f),
            floatArrayOf(0.99642467498779f, 0.70190042257309f),
            floatArrayOf(-0.94705086946487f, -0.29580041766167f),
            floatArrayOf(0.91599804162979f, -0.98147833347321f)
        )
    }
}