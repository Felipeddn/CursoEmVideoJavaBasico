# Aula 12 - Estruturas de repetição parte 2

Professor: Gustavo Guanabara

Na aula de hoje iremos aprender uma estrutura de repetição onde o teste lógico fica no fim do bloco de códigos executado, a estrutura de repetição que aprendemos em algoritmos chamado **repita**.

veja um exemplo de fluxograma e o algoritmo dessa estrutura de repetição na imagem **a12-repeticao-com-teste-no-final.png**.

Veja a imagem **a12-diferenca-das-estruturas-de-repeticao.png** para saber como fica a diferença entre essas estruturas.

O java não trata o **repita** da mesma forma que os algoritmos tratam.

O Java trata o repita como um while de cabeixa para baixo e fica **do {} while**.

veja o exemplo da imagem em Java

~~~java

int cc = 0;
do {
    System.out.println("Cambalhota");
    cc++;
} while (cc < 4);

~~~

Vamos praticar no NetBeans.

Fim da aula
