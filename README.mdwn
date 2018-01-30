# projQuizJavaGtDistant
# version 0.1 V03 052V7BB
Jogo de Questões com tecnologia Java

Este Readme será tratado como um documento que ajudará a refinar o software.


======================================================================================

JavaQuiz: foi criado para aprender a linguagem Java; e 
          Serve para testar seus conhecimentos sobre questões apresentadas

JavaQuiz é um jogo com questoes que são apresentadas de forma randomica:

* Simplicidade e facilidade de uso são nossos objetivos
* Baseado em Questões inseridas na Classe
* Atualmente só depende de um objeto serealizavel que conterá as perguntas
* Objeto é salvo localmente, e o jogo executado localmente tambem
* Este arquivo servirá para testar conhecimentos sobre questões apresentadas.
* A seguir: como vai funcionar? Quais os parametros dele? 



Dependências
......................................................................................

Nesta versao o JavaQuiz depende do pacote pcteQuizJavaLocalGt e das seguintes classes:
* ClaBDProQuest52.java
* ClaOuvinteBtAcoesBotao52.java
* ClaOuvinteRadioAcoesJRadioBtt52.java
* ClaZGrafBtnPercorre1Por1V52Exec.java
* ClaZZZGravaSerealizaArrayListDeObjetoBD52.java
* ZTesteDesserealizarArrayListDeBD52.java (usada para teste de serealização)
* ArrayListBDProj52.ser é o objeto serealizavel



Rodando o JavaQuiz
......................................................................................

Vamos ilustrar um teste simples:

O jogo começa com a classe ClaZGrafBtnPercorre1Por1V52Exec.java

	# Rode a classe ClaZGrafBtnPercorre1Por1V52Exec.java

	# A seguir abrirá uma caixa de Dialogo JOptionPane.showInputDialog com (Opções 
	# de Matéria) com botão drop-down para selecionar a primeira matéria (entre 
	# Matemática, Portugues ou Conhecimentos Gerais) e confirmar sua escolha OK

	# Depois abre-se outra caixa de dialogo JOptionPane.showInputDialog (Opções de
	# Matéria) com botão drop-down para você selecionar a segunda matéria (entre as
	# matérias restantes) e após  e confirmar sua escolha OK

	# Depois abre terceira caixa de dialogo JOptionPane.showMessageDialog informando
	# as opções escolhidas; 

	# Depois disso inicia-se o questionario, exibido no formulário

	# O formulário de questoes eh composto de 4 partes: 

	# 1 - Uma parte para as perguntas

	# 2 - Uma parte para as 5 alternativas anexadas à botoes de radio

	# 3 - Botoes de Navegação: Responder, Pular (Quatao), Limpar (Questão)

	# 4 - Exibição de Status da pergunta respondida (Acertou, Errou)

	# Após a última questao abre-se a caixa de dialogo JOptionPane.showConfirmDialog
	# com sua performance (o numero total de questões, numero de questões corretas, 
	# de acerto; e um critério de avaliação (rigoroso!) e após lê-lo deverá clicar OK

	# Depois abre-se caixa de dialogo JOptionPane.INFORMATION_MESSAGE com o resultado
	# de sua avaliação e após lê-lo você deverá clicar SIM/NÃO Para fechar o programa

// O JavaQuiz esta em construção e deverá passar por grandes reformas
