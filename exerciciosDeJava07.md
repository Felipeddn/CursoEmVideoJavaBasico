# Exercícios de Java 7  

Professor: Gustavo Guanabara

Considerando o trecho de código a seguir, construído em linguagem JAVA, marque a opção que preencha as lacunas:

~~~java

int n = 4; 
System.out.println("O valor da variável é " + n++);

~~~

Executando a linha acima, será exibida a mensagem "O valor da variável é **4**" e o valor final de n após a execução será **5**.

b) 4 e 5

Considerando o tratamento de tipos primitivos pelo JAVA, analise o código a seguir e indique que valor será impresso na tela:

~~~java

int n1 = 2, n2 = 5;
double resultado = n2/n1;
System.out.println(resultado);

~~~

c) 2.5  X errei

De fato o Java fez exatamente o que foi explicado, ele considerou, a resposta do tipo primitivo e retornou dois.

b) 2 

Execute as três instruções JAVA a seguir e marque a opção que contém o valor que será impresso na tela:

~~~java

int v1 = 7, v2 = v1 % 2, v3 = 2;
v3 += v2;
System.out.println(v1 + " " + v2 + " " + v3);

~~~

v1 == 7  
v2 == 7 / 2 = 3 sobra 1, V2 = 1  
v3 == v3(2) + v2(1), v3 = 3  

7 1 3

c) 7 1 3

## Exercicio Prático

Super calculadora - Essa calculadora tem um controle giratória para selecionar números e quando seu botão de calcular é acionado ele informa:  
- Resto da divisão por 2  
- O valor elevado ao cubo  
- A raiz quadrada do valor  
- A raiz cúbica do valor  
- O valor absoluto  

Essa prática estará no diretório de exercicios 7.

Nessa prática eu fiz como o Guanabara orientou e eu vi que ele criou um painel, no meu caso eu pensei em esconder os labels quando eu abro a janela e quando eu clico o botão eu faço eles aparecerem vou fazer um projeto com painel como ele fez para práticar ambos os modos, mas eu fiquei muito satisfeito que fui capaz de produzir um efeito apenas acessando um atributo do label. Estou muito feliz fazendo esse curso, me sinto realizado. Faz muito sentido o que ele fez, ele escondeu o painel logo todos os componentes do mesmo ficam escondido, no meu caso eu tive que esconder label por label, bem interessante ele ter pensado nisso.

No caso ele determinou valores minimos e máximos para o spinner (-50, 50).

mesmo que eu não tenha feito isso no meu basta eu configurar isso na abertura da janela. E eu sei como fazer isso!!! :)

Caramba que top eu coloque como um método a questão da visibilidade, Mas o professor colocou no construtor, que eu não domino o conceito 100% mas já entendi, muito maneiro mesmo, bom demais essa aula de exercícios.

Agora ele ensinou como formatamos as casas decimais de um número double. para tal devemos usar o seguinte método:  

~~~java

// método para formatar as casas decimais String.format("%.2f", variavel)  
nomeDoLabel.setText(String.format("%.2f", nomeDaVariavel));

~~~

A propriedade que permite o controle do tamanho da tela é o **resizable**, podemos desmarcar ele ou colocar como "false" para ele não interagir.

Então fica como desafio para mim, a partir do meu código refatorar ele para chegar no mesmo modelo do Guanabara. Aula incrível, muito top!!

Fim dos exercícios  
