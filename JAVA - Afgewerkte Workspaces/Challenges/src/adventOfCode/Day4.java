package adventOfCode;

public class Day4 {

	public static void main(String[] args) {
		String input = "una bokpr ftz ryw nau yknf fguaczl anu\r\n"
				+ "tvay wvco bcoblpt fwzg sfsys zvuqll mcbhwz ovcw fgdy\r\n"
				+ "ynsocz vid rfmsy essqt fpbjvvq sldje qfpvjvb\r\n" + "yvh nxc kla vhy vkbq cxfzgr\r\n"
				+ "kljv ymobo jlvk ebst cse cmlub tavputz omoby psif\r\n"
				+ "ebfuvvu paqgzri uvvubef hglk jvn gzeln bdl ziqgpra bzcfa\r\n" + "tclq ytw tclq tezcqys\r\n"
				+ "qae eofr yzwcwqf wqm ytcdnc pxnmkw\r\n" + "krryi irykr ycp lbeed ykrir lhq rdd tyujwd\r\n"
				+ "hms pii lxoa dchsvz bepjwst bllxkqg hsm yrdj myzvju msh lwnnc\r\n"
				+ "yxqh hqxy xkn ljjsqjh jjljshq\r\n"
				+ "mhgsehj urbvnvf gbz ykxsd hsmgehj wtoc ujpfaos eir vifog tsy kdo\r\n"
				+ "wfruf wwijme pxbbsvf asmgs ccbn vwtc mkhah oxxfh\r\n"
				+ "lxqy jzvcvd cfgg uahxrwr dqmaqr bwzm wruxhra lrb lmk\r\n"
				+ "jspgxo yuhgni njzqtn zglkzz ybc itj orqr zgqwuoo mjagh erll srqrk\r\n"
				+ "cbrtnbx ukblei ienmdm sinzq lytyliz mma lizylty zeumwgu\r\n"
				+ "aeggz eljcry buqdeog dvjzn ilvw arz vep kxdzm mvh szkf\r\n"
				+ "imn sfty ugg flqq nydky mni bkqzlok wye lehwlmp xeyfmj\r\n"
				+ "beyv oamrpkc tebdkwv zlq jes mqvif sej qpsnmjz edvtbkw\r\n"
				+ "hylmacl wwlra xntnvg ppvb bzof cymllha\r\n" + "qktxomf ngfpuz qqz malc zxuqz szg zis vzro rfpgk\r\n"
				+ "phru sxlg qzqlw uej vmd omzga jue\r\n"
				+ "drzgojf ttqdqar weikik wvrjtxi gbj jramqh nlwoj drzgojf bgabmn xqlaeun\r\n"
				+ "aiuohu pca apkmv cpa kmvpa nmdn\r\n" + "gelymv eto itcnuhn ote teo\r\n" + "oxiz xzio kqu wwgow\r\n"
				+ "picoyb coibpy acsw ehlirq deyz gymqvz opicyb vuet lrl\r\n" + "zerg rezg miwtjgw gezr cui\r\n"
				+ "mlh qlu ktil tnlgnrk bfqbk pgg qxeyd noadmjo nonlsh eqxdy\r\n" + "yqqaq yqqqa xod oss\r\n"
				+ "mkotw bznvs xowoofq sebp wsgpsmn fytcpc vvmzr vmzrv xwtxz zrvvm\r\n"
				+ "dvs twhz teqmlow oqg sjetxd aku cwl qfvrkex mndsio hfg\r\n"
				+ "itdl qwdagkk wli tdil vlgur dyl xvfm\r\n" + "wlmyd dwmlx zhmqd zqmhd edzsvmz yclg umpq\r\n"
				+ "petva gazw byrca pvaet epkoqh nlp vqfl vatpe\r\n" + "rykn ckr dijkme kmiedj ozlh deikmj\r\n"
				+ "kuecjh sfqv pojfzf fjopzf fjpfzo amxtc\r\n" + "hri gglmial lrwbyc memgszu hir cfwlg ylcrwb\r\n"
				+ "rxrfbtv pwpra fngt auh rapwp zrruuq uah\r\n" + "cevc utfd ysrfcw nnlg fnqtx aua htteunu mrjhhj\r\n"
				+ "tvnxznj mvpagt nqmxvnl mutn ntmu eybh vkqeaj frayclp\r\n"
				+ "ygktzxo lzwwy qsipu nwb jdmw pahao paow mwjd uivqbnj woap nyyogcc\r\n"
				+ "log zihz rsmx ixfr xwvd osg zxc gol ufnbig\r\n" + "dogve cnb osa xbafl vefr nxlw yjgquui\r\n"
				+ "ucyl aaoae ktjvi fyps xvjhpbh iiur tuc\r\n"
				+ "pqt jasxg ehhs lzjzzzl sqmmj vwyva eklbtv hksanb fuesnd oyw fuesdn\r\n"
				+ "uankv wesi frhpau qiucu lim uzbdapf ciwjd tifbqxh tfbtsdi\r\n" + "vgjd izpofu fqjpcct phuz\r\n"
				+ "cfg cfg rgahl frm emn pbfsmgy frm jemwqgn sfpm azunntj igl\r\n"
				+ "daps hpe fqg err sapd dci vbzlqx gsigq eyp rre\r\n"
				+ "iuqyqdy djprdj mgtkdxr pwmkzv wmkvzp hppisd pidphs\r\n"
				+ "rlr rrl vhevh cucprc xki urte lrr zfc xrqydzk ipjkyxj kytul\r\n"
				+ "jwbkaee rgyjl rjljbwe ppq plp pfts ijd ckpvmw mbdrqh zolt lzmr\r\n"
				+ "alw law awl wknavtb esklsbj wvssyai\r\n"
				+ "aqy ldf qdht soxkg qtfipe nsdm aqe rtlc fbqrk ius gybbhxr\r\n"
				+ "xteov wgqoqim nlz szlj oxevt xwb\r\n" + "tmgdst fyn oul tsohzbq ltmxji fgops gatssx zxdzfc talb\r\n"
				+ "zkvjpu jnhtc nxs jqv pyoqz zsj ckwd xot ykai\r\n" + "fxfarre yjbxvj lqfaglo mbxuv bmuxv bxumv\r\n"
				+ "yrhi uosldj hryi fwres ycygw ycvxze zevxyc iyk\r\n" + "yphev xisbai xdb hzrbg ayxbhdx qnvbus pwc\r\n"
				+ "wytqraw yvurj erqckl rvrvda xsh gsd bxtm acxle gpndk\r\n"
				+ "kpvjtu vacggk oabcuoq qusf zitqpgn pbyq ocabouq ntpgizq gaiiry dke\r\n"
				+ "frz ceozajo ljltawq tjepzp iflv\r\n" + "zntejm dkfgc ysno noys sony muy\r\n"
				+ "qdnyvvw oykq bnmldt zjgauw pviurd cbcnl tnkhq ebsey bccln arvwe\r\n"
				+ "iqazt xidjgom wcrdz itht lfh ifzwkj rwqxhy ervcgmt vojg lzntz ezg\r\n" + "tlcxioh qvvkan wpi ody\r\n"
				+ "mhsy dwm hyms yegvvc\r\n" + "hbkvi wvemc uwxgqf pwrgu wcy wxqfgu qkzppc vxcwdwd rcgp ivjd wmevc\r\n"
				+ "upc ucp cpu unmr pyod\r\n" + "bqfew ebwfq paccwh phgc fchhr jrnio\r\n"
				+ "abh bjalls bdtac zzvt totdlc yptqmgu rpcin bch cqklqly\r\n"
				+ "bsnss qcsgi tegyz lqoqkpf qvatlyu ibza mzfotsk lye oqqf mnor\r\n"
				+ "lzrxca stkbn axhr wckbip bsntk ahrx\r\n" + "oricdw cnpte dbz nqx xloxc bdz fdsl uyvgi nvoy ezbi\r\n"
				+ "nlcqye ofta jcvqvtg yxduyh btawc tjgvqvc tcvqjvg\r\n"
				+ "nji znctdfm kkmp pmt ikhl jjoubc xnp zdctnmf covvmsh ydh ircplcm\r\n"
				+ "yafkuk yasqsyt ytqayss nusgb ukfyka\r\n" + "yogcf emg jlkd blupemf axg wihhrb ysernt yznhz\r\n"
				+ "gmc yyqtgp use lohoit\r\n" + "lclwa ojjkm rxr rrx\r\n"
				+ "punyfv iphw ddbc jghx lrssszc bepexv sicpy syicp lszrscs vrqjb\r\n"
				+ "rjanra juh hljdmad scu usc baifu ijs suc bgdbbv\r\n"
				+ "ogs hehi lgiwowc wwezznc ogs lorcl naunpll wlmal ajcbj ciujw\r\n" + "slenm xxod vhf amhts\r\n"
				+ "mrrduda mrrduda lwecwjv lwecwjv vvzmjla cjipv\r\n" + "ixnv invx inmzz aoxghpv\r\n"
				+ "ulyvfrf zsup zfryjy xoo agdsd giw papa ljtu rzbjiq wrex\r\n" + "bzpv svpuyov mklrct uzox\r\n"
				+ "fxs iypd uaqch kxazj ksjyv\r\n"
				+ "uxaommf xtq uubbfk bmlq kdhgjzg oxwpag itfij irmkjx ggod sddcyo bopn\r\n"
				+ "lch plmvfni qbjr dnu zjcod qlwax gejmyj gxjqm mfzkb gejmyj\r\n"
				+ "yoa thrfbto wposvrm amulogu mcqzfax fjquli oay\r\n"
				+ "kywj kqqhney ozuljxz wqwfte ubo mjj anhhg aphy ocfnef yhin ywnx\r\n"
				+ "vxuledm wllj obqtsrr jwll uvmelxd xvj gbwte\r\n" + "hevc bitwu ydw ywd btiwu iuether gfe\r\n"
				+ "dzn ssmfpel wbbdeyt xge hrfi\r\n" + "zebz ifhq euto ppfnrwc winkkj\r\n"
				+ "utuly wtdt iahpe ihtxwmh zxun bqluj hsaxgcs ytluu jlfnnuv drxlctr myhp\r\n"
				+ "kwxgy hreul rsnh wdmsx kkajywb\r\n" + "bond djq kccazc zvzcie hndm myx cmhyhkc ove ord dqj\r\n"
				+ "zcong tekgn pbzs ywqgqgu eizrx ypydeku yqyjdjp dwsu zxire zcgon iggnvf\r\n"
				+ "tkioh hflkm fsjz gisjbi otikh\r\n"
				+ "ccdqqm fdabbne fyd lbyqm cyzgtd puitvjz nluf hirrpxd tgxrg vvl\r\n"
				+ "hjnygbz fnu twwbp xqw pfdlt uoalyme rsd muayeol ezcq\r\n"
				+ "kubeooi bxgwoun paogjs twvwlji opsajg higbdfi aazo evmj\r\n"
				+ "sfipxe mqbkmrn plwqd zvq nmvom fyfbs nbs qkrbmmn eym kqnrmbm\r\n" + "ruhsp hurps mqws umm sphru\r\n"
				+ "ksjs pgpxh qozg enplxbn oqzg rvjnaje sjsk\r\n" + "rbwbvog mhgtgg uld twrqz rbf kpop\r\n"
				+ "lwho lohw ylhd dej lydh vsfffsm\r\n" + "icljgu gluijc vthqx orynv xhvqt\r\n"
				+ "biav elxkct mtaw nlafk snyr cbqdwim blim rtrqmc wze cxktel\r\n"
				+ "fgpeia ebkhga azlfsr bsj pipvwsd nry bayrjzl ftth ynr mfhd\r\n"
				+ "ymlowur nighqgk yjv pyxf nan xamb ohm jvy owrxbg icbz\r\n"
				+ "iyyt linaqu httt zyfeo udap mllq pdxo lpl djhqaou zkit llp\r\n"
				+ "dxspk yge kcqjqpz ulb hoe mfx nwayo\r\n"
				+ "rdnmmh gyqd qhxrzj dgizu lyittbv txngpdg fiu mwd ndp oks vxnxybi\r\n"
				+ "eul ztpe evnz yxx iuwon rkbbsw liy mqhxt\r\n" + "qahp zwn ualtk txbt cbthj xchqy pirucp povdwq\r\n"
				+ "mqwu mwww muiafa miaafu hzripx wmww\r\n"
				+ "auw hyyi ylewfi ihva jknbrry voxzooq xaos xymv qzzjw hjc\r\n"
				+ "enpb jqa ajciy cbeopfs tqrlqj ecudb gso cyjai gxoet\r\n" + "yohkjj yohjjk xapawgo rtgnjj\r\n"
				+ "lnlxxn nxllnx vhjrev uoew zts smkd kynlrg\r\n"
				+ "bkblpr vgafcy alju aiyqe eebtsyu buve hdesodl pspbohw\r\n"
				+ "aacmw qpndwo tcwsfqy qecnms wondpq sto\r\n" + "wdsyxe edsxyw jnzruiw pfqdrhi\r\n"
				+ "pfgxekl vswgxhb qyn mykn jimiatq zkcz jimiatq kaexgxm mykn\r\n"
				+ "xegwn upudt dew uqjrcl abyof hbtiko wxgne sorgno etm\r\n" + "xzojs zxsjo szjox gumjtwi\r\n"
				+ "gttngkk bwdgce bhuw fgo rcbf byw\r\n"
				+ "ngtzwqx ptx xodmy ctmtf oioahmm qajlhje jzilpk cvypp ijaefz\r\n"
				+ "arlx slcugvm hyuo zoptsh emyr tndx rroecp tdnx xea rtkpd\r\n"
				+ "sfckdx ktyrjju ruwjtp zhqznj vncun\r\n" + "oqqh xpc itrdg gtrid hoqq tuo yijh ncp suvck jic\r\n"
				+ "brrlqu twdt urblrq twtd\r\n" + "brfuh arwtkpu mzlj wdyqk\r\n"
				+ "pmag dtwnva nect azld axqrwy apgm xbv gdq ienubsy andvwt\r\n" + "hqb qbh gxdl mwjn cmfsmik\r\n"
				+ "yiwma utlor qxjfjsn aomlvu gxp ryj rfkdsw kuguhyi qxxpg\r\n"
				+ "ifq wcvcgly jdalgzx lgcycwv rajmnqw\r\n" + "latakk yxxbw evy vey\r\n"
				+ "odkvw ojgveb jhg qwhkyoh btvu qbfot nouv owgtsi pdwbmfn pmvcv dnqbo\r\n"
				+ "tmka qqnty knz swi fyvmt ikcdu jfjzsfu dshgi cosacuj szjjuff\r\n" + "eanet uua fbztk bzkft\r\n"
				+ "jepi hyo jgzplr jyqk zzcs iepj hfamvu bfgbz sjsnf lprgzj\r\n"
				+ "mlca ywko mtg vkfv ojka zbelq qkaujs simt kafq qtycfzo\r\n"
				+ "sqh omv llvra ecvxmtx dpnafv llvszx xzlsvl quj ufnhvod faraf fivmnl\r\n"
				+ "pvxlls fzeoav ahgv uhq nodcr cohy vqisgaj jsfcyur dbohh\r\n" + "ztccbwk okv vok kov ywel\r\n"
				+ "xyu cmaikc jgqu ozccdzk ybn yoeq fky aetrkj eyoyvla laiu cermo\r\n"
				+ "sssnb kxly mgvaz jpffkq bysbwwu rfnkm eycp ipyd hyi wjew\r\n"
				+ "obdfqmh flkm semednj iafewg lvh uwa ciepe\r\n"
				+ "zmldp ykffe gtehz qlmvule edrtzg prund oagwto qia bvyxur\r\n"
				+ "kjok neno qbxh wqgkkt ympclso poyclsm cajgnnn\r\n" + "paqili kur sfit jbqchzx bhjqzxc\r\n"
				+ "fhghm ubtaana qbn autnaab aaaunbt vmz\r\n"
				+ "exlrl hfnpq zgdwx smix nyg ogccrhj iimhhwc uhcldo oydwxp kqc jxxpycv\r\n"
				+ "wtdqjfh ialoqr zeej ipoh qtjdwhf wdhqftj\r\n"
				+ "jcgug cmtvmu ynhnilj txlv uemowyu cvrool oolcvr njr cxqntdh\r\n"
				+ "uhtwtp tgnc jmmjl utiu jfxtsoz cxwqcz\r\n"
				+ "qntxl lyownp tsp tps mixyge rqfqumc bxjiry zmaj azjm\r\n" + "abt bat tftvm nyjs jyns\r\n"
				+ "hzsdh pwthfvm cedg hzsdh rsxtehn owh cedg\r\n"
				+ "hcoiny aqbeme eeuigt pocpvox tiugee rwb tvgmyc ojg hgdaf\r\n"
				+ "mzlwcfc uoobo bouoo tvgvmiu evsfkm popgm evmfsk ehxvits vebxbmd qhmz jzj\r\n"
				+ "mypgg jbpx vgeb ahvjl zbm ancdzfy wytkcq\r\n"
				+ "bivscw zmzmjxu jzm fwb ujefxp jzsiskp cgx atcj sszikjp cxg nqvxga\r\n"
				+ "vvurbxp iry zlz gfnlpuy npyugfl\r\n" + "fpmee mhj iul lui liu\r\n"
				+ "xjoesn ggsdc vnisnmw kyxmmv xphfq\r\n" + "zcsml ngzlpy udaoab eotbv ylca bfmums izx\r\n"
				+ "pdi bpyoep cofsy qazl oaovek fvfbe sotc lfdmaea smvs\r\n"
				+ "zajm bskaqhj qxyiptb bdyeuqr dqjrekn iywj\r\n"
				+ "hzhky hukvpve iqcbwju nyiwb rvutxlb hyuah urnhxg savicaw hexr ptedk\r\n"
				+ "qndji wrr sin ljogf ncrb zvt tvz\r\n" + "kvfke tjpzhrl zvd doq kxyw fdgr oqd egkybdh rqpfxks nja\r\n"
				+ "escstpv ccc ryzdv gxkjuyt gkhw jxnfda awpzg csestpv\r\n"
				+ "cpcd onxeae nimbrpt zyji qnuo ktxgwbj vtjfglz skcozd zgii zgii nimbrpt\r\n"
				+ "lwq iue hfbv hgbg aeqc\r\n" + "vzgbod yjkoc ckt bpiaz\r\n" + "eyco ecoy uzousjp faxj utu yoec\r\n"
				+ "fhqdi myd tvex bzizkcx pifcfhz fczhpif eofzv bqzd knbhbgj dok ffcizhp\r\n"
				+ "qlqlgmz hofmnc cwtk ahgnpne acn prwdh hwdrp rfofhl atavrf afkcbk\r\n"
				+ "sgl apyfr pwxzptv osuwy vmqqh soyuw lqilked oinhh\r\n"
				+ "eglqdox gcxfxql ejtnwu wvho can eyu uetwnj elgdxqo atvpkk eailsnn cwosyn\r\n"
				+ "mylxhuj kbc apnllw qbmtj sqy hxtnvoe ins iyudo aagezrq nsi ikvn\r\n"
				+ "lpmzo tkdeg zilkm vdkmtf yulbdd dkfmtv\r\n" + "fzrv grq zfvr ychga gqr\r\n"
				+ "vdjxx wew pdxgp cjywsc meoffrj pgpdx chxmw eizgz ruea\r\n"
				+ "iaklyhx btqqik tbiqqk ynmq laxykhi qatrnsh lnmtm plz\r\n"
				+ "sfogup jtdsx tsxjd wwzkyy wzywky vgdsgr\r\n" + "paupqb kyy bccklmr vopviup lctcxza yyk yky\r\n"
				+ "gduuia doek hqcr upvb szeewnu rrrdz\r\n" + "lhnsaf lut kzf allu dvj tyngx zkf aqsgz rtkzzdz\r\n"
				+ "xxqj msg xxqj ezmm tmyji msg cco tain ctpel\r\n" + "pvcfzv rhn hlhxyu bghzzpx dlhvr hrvdl lhuxhy\r\n"
				+ "npzhkp voghdv rvezqff hvgvdo jndf gpa wevrwpu\r\n"
				+ "faixq aecax hxdouer yqlngzd grf wid iwd cce xnmmr\r\n"
				+ "ifqwiah dib ibd dtvkwqj mpn dtwjkqv kyntq xwlv\r\n"
				+ "rwoiz dja cvv lvza kfdblq bgtwgh ongdub wggthb lvaz\r\n"
				+ "xajf eyasx rupsyqx wubjwx bsrqi ripghci sbzxp sbz dhooax\r\n"
				+ "ydnv tvhwgp uvrh yryhl yxdlwa ladwxy awi mkwyn ghvpwt\r\n"
				+ "qrl vwdvwic ocbhpi bcmz dor lrq hokg gokh\r\n"
				+ "adz echnlju ebnmw twjl cfw loq fqklyyq clgqq jtgpsu wltj\r\n"
				+ "vwlgisb murtsw ldkacqv wxfcke vcqkald ldhh gsl kpzn\r\n" + "itnvo lyddd saewfse spnri vtmst iblx\r\n"
				+ "qsgv qni wvqiih mneg lkpb quhbkyi\r\n" + "efwaaa huu fslzwpc uuh szflwpc\r\n"
				+ "sgmj ajh vcwpcua enltaks aquooh bwoda txbuve\r\n" + "vbe astgezx xqbxkdj evb bev yuuesdc fvohzq\r\n"
				+ "gpn oqxfz pbwibjw gljdbf gbldfj sis dpk iss\r\n" + "pha ebybvye ntxhs wcuce\r\n"
				+ "odnnywv qpcjll aslxqjm injfs vkbturz atxi\r\n" + "zzncfj kbhk jzzvnwf kqipx qkxpi rzb czfnzj\r\n"
				+ "ygu vqpnxkw trdtv rrte\r\n" + "hrutley ljxuuq yonbpmk hmpc etyrhlu\r\n"
				+ "odxp fpvizzx dxop jjbr skhxq mpzawhe zptdxuu erxk adbbuk zfzipvx\r\n"
				+ "qjovasi yutjpg rcp bykpctm fqmmg pckbymt hqj\r\n"
				+ "ssqc cype tkowxb fbh rsluu zjk scrukwv pkuexk qlgjtdq oulrke\r\n"
				+ "bkcd nnf hdj sdlweyr uyf kmvzq\r\n" + "sgeg moy png blv bblree ufe uqknuqd lnjwbh\r\n"
				+ "snpex hrbcfok pffv cwrvhcs fpk uprhn gbpy zkxyi esug ccnnj\r\n"
				+ "bmwue dugcrdu uifiy clid rdmodec jodp hti xptj tpopl vuwhdyi hnoq\r\n"
				+ "cwlkg qsz nnp lfyk pwn dpe oeuzp jusxxkq qlnchc\r\n"
				+ "tsmkvge pxauyc cxypua boi hybq rzf iioyi rtedkc gjmk iob mqb\r\n"
				+ "cvip wgbjhe ulwg jckkwd gdu bmaoisp\r\n"
				+ "drpl xbliszf rpld ngnvgxl xnrd xsmd oetrcmn xvfohp mtocren\r\n"
				+ "habmf dmfxq qitw xxtybla cxvb colcvpj sowoeuh bhmfa plccvjo naftjgw\r\n"
				+ "cix soo icx ahx cdrjyxe htcnp\r\n"
				+ "acoksaf cgahlg tdj euchwnj bdn lunouq aewrk uktre kklwqy lnouuq\r\n"
				+ "ibsel hwjbah vxuk bjxa dvzbpq tffqvo bjax qfoftv\r\n" + "iynms tzv jakuuw cmz cjnyr ddibtd gcb\r\n"
				+ "tmgerk pvwizc lxoma ergmtk xmg loaxm\r\n"
				+ "ajazon yjwt viyemnk wobzwwm jcucn nopymyq znaajo qcjtmlq ccjun ywvt oqczod\r\n"
				+ "kdhgnv kdnvgh rpyrxx xpyrxr\r\n" + "qftmshx hrbr kcggxw jwtuk qxbzkn\r\n"
				+ "ddi fjekwxs xxua cmmkrso\r\n" + "ptrsv favvfh innnnx nninnx\r\n"
				+ "kzsnd pnf evtazgw wmjk gvxp bslajo\r\n" + "nphqtka umlxu ymw whqiab whqiab vwigkz pevtps\r\n"
				+ "vhje cnu uzfzum rwucy mxr wyrdqfi gnkuwz dkrwc otfc vbfc\r\n"
				+ "ubtzio vlijsst anruj qyntadb fnic klz ywqq fnic vlijsst\r\n"
				+ "rprj ybyqawb tgeieih nzcr rjpr bjfpozh tpevsx flvjdq\r\n" + "kvqqzvm cfdm wzjmkq sbcfx vzmkvqq\r\n"
				+ "zqtt elpg eglp uoe glep\r\n" + "lqv madhtch xevl fal ijmx chcpra lzl afl cndbvnq\r\n"
				+ "yjx jyx xjy otwklfj\r\n" + "cur egsdzaz ocbx wvky coxb pgiysbh lclhvy gfu oxbc vqyjvhh\r\n"
				+ "gtd pytdaz kecsku nkiud ytt bmgobx tyt pfleji ebqlifv lqp ytzadp\r\n"
				+ "bopfdvy eovszvw krgu jhuhyqi kaczafr krgu zlfxtl\r\n"
				+ "yixprs zqai oprgw vcsjoc pgorw ypx ijo urjcjqv\r\n" + "estg oqnhw xgwajp mpbsag ibzi\r\n"
				+ "zggbt jmmtkru sye ybd ztggb\r\n" + "tzryuqb blyxnnu sjpmf yxe zimf uyzqtbr qbyrtzu\r\n"
				+ "rzivz rxn invxqd nazw efzun bwnw ywx rfuda jhnoww mketav\r\n" + "zxfw zcaqi qaciz ktefiwk xwzf\r\n"
				+ "ntougl fvyaxfr obml obml bjkm lgsqj yfcggdu rqcpgt ntougl nveto\r\n"
				+ "rma dakifg pvfc ticvff iffctv difkga\r\n" + "wpnt eclov vmmoqh qvw mljlvnj hxrx\r\n"
				+ "ijnpo uhgxrfe xxopw xuzwyd powlpo ctduj eepw gubnepv\r\n"
				+ "rxcmve myxckxk ecid nxe xevrmc juzaonr ilkx zpb pbz mvgos yzr\r\n"
				+ "yfecm wqkh defqqa mnzgx nwe ixxg rjdhe new\r\n"
				+ "awztgx vqgnfd iwcakr ajaiwn jiwnaa uqfrim wrgbjon ufqrmi vdu yjwy gwkdc\r\n"
				+ "vrqf yzmvnr jkjji ghya pdlye ygha qlcm twmkex frqv\r\n"
				+ "hjb xgypw vtr mgj asa owcuks fnllp ommrhng senv iix\r\n"
				+ "usw iyuatv ondiwh neac ttge tzw bvjkfe neac usw\r\n"
				+ "qwehwhj idrwo vex zopkjd lrcc sfqyz smte qrfh lccr qwjhewh vlb\r\n"
				+ "efnlhsj ltm xirn nctwio cin\r\n" + "zocc cpfo czoc oiz tftk\r\n"
				+ "rlzvqe inivone kptyumn eatw urjxc aetw\r\n" + "qavvqa jvvc yux cvvj\r\n"
				+ "bfr fcpc xpkphcf irak bfr nuhsooj nniugf bfr gllq ipo\r\n" + "ekd dydxs rnmgb dek yowk\r\n"
				+ "ipdll wdgx gjiigd uleiwg buvv vdhuzg gigidj gkyigmx lpdli lzyode fqdpvms\r\n"
				+ "ycna rhyz bsipz lit rmc mrofb cyan mrc wujk\r\n"
				+ "tjrk cwdsvf srkdjy lsyvryj nko syjvlry fgqq srdykj pgb koh dyle\r\n"
				+ "sflcxt wmgdgej akllaoa bbsvve nsxnt nsxnt kgm akllaoa btqbez\r\n"
				+ "bzmoci agemx mdtiol pyohvf zwtx aqblx oibmcz ypcmz lfg ckssn ozx\r\n"
				+ "cuojke joekcu eusr dxqk xxwob klpsm\r\n" + "byspz lyunt eojrx ubh rjxoe ypzsb\r\n"
				+ "ibok bkrtut wzcdk ppm qekhvy aupaic vswwul lmlxrv ainigy sasurbx\r\n"
				+ "jeigcyc cycgjie resio ncz\r\n" + "xvxr lmlaje ebmtn cvms xrvx vsmc\r\n"
				+ "cfjbffj xvo hpsbu nfm jhlsk mnf fmn\r\n"
				+ "xncxo iwuon voj aebv jks nynzl hwjwo womejo ugzmr tdfaep olpdiaf\r\n"
				+ "jlnusc hgpprf nulcjs kwiwypu kitjjbj snlcju\r\n"
				+ "buqzm kpuoxel ajlqke qqdur jecuibn leajqk qudrq usi\r\n"
				+ "ahbnjf uuzecdv yfyrsxv eoqey oonue vyyrxfs jixmvao\r\n"
				+ "wjdi cfgurdl usdnlk jmao qnus cicxnux vtdxxkx nusq\r\n"
				+ "mlvfz twu unj mar qpiz fhjczpz ytl npwjys ppq koa\r\n" + "ippdky pvwthzj qlkhl pvwthzj\r\n"
				+ "kfm lcedomr xgdkrzo hfxyoe rafcby uwe pzjyuja weu nso erdwc fjvc\r\n"
				+ "peep oufzlb fsgn kxj uge xvufb zsnrxss lere gfsn gvwajkj fmh\r\n"
				+ "mexvi kgkktz kgkktz auyln ghvqc mexvi\r\n"
				+ "wit qxtewrk qdaz oljeb wowb suergyt hxq pfnfbei rdu qrxkwte fyw\r\n"
				+ "qjjzkd oxedeu uoxbehs zder vvjnn ocxkiz wkblzy eyzksc waiiqo fut raak\r\n"
				+ "dhojys qkusuxs kzicui dcsxo\r\n" + "hsnexb yoz inza gqxtbc rya jqfe ufzlqva\r\n"
				+ "scpquf gbloz ceol eclo qpvzavo rwfnxa\r\n" + "jyg edqf vdpsihl edqf\r\n"
				+ "mbyjg yjgbm mgybj mhgi grw\r\n" + "ler oxssrel jhw jwh sfa hdhlo gng auzoan\r\n"
				+ "hmkuis iaxf muhisk ikshum\r\n" + "eodbpo prajasi zsu hyb npr tbcntup uzs bxchne\r\n"
				+ "zpyr kxmvz frlzwnb tzqrw vdh ndbwqmu cadwsv adq bzfnrwl qfgf\r\n"
				+ "dybnn dmarc mknr fovokgj ukrp cuwag\r\n" + "khweq eljs rllijp pizevm lwws kehqw mkjcu otqodz\r\n"
				+ "fvsrb kzbjbcc kzbjbcc mee dhyedb kzbjbcc\r\n"
				+ "cnlmjd dvnd vhlvsa rsrtc scrrt tqhx vke jqmxpd udkjqc qxriw pfqpk\r\n"
				+ "tyureg urteyg rutyge rmoihs\r\n" + "pccxeak tkmyane qqggpr tbdmpi ieb\r\n"
				+ "wjucbi wjm hais pcxjd kkzh qns hmf mhf mnsv ifigsc\r\n"
				+ "lqeyr pnopcig cpgoinp pncpigo mjfkjus cko zedvvyq\r\n"
				+ "ofsnspv goj wqm ynolb qczly brl lrupzg buof zladwte\r\n" + "xzn zxn yaseulw qwhxb easyluw vvlmh\r\n"
				+ "aiybip ydfczwh wkl rjsu xreokl qov mko pna fkfu\r\n"
				+ "zjlwozs nxke ozwlzjs jybx jpsxp qtkll idsrad savpoe\r\n"
				+ "xph lpvkmvy afq uqhg qqjgm smg tmhem mxdyqx bvhot lpvmkyv\r\n"
				+ "jxkkzil pkjheow fewr ggbfy fuol cuzud wnx fxujfwh srjsmic\r\n"
				+ "lzbjx vfx sncis xuv unoa nlgs stdhf oibxsgk uhogsb\r\n"
				+ "hfqzkms bzyfnz npcd yhfdo myqukug pjq adle sqkfhmz\r\n"
				+ "czhainb iazcnhb hhaqr cyrwj zzow luuvt zdyhnh uppysr\r\n"
				+ "fyw dulbxa drewqsr tldlaac kyaw datclal ylplup hdzbj\r\n" + "kiiv tly gua lfg\r\n"
				+ "gphbvwc lqdd jqja ffpkz hafal eiapksw wsikpea vphgbcw lkcpm zjxcx\r\n"
				+ "viapp rxt vdgbm ezphp pcqr bll mklgx epzhp\r\n" + "favz bwmczgg zoyns pens wpgi mrwxel\r\n"
				+ "ozwjjn kbzaozc cuaa igbfyq swi uypx bczaozk pyux odvawqx\r\n" + "npnpw nwppn egnpj fkzh wppnn\r\n"
				+ "asu mlqmwa npewa cjluw qmalmw newpa fznx dzypi yiy\r\n"
				+ "hleh usw bgmgscg cqc fijfuw idtyh cgmsbgg zjhr wus hymbju\r\n"
				+ "tmre fvm cgowgb eduyfla ttez vdzp vtmtaog ezxsfi gyxgzi pvzd\r\n"
				+ "acvarlu hkmfzdg jsnil hpv wjj rljpk pygl wjhhohk rkplj spvgx psgvx\r\n"
				+ "wyz rvuobq kbmhaf bec bec\r\n" + "zosyz psuo lgihdo mjtftk fjkttm ddmcd\r\n"
				+ "pqm qpswpb opviwxg ppqsbw waco jpx\r\n"
				+ "yzgumgq kqv hqjghnl jixhoyg ufer kvq lzi rojm gbhvsd urd tuy\r\n"
				+ "sxc jndqc ozpex wkchpu tmwv utcxzd piecpma cmppeia\r\n"
				+ "ifjc lttj tltj rxmgxqa jcif lzhxkg zqb mdq kbjavv\r\n" + "isyxn zjbj uiw avziqxf zpezazx iuw\r\n"
				+ "rjaudu amtpuk gufogys xiqs\r\n" + "gau sndrkv cmiolti cdxm ikkcisu xusnfbp jxffy ffcizj psye sgd\r\n"
				+ "mvx onzmy oynzm mwfgvs\r\n" + "mrdg roanty dljs jlil gzcj dqitnfb gxb vzzqf ooweeh pgs oyntra\r\n"
				+ "yna xgok fvbdl xgko udqp sorfo hmhl yan\r\n" + "kycl ule blupejp kycl fhpkoe pqkptw cfzpv nkncl\r\n"
				+ "snugkyw zfdbsfs aehb olq kkoi xpsvy jqcspf lajjyu jtm\r\n"
				+ "hifhfa mii clukcbc fhhifa wcts tgai vvqsyr kclcbcu\r\n"
				+ "ordjftj dokk hdhytwc fjodrtj ojrjfdt san ajxrwy ked jfrqc\r\n"
				+ "eylx cohd biswq xgiibz gzcptbf eylx icunv bfg jqanbv rntp sbfkiey\r\n"
				+ "kub gdpbdms qnnto bit visqop\r\n" + "tywk clicj daics cbuewkx yyjjjka vxzk afsdyqg\r\n"
				+ "bmxzll wqjnyr mxlzbl yutkaa qmpz hiqkf lqqqle jagj qlqelq\r\n"
				+ "jgdeatg qubj jsu bhgbm swmgy lwgnuh qjbu dqwiikp mgwys\r\n"
				+ "ryisldg asrrhz vxvrnk ibjr kebyx dwbx qdrpa tgakt\r\n"
				+ "dfvgzk hifan dpjdnqc ncnvf xmqjjao npjq vobt evtaety kvufds pcugx oyjo\r\n"
				+ "ezionjg ioznegj cykxy igeojzn ezm\r\n" + "dkv dkv vfqyl dkv dtjhrem\r\n"
				+ "xfgh brsjcdw auvq fibb gcbecl\r\n" + "eet qdnrymr ndqmyrr tpfqxoi kbkxw\r\n"
				+ "qhmaj maukf uygg hqmaj tfmtv irao wsari\r\n"
				+ "ofoywus wxs leemkn wfko dwzqv txg qsiiiss aiiffe fadmdq zjtaovt\r\n"
				+ "fgfms oazi sam msgff qif evxca reho\r\n" + "gpzhy qxh sco qeax wtabxwv sjd oev\r\n"
				+ "xsmpi wskvku xspmi smipx\r\n" + "ghgf tbpeun qdivuvq dump umdp khxcxtx laljpv lownp egovve\r\n"
				+ "vhmu eziabt hnz neko nkz hfmizn\r\n" + "vqhb lax zzyf lxa lik jrqynr rgcos\r\n"
				+ "zjgbfzv ieufyz kjxad qxeuewx\r\n" + "ufl drkaac hoyic pqutop wqzdk eewabsr mqspcr ewarbse dzqkw\r\n"
				+ "bgatanj xmddwv mwlmw scgzboo myignm lkfl fsqr\r\n"
				+ "xkrx otjzfk wek dpbwk cromg fclmhg pkvw wsln\r\n" + "yyqjs lifg gifl cfv lfig fycza\r\n"
				+ "dfup fkfeiqq rcmuv dly iforzi lngkjc rzifio oiifrz mlhor puwm qrthoa\r\n"
				+ "nzfaeto punt rtmlg dwdk hyig\r\n" + "mds ueoyclh lxb axgea wqt wwqqglf tqw yvzji ryr dst bojf\r\n"
				+ "ayoj yzj lyctgnc woxz gqltw lkzkwte wysb mjyeu hrwso\r\n"
				+ "gymmvtt lhskza lsb nhlijnt men zphurrw oftksy zxs ykerwue hnijltn iknqyz\r\n"
				+ "xuaxkc lgzeef fwb nlzzhjj lsieg qdr ews rue rdq\r\n" + "xnf lljcmod kyuercp kvlvd lkvh ncn afaq\r\n"
				+ "bjytofa ltz mkyy bwt uxca somiz rhgdg keaqu ybr\r\n"
				+ "aipljn qpq nilajp udgkchc dirvxg rrbmi mxfxkk kmfxkx\r\n" + "sfzjemk hjsvnmb hfd hprfmvg pbhkc\r\n"
				+ "cvxi srj ucy yuc euswuns jpox\r\n" + "tajlnn ivuecv fdfce rakjq bfuxirh eibde tajnln nlajtn\r\n"
				+ "ndvm mlnhy bfqlzn nmdv ohto\r\n" + "jysyvwy xbcyt lbbm osoye swwtwa emfznci qnzc qsgk\r\n"
				+ "xcm jbqsuo xmc mtrk bojuqs\r\n" + "ukshrrh xhfl ooxgq vadlcrg ydva hugplg mnqbd wkyouq\r\n"
				+ "mnmqys bhws megar krgoke modxe krgoke clovh dlo\r\n" + "ejl qzc agxph jcn zcq zqc\r\n"
				+ "jgh yhh hjg jhg\r\n" + "tarm jboyg gbyjo pgalg xugzt bph mart\r\n"
				+ "yur wrrahr fnnfqu rwhrar cdq\r\n" + "mukod gueg guge epalg xjkctt\r\n" + "hub hbu hbzul buh sqfl\r\n"
				+ "xyrly lvpitr xfzn jjcl uvcnz dnpdyzq ifaiwe zlvzcx\r\n"
				+ "wxzsf tgd khvwp cmd mzv bsvjvjm wvhpk ublnqyz mvbjvjs peishcb\r\n" + "zunmk hxpney nphxey znmku\r\n"
				+ "bfxlgur wftcw xfkf fsik xkff ffxk\r\n"
				+ "sxyjzr ugcscx uiovqx ldzhord xgxbfph ldzhord prdhg rhdhzd ugcscx\r\n"
				+ "udg drb apyjq dgyevo fuxjhg\r\n"
				+ "qshbe aigfdp wyvz xfcos wve dgfrufw dwimmb jfh wfrjbzk nwgrigr sbrpbb\r\n"
				+ "ahpn xnzeof wxbv chxpcu jmso age ojsm bqonfki hqhrkw\r\n" + "mfupm vvig ndqbbm jlw\r\n"
				+ "ejqh ebcrytj zpiqtpp ogznd\r\n"
				+ "wkwkae odq rsrnqk nslczz hiyyhur kuw mjbuwll vduvod ryhuhiy swo tsos\r\n"
				+ "znkufyx jejrdno knr wkx ikrlly tnxtj\r\n" + "iizdiw iizdiw hukep rwj eaq ptm klta rwj onaz\r\n"
				+ "znb egqy qqnc igqr ikza ojgzkr xaen kurb pyckxvt wqx\r\n" + "pbohpw bphowp dajwdpp kotevs\r\n"
				+ "hmuvxu zdnguk jhcmj gccyxiu cxgiycu uyxcgic akxi demeff\r\n" + "zjr lupzwcy puva rzj\r\n"
				+ "cdn wee iqkbhl jwxo nhl cqd mqgqf ltdfg\r\n" + "phwco ggcj cggj ergpqmc kcz\r\n"
				+ "aryjl wqwmkc aklktpz kptnroc mckqww\r\n" + "jadydt atjdyd tajdyd owswsgm\r\n"
				+ "dshqt kacoge sdqth ylobih\r\n" + "kdnik knkdi dinkk xwvqa gvii\r\n"
				+ "cifbkpt zye xhwnrhm fctibpk sbn pdqry emkye kzyjpa plzkc btkfcip gcchi\r\n"
				+ "kekfr fufp dfy eqebgko obbn nuh\r\n"
				+ "zixfbus skuf bea gimbqq caubhto eba uvkovz xisfzub peukmyn\r\n"
				+ "okihcgh gazrc slee vlnwyg geviex eesl nmnvk rcbv ycupyw\r\n"
				+ "tcvlgqs wxe lusvwzy unr yzluwvs wsylvzu zkwth qdykv\r\n"
				+ "hyenkj ugao vlwgb putcepr lyeccs fqdotx burf aqew fje rfbu\r\n"
				+ "uhmnc zgnkarz gylqawm abl zimcz qbs zzmic\r\n" + "pxkbpn zuxlwtt rlbhegv zlxuwtt ooxpr pgjx\r\n"
				+ "leg wavgps fcplfpc xvxih ueskmi dvu wbiq nvtia pwjojw usiemk ojwwjp\r\n"
				+ "zmrpknx xrfpq avque tvoyqp\r\n" + "lyposyj mckyoub sqbl olpsjyy hjafzi wmojb nvezofd\r\n"
				+ "yflxrg egi aij qvc yflxrg typbs yflxrg kliexy eqnj jqrr\r\n"
				+ "gggt sht kdajvz sht gkqwaot sht vout\r\n" + "ahl aucpih feig man umtchcv ceqabr tfptb\r\n"
				+ "ftlywun voaorf kde ilwt hlpoe pksqxyh vpg cxo xgq fdkkl sgxhnq\r\n"
				+ "zzekhfi akb lupta sgtd qapznzf lgidsx lidsgx akgmq ettuwjq xyumf\r\n"
				+ "dxhpku lwoxpim gwb lhjmoh gxqapd ntmvc rvwwszg pvin lwoxpim coubc\r\n"
				+ "qia bxmremo rjf vaeio eqexwz wuoz sguf bsbusof xqeewz\r\n"
				+ "iczzz krf hbq tsgrih mzjabrt sfnwrm djignf zwac cwaz dgc nsrfmw\r\n"
				+ "yvarsva zzpbp yai und kkbinr zlyj nyxxof ggrgu vyk eib\r\n"
				+ "nepzm yrrgr vrlhbv hykmiog natrqx jvpq nbyhe zuo grx nwl\r\n"
				+ "cfboeev hcn yfobyx cqvlo obctww xxaux ofybxy wouguq avuztl xmgqq xyofby\r\n"
				+ "tikv uvzp oxopqy reh uzvp wefka vli kied gngks vbz thfsxyt\r\n"
				+ "exxvknp pucbdyl dboto tzat qze xyinygz mhzl ubahr ekxbtk\r\n"
				+ "jcz ufszbi pknsfgb ivok ijau okxolj etecn aurun zsa gbxs uryx\r\n"
				+ "ypnb ousd osg mvset ipffzdn dfinfpz ltescx\r\n" + "taeoct aoetct aocett ttda fcdqnxv\r\n"
				+ "bimtlk ssax bmrifkr vfxdmq hglp rgzr zpvk zhxtq rndwy mmr arkr\r\n"
				+ "bwvdb axxbhzk nwfmbbu kzuc sahv cvas wdac acsv\r\n"
				+ "xavkwou yvx ouwkxva otbe uzr mmw atq yiy ghavd qta pqlhv\r\n" + "omzht vsdsc zhtmo hmotz\r\n"
				+ "eqt wtveez syift shtfnc hmckjxa apwbvn yme okdl hbihdtv hxahns eetvwz\r\n"
				+ "rokdg ndjw hprxjc viys mbcctod dbvd\r\n"
				+ "lhzb fyxf xaslmi sjd vqp grxhmfe snetfv mgivd uaknj givkdi\r\n"
				+ "gxkxl kqcdnl rna jhcuepd npiedg djcpheu huce njryw bjluhq bvedvl kqxu\r\n"
				+ "sogh uym atpzuwx vjgbe xgrvkg thgbyn mptcebt rkro\r\n"
				+ "tnpxw uxrqxd lajmsmr tnnlt vrvbf deret hkmvrs eubvkn kks hjq\r\n" + "rcdoa zfja vod supip dvo\r\n"
				+ "zbxdo xglqv how mgoq jqrdou pwrminc lidi nfs xglqv lidi\r\n"
				+ "ldmnp dnqn ahhr tha mvsbsfh rpm rgus faf tjash\r\n"
				+ "ewrdol jqhfpf rckj mrxlwj redjg bmxprx grla\r\n" + "rhr jksebwa vtu skwaejb vut\r\n"
				+ "wrx iqvrjh atrt xrw vtqo tkcasd xedjh zkqrh vvhj\r\n" + "owc qlzygar uajwwe obzl inxawur\r\n"
				+ "crbtrf phvy nzipo rctbfr trrcbf\r\n" + "vwuun wcfhhzo vxxjdt fbf bqtmmhs bffqcna\r\n"
				+ "wkxfxmv zmrkyh sggw whwcw zukynw\r\n" + "lsdiy lnbn kblxi qfyib irfl mymrr zqbl\r\n"
				+ "gwdkeu ghn afry zxoz fary uzntlnk kee xtnop ptnox zngoran\r\n" + "lgs lsg sgeseiz gsl\r\n"
				+ "erpoqpi svtnv vsogl uym amzxbs\r\n" + "jtmodqx yjcsfcl zosugm jrekfdw xxbdqnx fcha\r\n"
				+ "vio tlfxokx xaoq pydeiq glxsuzm honifvf maiuzsy uizsyam eco\r\n" + "ophcui saka qyt ltti syw\r\n"
				+ "qff qff sde ryv\r\n" + "eiii jazx nlehtx tnhvxl rzvsjo qkupif feypppe tefxr wdjmlc\r\n"
				+ "pdrr mwuy wccd rxla drpr enbbap\r\n" + "pclml ubwdbz hfudj gdpujfm ovabv\r\n"
				+ "uink ffebi wdvhqzs qiympf lqxihty vnsp wdvhqzs hutxkcs lxfuos hutxkcs\r\n"
				+ "fycoaw palkpz yrkg kappzl ncjym mergg kryg\r\n" + "eqy npvgh ghafkro piqnogb polacs qye hnvpg\r\n"
				+ "dxyy udhmz jij tqsuic qxz erctv\r\n"
				+ "urum nmbr cgek eetmhj gxr oxgukf wzdmvi oibzt fxkoug rcrywcr rglx\r\n"
				+ "jkp ofej waibl opqhmww ifnczcg jdtkbc lil isc ill mylvuv\r\n"
				+ "vqbcosk yhhsy gasmj bspx peakt cjtekw hvzo ywe qcvbosk ohzv qddt\r\n"
				+ "edq llbvsx vedyvlm gou wkecank rkgf ziyrr belgo tbz\r\n"
				+ "wbome vhzf ztk zaxiu ywjb supuf beq sxq spuuf pufus\r\n" + "femu ymkdoew kjynct aia\r\n"
				+ "yjymr orovqj aremii licw bdtnc\r\n" + "uyade fbx duaye ujtvpn\r\n"
				+ "yzvp pvzgjp yofcvya gvkkoh cafyvoy mhsm okhkvg\r\n"
				+ "xuh qkaf dmi imd tzmlce mqkxj qilrc dim cadotvy\r\n"
				+ "azpqgb kyc aflgyaf laagffy kesmk jzyzaer taf bpkbzdg\r\n" + "ogd dbdlh dqt zaaloh\r\n"
				+ "exal vgnfx omu omepvwf szcwq snz bptite bzqyxl khmblyc sse emg\r\n"
				+ "yqcbwsn aihhf tqck tcqk wqwqy cfez xahpn\r\n" + "qqbuf lil ies tqu pyxhqp mnfuk azj\r\n"
				+ "vwma rzdtgl mxbasw nwgjav mwav\r\n" + "itpjfq rrgyt hralwm fqrig btwcod\r\n"
				+ "ydjd kmk fvwr wrfv yvhw mkk\r\n" + "xbsxub yhsj xzbuf ace xubbsx fzuxb vxk\r\n"
				+ "ttsist vubpf mhwkmtx vlj hdsva kmmhtwx ukxr upfvb tbma fxsrnxl hzwufho\r\n"
				+ "wckjvz unmtev egxts ihw topvw ptowv rnihhmq\r\n" + "gpdtl kcric nwg ssbs qah aarp ydsdty ngw\r\n"
				+ "lzhxbbq oktvcw xbasqe owtmwgp koa gumjie sodwrp hqsw aqh dtgsbb\r\n"
				+ "xjbyy mxfxa ogvk nqiy qyni ldqwryj niyq jjixc\r\n" + "uhbul daccgva xtiz dim uhbul yjmakv yjmakv\r\n"
				+ "huo esajup ouj oju ujo\r\n" + "eeeu hwvsk jfkmds okhi pogskfm itdlbll\r\n"
				+ "lpyubo dylpfb iehwug decj ntidy cuygyg lalkb iutu oxgm imn";

		String[] zinnen1 = input.split("\r\n");

		String[][] woorden = new String[zinnen1.length][];

		for (int i = 0; i < zinnen1.length; i++) {
			woorden[i] = zinnen1[i].split(" ");
		}

		int count = 0;
		int geldig = 0;
		int ongeldig = 0;
		for (int zinnen = 0; zinnen < woorden.length; zinnen++) {
			for (int i = 0; i < woorden[zinnen].length; i++) {
				for (int controle = (i + 1); controle < woorden[zinnen].length; controle++) {
					if (woorden[zinnen][controle] != null) {
						if (woorden[zinnen][i].equals(woorden[zinnen][controle])) {
							count++;
						}
					} else {
						controle = 15;
					}
				}
			}
			if (count != 0) {
				ongeldig++;
			}
			count = 0;
		}
		geldig = woorden.length - ongeldig;
		System.out.println("*** Deel 1 ***");
		System.out.println(geldig);
	}
}
