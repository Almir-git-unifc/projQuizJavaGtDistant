package pcteQuizJavaLocalGt;

 
// Importa a Classe ArrayList para não dar o erro: ArrayList cannot be resolved to a type
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

/**
*
* @author Almir_Silva
* @version  0.1, 11 Feb 2018
* <p>{@literal Version old V03 052V7BB since 07 mar 2013 And new implementation  v0.1, 02/11/18}</p>
* <p>{@literal Class ClaOuvinteBtAcoesBotao52 has 600 lines}</p>
* {@link #mtdCriaCaixaMensage(String, int)}  "String varTxtEntr is message of the messageBox
* and int rectipo is type (Confirmation, etc) of the messageBox"
* {@link #actionPerformed(ActionEvent evento)} "param evento is control of buton mean"
*/

public class ClaOuvinteBtAcoesBotao52 implements ActionListener{
	ClaAExecGrafBtnV52 janela;
    ClaZZZGravaSerealizaArrayListDeObjetoBD52 instSerealiz;
    ClaBDProQuest52 varTemp, varTempPerg; 
    ArrayList <ArrayList <ClaBDProQuest52> > InstTesteArrayListRemoveIObj;
    ArrayList <String> InstArrayListMaterias, InstArrListOpcoesEntrDisciplina;  
    ArrayList <ClaBDProQuest52>  varTempArrBD;
    
   //x Contem o valor de resposta teste captado de getAction - vamos pegar pelo scanner
    String x, elemCapt, varTesteArr, varTesteElemento, varStatusAcerto, varPrefDisc1, varPrefDisc2, captaRadioBotao, varAvaliacao;
       
    int  proxQuest, varTotalPerg, varTotQuestCorrect, varPercAcerto;
    public int i, j;
    static int tipo;

    //Abaixo Construtor Padrão e as INICIALIZAÇÕES
    public ClaOuvinteBtAcoesBotao52 (ClaAExecGrafBtnV52 objeto){
        instSerealiz = new ClaZZZGravaSerealizaArrayListDeObjetoBD52 ();
        varTotalPerg = instSerealiz.varCountPergSerealiz;            
        i = 0;
        j = 0;
        varTotQuestCorrect = 0;
        janela = objeto;
        InstTesteArrayListRemoveIObj =  new ArrayList <>();
        varTempArrBD = new ArrayList <>();
        metodoReconstArrayListDessereal(); 
        mtdScrumble ();
        metodoExibeArrayList ();
        mtdChamaPreparaMatPrefer ();
        metodoExibeArrayList ();
        // Abaixo só carrega a primeira questão
        carregavartemparr ();
    }

    
    public ArrayList <ArrayList <ClaBDProQuest52> > getInstTesteArrayListRemoveIObj (){
    
        return InstTesteArrayListRemoveIObj;
        
    }
    
    public void setInstTesteArrayListRemoveIObj (){            
        
    }
    
    
    public void mtdChamaPreparaMatPrefer ()
    {
        ClaEscolheMateria InstEscoMat = new ClaEscolheMateria ();        
        InstEscoMat.mtdPreparaInitMatPrefer();
    }
    
    public void metodoReconstArrayListDessereal() {    
                try {
	        ObjectInputStream is = new ObjectInputStream (new FileInputStream("ArrayListBDProj52.ser") );
	        InstTesteArrayListRemoveIObj = (ArrayList <ArrayList <ClaBDProQuest52> >) is.readObject ( );                                
                      System.out.println("INFORMAÇÕES DO MÉTODO UTILIZADO PARA DESSEREALIZAÇÃO: metodoReconstArrayListDessereal()");              
                      System.out.println("ArrayList BD52 Desserealizado e Reconstruido com sucesso!");
                      System.out.println("O ArrayList BD52 tem: " + varTotalPerg + " perguntas");
            }

            catch (Exception ex) {
                System.out.println ("O Array List BD52 não foi serealizado... ");
                System.out.println("Será que o nome do arquivo serealizado não é ... ArrayListBDProj51.ser");
                System.out.println("Consulte o método mtdSerealizarArrayListDeArrList() da classe OuvinteBotão");
                System.out.println ("Será que você se esqueceu de serealizar?  Ou será que o BD.ser foi apagado por acidente???");                
	  ex.printStackTrace ( );
            }            
    }
    
    
        public void mtdScrumble (){
            System.out.println("Antes de embaralhar, ArrayList está nesta ordem : " );
            metodoExibeArrayList ();
            System.out.println("");
            for (int q = 0; q < InstTesteArrayListRemoveIObj.size(); q++) {
                Collections.shuffle ( InstTesteArrayListRemoveIObj.get(q) );
            }
            System.out.println("Após embaralhar, ArrayList ficou nesta ordem : " );
            metodoExibeArrayList ();
            System.out.println("");
                
        }
    
    
    
    // Exibe ArrayList na linha de comando
     public void metodoExibeArrayList () {
        //se não escrever InstTesteArrayListRemoveIObj = new ArrayList <>();  DÁ ERRO NULL POINTER
        if(!InstTesteArrayListRemoveIObj.isEmpty()) {         
            System.out.print("O ArrayList agora é: [");  
                               
                //Repet   Repet  Repet  Repet
	  //VAMOS CRIAR O MÉTODO PARA PERCORRER TODAS AS QUESTÕES DO ARRAY PEQUENO 
            // QUE ESTÃO CONTIDAS NO ARRAYLIST GRANDE
 	 for (ArrayList <ClaBDProQuest52> InstArrayListStringTemp : InstTesteArrayListRemoveIObj) {

	     //vai pegar o grupo de questões mat, depois o port, e por ultimo o cogerais                        
                 for (int k = 0; k < InstArrayListStringTemp.size(); k++) {

	      //vai percorrer cada uma das três questões de cada matéria, começando com o 0, depois o 1, e por ultimo o i = 2
			//E agora capturamos uma questão	
			varTempPerg =  InstArrayListStringTemp.get(k);

	          //Agora vamos imprimir qualquer atributo desta questão, como 
                        //número da questão da matéria e sua respectiva resposta, etc...                             
                        System.out.print("  " + varTempPerg.getNumberQuest() + " " );    
                        System.out.print(varTempPerg.getAlterCert() + "  " );  
                }                                                        
           }
       
            System.out.print("]");
            System.out.println(""); 
       }
       System.out.println("Escolha uma resposta-alternativa para esta questão "); 
    }
          
    public  void mtCapturaTeclado (){    
        // Usando o trecho abaixo para simular o scanner E Solicitaremos um palpite
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu palpite para a questão ");
        elemCapt = null;
        elemCapt = in.next(); 
    }      
    
    public void mtCapturaRadioBotao () { 
        // Vamos capturar a resposta pelos botões de radio
        elemCapt = janela.grupoDeBotones.getSelection().getActionCommand(); 
    }
     
    public String  mtPapiteCapturado () {                      	
        //Vamos capturar os valores selecionados no teclado
        mtCapturaRadioBotao (); 
                
        return elemCapt;           
    }

    public void mtDesableBtn (){
       //ISTO QUANDO TERMIMNOU  
       janela.jrbAlt1.setEnabled(false);
       janela.jrbAlt2.setEnabled(false);
       janela.jrbAlt3 .setEnabled(false);
       janela.jrbAlt4.setEnabled(false);
       janela.jrbAlt5 .setEnabled(false); 
    }
     public void mtdLimpaSelecao () {
      //ACERTOU OU ERRROU     
       janela.grupoDeBotones.clearSelection(); 
       janela.botao.setEnabled(false);                                

    }
    
    public void mtStatusJanela () { 
        if (!InstTesteArrayListRemoveIObj.isEmpty()){
                janela.jtfCpoTxtResult.setText(varStatusAcerto);     
                janela.jtfCpoTxtResult.setEditable(false);
          
                System.out.println("Mensagem mtStatusJanela: Fim do Ciclo e você: " + varStatusAcerto) ;

                System.out.println("" ) ; 
        }
        else {
                System.out.println("FIM DO APLICATIVO!!!");
        }
    }   
        
        public void mtdLoadProxPerg (){
            if(!InstTesteArrayListRemoveIObj.isEmpty()) {  
                             System.out.println(" valor i " + i + " valor j " + j);
                             System.out.print("O array Grande tem " + InstTesteArrayListRemoveIObj.size() + " Elementos " ); 
                             System.out.println("O array Pequeno tem " + InstTesteArrayListRemoveIObj.get(i).size() + " Elementos " ); 
                             varTempPerg = InstTesteArrayListRemoveIObj.get(i).get(j);
                             janela.jtxtCpoPerg.setText(varTempPerg.getQuest()); 
                             mtdCarregarAlvernativas ();
                             janela.btPular.setEnabled(true);
                             janela.btLimp.setEnabled(true);                             
            }
        }

        public void mtdCarregarAlvernativas (){
                janela.jrbAlt1.setText(varTempPerg.getTxtOpcao1());
                janela.jrbAlt2.setText(varTempPerg.getTxtOpcao2());                 
                janela.jrbAlt3.setText(varTempPerg.getTxtOpcao3());                 
                janela.jrbAlt4.setText(varTempPerg.getTxtOpcao4());                 
                janela.jrbAlt5.setText(varTempPerg.getTxtOpcao5()); 
        }
        
        public void mtdCriaCaixaMensage (String varTxtEntr, int rectipo){
        	/**
        	 * @param varTxtEntr of mtdCriaCaixaMensage is message of the messageBox
        	 * @param rectipo of mtdCriaCaixaMensage is type (Confirmation, etc) of the messageBox
        	 */
            final  JOptionPane pane = new JOptionPane(varTxtEntr);
            tipo =  rectipo;
            JDialog dialog = pane.createDialog(new JFrame(), "RESULTADO FINAL");               
            dialog.show();  
            
            int response = JOptionPane.showConfirmDialog(null,"\n" + "O resultado da sua avaliação foi:   " + varAvaliacao 
                    + "\n" +"Você quer fechar o programa"
                    + "\n" , "Conclusão",JOptionPane.YES_NO_OPTION, tipo);

                if (response == JOptionPane.NO_OPTION) {
                    System.out.println("Nenhum Botão clicado");
                } 
                else if (response == JOptionPane.YES_OPTION) {
                    System.out.println("BTN Yes clicado");
                    System.exit(0);
                } 
                else if (response == JOptionPane.CLOSED_OPTION) {
                    System.out.println("Closed  janela clicado");
                }                  
        }         
        
        public void mtdAvaliaPerformance (){
            varPercAcerto =  varTotQuestCorrect  * 100 / varTotalPerg;            
            if (varPercAcerto >= 95) {
                varAvaliacao = "EXCELENTE!!!";
                tipo = JOptionPane.INFORMATION_MESSAGE;               
            }
            else if (varPercAcerto >= 85) {
                varAvaliacao = "BOM!!!";
                tipo = JOptionPane.INFORMATION_MESSAGE;
            }
            else if (varPercAcerto >= 50) {
                varAvaliacao = "RAZOÁVEL!!!";
                tipo = JOptionPane.WARNING_MESSAGE;
            }
            
            else if (varPercAcerto < 50){
                varAvaliacao = "RUIM!!!"; 
                tipo = JOptionPane.ERROR_MESSAGE;
            }
            System.out.println("De 0 à 49 = RUIM; 50 à 84 = RAZOÁVEL; 85 à 94 = BOM; de 95 em diante = ÓTIMO");
            System.out.println("Número de  Respostas Certas: " + varTotQuestCorrect);
            System.out.println("Total de perguntas: " + varTotalPerg + ". E sua nota (de 0 à 100) foi: " + varPercAcerto);
            System.out.println("Seu resultado foi " + varAvaliacao);
                    
            String message = 
                "\n"
                + "        R E S U L T A D O     DA     S U A     P E R F O R M A N C E :\n" 
                + "\n"
                + "\n"                   
                + "        Total de perguntas:   " + varTotalPerg + "\n" 
                + "\n"
                + "        Número de Questões Certas:   " + varTotQuestCorrect + "\n" 
                + "\n"
                + "        Sua nota   (de 0 à 100)   foi:   " + varPercAcerto + "\n"
                + "\n"
                + "\n"                       
                + "        P A D R Õ E S    D E    A V A L I A Ç Ã O :\n"   
                + "\n"                     
                + "        Nota  de  0  à  49   =   RUIM;            de  50  à  84  =  RAZOÁVEL;           \n" 
                + "        de  85  à  94   =  BOM;   e  de  95 em  diante     =  ÓTIMO  \n"    
                + "\n"
                + "\n";                    

        mtdCriaCaixaMensage (message, tipo); 
        }
        
        public void mtdFinalizarCiclo (){
                                        mtStatusJanela ();
                                        metodoExibeArrayList ();
                                        mtdLimpaSelecao ();

                                
                                        j++;
                                
                                        if (j >= varTempArrBD.size() ) {
                                            j = 0;
                                            i++;
                                            if ( i >= InstTesteArrayListRemoveIObj.size() )  { i = 0;}
                                    
                                        }
                                
                                    mtdLoadProxPerg ();
                                    janela.botao.setEnabled(false); 
                                    janela.btLimp.setEnabled(false); 
        }
        
        
        
        public void mtdFinalizarCicloTeste (){
                                        mtStatusJanela ();
                                        metodoExibeArrayList ();
                                        mtdLimpaSelecao ();
                                        janela.botao.setEnabled(false);                                
                                
                                        j++;
                                
                                        if (j >= varTempArrBD.size() ) {
                                            j = 0;
                                            i++;
                                            if ( i >= InstTesteArrayListRemoveIObj.size() )  { i = 0;}
                                    
                                        }
                                
                                    mtdLoadProxPerg ();
        }        
        
	public void mtdRemoverElementoECelulasVazias ( ) {

            InstTesteArrayListRemoveIObj.get(i).remove(j);
            j--;
                                                                    
            System.out.println(varStatusAcerto);                                   
            System.out.println("REMOVIDO O elemento que acertou!!!");
            System.out.println("");                                    
                                  
            //Abaixo removemos o Array da Matéria vazia para não travar o sistema
                if (InstTesteArrayListRemoveIObj.get(i).isEmpty() ) {
                    InstTesteArrayListRemoveIObj.remove(i);                                         
                    i--;
                    System.out.println("ArrayList de Matéria vazio foi removido");                                         
                                    
                    // Se este foi o último elemento removido, portanto acabou
                    if (InstTesteArrayListRemoveIObj.isEmpty()){
                        varStatusAcerto = "CORRECT: FIM!!!"; 
                        /*seSelected false porque FIM*/
                        mtdLimpaSelecao ();
                        mtDesableBtn ();  
                        janela.jtxtCpoPerg.setText("O QUESTIONÁRIO TERMINOU!!!");                                             
                        janela.grupoDeBotones.setSelected(null, false);
                        janela.btLimp.setEnabled(false);
                        janela.jtfCpoTxtResult.setText("FFFFFFFFFIM!!!");     
                        janela.jtfCpoTxtResult.setEditable(false);                                              
                                            
                        System.out.println("O Array Grande está vazio: Fim do Aplicativo ");                                     
                        System.out.println("");
                        mtdAvaliaPerformance ();
                        System.out.println(""); 
                                                                                                                
                        System.out.println("FFFFFFFFFIM!!!");
                        System.out.println("");  
                     }
                     else {
                        //Acertou a respostas, mas o Array Grande não acabou                                           
                        System.out.println("O ArrayList mat atual foi removido, Mas não acabou; HÁ outras matérias");
                     }
  
                  // Fim do Array Matéria vazio
                  }
                                
                  // O array matéria não está vazio
                  else {
                        //NÃO ESTÁ VAZIO                              
                  }

	}        
    
    public void actionPerformed(ActionEvent evento) 
    {         
    	/**
    	 * @param evento : is a control of button mean
    	 */
         if (evento.getSource()== janela.botao){
        
               if(!InstTesteArrayListRemoveIObj.isEmpty()) {         
               System.out.println("Inicio ActionPerformed evento getsource - Se o arraygrande não estiver vazio"); 

	 //vai pegar o grupo de questões mat, depois o port, e por ultimo o cogerais
                System.out.print(" No ActionPerformed linha 354: o j é: " + j + " e i é: " + i);
              	varTempArrBD  = (ArrayList <ClaBDProQuest52>) InstTesteArrayListRemoveIObj.get(i);   
                
                varTemp = (ClaBDProQuest52)  varTempArrBD.get(j);
			
                //A resposta certa agora estará em varTemp.getAlterCert ( );
                varTesteArr = varTemp.getAlterCert ( );
                    
                
	//vai percorrer cada uma das três questões de cada matéria, começando com o 0, depois o 1, e por ultimo o i = 2                 
                 	if (j < varTempArrBD.size() ) {
                            
		       //E agora capturei uma questão	
		       varTemp = (ClaBDProQuest52)  varTempArrBD.get(j);
			
                        	       //A resposta certa agora estará em varTemp.getAlterCert ( );
                        	      varTesteArr = varTemp.getAlterCert ( );
                                   janela.jtfCpoTxtResult.setText("  j é: " + j + " e i é: " + i);                                
                                                                
                        	System.out.print("A resposta certa (GetAlterCert) agora é: " + varTesteArr );
                        	System.out.println("    ...E a Questão atual é de nº " + varTemp.getNumberQuest ( )) ;
                                   
                                varTesteElemento = varTesteArr;
                                
                                // Abaixo capturou a resposta selecionada no radioBTN
                                x = mtPapiteCapturado ();                                 
                                System.out.println("A resposta certa é: " +varTesteElemento);                                          
                                System.out.println("Você selecionou no Radio BTN a alternativa: " + x); 
                                System.out.println("");
                                                                
                                
                                //ACERTOU
                                if (x.equals(varTesteElemento)) {
                                    
                                  varStatusAcerto = "CORRECT"; 
                                  varTotQuestCorrect ++;
                                  System.out.println("Questão Certa");  
                                  System.out.println("Total de Questões certas é: " + varTotQuestCorrect);                                  
                                
                                // Fim do Se Acertou a resposta
                                }
                                
                                else {
                                    // ERROR ERROR  ERROR!
                                    varStatusAcerto = "ERROR";
                                    
                                    // System.out.println(varStatusAcerto);                                     
                                    System.out.println(" ERROR THIS question: " + varTemp.getNumberQuest ( )); 
                                }
                                
                        // SE CORRECT OR OF ERROR - NO IMPORT - SERÁ EXECUTADO ESTE TRECHO 
                                
                                mtdRemoverElementoECelulasVazias ( );                                
                                
                                mtdFinalizarCiclo ();
                                
                        //Fim do Se j < varTempArrBD.size
			}

                // Fim do IF Se ArrayGrande Não estiver vazio : !InstTesteArrayListRemoveIObj.isEmpty        
		}
                     
                     else {
                   //   O else acima é se ArrayGrande acabou if (InstTesteArrayListRemoveIObj.isEmpty()){
                            }

         // Fim do evento geSource
         }
         
    //Abaixo fim do método actionPerformed
    }
    
    public  void carregavartemparr (){
        System.out.println ("o TAMANHO DE InstTesteArrayListRemoveIObj É: " + InstTesteArrayListRemoveIObj.size() );
        varTempArrBD  =  InstTesteArrayListRemoveIObj.get(0);    
        System.out.println ("o TAMANHO DE varTempArrBD É: " + varTempArrBD.size() );
        mtdLoadProxPerg ();
    }
    
 
// INNER CLASS  
class ClaOuvinteBtPularAcoes implements ActionListener {

            public void actionPerformed(ActionEvent evenBtPula) 
            {                 
                if (evenBtPula.getSource()== janela.btPular)
                {
        
                    if(!InstTesteArrayListRemoveIObj.isEmpty()) 
                    {         
                        System.out.println("btPular Inicio ActionPerformed evento getsource - Se o arraygrande não estiver vazio"); 

                        //vai pegar o grupo de questões matéria atual
                  //      varTempArrBD  = (ArrayList <ClaBDProQuest52>) InstTesteArrayListRemoveIObj.get(i);
                
                        varStatusAcerto = "Escolha um RdBtn";  
                        janela.jtfCpoTxtResult.setText("Selec RdBtn");     
                        janela.jtfCpoTxtResult.setEditable(false);  
                       // mtdFinalizarCiclo ();
                        System.out.println("btPular Foi desabilitado; agora será preciso removê-lo com suas ações e configurações");                         
                    }
                }
            }               
// Fim da inner class ClaOuvinteBtPularAcoes        
}


//inner class BTLimpar
class ClaOuvinteBtLimpSelect implements ActionListener {
   
            public void actionPerformed(ActionEvent evenBtLimp) 
            { 
                
                if (evenBtLimp.getSource()== janela.btLimp)
                {
        
                    if(!InstTesteArrayListRemoveIObj.isEmpty()) 
                    {         
                        System.out.println("btLimp Limpou - Inicio ActionPerformed evento getsource - Se o arraygrande não estiver vazio"); 

                        //vai limpar o que estiver selecionado
                
                        janela.jtfCpoTxtResult.setText("Limpou");     
                        mtdLimpaSelecao();
                        janela.btPular.setEnabled(true);
                        janela.btLimp.setEnabled(false);                        
                    }
                }
            }                

// Fim da inner class  ClaOuvinteBtLimpSelect           
}

class ClaEscolheMateria {
    
        public void mtdPreparaInitMatPrefer () 
        {
        
                mtdInicializarArrayDeMateriasEOpcoesDisciplina ( );
                //Insta duas JOptionPane e capta escolhas
                varPrefDisc1 = metdCaptaOptionPane ("Escolha a primeira matéria", "Matematica");
                varPrefDisc2 = metdCaptaOptionPane ("Escolha a segunda matéria", "Portugues");
                JOptionPane.showMessageDialog(null,"A primeira matéria escolhida foi: "+varPrefDisc1  + "\n " 
		+ "E a segunda matéria escolhida foi " + varPrefDisc2 + "\n " + "Agora vamos às perguntas");

        
                //COLOCANDO AS MATÉRIAS EM ORDEM DE PREFERENCIA 1 (o sistema definiu a primeira preferência)
                System.out.println("O valor da primeira variável preferida é: " + varPrefDisc1);
                mtdColocaMateriaEmOrdemPreferida(varPrefDisc1, 0);

                //VAMOS VER COMO FICOU
                System.out.println("O valor da segunda variável preferida é: " + varPrefDisc2);

                //COLOCANDO AS MATÉRIAS EM ORDEM DE PREFERENCIA 2 (sistema definiu a segunda preferência)
                mtdColocaMateriaEmOrdemPreferida(varPrefDisc2, 1);
        
        }
    
    	public void mtdInicializarArrayDeMateriasEOpcoesDisciplina ( ) 
	    { 
		//CRIA O PEQUENINO ARRAYLIST
                System.out.println("INICIO DA CRIAÇÃO DO ARRAYLIST DE STRING PARA  AS TRÊS MATÉRIAS"); 
		InstArrayListMaterias = new ArrayList <>(); 
		InstArrayListMaterias.add("Matematica");
		InstArrayListMaterias.add("Portugues");
		InstArrayListMaterias.add("Conhecimentos Gerais");

		for (int i=0; i < InstArrayListMaterias.size ( ); i++) 
		{
                    System.out.println ("O Array de matérias contem o elemento: " + InstArrayListMaterias.get(i) );
                }                
                System.out.println ("FIM DA CRIAÇÃO DO ARRAYLIST DE STRING PARA  AS TRÊS MATÉRIAS");
                 

                System.out.println("INICIO DA CRIAÇÃO DO ARRAYLIST DE STRING PARA  OPÇÕES DO COMBOBOX"); 
		InstArrListOpcoesEntrDisciplina = new ArrayList <>();
		//Abaixo adiciona todos os elementos do Arraylist InstArrayListMaterias neste arraylist
		InstArrListOpcoesEntrDisciplina.addAll(InstArrayListMaterias); 

                System.out.println("FIM DA CRIAÇÃO DO ARRAYLIST DE STRING PARA  OPÇÕES DO COMBOBOX"); 

                System.out.println (""); 
             } 



    public String metdCaptaOptionPane (String varTituloCbBx, String opcaoPadrao) 
	{
	    // CONVERTE O ARRAYLIST EM MATRIZ NOVAMENTE
            String [ ] opcoesEntrDisciplina = new String[ InstArrListOpcoesEntrDisciplina.size() ]; 
            InstArrListOpcoesEntrDisciplina.toArray(opcoesEntrDisciplina); 

	    // CAPTA A OPÇÃO ESCOLHIDA
            String varInput = (String) JOptionPane.showInputDialog(new JFrame(), varTituloCbBx, 
            "Opções de Matéria", JOptionPane.INFORMATION_MESSAGE, null, opcoesEntrDisciplina, opcaoPadrao);

	    // REMOVE A OPÇÃO ESCOLHIDA PARA NÃO SER USADA NOVAMENTE
            InstArrListOpcoesEntrDisciplina.remove(varInput);
            
	    // ZERA A MATRIZ
	    opcoesEntrDisciplina = null;

	    //DEVOLVE O VALOR SELECIONADO PARA QUEM CHAMOU O METODO
	    return varInput;
      	}



     public void mtdColocaMateriaEmOrdemPreferida(String materiaPreferida, int lugarPreferido) 
	{
                //COLOCANDO AS MATÉRIAS EM ORDEM DE PREFERENCIA
                //procurando em que lugar do arraylist está a matéria de preferencia 1
                System.out.println("COLOCANDO EM ORDEM DE MATÉRIA PREFERIDA > 0, i"); 

		for (int i = 0; i < 3; i++) 
		{
                        
                        String kk = InstArrayListMaterias.get(i);
			if (kk.equals(materiaPreferida) ) 
			{
			     	//DESCOBRI A MATÉRIA PROCURADA E COLOCÁ-LA NO LUGAR EM QUE DEVE ESTAR
                             	System.out.println("Achei! A matéria preferida está dentro da matriz no lugar: " + i); 
			    //	Collections.swap(InstArrayListMaterias, lugarPreferido,i);
                            	Collections.swap(InstTesteArrayListRemoveIObj, lugarPreferido,i);
			}
     		}
		System.out.println("Fim da ordenação da matéria preferida na frente");
	}
    
}

    
// Fim da Classe    
}
