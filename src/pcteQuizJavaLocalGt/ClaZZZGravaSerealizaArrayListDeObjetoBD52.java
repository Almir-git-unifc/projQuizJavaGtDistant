/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcteQuizJavaLocalGt;

import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
* @author Almir_Silva
* @version  0.1, 11 Feb 2018
* <p>{@literal Version old V03 052V7BB since 07 mar 2013 And new implementation  v0.1, 02/11/18}</p>
* <p>{@literal Class ClaZZZGravaSerealizaArrayListDeObjetoBD52 has 200 lines}</p>
* {@link #mtdSerealizarArrayListDeArrList()} "serialData use the ArrayList InstTesteArrayListRemoveIObj for serealize the questoes with writeObject"
* @serialData os fields of InstTesteArrayListRemoveIObj
*/
public class ClaZZZGravaSerealizaArrayListDeObjetoBD52 {
	// Abaixo nós estamos declarando o ArrayList Grande do tipo BD . Vamos declarfar
	// aqui pois o array é usado por mais de um método
	// O array list grande é usado pelo método mtdCriarArrayList e pelo método
	// mtdSerealizar
	ArrayList<ArrayList<ClaBDProQuest52>> InstTesteArrayListRemoveIObj;
	public int varCountPergSerealiz = 0;

	public ClaZZZGravaSerealizaArrayListDeObjetoBD52() {
		System.out.println("Inicio do metodo construtor da ClaZZZGravaSerealizaArrayListDeObjetoBD52 ");
		
		System.out.println("Chamando metodo mtdCriarArrayListDeArraySereal");		
		mtdCriarArrayListDeArraySereal();
		
		System.out.println("Chamando metodo mtdSerealizarArrayListDeArrList");	
		mtdSerealizarArrayListDeArrList();

	}

	/**
	 * Metodo mtdCriarArrayListDeArraySereal Cria objeto e adiciona perguntas e suas respostas
	 */
	public void mtdCriarArrayListDeArraySereal() {
		System.out.println("");
		System.out.println("");
		System.out.println("INICIO do metodo mtdCriarArrayListDeArraySereal ClaZZZGravaSerealiza... que contem as perguntas, alternativas e respostas");			
		// ABAIXO CRIAMOS NOVE PERGUNTAS
		ClaBDProQuest52 BDInst1 = new ClaBDProQuest52("Matemática", 1, "b", "Quanto é 1 + 1?", "11?", "2", "Não sei",
				"Posso pensar?", "Porquê?");

		ClaBDProQuest52 BDInst2 = new ClaBDProQuest52("Matemática", 2, "a", "Qual é a raiz quadrada de 16?", "4", "7",
				"Quadada?", "16", "Sei lá....");

		ClaBDProQuest52 BDInst3 = new ClaBDProQuest52("Matemática", 3, "c", "Quantas bananas tem uma duzia e meia?",
				"15", "12", "18", "10", "1,5");

		ClaBDProQuest52 BDInst4 = new ClaBDProQuest52("Português", 4, "d",
				"Qual das palavras baixo está escrita corretamente?", "caxtelo", "escrevido", "tristesa", "beleza",
				"mãi");

		ClaBDProQuest52 BDInst5 = new ClaBDProQuest52("Português", 5, "e", "Que é verbo defectivo?",
				"Conjugado em todas as pessoas", "Defeque o que ???!!!...", "Não se pode mencionar",
				"Proibido para este horário", "Não se pode flexionar");

		ClaBDProQuest52 BDInst6 = new ClaBDProQuest52("Português", 6, "e", "Qual é a palavra acentuada corretamente?",
				"Urubú", "Acórdão", "Cânon", "Céu", "Êxodo");

		ClaBDProQuest52 BDInst7 = new ClaBDProQuest52("Conhecimentos Gerais", 7, "b",
				"Quanto é o Presidente os Estados Unidas?", "Osama", "Obama", "Bill Clinton", "Carter?", "Mc Donald");

		ClaBDProQuest52 BDInst8 = new ClaBDProQuest52("Conhecimentos Gerais", 8, "a", "Atual Secretário da Saúde?",
				"Homero", "Enéias", "Filisteus", "Grana", "Sei lá....");

		ClaBDProQuest52 BDInst9 = new ClaBDProQuest52("Conhecimentos Gerais", 9, "c", "Onde fica a Terra Santa?",
				"Vietnã", "Vaticano", "Jerusalém", "Inglaterra", "Estados Unidos");

		varCountPergSerealiz = ClaBDProQuest52.getVarCountPergCreate();

		System.out.println("Fim da criação das nove perguntas!!!");

		System.out.println("");

		// Coloca perguntas dentro do array pequeno e o array pequeno dentro do array
		// grande

		System.out.println("INICIO DA ORGANIZAÇÃO DAS PERGUNTAS");

		System.out.println("Array grande acaba de ser criado");

		System.out.println("");

		// Criaremos o ArrayLIst pequeno para uma matéria (Matematica) do tipo BD

		// Primeiro vamos declarar o objeto Array List mde Matemática
		ArrayList<ClaBDProQuest52> InstPeqArrayListMatematica;

		// DEPOIS VAMOS CRIAR O OBJETO (USANDO NEW) ONDE IREMOS ADICIONAR AS PERGUNTAS
		// DE MATEMÁTICA
		InstPeqArrayListMatematica = new ArrayList<>();
		System.out.println("Com metodo mtdCriarArrayListDeArraySereal ClaZZZGravaSerealiza... ");
		System.out.println("Criamos o array pequeno chamado InstPeqArrayListMatematica, e adicionamos questoes de Matematica");

		// Adicionamos três perguntas (Instancias BD) à este Array pequeno
		InstPeqArrayListMatematica.add(BDInst1);

		InstPeqArrayListMatematica.add(BDInst2);

		InstPeqArrayListMatematica.add(BDInst3);

		System.out.println("Colocamos as três perguntas no grupo de matemática");

		System.out.println("");
		// Vamos declarar o objeto portugues

		// Criamos outro ArrayList Pequeno para outra matéria (Portugues) do tipo BD
		ArrayList<ClaBDProQuest52> InstPeqArrayListPortugues;

		System.out.println("Com metodo mtdCriarArrayListDeArraySereal ClaZZZGravaSerealiza... ");
		System.out.println("Criamos o array pequeno chamado InstPeqArrayListPortugues, e adicionamos questoes de Portugues");

		// PRIMEIRO VAMOS CRIAR O OBJETO - COM NEW NASCE UM OBJETO
		InstPeqArrayListPortugues = new ArrayList<>();

		// Adicionamos três perguntas (Instancias BD) à este Array pequeno
		InstPeqArrayListPortugues.add(BDInst4);

		InstPeqArrayListPortugues.add(BDInst5);

		InstPeqArrayListPortugues.add(BDInst6);

		System.out.println("Colocamos as três perguntas no grupo de Portugues");

		System.out.println("");

		// Criamos mais um ArrayList Pequeno para outra matéria (CoGe) do tipo BD

		// Primeiro vamos declara o Array de Conhec. Gerais
		ArrayList<ClaBDProQuest52> InstPeqArrayListConGerais;

		// DEPOIS VAMOS CRIAR O OBJETO COM NEW
		System.out.println("Com metodo mtdCriarArrayListDeArraySereal ClaZZZGravaSerealiza... ");
		System.out.println("Criamos o array pequeno chamado InstPeqArrayListConGerais, e adicionamos questoes de Conhecimentos Gerais");		
		InstPeqArrayListConGerais = new ArrayList<>();
		System.out.println("Criamos o array pequeno para Con. Gerais");

		// Adicionamos três perguntas (Instancias BD) à este Array pequeno
		InstPeqArrayListConGerais.add(BDInst7);

		InstPeqArrayListConGerais.add(BDInst8);

		InstPeqArrayListConGerais.add(BDInst9);

		System.out.println("Colocamos as três perguntas no grupo de Conhec. Gerais");

		System.out.println("");

		// ArrayList <ArrayList <ClaBDProQuest44> > InstTesteArrayListRemoveIObj = null;

		// AGORA VAMOS CRIAR O OBJETO (USANDO NEW) O ARRAYLIST DE ARRAYLIST GIGANTE
		System.out.println("Criamos o array Grande chamado InstTesteArrayListRemoveIObj");		
		InstTesteArrayListRemoveIObj = new ArrayList<>();
		// Adicionamos cada ArrayList pequeno ao ArrayList grande
		InstTesteArrayListRemoveIObj.add(InstPeqArrayListMatematica);
		System.out.println("Adicionado matriz pequena de matemática ao ArrayList Grande InstTesteArrayListRemoveIObj");

		InstTesteArrayListRemoveIObj.add(InstPeqArrayListPortugues);
		System.out.println("Adicionado matriz pequena de Portugues ao ArrayList Grande InstTesteArrayListRemoveIObj");

		InstTesteArrayListRemoveIObj.add(InstPeqArrayListConGerais);
		System.out.println("Adicionado matriz pequena de Conhec. Gerais ao ArrayList Grande InstTesteArrayListRemoveIObj");

		System.out.println("");

		// Aqui deixamos o ArrayList pequeno disponível para o GC
		// InstPeqArrayListMatematica = null;

		// InstPeqArrayListPortugues = null;

		// InstPeqArrayListConGerais = null;

		System.out.println("Acabamos de anular as três matrizes pequenas externas, e adeixamos para o GC");

		System.out.println("FIM DA ORGANIZAÇÃO DAS PERGUNTAS");
		System.out.println("");		

		System.out.println("FIM DO METPODO mtdCriarArrayListDeArraySereal");
		System.out.println("");	
		System.out.println("");	

	}

	/**
	 * Metodo mtdSerealizarArrayListDeArrList  serealiza o objeto (que tem as questoes e suas respectivas respostas)
	 * @serialData os.writeObject(InstTesteArrayListRemoveIObj) "Serealiza Objetos"
	 */	
	public void mtdSerealizarArrayListDeArrList() {
		System.out.println("");
		System.out.println("");
		System.out.println("Inicio do metodo mtdSerealizarArrayListDeArrList ");
		System.out.println("teste ObjetoBD52");
		System.out.println("Tentando serealizar ArrayList");
		try {
			System.out.println("Inicio TRY da Serealização da Classe ClaZZZGravaSerealizaArrayListDeObjetoBD52");
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("ArrayListBDProj52.ser"));
			os.writeObject(InstTesteArrayListRemoveIObj);
			System.out.println("BD52 tem: " + varCountPergSerealiz + " Perguntas!");
			System.out.println("Objeto BD52WW serializado com sucesso!");
			System.out.println("");
			System.out.println("FIM do TRY da Serealização da Classe ClaZZZGravaSerealizaArrayListDeObjetoBD52");			
			os.flush();
			os.close();
		}

		catch (IOException ex) {
			System.out.println("Tentativa de serealizar falhou. Deu problema na gravação da serealização");
			ex.printStackTrace();
			System.out.println("");
		}
		System.out.println("FIM DO METODO Serealizar mtdSerealizarArrayListDeArrList da Classe ClaZZZGravaSerealizaArrayListDeObjetoBD52");
		System.out.println("");	
		System.out.println("");	
	}

	public static void main(String[] args) {

		ClaZZZGravaSerealizaArrayListDeObjetoBD52 InstSerealizada = new ClaZZZGravaSerealizaArrayListDeObjetoBD52();

	}
}