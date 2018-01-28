package pcteQuizJavaLocalGt;

import java.io.Serializable;

/**
*
* @author Almir_Silva
* @version 0.1 V03 052V7BB
* @literal Class 127 lines
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
		return varCountPergCreate;
	}

}

