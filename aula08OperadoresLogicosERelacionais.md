# Aula 8 - Operadores lógicos e relacionais 

Professor: Gustavo Guanabara

## Operador Ternário

É um operador específico para fazer comparações.

No curso de algoritmos vimos a seguinte estrutura de código

~~~visualg

Se (n1 > n2) então
    maior <- n1
Senao
    maior <- n2
FimSe

~~~

No java esse exemplo poderia ser tratado com o operador ternário que pode ser utilizado em estruturas de escolhas simples.

Operador ternario:  
variavel = condição **?** atribuição_verdadeira **:** atribuição_falsa;

exemplo:  
maior = n1 > n2 ? n1 : n2;

Esse exemplo e outros foram executados no projeto OperadorTernario dentro do diretório(pasta) aula08OperadoresLogicosERelacionais.

Operadores ternarios aceita fórmulas como por exemplo:

~~~java

int numero3 = 14;

int numero4 = 18;

int resultado5 = numero3 > numero4 ? numero3 + numero4 : numero3 - numero4;

System.out.println("A variável resultado5 recebeu o valor " + resultado5);

~~~

O Operator ternário sempre deve ser usado para atribuir valor para uma única variável, se esse não for o caso ele não será necessário.

## Operadores relacionais  

Tabela |                  |        |  
------ | -----------------| -------| 
  **>**| maior que        | 5 > 2  | true
  <    | menor que        | 4 < 1  | false
**>**= | maior ou igual a | 8 >= 3 | true
  <=   | menor ou igual a | 6 <= 6 | true
   ==  | Igual a          | 9 == 8 | true
  !=   | Diferente de     | 4 != 5 | true

### Comparando Strings

~~~java

String nome1 = "Gustavo";
String nome2 = "Gustavo";
String nome3 = new String("Gustavo");

~~~

Código sobre as comparações dessas 3 strings feita no Netbeans, no diretório(pasta) aula08OperadoresLogicosERelacionais no projeto ComparacaoStrings.

No java para comparar a igualdade de conteúdo devemos usar um método valorParaComparar.**equals(** ValorParaComparar2 **)**.

Ou seja, utilizar o operador == para comparar nem sempre pode ser efetivo, daí teremos que usar o método .equals(), para solucionar algumas situações.

## Operadores lógicos

veja na imagem **a08-operadores-logicos.png** o operadores lógicos.

veja na imagem **a08-tabela-verdade.png** a tabela verdade desses operadores lógicos.

Veja exemplos de lógica no diretório(pasta) aula08OperadoresLogicosERelacionais no projeto OperadoresLogicos.

Veja um exemplo com swing do uso de operadores lógicos e ternarios no diretório(pasta) aula08OperadoresLogicosERelacionais no projeto VerificadorIdadeSwing.

## Expressões lógicas compostas

Vamos abordar uma situação eleitoral do Brasil

No Brasil dos 0 aos 15 anos não se pode votar  
Dos 16 aos 17 anos o voto é opcional  
Dos 18 aos 70 anos o voto é obrigatório  
Para maiores de 70 anos o voto é opcional

Ou seja, a lógica do voto opcional é a seguinte:

16 <= idade > 18 **E** idade > 70 

Isso em Java sera traduzida da seguinte forma

(16 <= idade && idade < 18) || (idade > 70)

Podemos até tentar colocar a opção acima em um operador ternário e até funciona, mas ele não poderá ser incluido na lógica eleitoral porque não podera abordar o voto proibido (idade < 16) e no voto obrigatório (18 <= idade <= 70 ) dessa forma teremos que abordar estruturas condicionais tema da aula 9.

Fim da aula
