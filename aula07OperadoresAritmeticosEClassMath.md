# Aula 7 - Operadores Aritméticos e ClassMath

Professor: Gustavo Guanabara

Nas aulas passadas já vimos alguns operadores

**=** para atribuição   
**+** para adição (soma)  

## Operadores aritméticos  

Tabela|               |       |   
----  |  -----------  | ----- | 
**+** | Adição        | 5 + 2 | 7  
**-** | subtração     | 5 - 2 | 3  
' *   | Multiplicação | 5 * 2 | 10  
  /   | Divisão       | 5 / 2 | 2.5  
  %   | Resto         | 5 % 2 | 1  


Veja um exemplo de código usando esses operadores:

~~~java

int numero1 = 3;
int numero2 = 2;
int media = (numero1 + numero2) / 2;

System.out.println("A média é igual a " + media);

~~~

Quando usamos diversos operadores existem ordem de precedência, uma ordem onde determina qual operação será realizada primeiro.  
os operadores tem a seguinte ordem de precedência:  
( )  
 / * %   
 **+** -   

A partir de agora iremos praticar no netbeans, verifique no diretório CodigosDasAulas > CodigoAula7OperadoresAritmeticosEClassMath

## Operadores Unário  

Pré - incrementa antes

Tabela  |            |            |   
--      |  --------  | ---------- |
++      | incremento | ++variavel | variavel = variavel + 1  
--      | decremento | --variavel | variavel = variavel - 1  

Pós - incremento depois

Tabela |            |            |  
---    |  --------  | ---------- |
++     | incremento | variavel++ | variavel = variavel + 1    
--     | decremento | variavel-- | variavel = variavel - 1    

A ordem dos operadores influênciam na operação de incremento e decremento. Provaremos isso com o exemplo abaixo:

~~~java

//pós-incremento

        System.out.println("Pós-incremento");
        System.out.println("");

        int numero = 0;
        numero++;
        System.out.println("número vale " + numero);
        // saída será 1

        numero--;
        System.out.println("número vale " + numero);
        // saída será 0
        System.out.println("");

        //pré-incremento
        System.out.println("Pré-incremento");
        System.out.println("");

        ++numero;
        System.out.println("número vale " + numero);
        // saída será 1

        --numero;
        System.out.println("número vale " + numero);
        // saída será 0
        System.out.println("");

        // A grande diferença entre pós e pré-incremento
        System.out.println("A grande diferença entre pós e pré-incremento nas operações");

        // operações com pós incremento
        System.out.println("pós-incremento");  
        
        int valor = 2;
        int soma = valor + numero++;
        System.out.println("soma vale " + soma);
        // saída será 2
        System.out.println("número vale " + numero);
        // saída será 1
        System.out.println("");
        
        System.out.println("pós-decremento");
        System.out.println("");
        soma = valor + numero--;
        System.out.println("soma vale " + soma);
        // saída será 3
        System.out.println("número vale " + numero);
        //saída será 0
        
        System.out.println("");
        System.out.println("pré-incremento");
        // operações com pré-incremento
        soma = valor + ++numero;
        System.out.println("soma vale " + soma);
        // saída será 3
        System.out.println("número vale " + numero);
        //saída será 1
        System.out.println("");
        
        System.out.println("pré-decremento");
        System.out.println("");
        soma = valor + --numero;
        System.out.println("soma vale " + soma);
        // saída será 2
        System.out.println("número vale " + numero);
        //saída será 0
        
~~~

## Operadores de atribuição

Tabelar   |                        |        |  
-- |  --------------------  | ------ |
+= | Somar e atribuir       | a += b | a = a + b 
-= | Subtrair e atribuir    | a -= b | a = a - b   
*= | multiplicar e atribuir | a *= b | a = a * b     
/= | dividir e atribuir     | a /= b | a = a / b    
%= | atribuir o resto       | a %= b | a = a % b    

Veja um exemplo dessa prática de atribuir

~~~java

    System.out.println("Operações e atribuições em um comando");
        
    System.out.println("x = 4");
    int x = 4;
    System.out.println("x += 2");
    x += 2; // x = x + 2
    System.out.println("x = " + x);
    System.out.println("x *= 2");
    x *= 2;
    System.out.println("x = " + x);

~~~

## Classe Math

O Java não tem um operador de exponênciação

Para as diversas operações matemáticas conhecidas existe a **Classe Math** do Java.

 Tabela    |               |                                  |  
---- |  -----------  | -------------------------------- |
PI   | Constante pi  | Math.PI                          | 3.1415... 
pow  | Exponenciação | Math.pow(base (5), expoente (2)) | 25 
sqrt | Raiz Quadrada | Math.sqrt(25)                    | 5     *Sq*uare *r*oo*t* 
cbrt | Raiz Cubica   | Math.cbrt(27)                    | 3      *Cu*b*ic *r*oo*t*    

Isso foi práticado no **OperadoresSwing2**.

## Arredondamentos

Tabela      |                    |                 |   
----- |  -----------------------  | --------------- |
abs   | valor absoluto            | Math.abs(-10)   | 10 
floor | arredonda para baixo      | Math.floor(3.9) | 3  
ceil  | arredonda para cima       | Math.ceil(4.2)  | 5  
round | arredonda aritméticamente | Math.round(5.6) | 6  

## Gerar números aleatórios  

O método random da classe Math gera números aleatórios.

Math.random() gera valores entre 0.0 e 1.0.

Para gerar valores de 5 a 10 veja a fórmula apresentada na aula

(5 + variavelQueRecebeValorAleatório * (10-5))

Para gerar valores de 15 a 50 veja a fórmula apresentada na aula

(15 + variavelQueRecebeValorAleatório * (50-15))

Fim da aula
