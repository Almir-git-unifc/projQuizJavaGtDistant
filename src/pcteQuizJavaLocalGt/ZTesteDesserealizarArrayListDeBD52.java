/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcteQuizJavaLocalGt;

import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
*
* @author Almir_Silva
* @version  0.1, 11 Feb 2018
* <p>{@literal Version old V03 052V7BB since 07 mar 2013 And new implementation  v0.1, 02/11/18}</p>
* <p>{@literal Class ZTesteDesserealizarArrayListDeBD52 has 100 lines}</p>
* {@link #metodoReconstArrayListDessereal()} "testa se serealizacao deu certo"
*/
public class ZTesteDesserealizarArrayListDeBD52 {

	ArrayList<ArrayList<ClaBDProQuest52>> InstTesteArrayListRemoveIObj;
	ArrayList<String> InstArrayListMaterias;
	ArrayList<String> InstArrListOpcoesEntrDisciplina;

	public ZTesteDesserealizarArrayListDeBD52() {
		metodoReconstArrayListDessereal();
		metodoExibeArrayList();

		// return InstTesteArrayListRecuperado1
	}

	public void metodoReconstArrayListDessereal() {
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("ArrayListBDProj52.ser"));
			InstTesteArrayListRemoveIObj = (ArrayList<ArrayList<ClaBDProQuest52>>) is.readObject();
			System.out.println("Informações do método desserealizar");
			System.out.println("");
			System.out.println("ArrayList BD52 Desserealizado e Reconstruido com sucesso!");
			System.out.println("");
			
			//Fechando o Objeto Streming
			is.close();
		}

		catch (Exception ex) {
			System.out.println("O Array List não foi serealizado... ");
			System.out.println("Será que o nome do arquivo serealizado não é ... ArrayListBDProj52.ser");
			System.out.println("Consulte o método mtdSerealizarArrayListDeArrList() da classe OuvinteBotão");
			System.out.println(
					"Será que você se esqueceu de serealizar?  Ou será que o BD.ser foi apagado por acidente???");
			ex.printStackTrace();
		}
	}

	public void metodoExibeArrayList() {
		// se não escrever InstTesteArrayListRemoveIObj = new ArrayList <>(); DÁ ERRO
		// NULL POINTER
		// nstTesteArrayListRemoveIObj = new ArrayList <>();
		if (!InstTesteArrayListRemoveIObj.isEmpty()) {
			System.out.print("O ArrayList agora é: [ ");

			// Repet Repet Repet Repet
			// VAMOS CRIAR O MÉTODO PARA PERCORRER TODAS AS PERGUNTAS DO ARRAY
			// PEQUENO QUE ESTÃO CONTIDAS NO ARRAYLIST GRANDE

			for (ArrayList<ClaBDProQuest52> InstArrayListStringTemp : InstTesteArrayListRemoveIObj) {

				// vai pegar o grupo de questões matemática, depois o portugues, e por ultimo o
				// cogerais
				for (int j = 0; j < InstArrayListStringTemp.size(); j++) {

					// vai percorrer cada uma das três questões de cada matéria, começando com o 0,
					// depois o 1, e por ultimo o i = 2

					// E agora capturei uma questão
					ClaBDProQuest52 varTempPerg = InstArrayListStringTemp.get(j);

					// Agora vamos imprimir qualquer atributo desta questão, como
					// número, a pergutna a matéria, etc...
					System.out.print(varTempPerg.getNumberQuest() + " ");
					System.out.print(varTempPerg.getAlterCert() + "    ");
				}
			}

			System.out.print(" ]");
			System.out.println("");
			System.out.println("");
		}

		System.out.println("");
	}

	public static void main(String args[]) {
		new ZTesteDesserealizarArrayListDeBD52();
		System.out.println("");
		System.out.println("Método main realizado: ");
		System.out.println("A quantidade de objetos serealizados é: " + ClaBDProQuest52.varCountPergCreate);
		System.out.println("");
	}
}
