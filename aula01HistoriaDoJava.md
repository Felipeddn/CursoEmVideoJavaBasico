# Curso em vídeo - Aula 1 - História do Java

Professor: Gustavo Guanabara

## História dos computadores 

Eniac, não tinha linguagem de programação, era programado por botões, e possui valvulas, não era binário, era decimal.

Uma das primeiras linguagens de alto nível foi o Pascal.

Veja um exemplo de um código fonte em Pascal

````Pascal
Program PASCAL;
var
    msg: String;
begin
    msg := "Olá, mundo!";
    write(msg);
end.
````

Um arquivo que armazena um código como acima é chamado de código-fonte.

Essa linguagem é de alto nível porque está bem próxima da linguagem falada por seres humanos, o código digitado nessa linguagem é o código fonte.

O código nesse formato não pode ser utilizado pelo computador, o computador só consegue utilizar códigos em binários. Para um computador utilizar esse código ele precisa ser transformado em um compilador o resultado dessa transformação é chamado de código executável.

Um compilador é compostos de outros componentes para passar um código fonte para um código executável, como um linker, um montador, um interpretador...

O processo das primeiras linguagens de programação acontecia da seguinte forma: um programador escrevia o programa em linguagem de alto nível (entendido por ser humano mas não pela máquina), passava por um compilador (composto de mais componentes como dito antes) e obtinha o executável, esse processo tinha um pequeno problema.

O código fonte compilado em uma plataforma (sistema operacional) produz um código executável que só pode ser usado nessa plataforma, e por conta disso é necessário compilar esse código nas diversas plataforma, além disso é necessário fazer adaptações na escrita do **código-fonte** para fazer a compilação desse código fonte na plataforma específica, ou seja, o código-fonte e o compilador muda de plataforma para plataforma, um exemplo de linguagem que faz isso é a linguagem **C**.

````C
#include <stdio.h>
void main (){
    printf("Olá, mundo!");
}
````

A linguagem C é considerada uma linguagem multiplataforma e sistemas operacionais como windows e linux e navegadores como o firefox foram feitos com essa linguagem, ela é uma linguagem muito usada ainda hoje e evoluiu para 

C++, uma linguagem de programação que incluiu orientação a objetos
C#, ...

Sun microsystems
Tentou utilizar a linguagem C++ para integrar diversos dispositivos, porem não deu certo e eles tiveram que criar uma linguagem que pudesse atender ao objetivo de intercomunicação entre os dispositivos.

O nome inicial dessa linguagem foi GreenTalk, que mudou para o nome OAK.

Em 1991 com essa linguagens eles desenvolveram um software para um dispositivo chamado Star Seven (*7). Esse projeto do star seven não progrediu

Em 1994 com o advento do html e a retomada da ideia da interoperabilidade de dispositivos a linguagem OAK foi reutilizada no projeto web runner, porém esse nome OAK já estava sendo utilizada e foi necessario renomear a linguagem, escolheram o nome Java, por conta do tipo de café chamado Java Coffee, um café forte pois os grãos vinham da ilha Java.

Desenvolveram um anel chamado Java ring para desenvolver interações entre dispositivos e Java foi utilizado até em um robo enviado para marte.

Java com o passar do tempo se tornou uma linguagem de código aberto.

A sun microsystem foi comprada pela Oracle o que deu o direito de uso comercial da linguagem Java, apesar de existir um braço do Java de código aberto chamado de "comunity".

A linguagem Java é utilizado em chips de cartões, em em aplicativos sistemas como android, em blue-ray players, em leitores ebook, em tvs digitais, em alguns relógios, em sistemas da receita federal para declarar o imposto de renda.

Fim da aula
