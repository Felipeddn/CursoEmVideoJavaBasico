# Exercícios Java 9

Professor: Gustavo Guanabara

O exercício prático que será feio nessa aula será um exercício para resolver uma equação de segundo grau.

Analise o algoritmo abaixo: 

~~~algoritmo

inicio
    inteiro Y, X, DIV;
    leia (Y);
    X = Y % 7;
    Se X > 10;
        entao DIV = verdadeiro;
        senao DiV = 10;
    FimSe;
fim

~~~

Assinale a opção que apresenta a linha que contém o erro na execução do algoritmo.

D) entao DIV = verdadeiro

Apesar de que eu achava que o erro era na estrutura do se, o erro estava na atribuição da variavel DIV, que é do tipo inteiro, recebendo o valor verdadeiro que é um valor booleano.

Indique o resultado de "x" do trecho do programa em português estruturado, mostrado abaixo. Para as saídas, considere os seguintes valores:  
A = 2; B = 3; C = 3; D = 4

~~~algoritmo

Se não (D < 5) então 
    x <- (A + B) * D
Senão
    x <- (C + A) * B
FimSe
Escreva x

~~~

a) 15

Dada a estrutura representada abaixo:

~~~java

int a = 5, b = 2;
String c;
if (a > b) {
    c = "Primeiro é Maior";
} else {
    c = "Segundo é Maior"
}

~~~

Que linha substituiria a condição apresentada?

d) c = (a >= b) ? "Primeiro é Maior" : "Segundo é Maior";

Errei o correto é letra b)

c = (a <= b) ? "Segundo é Maior" : "Primeiro é Maior";

Iniciando o exercicio antes do Guanabara, eu consegui fazer por conta própria

- Todo o visual não tão agradável quanto o dele mas completo inclusive os símbolos de expoentes nos valores numéricos
- pegar os valores dos spinners, fazer o calculo do delta, mostrar os resultados dos deltas e se existem raízes ou não existem

Minhas dificuldades

[x] Fazer o label interagir com a mudança de valores do spinner, para fazer isso eu controlo eventos no spinner. Basta ir em eventos e stateChanged.  
[X] Layout igual ao dele tamanho de fontes no caso, será possível assim que eu assistir o exercicio.  
[X] no caso ele já usou o html na propriedade text do label e do button, então acredito que vou fazer como ele assim não desconfigura o layout dos componente no aplicativo quando aperto o botão. Fiz isso e realmente o layout melhorou bastante.  

Fim dos exercícios
