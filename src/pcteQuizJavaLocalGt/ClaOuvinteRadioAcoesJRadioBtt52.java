package pcteQuizJavaLocalGt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
*
* @author Almir_Silva
 * @version  0.1, 11 Feb 2018
* <p>{@literal Version old V03 052V7BB since 07 mar 2013 And new implementation  v0.1, 02/11/18}</p>
* {@link #actionPerformed(ActionEvent evento)} "Param evento is control of buton mean IN class ClaOuvinteRadioAcoesJRadioBtt52"
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

		/*
		 * @param evento Verifica se o evento é a resposta certa  
		 */
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