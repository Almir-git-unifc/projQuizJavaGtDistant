package pcteQuizJavaLocalGt;

import java.io.Serializable;

/**
*
* @author Almir_Silva
 * @version  0.1, 11 Feb 2018
* <p>{@literal Version old V03 052V7BB since 07 mar 2013 And new implementation  v0.1, 02/11/18}</p>
* <p>{@literal Class create a type data mean, that be will used in moment of serialized BD}</p>
* <p>{@literal Class ClaBDProQuest52 has 127 lines}</p>
* <p>{@link #getAlterCert()} "Class has getters e setters because VAR instance are private"</p>
* <p>{@link #ClaBDProQuest52(String, int, String, String, String, String, String, String, String)}  "Parameter too, are 9 parameter"
* <p>{@link #ClaBDProQuest52(String, int, String, String, String, String, String, String, String)}  "Constructor Class composed string 
*  varMateriaQuestao, Number Question, char to Alternative right and five strings to alternatives"</p>
* {@link #getVarCountPergCreate()}  "Return varCountPergCreate that is VAR static to counter questions created"
*
*/

public class ClaBDProQuest52 implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private String varMateriaQuestao;
	private int numberQuest;
	private String alterCert;
	private String quest;
	private String txtOpcao1;
	private String txtOpcao2;
	private String txtOpcao3;
	private String txtOpcao4;
	private String txtOpcao5;
	public static int varCountPergCreate;

	public ClaBDProQuest52() {
	}

	public ClaBDProQuest52(String MateriaRecebida, int insertNumq, String insertRespC, String insertPer,
			String insertAlter1, String insertAlter2, String insertAlter3, String insertAlter4, String insertAlter5) {
		// public ClaBDProQuest31 (int insertNumq, String insertRespC, String
		// insertPer){
		varMateriaQuestao = MateriaRecebida;
		numberQuest = insertNumq;
		alterCert = insertRespC;
		quest = insertPer;
		txtOpcao1 = insertAlter1;
		txtOpcao2 = insertAlter2;
		txtOpcao3 = insertAlter3;
		txtOpcao4 = insertAlter4;
		txtOpcao5 = insertAlter5;
		varCountPergCreate++;
		System.out.println("Foi criado a pergunta nº : " + varCountPergCreate);
	}

	// Abaixo métodos modificadores das variáves acima, desta vez a variável de
	// instância foi declarada privada

	public void setVarMateriaQuestao(String MaterQuestaoRec) {
		varMateriaQuestao = MaterQuestaoRec;
	}

	public String getVarMateriaQuestao() {
		return varMateriaQuestao;
	}

	public void setAlterCert(String alt) {
		alterCert = alt;
	}

	public String getAlterCert() {
		return alterCert;
	}

	public void setNumberQuest(int num) {
		numberQuest = num;
	}

	public int getNumberQuest() {
		return numberQuest;
	}

	public void setQuest(String insertPergu) {
		quest = insertPergu;
	}

	public String getQuest() {
		return quest;
	}

	public void setTxtOpcao1(String insertTxtOpcao1) {
		txtOpcao1 = insertTxtOpcao1;
	}

	public String getTxtOpcao1() {
		return txtOpcao1;
	}

	public void setTxtOpcao2(String insertTxtOpcao2) {
		txtOpcao2 = insertTxtOpcao2;
	}

	public String getTxtOpcao2() {
		return txtOpcao2;
	}

	public void setTxtOpcao3(String insertTxtOpcao3) {
		txtOpcao3 = insertTxtOpcao3;
	}

	public String getTxtOpcao3() {
		return txtOpcao3;
	}

	public void setTxtOpcao4(String insertTxtOpcao4) {
		txtOpcao4 = insertTxtOpcao4;
	}

	public String getTxtOpcao4() {
		return txtOpcao4;
	}

	public void setTxtOpcao5(String insertTxtOpcao5) {
		txtOpcao5 = insertTxtOpcao5;
	}

	public String getTxtOpcao5() {
		return txtOpcao5;
	}

	public static int getVarCountPergCreate() {
		/**
		 * @return varCountPergCreate of getVarCountPergCreate is VAR static to counter questions and answer created
		*/
		return varCountPergCreate;
	}

}

