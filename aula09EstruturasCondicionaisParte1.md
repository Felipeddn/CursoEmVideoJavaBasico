# Aula 9 - Estruturas Condicionais Parte 1

Professor: Gustavo Guanabara

O Guanabara explicou que gosta de dividir as aulas de estruturas condicionais em duas partes, na primeira parte ele trata de estruturas condicionais simples e compostas, na segunda parte ele trata de estruturas condicionais aninhadas e escolha multipla.

## Estrutura condicional

Para visualizar um exemplo de condicional simples em Fluxograma e Pseudocódigo veja a imagem **a09-escolha-condicional-simples.png**.

O equivalente em Java do condicional simples que aparece na imagem a09-escolha-condicional-simples.png segue logo abaixo.

### Condicional Simples

~~~java

import java.util.Scanner;

Scanner teclado = new Scanner(System.in);

float numero1 = teclado.nextFloat();
float numero2 = teclado.nextFloat();

float media = (numero1 + numero2) / 2;

System.out.println("A média é " + media);

if(media > 9) {
    System.out.println("Parabéns!");
}

~~~

### Condicional composta 

Para visualizar o exemplo de condicional composta em fluxograma e pseudocódigo veja a imagem **a09-escolha-condicional-composta.png**.

O equivalente do exemplo em Java seria o seguinte

~~~java

//Criando objetos para ter acesso a métodos e atributos das bibliotecas Scanner e LocalDate
Scanner teclado = new Scanner(System.in);
LocalDate data = LocalDate.now();
        
//ano atual
int anoAtual = data.getYear();
        
// ano de nascimento
System.out.print("Qual sua data de nascimento (aaaa)? ");
int anoNascimento = teclado.nextInt();
        
// calculando para obter idade
int idade = anoAtual - anoNascimento;
        
//mostando mensagem conforme idade
if(idade >= 18){
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}

~~~

Fim da aula
