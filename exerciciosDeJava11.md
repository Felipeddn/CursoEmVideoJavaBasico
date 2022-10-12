# Exercicios 11 

Professor: Gustavo Guanabara

Na aula de hoje iremos fazer um aplicativo que realiza o calculo de fatorial.

Analise as seguintes variáveis em JAVA a seguir.

char c = 'c';  
int i = 10;  
double d = 10;  
long l = 1;  
String s = "Hello";  

De acordo com as variáveis acima, qual das instruções abaixo compila sem erro?  

estou em duvida entre

b) s += i;  
e) i += l;

mas como vi na aula a gente juntar em uma string com um contador, ou seja String + valor inteiro vou escolher a b)

Essa pergunta tem uma falha, existem duas respostas corretas e vamos ver isso no Netbeans.

e as duas acimas são corretas isso foi provado no Netbeans no projeto TesteExercicio no diretório CodigoDosExercicios.

Qual das afirmações a seguir é VERDADEIRA?

c) O comando return não pode ser utilizado dentro de loops.

eu errei o return pode ser usado em qualquer lugar, seu papel é retornar o valor de uma função

o certo passa a ser

e) Todas as alternativas acima são falsas.

Analise o código JAVA a seguir.

~~~java

package prova;
public class Main{

    public static void main(String[] args){
        int i = 1;
        int a = 0;
        while(i < 10){
            ++a;
            i = i + 1;
            if (a > 6){
                ++i;
            }
            System.out.println(i);
            System.out.println(a);
        }
    }
}

~~~

i = 11
a = 8

Sabendo-se que o código acima foi escrito e executado utilizando o IDE NetBeans 6.0.1, assinale a opção correta referente aos valores impressos de i e de a, respectivamente

a) 11 e 8 

Agora vamos partir para o exercício prático da aula, vou tentar fazer o máximo possível sem ajuda e depois eu assisto o Guanabara resolvendo.

Fiz todo o exercicio, ele tem apenas um limitante, a variavel chega no limite dos inteiros então o spinner só pode ir até o valor 16 acima disso ele retorna resultado negativos, e o uso de float ele retorna valores com E8 por exemplo para sinalizar elevado o que não é muito agradavel de ver.

Uma dica que ele deu foi para clicar com o botão direito e definir com set to default size, para conforme o valor for aumentando no label(etiqueta) ele vai aumentando automáticamente também.

## Desafio

No fim do exercicio ele passou um desafio para mostrar a operação completa do fatorial

do tipo 

5! = 5 * 4 * 3 * 2 * 1 = 120

Desafio Resolvido :)

Fim dos exercícios 
