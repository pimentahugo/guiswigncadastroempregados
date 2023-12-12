# Projeto GUI Swing - sistema de cadastro e consulta de Empregado

<h3>Descrição do Projeto</h3>
Este projeto foi desenvolvido como parte da disciplina de Programação de Computadores 3, inspirado nos conceitos dos Capítulos 4 (Objetos e Classes) e 5 (Herança) do livro "Core Java Volume I - Fundamentos" de Horstmann e Cornell. O objetivo principal é criar um sistema de cadastro de empregados para a empresa "ABC", utilizando o GUI Swing para interação com o usuário.

<h3>Escopo da atividade</h3>
Está anexada no arquivo PDF <a href="https://github.com/pimentahugo/guiswigncadastroempregados/blob/main/Atividade_OO_heran%C3%A7a_polimorismo_etc.pdf" target="_blank">Atividade_OO_herança_polimorismo_etc.pdf</a>

<h3>Funcionalidades</h3>
- Cadastro e consulta de empregados com diferentes tipos, como Gerente, Gerente Executivo, Secretário e Programador. <br />
- Interface gráfica para cadastro, consulta e remoção de empregados. <br />
- Utilização de herança para estruturar classes de empregados.<br />
- Estrutura do Projeto: O projeto consiste em duas principais classes: <br />

  - Empregado.java - A superclasse que possui atributos gerais como nome, salário e data de contratação. Contém métodos construtor, "getters" para cada atributo e um método para aumento salarial. <br />
  - Subclasses de Herança - As classes Gerente, GerenteExecutivo, Secretario e Programador que herdam de Empregado. Cada uma delas tem atributos e métodos específicos,   mostrando a aplicação de polimorfismo. <br />
  - TelaPrincipal.java - A classe principal (main) responsável pela interface gráfica. Utiliza o GUI Designer disponível para criar telas de cadastro, consulta e remoção de empregados, mantendo listas adequadas para cada tipo.<br />

<h3>Demonstrações do projeto</h3>
<img src="https://github.com/pimentahugo/guiswigncadastroempregados/blob/main/GUISwing-Tela1.png" />
<img src="https://github.com/pimentahugo/guiswigncadastroempregados/blob/main/GUISwing-Tela2.png" />
<img src="https://github.com/pimentahugo/guiswigncadastroempregados/blob/main/GUISwing-Tela3.png" />
<img src="https://github.com/pimentahugo/guiswigncadastroempregados/blob/main/GUISwing-Tela4.png" />
