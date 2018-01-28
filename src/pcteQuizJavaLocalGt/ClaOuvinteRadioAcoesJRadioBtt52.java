package pcteQuizJavaLocalGt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
*
* @author Almir_Silva
* @version 0.1 V03 052V7BB
* @param actionPerformed receiver evento
*/
public class ClaOuvinteRadioAcoesJRadioBtt52 implements ActionListener {

	/* Abaixo declaramos um objeto do tipo window */
	ClaAExecGrafBtnV52 janela;
	/* Abaixo declaramos e instanciamos nossas variáveis */

	public ClaOuvinteRadioAcoesJRadioBtt52(ClaAExecGrafBtnV52 objeto) {
		janela = objeto;

	}


	@Override
	public void actionPerformed(ActionEvent evento) {

		/* Verificamos se o evento é a resposta certa */
		/* Verificamos se marcou a alternativa 1 */
		if (evento.getSource() == janela.jrbAlt1 || evento.getSource() == janela.jrbAlt2
				|| evento.getSource() == janela.jrbAlt3 || evento.getSource() == janela.jrbAlt4
				|| evento.getSource() == janela.jrbAlt5) {
			janela.botao.setEnabled(true);
			janela.btLimp.setEnabled(true);
			janela.jtfCpoTxtResult.setText("");
			janela.btPular.setEnabled(false);

		} else {
			janela.botao.setEnabled(false);
		}
	}
}