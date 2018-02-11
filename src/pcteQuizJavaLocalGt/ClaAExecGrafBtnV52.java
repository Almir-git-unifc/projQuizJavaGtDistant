package pcteQuizJavaLocalGt;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *  4 H
 */
import pcteQuizJavaLocalGt.ClaOuvinteBtAcoesBotao52.ClaOuvinteBtPularAcoes;
//import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;

/**
 * @author Almir_Silva
 * @version  0.1, 11 Feb 2018
* <p>{@literal Version old V03 052V7BB since 07 mar 2013 And new implementation  v0.1, 02/11/18}</p>
 * <p>{@literal Class ClaAExecGrafBtnV52 has 270 lines}</p>
 * <p>{@link #initComponents()}  "Create big Painel with 4 sub-panels: jPanelPerg, jPanel1, jPanel2 e jPanel4"</p>
 * <p>{@link #initComponents()}  "jPanelPerg  in initComponents() is a Panel with Question"
 * <p>{@link #initComponents()}  "jtxtCpoPer  of jPanelPerg.add() in initComponents() is a label"
 * <p>{@link #initComponents()}  "jtfCpoTxtResult  of jPanel4.add in initComponents() is textfield for status of answer"
 * <p>{@link #initComponents()}  "getContentPane().Add() received a Label, JPanel1 (with RadioButon and Questions)"
 * <p>{@link #initComponents()}  " getContentPane().Add() received too  Jpanel2 (With button),jPanelPerg (Panel Question)"
 * <p>{@link #initComponents()}  "Parameters of getContentPane().Add() are jtxtCpoPer, jtfCpoTxtResult, jPanelPerg"</p>
 * {@link #jPanelPerg}  "in initComponents() is a Panel with Question"
 * <p>{@link #jPanel1}  "in initComponents() is a Panel with JRadioButoon with alterantives answers"</p>
 * {@link #jPanel2}  "in initComponents() is a Panel with JButoon Responder, Pular, Limpar"
 * <p>{@link #jPanel4}  "in initComponents() is a Panel with textfiel jtfCpoTxtResult of Status of the answer made"</p>
 */
/* */

public class ClaAExecGrafBtnV52 extends JFrame {


	private static final long serialVersionUID = -2166396122874767802L;
	public ButtonGroup grupoDeBotones;
	public JLabel jLabel2;
	public JLabel jLabel3;
	public JPanel jPanelPerg;
	public JPanel jPanel1;
	public JPanel jPanel2;
	public JPanel jPanel4;
	public JRadioButton jrbAlt1;
	public JRadioButton jrbAlt2;
	public JRadioButton jrbAlt3;
	public JRadioButton jrbAlt4;
	public JRadioButton jrbAlt5;
	JTextField jtfCpoTxtResult;
	public JTextArea jtxtCpoPerg;
	JScrollPane scroller;
	JButton botao, btPular, btLimp;

	public ClaAExecGrafBtnV52() {
		/** 
		* <p>{@literal Contrutor has initComponents}</p> 
		* */

		initComponents();
	}
     
	 
	public void initComponents() {

		grupoDeBotones = new ButtonGroup();

		jPanelPerg = new JPanel();
		jPanel1 = new JPanel();
		jrbAlt1 = new JRadioButton();
		jrbAlt2 = new JRadioButton();
		jrbAlt3 = new JRadioButton();
		jrbAlt4 = new JRadioButton();
		jrbAlt5 = new JRadioButton();
		jPanel2 = new JPanel();
		jPanel4 = new JPanel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();

		// DADOS GERAIS DO FORMULÁRIO
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Testes ABS – Gráfico Pra Questionário simplíssimo V00_50");
		setResizable(false);
		getContentPane().setLayout(null);

		jLabel3.setText("TESTE DE QUESTIONÁRIO GERAL - NÍVEL 1");
		getContentPane().add(jLabel3);
		jLabel3.setBounds(130, 15, 250, 10);

		// Painel Pergunta - Antigo Painel 1
		jPanelPerg.setBorder(BorderFactory.createTitledBorder("Pergunta:"));
		jPanelPerg.setLayout(null);
		// jPanelPerg - RECEM CRIADO
		

		getContentPane().add(jPanelPerg);

		// ABAIXO DIMENSIONA O PAINEL PERGUNTA
		jPanelPerg.setBounds(27, 40, 460, 70);

		jtxtCpoPerg = new JTextArea(10, 20);
		jtxtCpoPerg.setBounds(10, 15, 320, 20);
		// Abaixo a barra de rolagem
		// scroller = new JScrollPane(jtxtCpoPerg);
		jtxtCpoPerg.setLineWrap(true);
		

		jPanelPerg.add(jtxtCpoPerg);

		// scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		// scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		// O BOTÃO QUE FARÁ A PERGUNTA, DE ACORDO COM i DO ARRAYLIST
		jtxtCpoPerg.setText("Quanto é 1 + 1?");

		// Painel 1 - ALTERNATIVAS DE RESPOSTAS
		jPanel1.setBorder(BorderFactory.createTitledBorder("Escolha uma alternativa"));
		jPanel1.setLayout(null);
		getContentPane().add(jPanel1);

		// ABAIXO DIMENSIONA O PAINEL 1 - ALTERNATIVAS DE RESPOSTAS
		jPanel1.setBounds(27, 130, 460, 160);

		// LOCALIZAÇÃO E DIMENSÃO DO JRADIO 1
		// Painel 1 - Opção 1 de Radio
		// O BOTÃO QUE FARÁ A PERGUNTA, DE ACORDO COM i DO ARRAYLIST
		jrbAlt1.setText("11?");
		jPanel1.add(jrbAlt1);
		jrbAlt1.setBounds(10, 23, 250, 30);
		// O VALOR ABAIXO (a) SERÁ UTILIZADO PARA VERIFICAR SE CLICOU NA ALTERNATIVA
		// CERTA
		jrbAlt1.setActionCommand("a");

		// LOCALIZAÇÃO E DIMENSÃO DO JRADIO 2
		// Painel 1 - Opção 2 de Radio, abaixo
		// O BOTÃO QUE FARÁ A PERGUNTA, DE ACORDO COM i DO ARRAYLIST
		jrbAlt2.setText("2");
		jtxtCpoPerg.setEditable(false);
		jPanel1.add(jrbAlt2);
		jrbAlt2.setBounds(10, 48, 250, 30);
		// O VALOR ABAIXO (b) SERÁ UTILIZADO PARA VERIFICAR SE CLICOU NA ALTERNATIVA
		// CERTA
		jrbAlt2.setActionCommand("b");

		// LOCALIZAÇÃO E DIMENSÃO DO JRADIO 2
		// Painel 1 - Opção 2 de Radio, abaixo
		// O BOTÃO QUE FARÁ A PERGUNTA, DE ACORDO COM i DO ARRAYLIST
		jrbAlt3.setText("Não sei");
		jtxtCpoPerg.setEditable(false);
		jPanel1.add(jrbAlt3);

		// DIMENSÃO E LOCALIZAÇÃO DO JRADIO3
		jrbAlt3.setBounds(10, 73, 250, 30);
		// O VALOR ABAIXO (b) SERÁ UTILIZADO PARA VERIFICAR SE CLICOU NA ALTERNATIVA
		// CERTA
		jrbAlt3.setActionCommand("c");

		// LOCALIZAÇÃO E DIMENSÃO DO JRADIO 2
		// Painel 1 - Opção 2 de Radio, abaixo
		// O BOTÃO QUE FARÁ A PERGUNTA, DE ACORDO COM i DO ARRAYLIST
		jrbAlt4.setText("Posso pensar?");
		jtxtCpoPerg.setEditable(false);
		jPanel1.add(jrbAlt4);

		// DIMENSÃO E LOCALIZAÇÃO DO JRADIO3
		jrbAlt4.setBounds(10, 98, 250, 30);
		// O VALOR ABAIXO (b) SERÁ UTILIZADO PARA VERIFICAR SE CLICOU NA ALTERNATIVA
		// CERTA
		jrbAlt4.setActionCommand("d");

		// LOCALIZAÇÃO E DIMENSÃO DO JRADIO 2
		// Painel 1 - Opção 2 de Radio, abaixo
		// O BOTÃO QUE FARÁ A PERGUNTA, DE ACORDO COM i DO ARRAYLIST
		jrbAlt5.setText("Porquê?");
		jtxtCpoPerg.setEditable(false);
		jPanel1.add(jrbAlt5);

		// DIMENSÃO E LOCALIZAÇÃO DO JRADIO3
		jrbAlt5.setBounds(10, 123, 250, 30);
		// O VALOR ABAIXO (b) SERÁ UTILIZADO PARA VERIFICAR SE CLICOU NA ALTERNATIVA
		// CERTA
		jrbAlt5.setActionCommand("e");

		// Painel1 - Adicionamos os botões de radio ao grupo
		grupoDeBotones.add(jrbAlt1);
		grupoDeBotones.add(jrbAlt2);
		grupoDeBotones.add(jrbAlt3);
		grupoDeBotones.add(jrbAlt4);
		grupoDeBotones.add(jrbAlt5);

		// PAINEL BOTÃO - LOCALIZAÇÃO E DIMENSIONAMENTO
		jPanel2 = new JPanel();
		jPanel2.setBorder(BorderFactory.createTitledBorder("Responder / Pular"));
		jPanel2.setLayout(null);
		// criamos o botão e adicionamos no PAINEL 2
		botao = new JButton("Responder");
		botao.setEnabled(false);
		jPanel2.add(botao);
		botao.setBounds(15, 20, 98, 30);

		btPular = new JButton("Pular");
		jPanel2.add(btPular);
		btPular.setBounds(123, 20, 78, 30);

		btLimp = new JButton("Limpar");
		btLimp.setEnabled(false);
		jPanel2.add(btLimp);
		btLimp.setBounds(212, 20, 78, 30);

		// Colocamos o Painel 2 no Frame - Moldura
		getContentPane().add(jPanel2);

		// Abaixo configura o tamanho do painel2 à unha
		jPanel2.setBounds(27, 305, 305, 63);

		// PAINEL 4 - RESULTADO - LOCALIZAÇÃO E DIMENSIONAMENTO
		// ABAIXO INSTALAMOS E CONFIGURAMOS O PAINEL 4
		jPanel4 = new JPanel();
		// TÍTULO DO PAINEL 4
		jPanel4.setBorder(BorderFactory.createTitledBorder("Resultado"));
		jPanel4.setLayout(null);

		jLabel2 = new JLabel();
		// ROTULO DA CAIXA DE TEXTO
		jLabel2.setText("Você: ");

		// Abaixo configura o tamanho do LABEL à unha
		jLabel2.setBounds(10, 20, 40, 30);
		jtfCpoTxtResult = new JTextField();

		// Abaixo configura o tamanho do campo à unha
		jtfCpoTxtResult.setBounds(63, 20, 70, 30);

		jPanel4.add(jLabel2);
		jPanel4.add(jtfCpoTxtResult);

		// Abaixo configura o tamanho do painel4 à unha
		jPanel4.setBounds(340, 305, 146, 63);

		// Abaixo colocamos o painel 4 na moldura
		getContentPane().add(jPanel4);

		// REDIMENSIONAMENTO GERAL - TAMANHO GERAL DA MOLDURA
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 521) / 2, (screenSize.height - 410) / 2, 521, 410);

		/* Abaixo criamos um objeto controlador desta classe */
		ClaOuvinteRadioAcoesJRadioBtt52 InstVerifRespSelectOuvinteDoRadio = new ClaOuvinteRadioAcoesJRadioBtt52(this);
		ClaOuvinteBtAcoesBotao52 InstAcoesProOuvBotao = new ClaOuvinteBtAcoesBotao52(this);
		ClaOuvinteBtPularAcoes InstAcoesBtPular = InstAcoesProOuvBotao.new ClaOuvinteBtPularAcoes();
		ClaOuvinteBtAcoesBotao52.ClaOuvinteBtLimpSelect InstAcoesBtLimp = InstAcoesProOuvBotao.new ClaOuvinteBtLimpSelect();

		/* E Abaixo colocamos um ouvinte nos botões, para ver qual será acionado */
		jrbAlt1.addActionListener(InstVerifRespSelectOuvinteDoRadio);
		jrbAlt2.addActionListener(InstVerifRespSelectOuvinteDoRadio);
		jrbAlt3.addActionListener(InstVerifRespSelectOuvinteDoRadio);
		jrbAlt4.addActionListener(InstVerifRespSelectOuvinteDoRadio);
		jrbAlt5.addActionListener(InstVerifRespSelectOuvinteDoRadio);
		botao.addActionListener(InstAcoesProOuvBotao);
		btPular.addActionListener(InstAcoesBtPular);
		btLimp.addActionListener(InstAcoesBtLimp);
		
	
	}

	public static void main(String args[]) {
		ClaAExecGrafBtnV52 InstFrame = new ClaAExecGrafBtnV52();

		InstFrame.setVisible(true);

	}

}

