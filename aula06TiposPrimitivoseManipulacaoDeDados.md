# Aula 6 Tipos primitivos e manipulação de dados

Professor: Gustavo Guanabara

Em algoritmos aprendemos que existem 4 tipos de dados, são eles

- Inteiros  
- Reais  
- Caracteres    
- Lógico

Em Java esses tipos viram familias, por exemplo o tipo inteiro possui 4 subtipos dentro dele.

Além dos tipos primitivos, vamos aprender mais dois comandos de saída, comandos de entrada e veremos que o Java não possui comandos de entrada por padrão, por conta disso será necessário a importação de bibliotecas para executar os comandos de saída, também faremos todos esses comandos de entrada e saída com as bibliotecas Swing.

## Comentando seus códigos

// comentários de linha usam duas barras

/*  
comentário com mais de uma linha, multiplas linhas  
assim podemos escrever muito mais  
*/

comentários para documentação, todo comentário com dois asteríscos e multiplas linhas serve para documentação.  
/**
    Exemplo para o CursoemVideo de Java  
    @author Gustavo Guanabara   
    @version 1.0  
    @since 2015-01-01  
*/

## Tipos primitivos

Vamos relembras os tipos aprendidos em algoritmos e quais conteúdos podem ser armazenados

var  
    idade: inteiro  
    sal: real  
    letra: caractere  
    casado: logico  

inicio
    idade <- 3  
    salario <- 1825.54  
    letra <- "F"  
    casado <- falso  

### Como declarar em Java variáveis e seus tipos 

Existem 3 maneiras de declarar variáveis e atribuir valores, em Java.

- **Primeira forma**: Declaração simples com tipo e nome da variável (atribuindo um valor, essa etapa é opcional).

int idade = 3;   
float salario = 1825.54**f**; se esquecer a letra **f** o Java pode dar erro.  
char letra = 'F';  
boolean casado = false;

- **Segunda forma**: Declaração com typecast

O Java é fortemente tipada, e podemos usar o typecast para explicitar o tipo de valores que podem assumir mais de um valor como um número (3) que pode ser real, caracter ou inteiro. a sintaxe do typecast também é a segunda forma de declarar variáveis

int idade = (int) 3;  
float salario = (float) 1825.54;   
char letra = (char) 'F';  
boolean casado = (boolean) false;

- **Terceira forma**: Criando um objeto a partir das classes de tipos primitivos, essa "variável"(um objeto que guarda um valor, mas que podemos tratar como uma variável apenas no sentido de armazenar dados assim como fazem as variáveis), herda os métodos e atributos da classe do tipo que ela foi instânciada.

Integer idade = new Integer(3);  
Float salario = new Float(1825.54);  
Character letra = new Character('F');  
Boolean casado = new Boolean(false);

A duas primeiras formas são variáveis, a ultima é um objeto(pode ser encarado como uma variável por guardar dados, mas é um objeto!), a diferença é que um objeto herda os métodos e atributos da classe do tipo que ela foi instânciada.

Wrapper Class -> Classe invólucro, são o nome das classes usadas.


Familia  | Tipo Primitivo | Classe invólucro | Tamanho      | Exemplo  
-------- |----------------|------------------|--------------|--------  
Lógico   | boolean        | Boolean          | 1 bit        | true    
Literais | char           | Character        | 1 byte       | 'A'  
Literais |  não tem       | String           | 1 byte /cada | "JAVA"  
inteiros | byte           | Byte             | 1 byte       | 127  
Reais    | short          | Short            | 2 bytes      | 32 767   
Reais    | int            | Integer          | 4 bytes      | 2 147 483  
Reais    | long           | Long             | 8 bytes      | 2<sup>63</sup>  
Reais    | float          | Float            | 4 bytes      | 3.4.e<sup>+38</sup>  
Reais    | double         | Double           | 8 bytes      | 1.8.e<sup>+308</sup>

## Testes do tipos primitivos com prática de saída de dados

Saída de dado é pegar um dado armazenado na memória do computador e mostrar de alguma forma por um dispositivo de saída.

Exemplos de saída

```java

float nota = 8.5f;

System.out.print("Sua nota é " + nota);

System.out.println("Sua nota é " + nota); // Essa opção pula uma linha ao fim do comando.

```

Iremos práticar no netbeans 

um novo comando de saída é o 

```java

System.out.printf("Sua nota é %.2f", nota);

```

Observe que o f é de formatado e podemos concatenar com vírgula(,).

o símbolo %.2f indica o seguinte % -> onde a variável vai se encaixar, .2 (quantidade de casas decimais que serão mostradas), f (tipo de dado da variável).

Para quebrar linha nesse comando é necessário inserir "/n".

Para inserir mais de uma variável em um comando de saída printf basta seguir a sintaxe abaixo

```java

System.out.printf("A nota de %s é %.2f \n", nome, nota);

``` 

Observe que %s é uma variável do tipo string, e devemos respeitar a ordem da formatação então, a primeira variável é nome e a segunda é nota na mesma ordem que aparecem, %s e depois %.2f

Outra sintaxe de saída valida é a seguinte:

```java

System.out.format("Sua nota é %.2f", nota);

```

O resultado será o mesmo de printf.

## Entrada de dados

Entrada de dados é inserir algo que está fora do computador para a memória do mesmo.

O Java não traz por padrão comandos de entrada de dados, por conta disso é necessario importar essa funcionalidade através de uma biblioteca, a biblioteca em questão é java.util.Scanner

a sintaxe para gerar uma variável de entrada de dados em Java:

```java

import java.util.Scanner;

Scanner teclado = new Scanner (System.in);

```

Assim que esse objeto que herda os métodos da biblioteca Scanner é gerado pode utiliza-lo em nosso código:

```java

import java.util.Scanner;

Scanner teclado = new Scanner (System.in);

String nome = teclado.nextLine();  
float nota = teclado.nextFloat();

System.out.format("A nota de %s é %.2f \n", nome, nota);

```

Podemos melhorar a interação com o usuário ao inserir mensagens que informa para o mesmo quais dados ele está inserindo.

```java

import java.util.Scanner;

Scanner teclado = new Scanner (System.in);

System.out.println("Qual o nome do aluno: ");
String nome = teclado.nextLine();  

System.out.println("Qual a nota do aluno: ");
float nota = teclado.nextFloat();

System.out.format("A nota de %s é %.2f \n", nome, nota);

```

Observe que o comando muda para ler dados, para cada tipo de dado usamos um comando para ler o tipo do dado, veja:

~~~java

// Importando Scanner para acessar essa classe
import java.util.Scanner;

// Criando um objeto para poder acessar o método de leitura de dados da classe Scanner
Scanner teclado = new Scanner(System.in);

//Para ler inteiros 
int idade = teclado.nextInt();

//Para ler reais (float)
float salario = teclado.nextFloat();

//Para ler cadeia de caracteres (String)
String nome = teclado.nextLine();

~~~

## Imcompatibilidade entre números e strings

Java é uma linguagem fortemente tipada por conta disso não podemos atribuir para uma variável de um tipo outra variável de outro tipo

```java
int idade = 30;
//String aniversario = idade; (essa forma de atribuir 30 a variável aniversário não funciona)
//String aniversario = (String) idade; (essa forma essa forma de atribuir 30 a variável aniversário não funciona)

// temos que fazer uso de métodos de conversão de dados
String aniversario = Integer.toString(idade);

// Podemos até verificar o valor agora
System.out.println(aniversario);
```

e se idade fosse uma String? como fariamos a conversão?

```java
String idade = "30";
//int aniversario = idade; (essa forma de atribuir 30 a variável aniversário não funciona)
//int aniversario = (int) idade; (essa forma essa forma de atribuir 30 a variável aniversário não funciona)

// devemos fazer o uso de métodos de conversão que é um pouco diferente
int aniversário = Integer.parseInt(idade);

// Podemos verificar o valor após a conversão
System.out.println(aniversario);
```

Isso pode ser feito para valores reais

~~~java

String idade2 = "30.5";
float valor2 = Float.parseFloat(idade2);

System.out.println(valor2);
System.out.printf("A idade é %.3f \n", idade2);

~~~

Ainda na prática da aula no Netbeans usaremos agora o swing para fazer as práticas.

Prática **Somar valores**  
A primeira prática é uma interface com duas caixas de entradas de dados com um botão de igual que retorna o resultado.

Alguns nomes foram combinados para o seguintes componentes:  
- Primeira caixa de texto, nome txtN1, Text vazio   
- Segunda caixa de texto, nome txtN2, Text vazio    
- Botão, nome btnSoma, Text =    
- label de resultado, lblResultado, Text 0

## Acessando dados de uma caixa de texto para inserir em uma variável

Em um dado momento durante a programação no swing surgiu a pergunta, como acesso os dados das caixas de texto e armazeno elas em variáveis para manipular esses dados em uma ação de nosso botão e retornar um resultado em um label?

Usamos os **métodos acessores** para pegar ou inserir dados.

Existem dois métodos acessores

**Método Getter** é o método que pega os valores dentro de uma caixa de texto ou label.

**Método Setter** é o método que insere valores dentro de uma caixa de texto ou label.

Veja um exemplo.

temos um label com os seguintes atributos:  
Nome: lblResultado  
Text: 0

Para pegar o valor como dito antes usamos o **método getter**  
lblResultado.getText();

Para inserir o resultado como dito antes usamos o **método setter**  
lblResultado.setText();

quando usamos o comando para pegar o dado ele tinha um problema.

~~~java

int n1 = txtN1.getText(); //o problema é que o texto é um tipo de dado não compativel com inteiro

//Para resolver isso basta usar o método que aprendemos de conversão de dados
int n1 = Integer.parseInt(txtN1.getText());

~~~

Fim da aula
