package net.lepidodendron.util;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.ICriterionTrigger;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ModTriggers

{
    public static final CustomTrigger ENTER_PRECAMBRIAN = new CustomTrigger("enter_pf_precambrian");
    public static final CustomTrigger ENTER_CAMBRIAN = new CustomTrigger("enter_pf_cambrian");
    public static final CustomTrigger ENTER_ORDOVICIAN = new CustomTrigger("enter_pf_ordovician");
    public static final CustomTrigger ENTER_SILURIAN = new CustomTrigger("enter_pf_silurian");
    public static final CustomTrigger ENTER_DEVONIAN = new CustomTrigger("enter_pf_devonian");
    public static final CustomTrigger ENTER_CARBONIFEROUS = new CustomTrigger("enter_pf_carboniferous");
    public static final CustomTrigger ENTER_PERMIAN = new CustomTrigger("enter_pf_permian");
    public static final CustomTrigger ENTER_TRIASSIC = new CustomTrigger("enter_pf_triassic");
    public static final CustomTrigger ENTER_JURASSIC = new CustomTrigger("enter_pf_jurassic");
    public static final CustomTrigger ENTER_CRETACEOUS = new CustomTrigger("enter_pf_cretaceous");
    public static final CustomTrigger REJUVENATE = new CustomTrigger("pf_rejuvenate");
    public static final CustomTrigger USE_CAGE = new CustomTrigger("pf_use_cage");
    public static final CustomTrigger USE_JAR = new CustomTrigger("pf_use_jar");
    public static final CustomTrigger EPHEDRA = new CustomTrigger("pf_eat_ephedra");
    public static final CustomTrigger TAIL = new CustomTrigger("pf_eat_tail");

    //Knowledge of blocks:
    //Precambrian:
    public static final CustomTrigger CLICK_ARBOREA = new CustomTrigger("pf_book_arborea");
    public static final CustomTrigger CLICK_ARKARUA = new CustomTrigger("pf_book_arkarua");
    public static final CustomTrigger CLICK_AUSIA = new CustomTrigger("pf_book_ausia");
    public static final CustomTrigger CLICK_BOMAKELLIA = new CustomTrigger("pf_book_bomakellia");
    public static final CustomTrigger CLICK_BRADGATIA = new CustomTrigger("pf_book_bradgatia");
    public static final CustomTrigger CLICK_BURYKHIA = new CustomTrigger("pf_book_burykhia");
    public static final CustomTrigger CLICK_CHARNIA = new CustomTrigger("pf_book_charnia");
    public static final CustomTrigger CLICK_CHARNIODISCUS = new CustomTrigger("pf_book_charniodiscus");
    public static final CustomTrigger CLICK_CLOUDINA = new CustomTrigger("pf_book_cloudina");
    public static final CustomTrigger CLICK_CONOMEDUSITES = new CustomTrigger("pf_book_conomedusites");
    public static final CustomTrigger CLICK_CORONACOLLINA = new CustomTrigger("pf_book_coronacollina");
    public static final CustomTrigger CLICK_CORUMBELLA = new CustomTrigger("pf_book_corumbella");
    public static final CustomTrigger CLICK_FUNISIA = new CustomTrigger("pf_book_funisia");
    public static final CustomTrigger CLICK_GRYPANIA = new CustomTrigger("pf_book_grypania");
    public static final CustomTrigger CLICK_HAOOTIA = new CustomTrigger("pf_book_haootia");
    public static final CustomTrigger CLICK_HAPSIDOPHYLLAS = new CustomTrigger("pf_book_hapsidophyllas");
    public static final CustomTrigger CLICK_INARIA = new CustomTrigger("pf_book_inaria");
    public static final CustomTrigger CLICK_NAMACALATHUS = new CustomTrigger("pf_book_namacalathus");
    public static final CustomTrigger CLICK_NAMAPOIKIA = new CustomTrigger("pf_book_namapoikia");
    public static final CustomTrigger CLICK_PAMBIKALBAE = new CustomTrigger("pf_book_pambikalbae");
    public static final CustomTrigger CLICK_PARVISCOPA = new CustomTrigger("pf_book_parviscopa");
    public static final CustomTrigger CLICK_PRIMOCANDELABRUM = new CustomTrigger("pf_book_primocandelabrum");
    public static final CustomTrigger CLICK_PTERIDINIUM = new CustomTrigger("pf_book_pteridinium");
    public static final CustomTrigger CLICK_SWARTPUNTIA = new CustomTrigger("pf_book_swartpuntia");
    public static final CustomTrigger CLICK_TAWUIA = new CustomTrigger("pf_book_tawuia");
    public static final CustomTrigger CLICK_THECTARDIS = new CustomTrigger("pf_book_thectardis");
    public static final CustomTrigger CLICK_TRIBRACHIDIUM = new CustomTrigger("pf_book_tribrachidium");
    public static final CustomTrigger CLICK_VENTOGYRUS = new CustomTrigger("pf_book_ventogyrus");
    public static final CustomTrigger CLICK_SPONGE = new CustomTrigger("pf_book_sponge");

    //Cambrian:
    public static final CustomTrigger CLICK_ALLONNIA = new CustomTrigger("pf_book_allonnia");
    public static final CustomTrigger CLICK_CASTERICYSTIS = new CustomTrigger("pf_book_castericystis");
    public static final CustomTrigger CLICK_DINOMISCHUS = new CustomTrigger("pf_book_dinomischus");
    public static final CustomTrigger CLICK_ECHMATOCRINUS = new CustomTrigger("pf_book_echmatocrinus");
    public static final CustomTrigger CLICK_GOGIA = new CustomTrigger("pf_book_gogia");
    public static final CustomTrigger CLICK_HELICOCYSTIS = new CustomTrigger("pf_book_helicocystis");
    public static final CustomTrigger CLICK_HERPETOGASTER = new CustomTrigger("pf_book_herpetogaster");
    public static final CustomTrigger CLICK_LEPIDOCYSTIS = new CustomTrigger("pf_book_lepidocystis");
    public static final CustomTrigger CLICK_LYRACYSTIS = new CustomTrigger("pf_book_lyracystis");
    public static final CustomTrigger CLICK_SIPHUSAUCTUM = new CustomTrigger("pf_book_siphusauctum");
    public static final CustomTrigger CLICK_SEA_ANEMONE = new CustomTrigger("pf_book_seaanemone");
    public static final CustomTrigger CLICK_XIANGUANGIA = new CustomTrigger("pf_book_xianguangia");
    public static final CustomTrigger CLICK_PIRANIA = new CustomTrigger("pf_book_pirania");
    public static final CustomTrigger CLICK_CHAUNOGRAPTUS = new CustomTrigger("pf_book_chaunograptus");
    public static final CustomTrigger CLICK_DICTYONEMA = new CustomTrigger("pf_book_dictyonema");
    public static final CustomTrigger CLICK_STROMATOCYSTITES = new CustomTrigger("pf_book_stromatocystites");
    public static final CustomTrigger CLICK_STROMATOVERIS = new CustomTrigger("pf_book_stromatoveris");
    public static final CustomTrigger CLICK_THAUMAPTILON = new CustomTrigger("pf_book_thaumaptilon");
    public static final CustomTrigger CLICK_FACIVERMIS = new CustomTrigger("pf_book_facivermis");
    public static final CustomTrigger CLICK_OESIAMARGARETIA = new CustomTrigger("pf_book_oesiamargaretia");


    //Ordovician:
    public static final CustomTrigger CLICK_ARISTOCYSTITES = new CustomTrigger("pf_book_aristocystites");
    public static final CustomTrigger CLICK_AULACERA = new CustomTrigger("pf_book_aulacera");
    public static final CustomTrigger CLICK_BLASTOIDS = new CustomTrigger("pf_book_blastoids");
    public static final CustomTrigger CLICK_BIVALVE = new CustomTrigger("pf_book_bivalve");
    public static final CustomTrigger CLICK_BOLBOPORITES = new CustomTrigger("pf_book_bolboporites");
    public static final CustomTrigger CLICK_CARYOCRINITES = new CustomTrigger("pf_book_caryocrinites");
    public static final CustomTrigger CLICK_DENDROGRAPTUS = new CustomTrigger("pf_book_dendrograptus");
    public static final CustomTrigger CLICK_ECHINOSPHAERITES = new CustomTrigger("pf_book_echinosphaerites");
    public static final CustomTrigger CLICK_FENESTELLA = new CustomTrigger("pf_book_fenestella");
    public static final CustomTrigger CLICK_RUGOSA = new CustomTrigger("pf_book_rugosa");
    public static final CustomTrigger CLICK_TABULATA = new CustomTrigger("pf_book_tabulata");
    public static final CustomTrigger CLICK_THAMNOBEATRICEA = new CustomTrigger("pf_book_thamnobeatricea");
    public static final CustomTrigger CLICK_TENTACULITA = new CustomTrigger("pf_book_tentaculita");
    public static final CustomTrigger CLICK_CORNULITIDA = new CustomTrigger("pf_book_cornulitida");

    //Silurian:
    public static final CustomTrigger CLICK_ENCRINUS = new CustomTrigger("pf_book_encrinus");
    public static final CustomTrigger CLICK_EUCALYPTOCRINITES = new CustomTrigger("pf_book_eucalyptocrinites");
    public static final CustomTrigger CLICK_CYATHOCRINUS = new CustomTrigger("pf_book_cyathocrinus");
    public static final CustomTrigger CLICK_PETALOCRINUS = new CustomTrigger("pf_book_petalocrinus");
    public static final CustomTrigger CLICK_PISOCRINUS = new CustomTrigger("pf_book_pisocrinus");
    public static final CustomTrigger CLICK_PSEUDOCRINITES = new CustomTrigger("pf_book_pseudocrinites");
    public static final CustomTrigger CLICK_SCYPHOCRINUS = new CustomTrigger("pf_book_scyphocrinus");
    public static final CustomTrigger CLICK_SIPHONOCRINUS = new CustomTrigger("pf_book_siphonocrinus");
    public static final CustomTrigger CLICK_CALLICRINUS = new CustomTrigger("pf_book_callicrinus");

    //Devonian:
    public static final CustomTrigger CLICK_ANCYROCRINUS = new CustomTrigger("pf_book_ancyrocrinus");
    public static final CustomTrigger CLICK_CUPRESSOCRINITES = new CustomTrigger("pf_book_cupressocrinites");
    public static final CustomTrigger CLICK_MEGALODON_BIVALVE = new CustomTrigger("pf_book_megalodon_bivalve");
    public static final CustomTrigger CLICK_VADAROCRINUS = new CustomTrigger("pf_book_vadarocrinus");

    //Carboniferous:
    public static final CustomTrigger CLICK_DIZYGOCRINUS = new CustomTrigger("pf_book_dizygocrinus");
    public static final CustomTrigger CLICK_ESCUMASIA = new CustomTrigger("pf_book_escumasia");
    public static final CustomTrigger CLICK_MACROCRINUS = new CustomTrigger("pf_book_macrocrinus");

    //Permian:
    public static final CustomTrigger CLICK_GIGANTOSPONGIA = new CustomTrigger("pf_book_gigantospongia");
    public static final CustomTrigger CLICK_JIMBACRINUS = new CustomTrigger("pf_book_jimbacrinus");

    //Triassic:
    public static final CustomTrigger CLICK_DICEROCARDIUM = new CustomTrigger("pf_book_dicerocardium");
    public static final CustomTrigger CLICK_LITHIOTIS = new CustomTrigger("pf_book_lithiotis");
    public static final CustomTrigger CLICK_TRAUMATOCRINUS = new CustomTrigger("pf_book_traumatocrinus");
    public static final CustomTrigger CLICK_VOSTOCOVACRINUS = new CustomTrigger("pf_book_vostocovacrinus");
    public static final CustomTrigger CLICK_HOLOCRINUS = new CustomTrigger("pf_book_holocrinus");

    //Jurassic:


    public static final CustomTrigger CLICK_LEPIDODENDRON = new CustomTrigger("pf_book_lepidodendron");

    //Knowledge of mobs:
    public static final CustomTrigger CLICK_ACADOARADOXIDES = new CustomTrigger("pf_book_acadoaradoxides");
    public static final CustomTrigger CLICK_ACANTHODES = new CustomTrigger("pf_book_acanthodes");
    public static final CustomTrigger CLICK_ACANTHOSTEGA = new CustomTrigger("pf_book_acanthostega");
    public static final CustomTrigger CLICK_ACANTHOSTOMATOPS = new CustomTrigger("pf_book_acanthostomatops");
    public static final CustomTrigger CLICK_ACROLEPIS = new CustomTrigger("pf_book_acrolepis");
    public static final CustomTrigger CLICK_ACUTIRAMUS = new CustomTrigger("pf_book_acutiramus");
    public static final CustomTrigger CLICK_ADELOPHTHALMUS = new CustomTrigger("pf_book_adelophthalmus");
    public static final CustomTrigger CLICK_AEGIROCASSIS = new CustomTrigger("pf_book_aegirocassis");
    public static final CustomTrigger CLICK_AINIKTOZOON = new CustomTrigger("pf_book_ainiktozoon");
    public static final CustomTrigger CLICK_AKMONISTION = new CustomTrigger("pf_book_akmonistion");
    public static final CustomTrigger CLICK_ALACARIS = new CustomTrigger("pf_book_alacaris");
    public static final CustomTrigger CLICK_ALBERTONIA = new CustomTrigger("pf_book_albertonia");
    public static final CustomTrigger CLICK_ALLENYPTERUS = new CustomTrigger("pf_book_allenypterus");
    public static final CustomTrigger CLICK_AMMONITE_ASTEROCERAS = new CustomTrigger("pf_book_ammonite_asteroceras");
    public static final CustomTrigger CLICK_AMMONITE_CERATITES = new CustomTrigger("pf_book_ammonite_ceratites");
    public static final CustomTrigger CLICK_AMMONITE_CORONICERAS = new CustomTrigger("pf_book_ammonite_coroniceras");
    public static final CustomTrigger CLICK_AMMONITE_CYLOLOBUS = new CustomTrigger("pf_book_ammonite_cylolobus");
    public static final CustomTrigger CLICK_AMMONITE_DACTYLIOCERAS = new CustomTrigger("pf_book_ammonite_dactylioceras");
    public static final CustomTrigger CLICK_AMMONITE_GONIATITES = new CustomTrigger("pf_book_ammonite_goniatites");
    public static final CustomTrigger CLICK_AMMONITE_MANTICOCERAS = new CustomTrigger("pf_book_ammonite_manticoceras");
    public static final CustomTrigger CLICK_AMMONITE_PACHYDESMOCERAS = new CustomTrigger("pf_book_ammonite_pachydesmoceras");
    public static final CustomTrigger CLICK_AMMONITE_PACHYDISCUS = new CustomTrigger("pf_book_ammonite_pachydiscus");
    public static final CustomTrigger CLICK_AMMONITE_PARAPUZOSIA = new CustomTrigger("pf_book_ammonite_parapuzosia");
    public static final CustomTrigger CLICK_AMMONITE_TITANITES = new CustomTrigger("pf_book_ammonite_titanites");
    public static final CustomTrigger CLICK_AMPHIBAMUS = new CustomTrigger("pf_book_amphibamus");
    public static final CustomTrigger CLICK_AMPLECTOBELUA = new CustomTrigger("pf_book_amplectobelua");
    public static final CustomTrigger CLICK_ANOMALOCARIS = new CustomTrigger("pf_book_anomalocaris");
    public static final CustomTrigger CLICK_ANTARCTICARCINUS = new CustomTrigger("pf_book_antarcticarcinus");
    public static final CustomTrigger CLICK_ANTEOSAURUS = new CustomTrigger("pf_book_anteosaurus");
    public static final CustomTrigger CLICK_ANTHRACOMEDUSA = new CustomTrigger("pf_book_anthracomedusa");
    public static final CustomTrigger CLICK_ANTINEOSTEUS = new CustomTrigger("pf_book_antineosteus");
    public static final CustomTrigger CLICK_APHETOCERAS = new CustomTrigger("pf_book_aphetoceras");
    public static final CustomTrigger CLICK_ARANDASPIS = new CustomTrigger("pf_book_arandaspis");
    public static final CustomTrigger CLICK_ARCHOBLATTINA = new CustomTrigger("pf_book_archoblattina");
    public static final CustomTrigger CLICK_ARCHOBLATTINA_NYMPH = new CustomTrigger("pf_book_archoblattina_nymph");
    public static final CustomTrigger CLICK_ARCHOSAURUS = new CustomTrigger("pf_book_archosaurus");
    public static final CustomTrigger CLICK_ASAPHUS = new CustomTrigger("pf_book_asaphus");
    public static final CustomTrigger CLICK_ASCENDONANUS = new CustomTrigger("pf_book_ascendonanus");
    public static final CustomTrigger CLICK_ATELEASPIS = new CustomTrigger("pf_book_ateleaspis");
    public static final CustomTrigger CLICK_ATTERCOPUS = new CustomTrigger("pf_book_attercopus");
    public static final CustomTrigger CLICK_AULACEPHALODON = new CustomTrigger("pf_book_aulacephalodon");
    public static final CustomTrigger CLICK_BALANERPETON = new CustomTrigger("pf_book_balanerpeton");
    public static final CustomTrigger CLICK_BANDRINGA = new CustomTrigger("pf_book_bandringa");
    public static final CustomTrigger CLICK_BANFFIA = new CustomTrigger("pf_book_banffia");
    public static final CustomTrigger CLICK_BARBCLABORNIA = new CustomTrigger("pf_book_barbclabornia");
    public static final CustomTrigger CLICK_BASILOCERAS = new CustomTrigger("pf_book_basiloceras");
    public static final CustomTrigger CLICK_BATOFASCICULUS = new CustomTrigger("pf_book_batofasciculus");
    public static final CustomTrigger CLICK_BELANTSEA = new CustomTrigger("pf_book_belantsea");
    public static final CustomTrigger CLICK_BIRKENIA = new CustomTrigger("pf_book_birkenia");
    public static final CustomTrigger CLICK_BLOURUGIA = new CustomTrigger("pf_book_blourugia");
    public static final CustomTrigger CLICK_BOBASATRANIA = new CustomTrigger("pf_book_bobasatrania");
    public static final CustomTrigger CLICK_BOTHRIOLEPIS = new CustomTrigger("pf_book_bothriolepis");
    public static final CustomTrigger CLICK_BRANCHIOSAUR = new CustomTrigger("pf_book_branchiosaur");
    public static final CustomTrigger CLICK_BROCHOADMONES = new CustomTrigger("pf_book_brochoadmones");
    public static final CustomTrigger CLICK_BUNOSTEGOS = new CustomTrigger("pf_book_bunostegos");
    public static final CustomTrigger CLICK_BUSHIZHEIA = new CustomTrigger("pf_book_bushizheia");
    public static final CustomTrigger CLICK_CACOPS = new CustomTrigger("pf_book_cacops");
    public static final CustomTrigger CLICK_CAMBRORASTER = new CustomTrigger("pf_book_cambroraster");
    public static final CustomTrigger CLICK_CAMEROCERAS = new CustomTrigger("pf_book_cameroceras");
    public static final CustomTrigger CLICK_CAMPBELLODUS = new CustomTrigger("pf_book_campbellodus");
    public static final CustomTrigger CLICK_CANADASPIS = new CustomTrigger("pf_book_canadaspis");
    public static final CustomTrigger CLICK_CANADIA = new CustomTrigger("pf_book_canadia");
    public static final CustomTrigger CLICK_CAPTORHINUS = new CustomTrigger("pf_book_captorhinus");
    public static final CustomTrigger CLICK_CARCINOSOMA = new CustomTrigger("pf_book_carcinosoma");
    public static final CustomTrigger CLICK_CAROLOWILHELMINA = new CustomTrigger("pf_book_carolowilhelmina");
    public static final CustomTrigger CLICK_CASINERIA = new CustomTrigger("pf_book_casineria");
    public static final CustomTrigger CLICK_CEPHALASPIS = new CustomTrigger("pf_book_cephalaspis");
    public static final CustomTrigger CLICK_CHEIRURUS = new CustomTrigger("pf_book_cheirurus");
    public static final CustomTrigger CLICK_CHELONIELLON = new CustomTrigger("pf_book_cheloniellon");
    public static final CustomTrigger CLICK_CLADOSELACHE = new CustomTrigger("pf_book_cladoselache");
    public static final CustomTrigger CLICK_CLAUDIOSAURUS = new CustomTrigger("pf_book_claudiosaurus");
    public static final CustomTrigger CLICK_CLYDAGNATHUS = new CustomTrigger("pf_book_clydagnathus");
    public static final CustomTrigger CLICK_COCCOSTEUS = new CustomTrigger("pf_book_coccosteus");
    public static final CustomTrigger CLICK_COELACANTHUS = new CustomTrigger("pf_book_coelacanthus");
    public static final CustomTrigger CLICK_COELOPHYSIS = new CustomTrigger("pf_book_coelophysis");
    public static final CustomTrigger CLICK_COELUROSAURAVUS = new CustomTrigger("pf_book_coelurosauravus");
    public static final CustomTrigger CLICK_COOPEROCERAS = new CustomTrigger("pf_book_cooperoceras");
    public static final CustomTrigger CLICK_COTHURNOCYSTIS = new CustomTrigger("pf_book_cothurnocystis");
    public static final CustomTrigger CLICK_COTYLORHYNCHUS = new CustomTrigger("pf_book_cotylorhynchus");
    public static final CustomTrigger CLICK_CRASSIGYRINUS = new CustomTrigger("pf_book_crassigyrinus");
    public static final CustomTrigger CLICK_CROTALOCEPHALUS = new CustomTrigger("pf_book_crotalocephalus");
    public static final CustomTrigger CLICK_CTENOSPONDYLUS = new CustomTrigger("pf_book_ctenospondylus");
    public static final CustomTrigger CLICK_CYCLONEMA = new CustomTrigger("pf_book_cyclonema");
    public static final CustomTrigger CLICK_CYNOGNATHUS = new CustomTrigger("pf_book_cynognathus");
    public static final CustomTrigger CLICK_CYRTOCERAS = new CustomTrigger("pf_book_cyrtoceras");
    public static final CustomTrigger CLICK_DAEDALICHTHYS = new CustomTrigger("pf_book_daedalichthys");
    public static final CustomTrigger CLICK_DALMANITES = new CustomTrigger("pf_book_dalmanites");
    public static final CustomTrigger CLICK_DASYCEPS = new CustomTrigger("pf_book_dasyceps");
    public static final CustomTrigger CLICK_DATHEOSAURUS = new CustomTrigger("pf_book_datheosaurus");
    public static final CustomTrigger CLICK_DEIROCERAS = new CustomTrigger("pf_book_deiroceras");
    public static final CustomTrigger CLICK_DIADECTES = new CustomTrigger("pf_book_diadectes");
    public static final CustomTrigger CLICK_DIANIA = new CustomTrigger("pf_book_diania");
    public static final CustomTrigger CLICK_DICKINSONIA = new CustomTrigger("pf_book_dickinsonia");
    public static final CustomTrigger CLICK_DIDYMOGRAPTUS = new CustomTrigger("pf_book_didymograptus");
    public static final CustomTrigger CLICK_DIICTODON = new CustomTrigger("pf_book_diictodon");
    public static final CustomTrigger CLICK_DIMETRODON = new CustomTrigger("pf_book_dimetrodon");
    public static final CustomTrigger CLICK_DIPLOCAULUS = new CustomTrigger("pf_book_diplocaulus");
    public static final CustomTrigger CLICK_DIPLOCERASPIS = new CustomTrigger("pf_book_diploceraspis");
    public static final CustomTrigger CLICK_DORYASPIS = new CustomTrigger("pf_book_doryaspis");
    public static final CustomTrigger CLICK_DORYPTERUS = new CustomTrigger("pf_book_dorypterus");
    public static final CustomTrigger CLICK_DRACOPRISTIS = new CustomTrigger("pf_book_dracopristis");
    public static final CustomTrigger CLICK_DREPANASPIS = new CustomTrigger("pf_book_drepanaspis");
    public static final CustomTrigger CLICK_DUNKLEOSTEUS = new CustomTrigger("pf_book_dunkleosteus");
    public static final CustomTrigger CLICK_DVINIA = new CustomTrigger("pf_book_dvinia");
    public static final CustomTrigger CLICK_DVINOSAURUS = new CustomTrigger("pf_book_dvinosaurus");
    public static final CustomTrigger CLICK_EBENAQUA = new CustomTrigger("pf_book_ebenaqua");
    public static final CustomTrigger CLICK_EDESTUS = new CustomTrigger("pf_book_edestus");
    public static final CustomTrigger CLICK_EGLONASPIS = new CustomTrigger("pf_book_eglonaspis");
    public static final CustomTrigger CLICK_ELGINIA = new CustomTrigger("pf_book_elginia");
    public static final CustomTrigger CLICK_ELLIPSOCEPHALUS = new CustomTrigger("pf_book_ellipsocephalus");
    public static final CustomTrigger CLICK_ELRATHIA = new CustomTrigger("pf_book_elrathia");
    public static final CustomTrigger CLICK_ENDOCERAS = new CustomTrigger("pf_book_endoceras");
    public static final CustomTrigger CLICK_ENOPLOURA = new CustomTrigger("pf_book_enoploura");
    public static final CustomTrigger CLICK_EOANDROMEDA = new CustomTrigger("pf_book_eoandromeda");
    public static final CustomTrigger CLICK_EOARTHROPLEURA = new CustomTrigger("pf_book_eoarthropleura");
    public static final CustomTrigger CLICK_EORAPTOR = new CustomTrigger("pf_book_eoraptor");
    public static final CustomTrigger CLICK_EOREDLICHIA = new CustomTrigger("pf_book_eoredlichia");
    public static final CustomTrigger CLICK_EOSAURICHTHYS = new CustomTrigger("pf_book_eosaurichthys");
    public static final CustomTrigger CLICK_EOSIMOPS = new CustomTrigger("pf_book_eosimops");
    public static final CustomTrigger CLICK_ERICIXERXES = new CustomTrigger("pf_book_ericixerxes");
    public static final CustomTrigger CLICK_ERYOPS = new CustomTrigger("pf_book_eryops");
    public static final CustomTrigger CLICK_ESTEMMENOSUCHUS = new CustomTrigger("pf_book_estemmenosuchus");
    public static final CustomTrigger CLICK_EUCHAMBERSIA = new CustomTrigger("pf_book_euchambersia");
    public static final CustomTrigger CLICK_EUNOTOSAURUS = new CustomTrigger("pf_book_eunotosaurus");
    public static final CustomTrigger CLICK_EURYPTERUS = new CustomTrigger("pf_book_eurypterus");
    public static final CustomTrigger CLICK_EUSTHENOPTERON = new CustomTrigger("pf_book_eusthenopteron");
    public static final CustomTrigger CLICK_FEROXICHTHYS = new CustomTrigger("pf_book_feroxichthys");
    public static final CustomTrigger CLICK_FURCACAUDA = new CustomTrigger("pf_book_furcacauda");
    public static final CustomTrigger CLICK_FURCASTER = new CustomTrigger("pf_book_furcaster");
    public static final CustomTrigger CLICK_GABREYASPIS = new CustomTrigger("pf_book_gabreyaspis");
    public static final CustomTrigger CLICK_GANTAROSTRATASPIS = new CustomTrigger("pf_book_gantarostrataspis");
    public static final CustomTrigger CLICK_GEMMACTENA = new CustomTrigger("pf_book_gemmactena");
    public static final CustomTrigger CLICK_GEMUENDINA = new CustomTrigger("pf_book_gemuendina");
    public static final CustomTrigger CLICK_GEPHYROSTEGUS = new CustomTrigger("pf_book_gephyrostegus");
    public static final CustomTrigger CLICK_GERARUS = new CustomTrigger("pf_book_gerarus");
    public static final CustomTrigger CLICK_GLAURUNG = new CustomTrigger("pf_book_glaurung");
    public static final CustomTrigger CLICK_GNATHORHIZA = new CustomTrigger("pf_book_gnathorhiza");
    public static final CustomTrigger CLICK_GONIOCERAS = new CustomTrigger("pf_book_gonioceras");
    public static final CustomTrigger CLICK_GORGONOPS = new CustomTrigger("pf_book_gorgonops");
    public static final CustomTrigger CLICK_GROENLANDASPIS = new CustomTrigger("pf_book_groenlandaspis");
    public static final CustomTrigger CLICK_GYRACANTHIDES = new CustomTrigger("pf_book_gyracanthides");
    public static final CustomTrigger CLICK_HAIKOUICHTHYS = new CustomTrigger("pf_book_haikouichthys");
    public static final CustomTrigger CLICK_HALLUCIGENIA = new CustomTrigger("pf_book_hallucigenia");
    public static final CustomTrigger CLICK_HARVESTMAN = new CustomTrigger("pf_book_harvestman");
    public static final CustomTrigger CLICK_HELENODORA = new CustomTrigger("pf_book_helenodora");
    public static final CustomTrigger CLICK_HELIANTHASTER = new CustomTrigger("pf_book_helianthaster");
    public static final CustomTrigger CLICK_HELICOPRION = new CustomTrigger("pf_book_helicoprion");
    public static final CustomTrigger CLICK_HELMETIA = new CustomTrigger("pf_book_helmetia");
    public static final CustomTrigger CLICK_HEMICYCLASPIS = new CustomTrigger("pf_book_hemicyclaspis");
    public static final CustomTrigger CLICK_HERRERASAURUS = new CustomTrigger("pf_book_herrerasaurus");
    public static final CustomTrigger CLICK_HETEROSTEUS = new CustomTrigger("pf_book_heterosteus");
    public static final CustomTrigger CLICK_HIBBERTOPTERUS = new CustomTrigger("pf_book_hibbertopterus");
    public static final CustomTrigger CLICK_HIBERNASPIS = new CustomTrigger("pf_book_hibernaspis");
    public static final CustomTrigger CLICK_HUNGIOIDES = new CustomTrigger("pf_book_hungioides");
    public static final CustomTrigger CLICK_HYLONOMUS = new CustomTrigger("pf_book_hylonomus");
    public static final CustomTrigger CLICK_HYNERIA = new CustomTrigger("pf_book_hyneria");
    public static final CustomTrigger CLICK_ICHTHYOSTEGA = new CustomTrigger("pf_book_ichthyostega");
    public static final CustomTrigger CLICK_INIOPTERYX = new CustomTrigger("pf_book_iniopteryx");
    public static final CustomTrigger CLICK_INOSTRANCEVIA = new CustomTrigger("pf_book_inostrancevia");
    public static final CustomTrigger CLICK_ISOTELUS = new CustomTrigger("pf_book_isotelus");
    public static final CustomTrigger CLICK_ITALOPHLEBIA = new CustomTrigger("pf_book_italophlebia");
    public static final CustomTrigger CLICK_JAEKELOPTERUS = new CustomTrigger("pf_book_jaekelopterus");
    public static final CustomTrigger CLICK_JANASSA = new CustomTrigger("pf_book_janassa");
    public static final CustomTrigger CLICK_JELLYFISH_PRECAMBRIAN = new CustomTrigger("pf_book_jellyfish_precambrian");
    public static final CustomTrigger CLICK_JELLYFISH1 = new CustomTrigger("pf_book_jellyfish1");
    public static final CustomTrigger CLICK_JELLYFISH2 = new CustomTrigger("pf_book_jellyfish2");
    public static final CustomTrigger CLICK_JELLYFISH3 = new CustomTrigger("pf_book_jellyfish3");
    public static final CustomTrigger CLICK_JELLYFISH4 = new CustomTrigger("pf_book_jellyfish4");
    public static final CustomTrigger CLICK_JELLYFISH5 = new CustomTrigger("pf_book_jellyfish5");
    public static final CustomTrigger CLICK_JELLYFISH6 = new CustomTrigger("pf_book_jellyfish6");
    public static final CustomTrigger CLICK_JELLYFISH7 = new CustomTrigger("pf_book_jellyfish7");
    public static final CustomTrigger CLICK_JIANSHANOPODIA = new CustomTrigger("pf_book_jianshanopodia");
    public static final CustomTrigger CLICK_JONKERIA = new CustomTrigger("pf_book_jonkeria");
    public static final CustomTrigger CLICK_KAIBABVENATOR = new CustomTrigger("pf_book_kaibabvenator");
    public static final CustomTrigger CLICK_KALBARRIA = new CustomTrigger("pf_book_kalbarria");
    public static final CustomTrigger CLICK_KERYGMACHELA = new CustomTrigger("pf_book_kerygmachela");
    public static final CustomTrigger CLICK_KIMBERELLA = new CustomTrigger("pf_book_kimberella");
    public static final CustomTrigger CLICK_KODYMIRUS = new CustomTrigger("pf_book_kodymirus");
    public static final CustomTrigger CLICK_KOKOMOPTERUS = new CustomTrigger("pf_book_kokomopterus");
    public static final CustomTrigger CLICK_LABIDOSAURUS = new CustomTrigger("pf_book_labidosaurus");
    public static final CustomTrigger CLICK_LACCOGNATHUS = new CustomTrigger("pf_book_laccognathus");
    public static final CustomTrigger CLICK_LAMINACARIS = new CustomTrigger("pf_book_laminacaris");
    public static final CustomTrigger CLICK_LEBACHACANTHUS = new CustomTrigger("pf_book_lebachacanthus");
    public static final CustomTrigger CLICK_LILIENSTERNUS = new CustomTrigger("pf_book_liliensternus");
    public static final CustomTrigger CLICK_LIMNOSCELIS = new CustomTrigger("pf_book_limnoscelis");
    public static final CustomTrigger CLICK_LISOWICIA = new CustomTrigger("pf_book_lisowicia");
    public static final CustomTrigger CLICK_LISTRACANTHUS = new CustomTrigger("pf_book_listracanthus");
    public static final CustomTrigger CLICK_LUNASPIS = new CustomTrigger("pf_book_lunaspis");
    public static final CustomTrigger CLICK_LUNATASPIS = new CustomTrigger("pf_book_lunataspis");
    public static final CustomTrigger CLICK_LUNGMENSHANASPIS = new CustomTrigger("pf_book_lungmenshanaspis");
    public static final CustomTrigger CLICK_LYRARAPAX = new CustomTrigger("pf_book_lyrarapax");
    public static final CustomTrigger CLICK_LYSTROSAURUS = new CustomTrigger("pf_book_lystrosaurus");
    public static final CustomTrigger CLICK_MACLURINA = new CustomTrigger("pf_book_maclurina");
    public static final CustomTrigger CLICK_MARRELLA = new CustomTrigger("pf_book_marrella");
    public static final CustomTrigger CLICK_MASTODONSAURUS = new CustomTrigger("pf_book_mastodonsaurus");
    public static final CustomTrigger CLICK_MCNAMARASPIS = new CustomTrigger("pf_book_mcnamaraspis");
    public static final CustomTrigger CLICK_MEGALOCEPHALUS = new CustomTrigger("pf_book_megalocephalus");
    public static final CustomTrigger CLICK_MEGALOGRAPTUS = new CustomTrigger("pf_book_megalograptus");
    public static final CustomTrigger CLICK_MEGANEURA = new CustomTrigger("pf_book_meganeura");
    public static final CustomTrigger CLICK_MEGANEUROPSIS = new CustomTrigger("pf_book_meganeuropsis");
    public static final CustomTrigger CLICK_MEGARACHNE = new CustomTrigger("pf_book_megarachne");
    public static final CustomTrigger CLICK_MELOSAURUS = new CustomTrigger("pf_book_melosaurus");
    public static final CustomTrigger CLICK_MENASPIS = new CustomTrigger("pf_book_menaspis");
    public static final CustomTrigger CLICK_MESOSAURUS = new CustomTrigger("pf_book_mesosaurus");
    public static final CustomTrigger CLICK_METASPRIGGINA = new CustomTrigger("pf_book_metaspriggina");
    public static final CustomTrigger CLICK_MICRODICTYON = new CustomTrigger("pf_book_microdictyon");
    public static final CustomTrigger CLICK_MIMETASTER = new CustomTrigger("pf_book_mimetaster");
    public static final CustomTrigger CLICK_MIXOPTERUS = new CustomTrigger("pf_book_mixopterus");
    public static final CustomTrigger CLICK_MONOGRAPTUS = new CustomTrigger("pf_book_monograptus");
    public static final CustomTrigger CLICK_MOOREOCERAS = new CustomTrigger("pf_book_mooreoceras");
    public static final CustomTrigger CLICK_MOSCHOPS = new CustomTrigger("pf_book_moschops");
    public static final CustomTrigger CLICK_NECTOCARIS = new CustomTrigger("pf_book_nectocaris");
    public static final CustomTrigger CLICK_ODARAIA = new CustomTrigger("pf_book_odaraia");
    public static final CustomTrigger CLICK_ODONTOGRIPHUS = new CustomTrigger("pf_book_odontogriphus");
    public static final CustomTrigger CLICK_OMNIDENS = new CustomTrigger("pf_book_omnidens");
    public static final CustomTrigger CLICK_ONYCHODUS = new CustomTrigger("pf_book_onychodus");
    public static final CustomTrigger CLICK_OPABINIA = new CustomTrigger("pf_book_opabinia");
    public static final CustomTrigger CLICK_OPHIACODON = new CustomTrigger("pf_book_ophiacodon");
    public static final CustomTrigger CLICK_ORTHOCERAS = new CustomTrigger("pf_book_orthoceras");
    public static final CustomTrigger CLICK_ORTHROZANCLUS = new CustomTrigger("pf_book_orthrozanclus");
    public static final CustomTrigger CLICK_OSTEOLEPIS = new CustomTrigger("pf_book_osteolepis");
    public static final CustomTrigger CLICK_OTTOIA = new CustomTrigger("pf_book_ottoia");
    public static final CustomTrigger CLICK_PAGEA = new CustomTrigger("pf_book_pagea");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_DELITZSCHALA = new CustomTrigger("pf_book_palaeodictyoptera_delitzschala");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_DUNBARIA = new CustomTrigger("pf_book_palaeodictyoptera_dunbaria");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_HOMALONEURA = new CustomTrigger("pf_book_palaeodictyoptera_homaloneura");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_HOMOIOPTERA = new CustomTrigger("pf_book_palaeodictyoptera_homoioptera");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_LITHOMANTIS = new CustomTrigger("pf_book_palaeodictyoptera_lithomantis");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_LYCOCERCUS = new CustomTrigger("pf_book_palaeodictyoptera_lycocercus");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_STENODICTYA = new CustomTrigger("pf_book_palaeodictyoptera_stenodictya");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_SINODUNBARIA = new CustomTrigger("pf_book_palaeodictyoptera_sinodunbaria");
    public static final CustomTrigger CLICK_PALAEOISOPUS = new CustomTrigger("pf_book_palaeoisopus");
    public static final CustomTrigger CLICK_ANCIENT_JELLY = new CustomTrigger("pf_book_ancientjelly");
    public static final CustomTrigger CLICK_PALAEONTINID = new CustomTrigger("pf_book_palaeontinid");
    public static final CustomTrigger CLICK_PANDERICHTHYS = new CustomTrigger("pf_book_panderichthys");
    public static final CustomTrigger CLICK_PANTYLUS = new CustomTrigger("pf_book_pantylus");
    public static final CustomTrigger CLICK_PARADOXIDES = new CustomTrigger("pf_book_paradoxides");
    public static final CustomTrigger CLICK_PARANAICHTHYS = new CustomTrigger("pf_book_paranaichthys");
    public static final CustomTrigger CLICK_PAREXUS = new CustomTrigger("pf_book_parexus");
    public static final CustomTrigger CLICK_PARVANCORINA = new CustomTrigger("pf_book_parvancorina");
    public static final CustomTrigger CLICK_PAUCIPODIA = new CustomTrigger("pf_book_paucipodia");
    public static final CustomTrigger CLICK_PEDERPES = new CustomTrigger("pf_book_pederpes");
    public static final CustomTrigger CLICK_PELURGASPIS = new CustomTrigger("pf_book_pelurgaspis");
    public static final CustomTrigger CLICK_PHANEROTINUS = new CustomTrigger("pf_book_phanerotinus");
    public static final CustomTrigger CLICK_PHANTASPIS = new CustomTrigger("pf_book_phantaspis");
    public static final CustomTrigger CLICK_PHARYNGOLEPIS = new CustomTrigger("pf_book_pharyngolepis");
    public static final CustomTrigger CLICK_PHLEGETHONTIA = new CustomTrigger("pf_book_phlegethontia");
    public static final CustomTrigger CLICK_PHOLIDERPETON = new CustomTrigger("pf_book_pholiderpeton");
    public static final CustomTrigger CLICK_PIKAIA = new CustomTrigger("pf_book_pikaia");
    public static final CustomTrigger CLICK_PLACERIAS = new CustomTrigger("pf_book_placerias");
    public static final CustomTrigger CLICK_PLATEOSAURUS = new CustomTrigger("pf_book_plateosaurus");
    public static final CustomTrigger CLICK_PLATYCARASPIS = new CustomTrigger("pf_book_platycaraspis");
    public static final CustomTrigger CLICK_PLATYHYSTRIX = new CustomTrigger("pf_book_platyhystrix");
    public static final CustomTrigger CLICK_PLATYLOMASPIS = new CustomTrigger("pf_book_platylomaspis");
    public static final CustomTrigger CLICK_PLATYSOMUS = new CustomTrigger("pf_book_platysomus");
    public static final CustomTrigger CLICK_PNEUMODESMUS = new CustomTrigger("pf_book_pneumodesmus");
    public static final CustomTrigger CLICK_POLEUMITA = new CustomTrigger("pf_book_poleumita");
    public static final CustomTrigger CLICK_POMATRUM = new CustomTrigger("pf_book_pomatrum");
    public static final CustomTrigger CLICK_PORASPIS = new CustomTrigger("pf_book_poraspis");
    public static final CustomTrigger CLICK_PRIONOSUCHUS = new CustomTrigger("pf_book_prionosuchus");
    public static final CustomTrigger CLICK_PRISTEROGNATHUS = new CustomTrigger("pf_book_pristerognathus");
    public static final CustomTrigger CLICK_PROBURNETIA = new CustomTrigger("pf_book_proburnetia");
    public static final CustomTrigger CLICK_PROCYNOSUCHUS = new CustomTrigger("pf_book_procynosuchus");
    public static final CustomTrigger CLICK_PROFALLOTASPIS = new CustomTrigger("pf_book_profallotaspis");
    public static final CustomTrigger CLICK_PROMISSUM = new CustomTrigger("pf_book_promissum");
    public static final CustomTrigger CLICK_PROSICTODON = new CustomTrigger("pf_book_prosictodon");
    public static final CustomTrigger CLICK_PROTEROGYRINUS = new CustomTrigger("pf_book_proterogyrinus");
    public static final CustomTrigger CLICK_PROTOROSAURUS = new CustomTrigger("pf_book_protorosaurus");
    public static final CustomTrigger CLICK_PROTOZYGOPTERA = new CustomTrigger("pf_book_protozygoptera");
    public static final CustomTrigger CLICK_PSAROLEPIS = new CustomTrigger("pf_book_psarolepis");
    public static final CustomTrigger CLICK_PTERASPIS = new CustomTrigger("pf_book_pteraspis");
    public static final CustomTrigger CLICK_PTERYGOTUS = new CustomTrigger("pf_book_pterygotus");
    public static final CustomTrigger CLICK_PURLOVIA  = new CustomTrigger("pf_book_purlovia");
    public static final CustomTrigger CLICK_QILINYU = new CustomTrigger("pf_book_qilinyu");
    public static final CustomTrigger CLICK_RAUTIANIA = new CustomTrigger("pf_book_rautiania");
    public static final CustomTrigger CLICK_RAYONNOCERAS = new CustomTrigger("pf_book_rayonnoceras");
    public static final CustomTrigger CLICK_REBELLATRIX = new CustomTrigger("pf_book_rebellatrix");
    public static final CustomTrigger CLICK_REMIGIOMONTANUS = new CustomTrigger("pf_book_remigiomontanus");
    public static final CustomTrigger CLICK_RETIFACIES = new CustomTrigger("pf_book_retifacies");
    public static final CustomTrigger CLICK_RHIZODUS = new CustomTrigger("pf_book_rhizodus");
    public static final CustomTrigger CLICK_ROACHOID = new CustomTrigger("pf_book_roachoid");
    public static final CustomTrigger CLICK_ROBERTIA = new CustomTrigger("pf_book_robertia");
    public static final CustomTrigger CLICK_SACABAMBASPIS = new CustomTrigger("pf_book_sacabambaspis");
    public static final CustomTrigger CLICK_SAIVODUS = new CustomTrigger("pf_book_saivodus");
    public static final CustomTrigger CLICK_SAURICHTHYS = new CustomTrigger("pf_book_saurichthys");
    public static final CustomTrigger CLICK_SAUROCTONUS = new CustomTrigger("pf_book_sauroctonus");
    public static final CustomTrigger CLICK_SCAUMENACIA = new CustomTrigger("pf_book_scaumenacia");
    public static final CustomTrigger CLICK_SCHINDERHANNES = new CustomTrigger("pf_book_schinderhannes");
    public static final CustomTrigger CLICK_SCORPION_GIGANTOSCORPIO = new CustomTrigger("pf_book_gigantoscorpio");
    public static final CustomTrigger CLICK_SCORPION_GONDWANASCORPIO = new CustomTrigger("pf_book_gondwanascorpio");
    public static final CustomTrigger CLICK_SCORPION_OPSIEOBUTHUS = new CustomTrigger("pf_book_opsieobuthus");
    public static final CustomTrigger CLICK_SCORPION_PULMONOSCORPIUS = new CustomTrigger("pf_book_pulmonoscorpius");
    public static final CustomTrigger CLICK_SCUTOSAURUS = new CustomTrigger("pf_book_scutosaurus");
    public static final CustomTrigger CLICK_SELENOPELTIS = new CustomTrigger("pf_book_selenopeltis");
    public static final CustomTrigger CLICK_SEMIONOTUS = new CustomTrigger("pf_book_semionotus");
    public static final CustomTrigger CLICK_SEYMOURIA = new CustomTrigger("pf_book_seymouria");
    public static final CustomTrigger CLICK_SHONISAURUS = new CustomTrigger("pf_book_shonisaurus");
    public static final CustomTrigger CLICK_SHRINGASAURUS = new CustomTrigger("pf_book_shringasaurus");
    public static final CustomTrigger CLICK_SIBERION = new CustomTrigger("pf_book_siberion");
    public static final CustomTrigger CLICK_SIDNEYIA = new CustomTrigger("pf_book_sidneyia");
    public static final CustomTrigger CLICK_SPATHICEPHALUS = new CustomTrigger("pf_book_spathicephalus");
    public static final CustomTrigger CLICK_SPHENACODON = new CustomTrigger("pf_book_sphenacodon");
    public static final CustomTrigger CLICK_SPINOAEQUALIS = new CustomTrigger("pf_book_spinoaequalis");
    public static final CustomTrigger CLICK_SPRIGGINA = new CustomTrigger("pf_book_spriggina");
    public static final CustomTrigger CLICK_SQUATINACTIS = new CustomTrigger("pf_book_squatinactis");
    public static final CustomTrigger CLICK_STENSIOELLA = new CustomTrigger("pf_book_stensioella");
    public static final CustomTrigger CLICK_SUMINIA = new CustomTrigger("pf_book_suminia");
    public static final CustomTrigger CLICK_SYNOPHALOS = new CustomTrigger("pf_book_synophalos");
    public static final CustomTrigger CLICK_TAPINOCEPHALUS = new CustomTrigger("pf_book_tapinocephalus");
    public static final CustomTrigger CLICK_TARTUOSTEUS = new CustomTrigger("pf_book_tartuosteus");
    public static final CustomTrigger CLICK_TEGOPELTE = new CustomTrigger("pf_book_tegopelte");
    public static final CustomTrigger CLICK_TEMPEROCERAS = new CustomTrigger("pf_book_temperoceras");
    public static final CustomTrigger CLICK_TERATASPIS = new CustomTrigger("pf_book_terataspis");
    public static final CustomTrigger CLICK_TETRACERATOPS = new CustomTrigger("pf_book_tetraceratops");
    public static final CustomTrigger CLICK_TETRAGRAPTUS = new CustomTrigger("pf_book_tetragraptus");
    public static final CustomTrigger CLICK_THELODUS = new CustomTrigger("pf_book_thelodus");
    public static final CustomTrigger CLICK_THRINAXODON = new CustomTrigger("pf_book_thrinaxodon");
    public static final CustomTrigger CLICK_TITANICHTHYS = new CustomTrigger("pf_book_titanichthys");
    public static final CustomTrigger CLICK_TIARAJUDENS = new CustomTrigger("pf_book_tiarajudens");
    public static final CustomTrigger CLICK_TOKUMMIA = new CustomTrigger("pf_book_tokummia");
    public static final CustomTrigger CLICK_TRAQUAIRIUS = new CustomTrigger("pf_book_traquairius");
    public static final CustomTrigger CLICK_TRIGONOTARBID_CRYPTOMARTUS = new CustomTrigger("pf_book_trigonotarbid_cryptomartus");
    public static final CustomTrigger CLICK_TRIGONOTARBID_EOPHRYNUS = new CustomTrigger("pf_book_trigonotarbid_eophrynus");
    public static final CustomTrigger CLICK_TRIGONOTARBID_KREISCHERIA = new CustomTrigger("pf_book_trigonotarbid_kreischeria");
    public static final CustomTrigger CLICK_TRIGONOTARBID_PALAEOTARBUS = new CustomTrigger("pf_book_trigonotarbid_palaeotarbus");
    public static final CustomTrigger CLICK_TRIGONOTARBID_PERMOTARBUS = new CustomTrigger("pf_book_trigonotarbid_permotarbus");
    public static final CustomTrigger CLICK_TRIGONOTARBID_PALAEOCHARINUS = new CustomTrigger("pf_book_trigonotarbid_palaeocharinus");
    public static final CustomTrigger CLICK_TRIMERUS = new CustomTrigger("pf_book_trimerus");
    public static final CustomTrigger CLICK_TULLIMONSTRUM = new CustomTrigger("pf_book_tullimonstrum");
    public static final CustomTrigger CLICK_TURRISASPIS = new CustomTrigger("pf_book_turrisaspis");
    public static final CustomTrigger CLICK_URANOCENTRODON = new CustomTrigger("pf_book_uranocentrodon");
    public static final CustomTrigger CLICK_UROSTHENES = new CustomTrigger("pf_book_urosthenes");
    public static final CustomTrigger CLICK_VARIALEPIS = new CustomTrigger("pf_book_varialepis");
    public static final CustomTrigger CLICK_VESTINAUTILUS = new CustomTrigger("pf_book_vestinautilus");
    public static final CustomTrigger CLICK_VETULICOLA = new CustomTrigger("pf_book_vetulicola");
    public static final CustomTrigger CLICK_VIVAXOSAURUS = new CustomTrigger("pf_book_vivaxosaurus");
    public static final CustomTrigger CLICK_WALLISEROPS = new CustomTrigger("pf_book_walliserops");
    public static final CustomTrigger CLICK_WEBSTEROPRION = new CustomTrigger("pf_book_websteroprion");
    public static final CustomTrigger CLICK_WEIGELTISAURUS = new CustomTrigger("pf_book_weigeltisaurus");
    public static final CustomTrigger CLICK_WHATCHEERIA = new CustomTrigger("pf_book_whatcheeria");
    public static final CustomTrigger CLICK_WIWAXIA = new CustomTrigger("pf_book_wiwaxia");
    public static final CustomTrigger CLICK_XENACANTHUS = new CustomTrigger("pf_book_xenacanthus");
    public static final CustomTrigger CLICK_XENUSION = new CustomTrigger("pf_book_xenusion");
    public static final CustomTrigger CLICK_YAWUNIK = new CustomTrigger("pf_book_yawunik");
    public static final CustomTrigger CLICK_YILINGIA = new CustomTrigger("pf_book_yilingia");
    public static final CustomTrigger CLICK_YOHOIA = new CustomTrigger("pf_book_yohoia");
    public static final CustomTrigger CLICK_YORGIA = new CustomTrigger("pf_book_yorgia");
    public static final CustomTrigger CLICK_YUNNANOZOON = new CustomTrigger("pf_book_yunnanozoon");
    public static final CustomTrigger CLICK_LOCHMANOLENELLUS = new CustomTrigger("pf_book_lochmanolenellus");
    public static final CustomTrigger CLICK_ASTRASPIS = new CustomTrigger("pf_book_astraspis");
    public static final CustomTrigger CLICK_PANDERODUS = new CustomTrigger("pf_book_panderodus");
    public static final CustomTrigger CLICK_CALVAPILOSA = new CustomTrigger("pf_book_calvapilosa");
    public static final CustomTrigger CLICK_BOOTHIASPIS = new CustomTrigger("pf_book_boothiaspis");
    public static final CustomTrigger CLICK_HOLONEMA = new CustomTrigger("pf_book_holonema");
    public static final CustomTrigger CLICK_DROTOPS = new CustomTrigger("pf_book_drotops");
    public static final CustomTrigger CLICK_HELIOPELTIS = new CustomTrigger("pf_book_heliopeltis");
    public static final CustomTrigger CLICK_LANCEASPIS = new CustomTrigger("pf_book_lanceaspis");
    public static final CustomTrigger CLICK_MONTECARIS = new CustomTrigger("pf_book_montecaris");
    public static final CustomTrigger CLICK_RHENOCYSTIS = new CustomTrigger("pf_book_rhenocystis");
    public static final CustomTrigger CLICK_WILLWERATHIA = new CustomTrigger("pf_book_willwerathia");
    public static final CustomTrigger CLICK_PARMASTEGA = new CustomTrigger("pf_book_parmastega");
    public static final CustomTrigger CLICK_TIKTAALIK = new CustomTrigger("pf_book_tiktaalik");
    public static final CustomTrigger CLICK_PYGOPTERUS = new CustomTrigger("pf_book_pygopterus");
    public static final CustomTrigger CLICK_DELTOPTYCHIUS = new CustomTrigger("pf_book_deltoptychius");
    public static final CustomTrigger CLICK_FADENIA_CARBONIFEROUS = new CustomTrigger("pf_book_fadenia_carboniferous");
    public static final CustomTrigger CLICK_FADENIA_PERMOTRIASSIC = new CustomTrigger("pf_book_fadenia_permotriassic");
    public static final CustomTrigger CLICK_FALCATUS = new CustomTrigger("pf_book_falcatus");
    public static final CustomTrigger CLICK_ORODUS = new CustomTrigger("pf_book_orodus");
    public static final CustomTrigger CLICK_PARATARRASIUS = new CustomTrigger("pf_book_paratarrasius");
    public static final CustomTrigger CLICK_SYLLIPSIMOPODI = new CustomTrigger("pf_book_syllipsimopodi");
    public static final CustomTrigger CLICK_THRINACODUS = new CustomTrigger("pf_book_thrinacodus");
    public static final CustomTrigger CLICK_TYRANNOPHONTES = new CustomTrigger("pf_book_tyrannophontes");
    public static final CustomTrigger CLICK_UROCORDYLUS = new CustomTrigger("pf_book_urocordylus");
    public static final CustomTrigger CLICK_EDAPHOSAURUS = new CustomTrigger("pf_book_edaphosaurus");
    public static final CustomTrigger CLICK_ARTHROPLEURA = new CustomTrigger("pf_book_arthropleura");
    public static final CustomTrigger CLICK_COBELODUS = new CustomTrigger("pf_book_cobelodus");
    public static final CustomTrigger CLICK_MEGACTENOPETALUS = new CustomTrigger("pf_book_megactenopetalus");
    public static final CustomTrigger CLICK_RUBIDGEA = new CustomTrigger("pf_book_rubidgea");
    public static final CustomTrigger CLICK_ENDOTHIODON = new CustomTrigger("pf_book_endothiodon");
    public static final CustomTrigger CLICK_AUSTROLIMULUS = new CustomTrigger("pf_book_austrolimulus");
    public static final CustomTrigger CLICK_BEISHANICHTHYS = new CustomTrigger("pf_book_beishanichthys");
    public static final CustomTrigger CLICK_BIRGERIA = new CustomTrigger("pf_book_birgeria");
    public static final CustomTrigger CLICK_BREMBODUS = new CustomTrigger("pf_book_brembodus");
    public static final CustomTrigger CLICK_CATURUS = new CustomTrigger("pf_book_caturus");
    public static final CustomTrigger CLICK_CHINLEA = new CustomTrigger("pf_book_chinlea");
    public static final CustomTrigger CLICK_DAPEDIUM = new CustomTrigger("pf_book_dapedium");
    public static final CustomTrigger CLICK_FOREYIA = new CustomTrigger("pf_book_foreyia");
    public static final CustomTrigger CLICK_HYBODUS = new CustomTrigger("pf_book_hybodus");
    public static final CustomTrigger CLICK_LUOXIONGICHTHYS = new CustomTrigger("pf_book_luoxiongichthys");
    public static final CustomTrigger CLICK_POTANICHTHYS = new CustomTrigger("pf_book_potanichthys");
    public static final CustomTrigger CLICK_AEGER = new CustomTrigger("pf_book_aeger");
    public static final CustomTrigger CLICK_AULACOCERAS = new CustomTrigger("pf_book_aulacoceras");
    public static final CustomTrigger CLICK_BESANOSAURUS = new CustomTrigger("pf_book_besanosaurus");
    public static final CustomTrigger CLICK_CARTORHYNCHUS = new CustomTrigger("pf_book_cartorhynchus");
    public static final CustomTrigger CLICK_CYAMODUS = new CustomTrigger("pf_book_cyamodus");
    public static final CustomTrigger CLICK_CYMBOSPONDYLUS = new CustomTrigger("pf_book_cymbospondylus");
    public static final CustomTrigger CLICK_EORHYNCHOCHELYS = new CustomTrigger("pf_book_eorhynchochelys");
    public static final CustomTrigger CLICK_eretmorhipis = new CustomTrigger("pf_book_eretmorhipis");
    public static final CustomTrigger CLICK_HENODUS = new CustomTrigger("pf_book_henodus");
    public static final CustomTrigger CLICK_LIMULID = new CustomTrigger("pf_book_limulid");
    public static final CustomTrigger CLICK_KEICHOUSAURUS = new CustomTrigger("pf_book_keichousaurus");
    public static final CustomTrigger CLICK_NOTHOSAURUS = new CustomTrigger("pf_book_nothosaurus");
    public static final CustomTrigger CLICK_OPOLANKA = new CustomTrigger("pf_book_opolanka");
    public static final CustomTrigger CLICK_PANZHOUSAURUS = new CustomTrigger("pf_book_panzhousaurus");
    public static final CustomTrigger CLICK_PLACODUS = new CustomTrigger("pf_book_placodus");
    public static final CustomTrigger CLICK_SCLEROCORMUS = new CustomTrigger("pf_book_sclerocormus");
    public static final CustomTrigger CLICK_TRIADOBATRACHUS = new CustomTrigger("pf_book_triadobatrachus");
    public static final CustomTrigger CLICK_YUNGUISAURUS = new CustomTrigger("pf_book_yunguisaurus");
    public static final CustomTrigger CLICK_ARIZONASAURUS = new CustomTrigger("pf_book_arizonasaurus");
    public static final CustomTrigger CLICK_ATOPODENTATUS = new CustomTrigger("pf_book_atopodentatus");
    public static final CustomTrigger CLICK_BATRACHOTOMUS = new CustomTrigger("pf_book_batrachotomus");
    public static final CustomTrigger CLICK_CLEVOSAURUS = new CustomTrigger("pf_book_clevosaurus");
    public static final CustomTrigger CLICK_DESMATOSUCHUS = new CustomTrigger("pf_book_desmatosuchus");
    public static final CustomTrigger CLICK_DOSWELLIA = new CustomTrigger("pf_book_doswellia");
    public static final CustomTrigger CLICK_DREPANOSAURUS = new CustomTrigger("pf_book_drepanosaurus");
    public static final CustomTrigger CLICK_EFFIGIA = new CustomTrigger("pf_book_effigia");
    public static final CustomTrigger CLICK_ERYTHROSUCHUS = new CustomTrigger("pf_book_erythrosuchus");
    public static final CustomTrigger CLICK_EUPARKERIA = new CustomTrigger("pf_book_euparkeria");
    public static final CustomTrigger CLICK_EUSAUROSPHARGIS = new CustomTrigger("pf_book_eusaurosphargis");
    public static final CustomTrigger CLICK_GERROTHORAX = new CustomTrigger("pf_book_gerrothorax");
    public static final CustomTrigger CLICK_HYPERODAPEDON = new CustomTrigger("pf_book_hyperodapedon");
    public static final CustomTrigger CLICK_HYPSOGNATHUS = new CustomTrigger("pf_book_hypsognathus");
    public static final CustomTrigger CLICK_HYPURONECTOR = new CustomTrigger("pf_book_hypuronector");
    public static final CustomTrigger CLICK_LAGOSUCHUS = new CustomTrigger("pf_book_lagosuchus");
    public static final CustomTrigger CLICK_LESSEMSAURUS = new CustomTrigger("pf_book_lessemsaurus");
    public static final CustomTrigger CLICK_LONGISQUAMA = new CustomTrigger("pf_book_longisquama");
    public static final CustomTrigger CLICK_LOTOSAURUS = new CustomTrigger("pf_book_lotosaurus");
    public static final CustomTrigger CLICK_MEGAZOSTRODON = new CustomTrigger("pf_book_megazostrodon");
    public static final CustomTrigger CLICK_METOPOSAURUS = new CustomTrigger("pf_book_metoposaurus");
    public static final CustomTrigger CLICK_MORGANUCODON = new CustomTrigger("pf_book_morganucodon");
    public static final CustomTrigger CLICK_MUSSAURUS = new CustomTrigger("pf_book_mussaurus");
    public static final CustomTrigger CLICK_ORNITHOSUCHUS = new CustomTrigger("pf_book_ornithosuchus");
    public static final CustomTrigger CLICK_TELEOCRATER = new CustomTrigger("pf_book_teleocrater");
    public static final CustomTrigger CLICK_POPOSAURUS = new CustomTrigger("pf_book_poposaurus");
    public static final CustomTrigger CLICK_POSTOSUCHUS = new CustomTrigger("pf_book_postosuchus");
    public static final CustomTrigger CLICK_PROGANOCHELYS = new CustomTrigger("pf_book_proganochelys");
    public static final CustomTrigger CLICK_PSEUDOTHERIUM = new CustomTrigger("pf_book_pseudotherium");
    public static final CustomTrigger CLICK_SAUROSUCHUS = new CustomTrigger("pf_book_saurosuchus");
    public static final CustomTrigger CLICK_RUTIODON = new CustomTrigger("pf_book_rutiodon");
    public static final CustomTrigger CLICK_SCLEROMOCHLUS = new CustomTrigger("pf_book_scleromochlus");
    public static final CustomTrigger CLICK_SHAROVIPTERYX = new CustomTrigger("pf_book_sharovipteryx");
    public static final CustomTrigger CLICK_SILESAURUS = new CustomTrigger("pf_book_silesaurus");
    public static final CustomTrigger CLICK_SILLOSUCHUS = new CustomTrigger("pf_book_sillosuchus");
    public static final CustomTrigger CLICK_SMILOSUCHUS = new CustomTrigger("pf_book_smilosuchus");
    public static final CustomTrigger CLICK_SMOK = new CustomTrigger("pf_book_smok");
    public static final CustomTrigger CLICK_SPHENOTITAN = new CustomTrigger("pf_book_sphenotitan");
    public static final CustomTrigger CLICK_STAGONOLEPIS = new CustomTrigger("pf_book_stagonolepis");
    public static final CustomTrigger CLICK_STANOCEPHALOSAURUS = new CustomTrigger("pf_book_stanocephalosaurus");
    public static final CustomTrigger CLICK_TANYSTROPHEUS = new CustomTrigger("pf_book_tanystropheus");
    public static final CustomTrigger CLICK_TERATERPETON = new CustomTrigger("pf_book_teraterpeton");
    public static final CustomTrigger CLICK_TEYUJAGUA = new CustomTrigger("pf_book_teyujagua");
    public static final CustomTrigger CLICK_THECODONTOSAURUS = new CustomTrigger("pf_book_thecodontosaurus");
    public static final CustomTrigger CLICK_VANCLEAVEA = new CustomTrigger("pf_book_vancleavea");
    public static final CustomTrigger CLICK_XINPUSAURUS = new CustomTrigger("pf_book_xinpusaurus");
    public static final CustomTrigger CLICK_AUSTRIADACTYLUS = new CustomTrigger("pf_book_austriadactylus");
    public static final CustomTrigger CLICK_CAELESTIVENTUS = new CustomTrigger("pf_book_caelestiventus");
    public static final CustomTrigger CLICK_CAVIRAMUS = new CustomTrigger("pf_book_caviramus");
    public static final CustomTrigger CLICK_EUDIMORPHODON = new CustomTrigger("pf_book_eudimorphodon");
    public static final CustomTrigger CLICK_TITANOPTERA_CLATROTITAN = new CustomTrigger("pf_book_titanoptera_clatrotitan");
    public static final CustomTrigger CLICK_TITANOPTERA_MESOTITAN = new CustomTrigger("pf_book_titanoptera_mesotitan");
    public static final CustomTrigger CLICK_TITANOPTERA_GIGATITAN = new CustomTrigger("pf_book_titanoptera_gigatitan");
    public static final CustomTrigger CLICK_NAGINI = new CustomTrigger("pf_book_nagini");
    public static final CustomTrigger CLICK_BRACHYDECTES = new CustomTrigger("pf_book_brachydectes");
    public static final CustomTrigger CLICK_LYSOROPHUS = new CustomTrigger("pf_book_lysorophus");
    public static final CustomTrigger CLICK_PARHYBODUS = new CustomTrigger("pf_book_parhybodus");
    public static final CustomTrigger CLICK_SNAIL_LAND = new CustomTrigger("pf_book_snail_land");
    public static final CustomTrigger CLICK_LONCHIDION = new CustomTrigger("pf_book_lonchidion");
    public static final CustomTrigger CLICK_PALAEONISCUM = new CustomTrigger("pf_book_palaeoniscum");
    public static final CustomTrigger CLICK_SPINIPLATYCERAS = new CustomTrigger("pf_book_spiniplatyceras");
    public static final CustomTrigger CLICK_NIPPONOMARIA = new CustomTrigger("pf_book_nipponomaria");
    public static final CustomTrigger CLICK_PARAPEYTOIA = new CustomTrigger("pf_book_parapeytoia");
    public static final CustomTrigger CLICK_PHRAGMOCERAS = new CustomTrigger("pf_book_phragmoceras");
    public static final CustomTrigger CLICK_LITUITES = new CustomTrigger("pf_book_lituites");

    public static final CustomTrigger CLICK_CIDAROIDA = new CustomTrigger("pf_book_cidaroida");
    public static final CustomTrigger CLICK_ARCHAEOCIDARIS = new CustomTrigger("pf_book_archaeocidaris");
    public static final CustomTrigger CLICK_CERATODUS = new CustomTrigger("pf_book_ceratodus");

    public static final CustomTrigger CLICK_MICROBRACHIUS = new CustomTrigger("pf_book_microbrachius");
    public static final CustomTrigger CLICK_CHOTECOPS = new CustomTrigger("pf_book_chotecops");
    public static final CustomTrigger CLICK_IVOITES = new CustomTrigger("pf_book_ivoites");
    public static final CustomTrigger CLICK_PARAMBLYPTERUS = new CustomTrigger("pf_book_paramblypterus");
    public static final CustomTrigger CLICK_MIGUASHAIA = new CustomTrigger("pf_book_miguashaia");
    public static final CustomTrigger CLICK_ERAMOSCORPIUS = new CustomTrigger("pf_book_eramoscorpius");
    public static final CustomTrigger CLICK_DUSLIA = new CustomTrigger("pf_book_duslia");
    public static final CustomTrigger CLICK_BALHUTICARIS = new CustomTrigger("pf_book_balhuticaris");
    public static final CustomTrigger CLICK_CERATIOCARIS = new CustomTrigger("pf_book_ceratiocaris");
    public static final CustomTrigger CLICK_PLECTODISCUS = new CustomTrigger("pf_book_plectodiscus");
    public static final CustomTrigger CLICK_FLAGELLOPANTOPUS = new CustomTrigger("pf_book_flagellopantopus");
    public static final CustomTrigger CLICK_VACHONISIA = new CustomTrigger("pf_book_vachonisia");
    public static final CustomTrigger CLICK_BUNDENBACHIELLUS = new CustomTrigger("pf_book_bundenbachiellus");
    public static final CustomTrigger CLICK_WINGERTSHELLICUS = new CustomTrigger("pf_book_wingertshellicus");
    public static final CustomTrigger CLICK_WEINBERGINA = new CustomTrigger("pf_book_weinbergina");
    public static final CustomTrigger CLICK_NAHECARIS = new CustomTrigger("pf_book_nahecaris");
    public static final CustomTrigger CLICK_HARPES = new CustomTrigger("pf_book_harpes");
    public static final CustomTrigger CLICK_COMETICERCUS = new CustomTrigger("pf_book_cometicercus");
    public static final CustomTrigger CLICK_BOHEMOHARPES = new CustomTrigger("pf_book_bohemoharpes");
    public static final CustomTrigger CLICK_AMPYX = new CustomTrigger("pf_book_ampyx");
    public static final CustomTrigger CLICK_LONCHODOMAS = new CustomTrigger("pf_book_lonchodomas");
    public static final CustomTrigger CLICK_NEEYAMBASPIS = new CustomTrigger("pf_book_neeyambaspis");
    public static final CustomTrigger CLICK_PITURIASPIS = new CustomTrigger("pf_book_pituriaspis");
    public static final CustomTrigger CLICK_TEGEOLEPIS = new CustomTrigger("pf_book_tegeolepis");
    public static final CustomTrigger CLICK_CLIMATIUS = new CustomTrigger("pf_book_climatius");
    public static final CustomTrigger CLICK_NEREPISACANTHUS = new CustomTrigger("pf_book_nerepisacanthus");
    public static final CustomTrigger CLICK_DIPLACANTHUS = new CustomTrigger("pf_book_diplacanthus");
    public static final CustomTrigger CLICK_HURDIA = new CustomTrigger("pf_book_hurdia");
    public static final CustomTrigger CLICK_CARYOSYNTRIPS = new CustomTrigger("pf_book_caryosyntrips");
    public static final CustomTrigger CLICK_PHLEBOLEPIS = new CustomTrigger("pf_book_phlebolepis");
    public static final CustomTrigger CLICK_JAMOYTIUS = new CustomTrigger("pf_book_jamoytius");
    public static final CustomTrigger CLICK_ASCOCERAS = new CustomTrigger("pf_book_ascoceras");
    public static final CustomTrigger CLICK_SPHOOCERAS = new CustomTrigger("pf_book_sphooceras");
    public static final CustomTrigger CLICK_CASSINOCERAS = new CustomTrigger("pf_book_cassinoceras");
    public static final CustomTrigger CLICK_PRAEARCTURUS = new CustomTrigger("pf_book_praearcturus");
    public static final CustomTrigger CLICK_SKEEMELLA = new CustomTrigger("pf_book_skeemella");
    public static final CustomTrigger CLICK_RUTGERSELLA = new CustomTrigger("pf_book_rutgersella");
    public static final CustomTrigger CLICK_DUNYU = new CustomTrigger("pf_book_dunyu");
    public static final CustomTrigger CLICK_EUGALEASPIS = new CustomTrigger("pf_book_eugaleaspis");
    public static final CustomTrigger CLICK_OGYGINUS = new CustomTrigger("pf_book_ogyginus");
    public static final CustomTrigger CLICK_ARCTINURUS = new CustomTrigger("pf_book_arctinurus");
    public static final CustomTrigger CLICK_URALICHAS = new CustomTrigger("pf_book_uralichas");
    public static final CustomTrigger CLICK_LASANIUS = new CustomTrigger("pf_book_lasanius");
    public static final CustomTrigger CLICK_BARAMEDA = new CustomTrigger("pf_book_barameda");
    public static final CustomTrigger CLICK_ORNITHOPRION = new CustomTrigger("pf_book_ornithoprion");
    public static final CustomTrigger CLICK_BRACHIOPOD_GIGANTOPRODUCTUS = new CustomTrigger("pf_book_brachiopod_gigantoproductus");
    public static final CustomTrigger CLICK_BRACHIOPOD_ORTHID = new CustomTrigger("pf_book_brachiopod_orthid");
    public static final CustomTrigger CLICK_BRACHIOPOD_SPIRIFERID = new CustomTrigger("pf_book_brachiopod_spiriferid");
    public static final CustomTrigger CLICK_MAZOTHAIROS = new CustomTrigger("pf_book_mazothairos");
    public static final CustomTrigger CLICK_TORPEDASPIS = new CustomTrigger("pf_book_torpedaspis");
    public static final CustomTrigger CLICK_FURCA = new CustomTrigger("pf_book_furca");
    public static final CustomTrigger CLICK_TOMLINSONUS = new CustomTrigger("pf_book_tomlinsonus");
    public static final CustomTrigger CLICK_COWIELEPIS = new CustomTrigger("pf_book_cowielepis");
    public static final CustomTrigger CLICK_TRIGONOTARBID_ANTHRACOMARTUS = new CustomTrigger("pf_book_trigonotarbid_anthracomartus");

    // public static final CustomTrigger CLICK_ = new CustomTrigger("pf_book_"); TEMPLATE



    /*
     * This array just makes it convenient to register all the criteria.
     */
    public static final CustomTrigger[] TRIGGER_ARRAY = new CustomTrigger[] {
            ENTER_PRECAMBRIAN,
            ENTER_CAMBRIAN,
            ENTER_ORDOVICIAN,
            ENTER_SILURIAN,
            ENTER_DEVONIAN,
            ENTER_CARBONIFEROUS,
            ENTER_PERMIAN,
            ENTER_TRIASSIC,
            ENTER_JURASSIC,
            ENTER_CRETACEOUS,
            REJUVENATE,
            USE_CAGE,
            USE_JAR,
            EPHEDRA,
            TAIL,

            //BLOCKS:
            //----------
            //Precambrian:
            CLICK_ARBOREA,
            CLICK_ARKARUA,
            CLICK_AUSIA,
            CLICK_BOMAKELLIA,
            CLICK_BRADGATIA,
            CLICK_BURYKHIA,
            CLICK_CHARNIA,
            CLICK_CHARNIODISCUS,
            CLICK_CLOUDINA,
            CLICK_CONOMEDUSITES,
            CLICK_CORONACOLLINA,
            CLICK_CORUMBELLA,
            CLICK_FUNISIA,
            CLICK_GRYPANIA,
            CLICK_HAOOTIA,
            CLICK_HAPSIDOPHYLLAS,
            CLICK_INARIA,
            CLICK_NAMACALATHUS,
            CLICK_NAMAPOIKIA,
            CLICK_PAMBIKALBAE,
            CLICK_PARVISCOPA,
            CLICK_PRIMOCANDELABRUM,
            CLICK_PTERIDINIUM,
            CLICK_SWARTPUNTIA,
            CLICK_TAWUIA,
            CLICK_THECTARDIS,
            CLICK_TRIBRACHIDIUM,
            CLICK_VENTOGYRUS,
            CLICK_SPONGE,

            //Cambrian:
            CLICK_ALLONNIA,
            CLICK_CASTERICYSTIS,
            CLICK_DINOMISCHUS,
            CLICK_ECHMATOCRINUS,
            CLICK_GOGIA,
            CLICK_HELICOCYSTIS,
            CLICK_HERPETOGASTER,
            CLICK_LEPIDOCYSTIS,
            CLICK_LYRACYSTIS,
            CLICK_SIPHUSAUCTUM,
            CLICK_SEA_ANEMONE,
            CLICK_XIANGUANGIA,
            CLICK_PIRANIA,
            CLICK_CHAUNOGRAPTUS,
            CLICK_DICTYONEMA,
            CLICK_STROMATOCYSTITES,
            CLICK_STROMATOVERIS,
            CLICK_THAUMAPTILON,
            CLICK_FACIVERMIS,
            CLICK_OESIAMARGARETIA,

            //Ordovician:
            CLICK_ARISTOCYSTITES,
            CLICK_AULACERA,
            CLICK_BLASTOIDS,
            CLICK_BIVALVE,
            CLICK_BOLBOPORITES,
            CLICK_CARYOCRINITES,
            CLICK_DENDROGRAPTUS,
            CLICK_ECHINOSPHAERITES,
            CLICK_FENESTELLA,
            CLICK_RUGOSA,
            CLICK_TABULATA,
            CLICK_THAMNOBEATRICEA,
            CLICK_TENTACULITA,
            CLICK_CORNULITIDA,

            //Silurian:
            CLICK_ENCRINUS,
            CLICK_EUCALYPTOCRINITES,
            CLICK_CYATHOCRINUS,
            CLICK_PETALOCRINUS,
            CLICK_PISOCRINUS,
            CLICK_PSEUDOCRINITES,
            CLICK_SCYPHOCRINUS,
            CLICK_SIPHONOCRINUS,
            CLICK_CALLICRINUS,

            //Devonian:
            CLICK_ANCYROCRINUS,
            CLICK_CUPRESSOCRINITES,
            CLICK_MEGALODON_BIVALVE,
            CLICK_VADAROCRINUS,

            //Carboniferous:
            CLICK_DIZYGOCRINUS,
            CLICK_ESCUMASIA,
            CLICK_MACROCRINUS,

            //Permian:
            CLICK_GIGANTOSPONGIA,
            CLICK_JIMBACRINUS,

            //Triassic:
            CLICK_DICEROCARDIUM,
            CLICK_LITHIOTIS,
            CLICK_TRAUMATOCRINUS,
            CLICK_VOSTOCOVACRINUS,
            CLICK_HOLOCRINUS,



            CLICK_LEPIDODENDRON,

            //ENTITIES:
            //----------
            CLICK_ACADOARADOXIDES,
            CLICK_ACANTHODES,
            CLICK_ACANTHOSTEGA,
            CLICK_ACANTHOSTOMATOPS,
            CLICK_ACROLEPIS,
            CLICK_ACUTIRAMUS,
            CLICK_ADELOPHTHALMUS,
            CLICK_AEGER,
            CLICK_AEGIROCASSIS,
            CLICK_AINIKTOZOON,
            CLICK_AKMONISTION,
            CLICK_ALACARIS,
            CLICK_ALBERTONIA,
            CLICK_ALLENYPTERUS,
            CLICK_AMMONITE_ASTEROCERAS,
            CLICK_AMMONITE_CERATITES,
            CLICK_AMMONITE_CORONICERAS,
            CLICK_AMMONITE_CYLOLOBUS,
            CLICK_AMMONITE_DACTYLIOCERAS,
            CLICK_AMMONITE_GONIATITES,
            CLICK_AMMONITE_MANTICOCERAS,
            CLICK_AMMONITE_PACHYDESMOCERAS,
            CLICK_AMMONITE_PACHYDISCUS,
            CLICK_AMMONITE_PARAPUZOSIA,
            CLICK_AMMONITE_TITANITES,
            CLICK_AMPHIBAMUS,
            CLICK_AMPLECTOBELUA,
            CLICK_ANCIENT_JELLY,
            CLICK_ANOMALOCARIS,
            CLICK_ANTARCTICARCINUS,
            CLICK_ANTEOSAURUS,
            CLICK_ANTHRACOMEDUSA,
            CLICK_ANTINEOSTEUS,
            CLICK_APHETOCERAS,
            CLICK_ARANDASPIS,
            CLICK_ARCHAEOCIDARIS,
            CLICK_ARCHOBLATTINA,
            CLICK_ARCHOBLATTINA_NYMPH,
            CLICK_ARCHOSAURUS,
            CLICK_ARIZONASAURUS,
            CLICK_ARTHROPLEURA,
            CLICK_ASAPHUS,
            CLICK_ASCENDONANUS,
            CLICK_ASTRASPIS,
            CLICK_ATELEASPIS,
            CLICK_ATOPODENTATUS,
            CLICK_ATTERCOPUS,
            CLICK_AULACEPHALODON,
            CLICK_AULACOCERAS,
            CLICK_AUSTRIADACTYLUS,
            CLICK_AUSTROLIMULUS,
            CLICK_BALANERPETON,
            CLICK_BANDRINGA,
            CLICK_BANFFIA,
            CLICK_BARBCLABORNIA,
            CLICK_BASILOCERAS,
            CLICK_BATOFASCICULUS,
            CLICK_BATRACHOTOMUS,
            CLICK_BEISHANICHTHYS,
            CLICK_BELANTSEA,
            CLICK_BESANOSAURUS,
            CLICK_BIRGERIA,
            CLICK_BIRKENIA,
            CLICK_BLOURUGIA,
            CLICK_BOBASATRANIA ,
            CLICK_BOOTHIASPIS,
            CLICK_BOTHRIOLEPIS,
            CLICK_BRACHYDECTES,
            CLICK_BRANCHIOSAUR,
            CLICK_BREMBODUS,
            CLICK_BROCHOADMONES,
            CLICK_BUNOSTEGOS,
            CLICK_BUSHIZHEIA,
            CLICK_CACOPS,
            CLICK_CAELESTIVENTUS,
            CLICK_CALVAPILOSA,
            CLICK_CAMBRORASTER,
            CLICK_CAMEROCERAS,
            CLICK_CAMPBELLODUS,
            CLICK_CANADASPIS,
            CLICK_CANADIA,
            CLICK_CAPTORHINUS,
            CLICK_CARCINOSOMA,
            CLICK_CAROLOWILHELMINA,
            CLICK_CARTORHYNCHUS,
            CLICK_CASINERIA,
            CLICK_CATURUS,
            CLICK_CAVIRAMUS,
            CLICK_CEPHALASPIS,
            CLICK_CERATODUS,
            CLICK_CHEIRURUS,
            CLICK_CHELONIELLON,
            CLICK_CHINLEA,
            CLICK_CIDAROIDA,
            CLICK_CLADOSELACHE,
            CLICK_CLAUDIOSAURUS,
            CLICK_CLEVOSAURUS,
            CLICK_CLYDAGNATHUS,
            CLICK_COBELODUS,
            CLICK_COCCOSTEUS,
            CLICK_COELACANTHUS,
            CLICK_COELOPHYSIS,
            CLICK_COELUROSAURAVUS,
            CLICK_COOPEROCERAS,
            CLICK_COTHURNOCYSTIS,
            CLICK_COTYLORHYNCHUS,
            CLICK_CRASSIGYRINUS,
            CLICK_CROTALOCEPHALUS,
            CLICK_CTENOSPONDYLUS,
            CLICK_CYAMODUS,
            CLICK_CYCLONEMA,
            CLICK_CYMBOSPONDYLUS,
            CLICK_CYNOGNATHUS,
            CLICK_CYRTOCERAS,
            CLICK_DAEDALICHTHYS,
            CLICK_DALMANITES,
            CLICK_DAPEDIUM,
            CLICK_DASYCEPS,
            CLICK_DATHEOSAURUS,
            CLICK_DEIROCERAS,
            CLICK_DELTOPTYCHIUS,
            CLICK_DESMATOSUCHUS,
            CLICK_DIADECTES,
            CLICK_DIANIA,
            CLICK_DICKINSONIA,
            CLICK_DIDYMOGRAPTUS,
            CLICK_DIICTODON,
            CLICK_DIMETRODON,
            CLICK_DIPLOCAULUS,
            CLICK_DIPLOCERASPIS,
            CLICK_DORYASPIS,
            CLICK_DORYPTERUS,
            CLICK_DOSWELLIA,
            CLICK_DRACOPRISTIS,
            CLICK_DREPANASPIS,
            CLICK_DREPANOSAURUS,
            CLICK_DROTOPS,
            CLICK_DUNKLEOSTEUS,
            CLICK_DVINIA,
            CLICK_DVINOSAURUS,
            CLICK_EBENAQUA,
            CLICK_EDAPHOSAURUS,
            CLICK_EDESTUS,
            CLICK_EFFIGIA,
            CLICK_EGLONASPIS,
            CLICK_ELGINIA,
            CLICK_ELLIPSOCEPHALUS,
            CLICK_ELRATHIA,
            CLICK_ENDOCERAS,
            CLICK_ENDOTHIODON,
            CLICK_ENOPLOURA,
            CLICK_EOANDROMEDA,
            CLICK_EOARTHROPLEURA,
            CLICK_EORAPTOR,
            CLICK_EOREDLICHIA,
            CLICK_EORHYNCHOCHELYS,
            CLICK_EOSAURICHTHYS,
            CLICK_EOSIMOPS,
            CLICK_eretmorhipis,
            CLICK_ERICIXERXES,
            CLICK_ERYOPS,
            CLICK_ERYTHROSUCHUS,
            CLICK_ESTEMMENOSUCHUS,
            CLICK_EUCHAMBERSIA,
            CLICK_EUDIMORPHODON,
            CLICK_EUNOTOSAURUS,
            CLICK_EUPARKERIA,
            CLICK_EURYPTERUS,
            CLICK_EUSAUROSPHARGIS,
            CLICK_EUSTHENOPTERON,
            CLICK_FADENIA_CARBONIFEROUS,
            CLICK_FADENIA_PERMOTRIASSIC,
            CLICK_FALCATUS,
            CLICK_FEROXICHTHYS,
            CLICK_FOREYIA,
            CLICK_FURCACAUDA,
            CLICK_FURCASTER,
            CLICK_GABREYASPIS,
            CLICK_GANTAROSTRATASPIS,
            CLICK_GEMMACTENA,
            CLICK_GEMUENDINA,
            CLICK_GEPHYROSTEGUS,
            CLICK_GERARUS,
            CLICK_GERROTHORAX,
            CLICK_GLAURUNG,
            CLICK_GNATHORHIZA,
            CLICK_GONIOCERAS,
            CLICK_GORGONOPS,
            CLICK_GROENLANDASPIS,
            CLICK_GYRACANTHIDES,
            CLICK_HAIKOUICHTHYS,
            CLICK_HALLUCIGENIA,
            CLICK_HARVESTMAN,
            CLICK_HELENODORA,
            CLICK_HELIANTHASTER,
            CLICK_HELICOPRION,
            CLICK_HELIOPELTIS,
            CLICK_HELMETIA,
            CLICK_HEMICYCLASPIS,
            CLICK_HENODUS,
            CLICK_HERRERASAURUS,
            CLICK_HETEROSTEUS,
            CLICK_HIBBERTOPTERUS,
            CLICK_HIBERNASPIS,
            CLICK_HOLONEMA,
            CLICK_HUNGIOIDES,
            CLICK_HYBODUS,
            CLICK_HYLONOMUS,
            CLICK_HYNERIA,
            CLICK_HYPERODAPEDON,
            CLICK_HYPSOGNATHUS,
            CLICK_HYPURONECTOR,
            CLICK_ICHTHYOSTEGA,
            CLICK_INIOPTERYX,
            CLICK_INOSTRANCEVIA,
            CLICK_ISOTELUS,
            CLICK_ITALOPHLEBIA,
            CLICK_JAEKELOPTERUS,
            CLICK_JANASSA,
            CLICK_JELLYFISH_PRECAMBRIAN,
            CLICK_JELLYFISH1,
            CLICK_JELLYFISH2,
            CLICK_JELLYFISH3,
            CLICK_JELLYFISH4,
            CLICK_JELLYFISH5,
            CLICK_JELLYFISH6,
            CLICK_JELLYFISH7,
            CLICK_JIANSHANOPODIA,
            CLICK_JONKERIA,
            CLICK_KAIBABVENATOR,
            CLICK_KALBARRIA,
            CLICK_KEICHOUSAURUS,
            CLICK_KERYGMACHELA,
            CLICK_KIMBERELLA,
            CLICK_KODYMIRUS,
            CLICK_KOKOMOPTERUS,
            CLICK_LABIDOSAURUS,
            CLICK_LACCOGNATHUS,
            CLICK_LAGOSUCHUS,
            CLICK_LAMINACARIS,
            CLICK_LANCEASPIS,
            CLICK_LEBACHACANTHUS,
            CLICK_LESSEMSAURUS,
            CLICK_LILIENSTERNUS,
            CLICK_LIMNOSCELIS,
            CLICK_LIMULID,
            CLICK_LISOWICIA,
            CLICK_LISTRACANTHUS,
            CLICK_LITUITES,
            CLICK_LOCHMANOLENELLUS,
            CLICK_LONCHIDION,
            CLICK_LONGISQUAMA,
            CLICK_LOTOSAURUS,
            CLICK_LUNASPIS,
            CLICK_LUNATASPIS,
            CLICK_LUNGMENSHANASPIS,
            CLICK_LUOXIONGICHTHYS,
            CLICK_LYRARAPAX,
            CLICK_LYSOROPHUS,
            CLICK_LYSTROSAURUS,
            CLICK_MACLURINA,
            CLICK_MARRELLA,
            CLICK_MASTODONSAURUS,
            CLICK_MCNAMARASPIS,
            CLICK_MEGACTENOPETALUS,
            CLICK_MEGALOCEPHALUS,
            CLICK_MEGALOGRAPTUS,
            CLICK_MEGANEURA,
            CLICK_MEGANEUROPSIS,
            CLICK_MEGARACHNE,
            CLICK_MEGAZOSTRODON,
            CLICK_MELOSAURUS,
            CLICK_MENASPIS,
            CLICK_MESOSAURUS,
            CLICK_METASPRIGGINA,
            CLICK_METOPOSAURUS,
            CLICK_MICRODICTYON,
            CLICK_MIMETASTER,
            CLICK_MIXOPTERUS,
            CLICK_MONOGRAPTUS,
            CLICK_MONTECARIS,
            CLICK_MOOREOCERAS,
            CLICK_MORGANUCODON,
            CLICK_MOSCHOPS,
            CLICK_MUSSAURUS,
            CLICK_NAGINI,
            CLICK_NECTOCARIS,
            CLICK_NIPPONOMARIA,
            CLICK_NOTHOSAURUS,
            CLICK_ODARAIA,
            CLICK_ODONTOGRIPHUS,
            CLICK_OMNIDENS,
            CLICK_ONYCHODUS,
            CLICK_OPABINIA,
            CLICK_OPHIACODON,
            CLICK_OPOLANKA,
            CLICK_ORNITHOSUCHUS,
            CLICK_ORODUS,
            CLICK_ORTHOCERAS,
            CLICK_ORTHROZANCLUS,
            CLICK_OSTEOLEPIS,
            CLICK_OTTOIA,
            CLICK_PAGEA,
            CLICK_PALAEODICTYOPTERA_DELITZSCHALA,
            CLICK_PALAEODICTYOPTERA_DUNBARIA,
            CLICK_PALAEODICTYOPTERA_HOMALONEURA,
            CLICK_PALAEODICTYOPTERA_HOMOIOPTERA,
            CLICK_PALAEODICTYOPTERA_LITHOMANTIS,
            CLICK_PALAEODICTYOPTERA_LYCOCERCUS,
            CLICK_PALAEODICTYOPTERA_SINODUNBARIA,
            CLICK_PALAEODICTYOPTERA_STENODICTYA,
            CLICK_PALAEOISOPUS,
            CLICK_PALAEONISCUM,
            CLICK_PALAEONTINID,
            CLICK_PANDERICHTHYS,
            CLICK_PANDERODUS,
            CLICK_PANTYLUS,
            CLICK_PANZHOUSAURUS,
            CLICK_PARADOXIDES,
            CLICK_PARANAICHTHYS,
            CLICK_PARAPEYTOIA,
            CLICK_PARATARRASIUS,
            CLICK_PAREXUS,
            CLICK_PARHYBODUS,
            CLICK_PARMASTEGA,
            CLICK_PARVANCORINA,
            CLICK_PAUCIPODIA,
            CLICK_PEDERPES,
            CLICK_PELURGASPIS,
            CLICK_PHANEROTINUS,
            CLICK_PHANTASPIS,
            CLICK_PHARYNGOLEPIS,
            CLICK_PHLEGETHONTIA,
            CLICK_PHOLIDERPETON,
            CLICK_PHRAGMOCERAS,
            CLICK_PIKAIA,
            CLICK_PLACERIAS,
            CLICK_PLACODUS,
            CLICK_PLATEOSAURUS,
            CLICK_PLATYCARASPIS,
            CLICK_PLATYHYSTRIX,
            CLICK_PLATYLOMASPIS,
            CLICK_PLATYSOMUS,
            CLICK_PNEUMODESMUS,
            CLICK_POLEUMITA,
            CLICK_POMATRUM,
            CLICK_POPOSAURUS,
            CLICK_PORASPIS,
            CLICK_POSTOSUCHUS,
            CLICK_POTANICHTHYS,
            CLICK_PRIONOSUCHUS,
            CLICK_PRISTEROGNATHUS,
            CLICK_PROBURNETIA,
            CLICK_PROCYNOSUCHUS,
            CLICK_PROFALLOTASPIS,
            CLICK_PROGANOCHELYS,
            CLICK_PROMISSUM,
            CLICK_PROSICTODON,
            CLICK_PROTEROGYRINUS,
            CLICK_PROTOROSAURUS,
            CLICK_PROTOZYGOPTERA,
            CLICK_PSAROLEPIS,
            CLICK_PSEUDOTHERIUM,
            CLICK_PTERASPIS,
            CLICK_PTERYGOTUS,
            CLICK_PURLOVIA ,
            CLICK_PYGOPTERUS,
            CLICK_QILINYU,
            CLICK_RAUTIANIA,
            CLICK_RAYONNOCERAS,
            CLICK_REBELLATRIX,
            CLICK_REMIGIOMONTANUS,
            CLICK_RETIFACIES,
            CLICK_RHENOCYSTIS,
            CLICK_RHIZODUS,
            CLICK_ROACHOID,
            CLICK_ROBERTIA,
            CLICK_RUBIDGEA,
            CLICK_RUTIODON,
            CLICK_SACABAMBASPIS,
            CLICK_SAIVODUS,
            CLICK_SAURICHTHYS,
            CLICK_SAUROCTONUS,
            CLICK_SAUROSUCHUS,
            CLICK_SCAUMENACIA,
            CLICK_SCHINDERHANNES,
            CLICK_SCLEROCORMUS,
            CLICK_SCLEROMOCHLUS,
            CLICK_SCORPION_GIGANTOSCORPIO,
            CLICK_SCORPION_GONDWANASCORPIO,
            CLICK_SCORPION_OPSIEOBUTHUS,
            CLICK_SCORPION_PULMONOSCORPIUS,
            CLICK_SCUTOSAURUS,
            CLICK_SELENOPELTIS,
            CLICK_SEMIONOTUS,
            CLICK_SEYMOURIA,
            CLICK_SHAROVIPTERYX,
            CLICK_SHONISAURUS,
            CLICK_SHRINGASAURUS,
            CLICK_SIBERION,
            CLICK_SIDNEYIA,
            CLICK_SILESAURUS,
            CLICK_SILLOSUCHUS,
            CLICK_SMILOSUCHUS,
            CLICK_SMOK,
            CLICK_SNAIL_LAND,
            CLICK_SPATHICEPHALUS,
            CLICK_SPHENACODON,
            CLICK_SPHENOTITAN,
            CLICK_SPINIPLATYCERAS,
            CLICK_SPINOAEQUALIS,
            CLICK_SPRIGGINA,
            CLICK_SQUATINACTIS,
            CLICK_STAGONOLEPIS,
            CLICK_STANOCEPHALOSAURUS,
            CLICK_STENSIOELLA,
            CLICK_SUMINIA,
            CLICK_SYLLIPSIMOPODI,
            CLICK_SYNOPHALOS,
            CLICK_TANYSTROPHEUS,
            CLICK_TAPINOCEPHALUS,
            CLICK_TARTUOSTEUS,
            CLICK_TEGOPELTE,
            CLICK_TELEOCRATER,
            CLICK_TEMPEROCERAS,
            CLICK_TERATASPIS,
            CLICK_TERATERPETON,
            CLICK_TETRACERATOPS,
            CLICK_TETRAGRAPTUS,
            CLICK_TEYUJAGUA,
            CLICK_THECODONTOSAURUS,
            CLICK_THELODUS,
            CLICK_THRINACODUS,
            CLICK_THRINAXODON,
            CLICK_TIARAJUDENS,
            CLICK_TIKTAALIK,
            CLICK_TITANICHTHYS,
            CLICK_TITANOPTERA_CLATROTITAN,
            CLICK_TITANOPTERA_GIGATITAN,
            CLICK_TITANOPTERA_MESOTITAN,
            CLICK_TOKUMMIA,
            CLICK_TRAQUAIRIUS,
            CLICK_TRIADOBATRACHUS,
            CLICK_TRIGONOTARBID_CRYPTOMARTUS,
            CLICK_TRIGONOTARBID_EOPHRYNUS,
            CLICK_TRIGONOTARBID_KREISCHERIA,
            CLICK_TRIGONOTARBID_PALAEOCHARINUS,
            CLICK_TRIGONOTARBID_PALAEOTARBUS,
            CLICK_TRIGONOTARBID_PERMOTARBUS,
            CLICK_TRIMERUS,
            CLICK_TULLIMONSTRUM,
            CLICK_TURRISASPIS,
            CLICK_TYRANNOPHONTES,
            CLICK_URANOCENTRODON,
            CLICK_UROCORDYLUS,
            CLICK_UROSTHENES,
            CLICK_VANCLEAVEA,
            CLICK_VARIALEPIS,
            CLICK_VESTINAUTILUS,
            CLICK_VETULICOLA,
            CLICK_VIVAXOSAURUS,
            CLICK_WALLISEROPS,
            CLICK_WEBSTEROPRION,
            CLICK_WEIGELTISAURUS,
            CLICK_WHATCHEERIA,
            CLICK_WILLWERATHIA,
            CLICK_WIWAXIA,
            CLICK_XENACANTHUS,
            CLICK_XENUSION,
            CLICK_XINPUSAURUS,
            CLICK_YAWUNIK,
            CLICK_YILINGIA,
            CLICK_YOHOIA,
            CLICK_YORGIA,
            CLICK_YUNGUISAURUS,
            CLICK_YUNNANOZOON,
            CLICK_MICROBRACHIUS,
            CLICK_CHOTECOPS,
            CLICK_IVOITES,
            CLICK_PARAMBLYPTERUS,
            CLICK_ERAMOSCORPIUS,
            CLICK_MIGUASHAIA,
            CLICK_DUSLIA,
            CLICK_BALHUTICARIS,
            CLICK_CERATIOCARIS,
            CLICK_PLECTODISCUS,
            CLICK_FLAGELLOPANTOPUS,
            CLICK_VACHONISIA,
            CLICK_BUNDENBACHIELLUS,
            CLICK_WINGERTSHELLICUS,
            CLICK_WEINBERGINA,
            CLICK_NAHECARIS,
            CLICK_COMETICERCUS,
            CLICK_HARPES,
            CLICK_BOHEMOHARPES,
            CLICK_AMPYX,
            CLICK_LONCHODOMAS,
            CLICK_NEEYAMBASPIS,
            CLICK_PITURIASPIS,
            CLICK_TEGEOLEPIS,
            CLICK_CLIMATIUS,
            CLICK_NEREPISACANTHUS,
            CLICK_DIPLACANTHUS,
            CLICK_HURDIA,
            CLICK_CARYOSYNTRIPS,
            CLICK_PHLEBOLEPIS,
            CLICK_JAMOYTIUS,
            CLICK_ASCOCERAS,
            CLICK_SPHOOCERAS,
            CLICK_PRAEARCTURUS,
            CLICK_RUTGERSELLA,
            CLICK_SKEEMELLA,
            CLICK_DUNYU,
            CLICK_EUGALEASPIS,
            CLICK_OGYGINUS,
            CLICK_ARCTINURUS,
            CLICK_URALICHAS,
            CLICK_LASANIUS,
            CLICK_BARAMEDA,
            CLICK_ORNITHOPRION,
            CLICK_TORPEDASPIS,
            CLICK_FURCA,
            CLICK_TOMLINSONUS,
            CLICK_COWIELEPIS,
            CLICK_TRIGONOTARBID_ANTHRACOMARTUS,
            CLICK_MAZOTHAIROS,
            CLICK_BRACHIOPOD_ORTHID,
            CLICK_BRACHIOPOD_GIGANTOPRODUCTUS,
            CLICK_BRACHIOPOD_SPIRIFERID




    };


    /**
     * This method is part of my simple custom advancement triggering tutorial.
     * See: http://jabelarminecraft.blogspot.com/p/minecraft-modding-custom-triggers-aka.html
     */
    public static void registerTriggers()
    {
        // DEBUG
        System.out.println("Registering custom triggers");

        Method method;

        method = ReflectionHelper.findMethod(CriteriaTriggers.class, "register", "func_192118_a", ICriterionTrigger.class);

        method.setAccessible(true);

        for (int i=0; i < TRIGGER_ARRAY.length; i++)
        {
            try
            {
               method.invoke(null, TRIGGER_ARRAY[i]);
            }
            catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
            {
               e.printStackTrace();
            }
        }
    }
}