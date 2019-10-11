package br.com.generico;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.generico.model.Pessoa;
import br.com.generico.repository.PessoaRepository;

@SpringBootApplication
public class Exercicio10QueriesApplication implements CommandLineRunner {

	@Autowired
	private PessoaRepository pessoaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Exercicio10QueriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Pessoa pes1 = new Pessoa(null, "JACKELINE KELLY SANTOS DA NÓBREGA", "55254070578", "9784619",
				sdf.parse("1/1/1965"), "RUA JACKELINE KELLY SANTOS DA NÓBREGA", "799", "JARDINS", "JOÃO PESSOA", "PB");
		Pessoa pes2 = new Pessoa(null, "DAVID ALBUQUERQUE CAVALCANTI", "41362452414", "7548376", sdf.parse("2/2/1966"),
				"RUA DAVID ALBUQUERQUE CAVALCANTI", "817", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes3 = new Pessoa(null, "JOÃO LENNON BATISTA", "43612257065", "7487893", sdf.parse("3/3/1967"),
				"RUA JOÃO LENNON BATISTA", "310", "DIVINOPOLIS", "JOÃO PESSOA", "PB");
		Pessoa pes4 = new Pessoa(null, "NATALYA DE SOUZA SOARES", "58207687844", "9949013", sdf.parse("4/4/1968"),
				"RUA NATALYA DE SOUZA SOARES", "77", "CENTRO", "JOÃO PESSOA", "PB");
		Pessoa pes5 = new Pessoa(null, "MARIA HELENA DINIZ DA COSTA SOUZA", "50033834731", "1469871",
				sdf.parse("5/5/1969"), "RUA MARIA HELENA DINIZ DA COSTA SOUZA", "813", "ESTADOS", "JOÃO PESSOA", "PB");
		Pessoa pes6 = new Pessoa(null, "IARA SOFHIA SOUSA FARIAS", "92580902521", "8577135", sdf.parse("6/6/1970"),
				"RUA IARA SOFHIA SOUSA FARIAS", "955", "MANGABEIRA", "JOÃO PESSOA", "PB");
		Pessoa pes7 = new Pessoa(null, "ELLEN FABIAN DA SILVA BRANDÃO", "60573980017", "8514531", sdf.parse("7/7/1971"),
				"RUA ELLEN FABIAN DA SILVA BRANDÃO", "302", "JARDINS", "JOÃO PESSOA", "PB");
		Pessoa pes8 = new Pessoa(null, "CAMILA DIAS SIMÃO DE OLIVEIRA", "90330093522", "3177812", sdf.parse("8/8/1972"),
				"RUA CAMILA DIAS SIMÃO DE OLIVEIRA", "908", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes9 = new Pessoa(null, "JAYNE ANICETO GAMBARRA DOS SANTOS", "72619647396", "3114685",
				sdf.parse("9/9/1973"), "RUA JAYNE ANICETO GAMBARRA DOS SANTOS", "294", "DIVINOPOLIS", "JOÃO PESSOA",
				"PB");
		Pessoa pes10 = new Pessoa(null, "LUIS CLAUDIO SILVA LIMA", "34368005099", "6233082", sdf.parse("10/10/1974"),
				"RUA LUIS CLAUDIO SILVA LIMA", "651", "CENTRO", "JOÃO PESSOA", "PB");
		Pessoa pes11 = new Pessoa(null, "ARIDELSON JOABSON ALMEIDA DE OLIVEIRA", "80090057649", "9508968",
				sdf.parse("11/11/1975"), "RUA ARIDELSON JOABSON ALMEIDA DE OLIVEIRA", "752", "ESTADOS", "JOÃO PESSOA",
				"PB");
		Pessoa pes12 = new Pessoa(null, "ELIZABETE MACIEL CARNEIRO DA CUNHA", "53498003423", "2782660",
				sdf.parse("12/12/1976"), "RUA ELIZABETE MACIEL CARNEIRO DA CUNHA", "631", "MANGABEIRA", "JOÃO PESSOA",
				"PB");
		Pessoa pes13 = new Pessoa(null, "MARIA MARTA ALBUQUERQUE DO NASCIMENTO", "66306387950", "9374741",
				sdf.parse("13/1/1977"), "RUA MARIA MARTA ALBUQUERQUE DO NASCIMENTO", "812", "JARDINS", "JOÃO PESSOA",
				"PB");
		Pessoa pes14 = new Pessoa(null, "KARINE SANTOS MELO PORTO", "82857772167", "9425632", sdf.parse("14/2/1978"),
				"RUA KARINE SANTOS MELO PORTO", "891", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes15 = new Pessoa(null, "ZEZANO DE OLIVEIRA FILHO", "16435792739", "6097738", sdf.parse("15/3/1979"),
				"RUA ZEZANO DE OLIVEIRA FILHO", "33", "DIVINOPOLIS", "JOÃO PESSOA", "PB");
		Pessoa pes16 = new Pessoa(null, "GINA TERESA CORREA GOMES DE ALMEIDA", "94258305507", "2984106",
				sdf.parse("16/4/1980"), "RUA GINA TERESA CORREA GOMES DE ALMEIDA", "131", "CENTRO", "JOÃO PESSOA",
				"PB");
		Pessoa pes17 = new Pessoa(null, "AMONN MATIAS GUEDES", "61200772172", "5141993", sdf.parse("17/5/1981"),
				"RUA AMONN MATIAS GUEDES", "108", "ESTADOS", "JOÃO PESSOA", "PB");
		Pessoa pes18 = new Pessoa(null, "MAGNA TATIANA ALBUQUERQUE DO NASCIMENTO MEIRA ", "66505559863", "7350820",
				sdf.parse("18/6/1982"), "RUA MAGNA TATIANA ALBUQUERQUE DO NASCIMENTO MEIRA ", "976", "MANGABEIRA",
				"JOÃO PESSOA", "PB");
		Pessoa pes19 = new Pessoa(null, "ESTEFANY FERNANDA DA SILVA BRANDÃO", "26604866711", "9752210",
				sdf.parse("19/7/1983"), "RUA ESTEFANY FERNANDA DA SILVA BRANDÃO", "840", "JARDINS", "JOÃO PESSOA",
				"PB");
		Pessoa pes20 = new Pessoa(null, "ESTEFANY SOARES DE FARIAS", "58580701324", "5885786", sdf.parse("20/8/1984"),
				"RUA ESTEFANY SOARES DE FARIAS", "961", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes21 = new Pessoa(null, "RUTH DE JESUS DA SILVA", "46367687300", "6435894", sdf.parse("21/9/1985"),
				"RUA RUTH DE JESUS DA SILVA", "127", "DIVINOPOLIS", "JOÃO PESSOA", "PB");
		Pessoa pes22 = new Pessoa(null, "DAIANA TAVARES BARBOSA BRASILEIRO", "41635179074", "7122955",
				sdf.parse("22/10/1986"), "RUA DAIANA TAVARES BARBOSA BRASILEIRO", "651", "CENTRO", "JOÃO PESSOA", "PB");
		Pessoa pes23 = new Pessoa(null, "JOSÉ SEVERINO DA SILVA", "33505759272", "9538555", sdf.parse("23/11/1987"),
				"RUA JOSÉ SEVERINO DA SILVA", "65", "ESTADOS", "JOÃO PESSOA", "PB");
		Pessoa pes24 = new Pessoa(null, "MARIA DANIELA MEDEIROS", "43074851117", "2975821", sdf.parse("24/12/1988"),
				"RUA MARIA DANIELA MEDEIROS", "235", "MANGABEIRA", "JOÃO PESSOA", "PB");
		Pessoa pes25 = new Pessoa(null, "MÁRCIA FERREIRA DE LIMA", "30591995573", "7549875", sdf.parse("25/1/1989"),
				"RUA MÁRCIA FERREIRA DE LIMA", "918", "JARDINS", "JOÃO PESSOA", "PB");
		Pessoa pes26 = new Pessoa(null, "GRACITA RODRIGUES", "55800014424", "8846137", sdf.parse("26/2/1990"),
				"RUA GRACITA RODRIGUES", "631", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes27 = new Pessoa(null, "ANDRÉ BORGES DE SOUSA", "28197871068", "7475432", sdf.parse("27/3/1991"),
				"RUA ANDRÉ BORGES DE SOUSA", "598", "DIVINOPOLIS", "JOÃO PESSOA", "PB");
		Pessoa pes28 = new Pessoa(null, "JOSIEL AQUINO ALVES", "88251271510", "7381957", sdf.parse("28/4/1992"),
				"RUA JOSIEL AQUINO ALVES", "303", "CENTRO", "JOÃO PESSOA", "PB");
		Pessoa pes29 = new Pessoa(null, "ANDRE FERREIRA MEDEIROS", "61593333115", "5822352", sdf.parse("29/5/1993"),
				"RUA ANDRE FERREIRA MEDEIROS", "297", "ESTADOS", "JOÃO PESSOA", "PB");
		Pessoa pes30 = new Pessoa(null, "JESSICA GABRIELLA OLIVEIRA AGUIAR", "71578032976", "1512772",
				sdf.parse("1/6/1994"), "RUA JESSICA GABRIELLA OLIVEIRA AGUIAR", "275", "MANGABEIRA", "JOÃO PESSOA",
				"PB");
		Pessoa pes31 = new Pessoa(null, "JOSE CARLOS ROSENO DE LIMA", "45410397545", "5892524", sdf.parse("2/7/1995"),
				"RUA JOSE CARLOS ROSENO DE LIMA", "752", "JARDINS", "JOÃO PESSOA", "PB");
		Pessoa pes32 = new Pessoa(null, "SUZANILDO DANTAS DA SILVA 527,10", "50876043284", "8458489",
				sdf.parse("3/8/1965"), "RUA SUZANILDO DANTAS DA SILVA 527,10", "30", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes33 = new Pessoa(null, "GRACILEIDE LOURENÇO DA SILVA 524,95", "53524364218", "3592036",
				sdf.parse("4/9/1966"), "RUA GRACILEIDE LOURENÇO DA SILVA 524,95", "900", "DIVINOPOLIS", "JOÃO PESSOA",
				"PB");
		Pessoa pes34 = new Pessoa(null, "ANA FABILLANE CABRAL DA SILVA", "16053564113", "5902733",
				sdf.parse("5/10/1967"), "RUA ANA FABILLANE CABRAL DA SILVA", "499", "CENTRO", "JOÃO PESSOA", "PB");
		Pessoa pes35 = new Pessoa(null, "CRISTINA ELIZABETH BRAZ DANTAS DOS SANTOS", "48599173031", "9300692",
				sdf.parse("6/11/1968"), "RUA CRISTINA ELIZABETH BRAZ DANTAS DOS SANTOS", "646", "ESTADOS",
				"JOÃO PESSOA", "PB");
		Pessoa pes36 = new Pessoa(null, "MARIA DE FÁTIMA DA SILVA", "95528877475", "3145270", sdf.parse("7/12/1969"),
				"RUA MARIA DE FÁTIMA DA SILVA", "32", "MANGABEIRA", "JOÃO PESSOA", "PB");
		Pessoa pes37 = new Pessoa(null, "MARIA APARECIDA DA SILVA FLOR", "82306249920", "5863445",
				sdf.parse("8/1/1970"), "RUA MARIA APARECIDA DA SILVA FLOR", "448", "JARDINS", "JOÃO PESSOA", "PB");
		Pessoa pes38 = new Pessoa(null, "ALINE FERNANDES DA NÓBREGA", "21586795103", "8922056", sdf.parse("9/2/1971"),
				"RUA ALINE FERNANDES DA NÓBREGA", "432", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes39 = new Pessoa(null, "SILVAN GOMES DA SILVA", "89523400268", "4508165", sdf.parse("10/3/1972"),
				"RUA SILVAN GOMES DA SILVA", "170", "DIVINOPOLIS", "JOÃO PESSOA", "PB");
		Pessoa pes40 = new Pessoa(null, "EMMANUEL LÁZARO DO NASCIMENTO DINIZ", "72213004484", "6592509",
				sdf.parse("11/4/1973"), "RUA EMMANUEL LÁZARO DO NASCIMENTO DINIZ", "489", "CENTRO", "JOÃO PESSOA",
				"PB");
		Pessoa pes41 = new Pessoa(null, "ALESSANDRA SILVA GONÇALVES DIAS", "28942989337", "2818921",
				sdf.parse("12/5/1974"), "RUA ALESSANDRA SILVA GONÇALVES DIAS", "189", "ESTADOS", "JOÃO PESSOA", "PB");
		Pessoa pes42 = new Pessoa(null, "MARIA JOSÉ DA SILVA LEANDRO", "18197305752", "3321558", sdf.parse("13/6/1975"),
				"RUA MARIA JOSÉ DA SILVA LEANDRO", "943", "MANGABEIRA", "JOÃO PESSOA", "PB");
		Pessoa pes43 = new Pessoa(null, "LIGIA SABINO DA COSTA MELO", "69851015035", "6181661", sdf.parse("14/7/1976"),
				"RUA LIGIA SABINO DA COSTA MELO", "589", "JARDINS", "JOÃO PESSOA", "PB");
		Pessoa pes44 = new Pessoa(null, "SILVANIO RAMOS DA SILVA", "30846605855", "4761301", sdf.parse("15/8/1977"),
				"RUA SILVANIO RAMOS DA SILVA", "994", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes45 = new Pessoa(null, "ESMEJOANO LINCOL DA SILVA DE FRANÇA", "62219650925", "4545702",
				sdf.parse("16/9/1978"), "RUA ESMEJOANO LINCOL DA SILVA DE FRANÇA", "14", "DIVINOPOLIS", "JOÃO PESSOA",
				"PB");
		Pessoa pes46 = new Pessoa(null, "JÉFERSON RENATO DA SILVA ", "32563387315", "8624831", sdf.parse("17/10/1979"),
				"RUA JÉFERSON RENATO DA SILVA ", "265", "CENTRO", "JOÃO PESSOA", "PB");
		Pessoa pes47 = new Pessoa(null, "AYLLA MILANEZ PEREIRA", "26981863281", "5179132", sdf.parse("18/11/1980"),
				"RUA AYLLA MILANEZ PEREIRA", "338", "ESTADOS", "JOÃO PESSOA", "PB");
		Pessoa pes48 = new Pessoa(null, "EMANUEL DO NASCIMENTO NUNES", "96792327656", "9621862",
				sdf.parse("19/12/1981"), "RUA EMANUEL DO NASCIMENTO NUNES", "336", "MANGABEIRA", "JOÃO PESSOA", "PB");
		Pessoa pes49 = new Pessoa(null, "ANA PAULA MENDES RODRIGUES CAVALCANTI", "12408128229", "1289060",
				sdf.parse("20/1/1982"), "RUA ANA PAULA MENDES RODRIGUES CAVALCANTI", "480", "JARDINS", "JOÃO PESSOA",
				"PB");
		Pessoa pes50 = new Pessoa(null, "JOÃO VITOR DO NASCIMENTO MARINHO", "31221952674", "1289188",
				sdf.parse("21/2/1983"), "RUA JOÃO VITOR DO NASCIMENTO MARINHO", "870", "MARIVALDO", "JOÃO PESSOA",
				"PB");
		Pessoa pes51 = new Pessoa(null, "GILDEMAR HENRIQUE SALUSTINO", "38594826866", "5692478", sdf.parse("22/3/1984"),
				"RUA GILDEMAR HENRIQUE SALUSTINO", "375", "DIVINOPOLIS", "JOÃO PESSOA", "PB");
		Pessoa pes52 = new Pessoa(null, "DAYSE LOPES DE BARROS BENICIO", "37726458562", "7288386",
				sdf.parse("23/4/1985"), "RUA DAYSE LOPES DE BARROS BENICIO", "507", "CENTRO", "JOÃO PESSOA", "PB");
		Pessoa pes53 = new Pessoa(null, "DINIZ SILVA DE FRANÇA", "95349501846", "3999199", sdf.parse("24/5/1986"),
				"RUA DINIZ SILVA DE FRANÇA", "780", "ESTADOS", "JOÃO PESSOA", "PB");
		Pessoa pes54 = new Pessoa(null, "NAGIB KAFFÁ FERRAZ", "74584539126", "8663776", sdf.parse("25/6/1987"),
				"RUA NAGIB KAFFÁ FERRAZ", "813", "MANGABEIRA", "JOÃO PESSOA", "PB");
		Pessoa pes55 = new Pessoa(null, "ANA PAULA SALES DE MEDEIROS", "19948516698", "1316735", sdf.parse("26/7/1988"),
				"RUA ANA PAULA SALES DE MEDEIROS", "266", "JARDINS", "JOÃO PESSOA", "PB");
		Pessoa pes56 = new Pessoa(null, "WEBER GEOVANNI MENDES MACIEL", "88206646557", "3106468",
				sdf.parse("27/8/1989"), "RUA WEBER GEOVANNI MENDES MACIEL", "199", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes57 = new Pessoa(null, "ERLON CHERQUE PINTO", "52026784533", "7085382", sdf.parse("28/9/1990"),
				"RUA ERLON CHERQUE PINTO", "754", "DIVINOPOLIS", "JOÃO PESSOA", "PB");
		Pessoa pes58 = new Pessoa(null, "LIVIA MARIA MACIEIRA MARTINS", "39129078535", "7883202",
				sdf.parse("29/10/1991"), "RUA LIVIA MARIA MACIEIRA MARTINS", "718", "CENTRO", "JOÃO PESSOA", "PB");
		Pessoa pes59 = new Pessoa(null, "VIVIANE PEREIRA DE ANDRADE", "93895217416", "5127842", sdf.parse("1/11/1992"),
				"RUA VIVIANE PEREIRA DE ANDRADE", "684", "ESTADOS", "JOÃO PESSOA", "PB");
		Pessoa pes60 = new Pessoa(null, "THALITA CABRAL LIMA", "70946037450", "7072506", sdf.parse("2/12/1993"),
				"RUA THALITA CABRAL LIMA", "475", "MANGABEIRA", "JOÃO PESSOA", "PB");
		Pessoa pes61 = new Pessoa(null, "KISSYS JULIA CARVALHO DE AZEVEDO", "70748047774", "7595433",
				sdf.parse("3/1/1994"), "RUA KISSYS JULIA CARVALHO DE AZEVEDO", "325", "JARDINS", "JOÃO PESSOA", "PB");
		Pessoa pes62 = new Pessoa(null, "SAMARA FERREIRA BEZERRA", "41349616713", "5166908", sdf.parse("4/2/1995"),
				"RUA SAMARA FERREIRA BEZERRA", "272", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes63 = new Pessoa(null, "RENATA FEITOSA COSTA LUCENA", "84627004094", "5271665", sdf.parse("5/3/1965"),
				"RUA RENATA FEITOSA COSTA LUCENA", "815", "DIVINOPOLIS", "JOÃO PESSOA", "PB");
		Pessoa pes64 = new Pessoa(null, "ROBSON CARLOS MARTINS DA SILVA SANTOS", "41488647397", "4155564",
				sdf.parse("6/4/1966"), "RUA ROBSON CARLOS MARTINS DA SILVA SANTOS", "280", "CENTRO", "JOÃO PESSOA",
				"PB");
		Pessoa pes65 = new Pessoa(null, "CLÁUDIA CILIAN DOS SANTOS SOUS", "49495353678", "6565599",
				sdf.parse("7/5/1967"), "RUA CLÁUDIA CILIAN DOS SANTOS SOUS", "577", "ESTADOS", "JOÃO PESSOA", "PB");
		Pessoa pes66 = new Pessoa(null, "ALDENISE BARBOSA DA SILVA", "71804049804", "6275708", sdf.parse("8/6/1968"),
				"RUA ALDENISE BARBOSA DA SILVA", "795", "MANGABEIRA", "JOÃO PESSOA", "PB");
		Pessoa pes67 = new Pessoa(null, "NOEMI FERREIRA LOBO DE CASTRO", "57453943676", "7711249",
				sdf.parse("9/7/1969"), "RUA NOEMI FERREIRA LOBO DE CASTRO", "127", "JARDINS", "JOÃO PESSOA", "PB");
		Pessoa pes68 = new Pessoa(null, "SHILDRENIA COUTINHO ALVES REGO", "84964595305", "5531901",
				sdf.parse("10/8/1970"), "RUA SHILDRENIA COUTINHO ALVES REGO", "707", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes69 = new Pessoa(null, "ZEILTON DE OLIVEIRA BARBOSA", "17939522523", "1563257", sdf.parse("11/9/1971"),
				"RUA ZEILTON DE OLIVEIRA BARBOSA", "648", "DIVINOPOLIS", "JOÃO PESSOA", "PB");
		Pessoa pes70 = new Pessoa(null, "ANTÔNIA KÁTIA ALVES DO NASCIMENTO", "29371578095", "8905158",
				sdf.parse("12/10/1972"), "RUA ANTÔNIA KÁTIA ALVES DO NASCIMENTO", "649", "CENTRO", "JOÃO PESSOA", "PB");
		Pessoa pes71 = new Pessoa(null, "LAURA DE LIZIEUX LIRA MADRUGA", "76901513474", "1335114",
				sdf.parse("13/11/1973"), "RUA LAURA DE LIZIEUX LIRA MADRUGA", "150", "ESTADOS", "JOÃO PESSOA", "PB");
		Pessoa pes72 = new Pessoa(null, "MARIA DENISE CRUZ", "13464136284", "4027194", sdf.parse("14/12/1974"),
				"RUA MARIA DENISE CRUZ", "212", "MANGABEIRA", "JOÃO PESSOA", "PB");
		Pessoa pes73 = new Pessoa(null, "ELAYNNE FELIX DA SILVA", "76118635914", "7547392", sdf.parse("15/1/1975"),
				"RUA ELAYNNE FELIX DA SILVA", "871", "JARDINS", "JOÃO PESSOA", "PB");
		Pessoa pes74 = new Pessoa(null, "SUELLEN CRISTINA DA SILVA", "73242891420", "5363505", sdf.parse("16/2/1976"),
				"RUA SUELLEN CRISTINA DA SILVA", "802", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes75 = new Pessoa(null, "HELLYNALDO JOHNNY LIMA DE MOURA", "25400574212", "8608863",
				sdf.parse("17/3/1977"), "RUA HELLYNALDO JOHNNY LIMA DE MOURA", "850", "DIVINOPOLIS", "JOÃO PESSOA",
				"PB");
		Pessoa pes76 = new Pessoa(null, "ROSANGELA GUIMARAES BATISTA", "63863591304", "3777599", sdf.parse("18/4/1978"),
				"RUA ROSANGELA GUIMARAES BATISTA", "124", "CENTRO", "JOÃO PESSOA", "PB");
		Pessoa pes77 = new Pessoa(null, "ROBERTO MANOEL DA SILVA DO NASCIMENTO", "19060520527", "5593091",
				sdf.parse("19/5/1979"), "RUA ROBERTO MANOEL DA SILVA DO NASCIMENTO", "596", "ESTADOS", "JOÃO PESSOA",
				"PB");
		Pessoa pes78 = new Pessoa(null, "VALQUIRIA DOS SANTOS TEIXEIRA", "87774965825", "7301927",
				sdf.parse("20/6/1980"), "RUA VALQUIRIA DOS SANTOS TEIXEIRA", "632", "MANGABEIRA", "JOÃO PESSOA", "PB");
		Pessoa pes79 = new Pessoa(null, "EVANICE GONÇALO DO NASCIMENTO", "72448897569", "7491652",
				sdf.parse("21/7/1981"), "RUA EVANICE GONÇALO DO NASCIMENTO", "691", "JARDINS", "JOÃO PESSOA", "PB");
		Pessoa pes80 = new Pessoa(null, "JOÃO PAULO RAMALHO LEITE", "23826934481", "9113472", sdf.parse("22/8/1982"),
				"RUA JOÃO PAULO RAMALHO LEITE", "959", "MARIVALDO", "JOÃO PESSOA", "PB");
		Pessoa pes81 = new Pessoa(null, "JÉSSICA BARBOSA DE SOUSA", "53920560234", "4727556", sdf.parse("23/9/1983"),
				"RUA JÉSSICA BARBOSA DE SOUSA", "449", "DIVINOPOLIS", "JOÃO PESSOA", "PB");
		Pessoa pes82 = new Pessoa(null, "SIMONE FLORIANO NUNES", "19989374907", "7634293", sdf.parse("24/10/1984"),
				"RUA SIMONE FLORIANO NUNES", "735", "CENTRO", "JOÃO PESSOA", "PB");

		pessoaRepository.saveAll(Arrays.asList(pes1, pes2, pes3, pes4, pes5, pes6, pes7, pes8, pes9, pes10, pes11,
				pes12, pes13, pes14, pes15, pes16, pes17, pes18, pes19, pes20, pes21, pes22, pes23, pes24, pes25, pes26,
				pes27, pes28, pes29, pes30, pes31, pes32, pes33, pes34, pes35, pes36, pes37, pes38, pes39, pes40, pes41,
				pes42, pes43, pes44, pes45, pes46, pes47, pes48, pes49, pes50, pes51, pes52, pes53, pes54, pes55, pes56,
				pes57, pes58, pes59, pes60, pes61, pes62, pes63, pes64, pes65, pes66, pes67, pes68, pes69, pes70, pes71,
				pes72, pes73, pes74, pes75, pes76, pes77, pes78, pes79, pes80, pes81, pes82));

	}
}
