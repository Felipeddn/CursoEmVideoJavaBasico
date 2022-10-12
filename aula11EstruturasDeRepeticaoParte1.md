# Aula 11 - Estruturas de repetição parte 1

Professor: Gustavo Guanabara

Existem 3 estruturas de repetição o **enquanto**, o **repita** e o **para**.

O Java possuem essas estruturas mas usa o While 

Verifique a **a11-fluxograma-de-repeticao.png** imagem um modelo de fluxograma para estrutura de repetição

A **repetição com teste lógico no ínicio do código** e a repetição que consideramos **enquanto**.

Segue abaixo o código em java do exemplo tratado no fluxograma da imagem **a11-fluxograma-de-repeticao.png**.

~~~java

//cc é um contadorcambalhota, é importante atribuir o valor zero para ele e ficar atento com esse contador se for reutilizar ele.
int cc = 0;
// while é enquanto em inglês
while (cc < 4){
    System.out.println("Cambalhota")
    // comando de incremento que equivale a cc = cc + 1;
    cc++;
}

~~~

Esse código foi praticado no Netbeans no projeto **Contador01While** no diretório CodigosDasAulas > CodigoAula11EstruturasDeRepeticaoParte1.

## Mudando o fluxo de um laço

Existem comandos que alteram o fluxo de uma estrutura de repetição.

### Continue

O primeiro comando para mudar o fluxo de um laço se chama **continue**.

Esse comando volta para o teste lógico do comando de repetição, veja a imagem **a11-mudando-fluxo-continue.png** para entender ele em um fluxograma.

Quanto ele encontra esse comando ele ignora o comando abaixo de continue e executa o looping.

### Break

O segundo comando é o break

veja a imagem **a11-mudando-fluxo-break.png** para entender ele em um fluxograma.

O comando break encerra o laço de repetição. 

Praticamos no Netbeans esses comandos e vamos praticar ele em um segundo projeto  com swing chamado Contador02Swing, quando fazemos projetos swing no netbeans sempre devemos remover a caixa de testo para criar automaticamente a classe principal.

Fim da aula
