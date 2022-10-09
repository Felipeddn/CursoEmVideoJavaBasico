# Exercicios de Java 8

Professor: Gustavo Guanabara

Na aula de hoje faremos um programa de adivinhação, se trata de um jogo, onde o gênio pensa em um número e você tenta adivinha que número é esse que o gênio pensou, se acertar o genio avisa, se errar o gênio também avisa e diz o número que ele pensou.

Dadas as linhas a seguir:

~~~java

int x = 8, y = 3;
int w = x / y;
String z = (w % 2 == 0)? "frase1" : "frase2";
System.out.println(z);

~~~

O que acontecerá se esse código for executado?

c) será impresso "frase1"

Analise o código a seguir e indique o que será impresso na tela:

~~~java

String parte1 = "Curso";
String parte2 = "Vídeo";
String parte3 = parte1 + parte2;
String parte4 = "CursoVídeo";
System.out.println(parte3 == parte4);
System.out.println(parte3.equals(parte4));

~~~

b) false true

O Java aplica a seguinte ideia para comparar variáveis se o programador usa == ele não está comparando os valores, mas sim os objetos, se existir alguma distinção entre os objetos comparados com o operador == ele acusará falso, ou seja, não existe igualdade entre os objetos, já se o importante é comparar o conteúdo das variáveis, ai sim o java pode retornar igualdade em forma de true mas para comparar o conteúdo usamos o método .equals() e deve ser feito da seguinte forma, variavelParaComparar.equals(variavelParaComparar), então sempre fique atento para esse detalhe em Java.

Analise o código a seguir e indique o que será impresso na tela: 

~~~java

boolean val1 = (4 >= 5) , val2 = (4 < 4>), val3 = (val1 == val2); // val1 = false, val2 = false, val3 = true
boolean val4 = val1 ^ val3; // val4 = true
boolean val5 = !val2 && val4; // true
System.out.println(val4 + " " + val5);

~~~

c) false false 

Errei por conta do terceiro, val3 que é verdadeiro, realmente esse conceito de comparação no Java não possui clareza, ou seja, não existe uma lógica confiável pois aqui não existe a comparação dos objetos? 

a) true true

Inicio da prática de adivinhação, alguns detalhes:

Substitui o gênio pelo sábio

Fiz toda a lógica do exercício, mas tive os seguintes problemas e fiz algumas coisas diferente do guanabara que será pontuada aqui

- Não consegui colocar o texto dentro do balão, descobrir que para tal eu precisava usar a opção **Set layout**, **Absolute layout**.  
- Não tinha usado um label para mostrar o texto número.  
- Não tinha usado a ideia de construtor para iniciar a frase apesar de conhecer esse recurso.  
- Não tinha conseguido quebrar linha no texto do label, e minha mente explodiu, o Guanabara usou tag html para quebrar linhas, hahaha, mano isso foi extremamente divertido.  
- Uma forma mais inteligente de fazer o operador ternario escolher frases e armazenar elas em variaveis e fazendo o ternario escolher essas variáveis ao invés de fazer como eu fiz, onde a escolha das frases ocorria no ternario.  
- Ele também alterou o tamanho da fonte baseado na resposta.

Além disso vou salvar meu projeto antes do Guanabara executar e um novo projeto colocando em prática alguns conceitos que ignorei.

Fim dos exercícios
