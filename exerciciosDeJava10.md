# Execícios Java 10

Professor: Gustavo Guanabara

Observe o trecho de programa:

~~~java

public class Exemplo {
    public static void main(String[] args){
        System.out.println("Marinha do Brasil");
    }
}

~~~

Com base na classe Java acima, assinale a opção correta.

e) O método main é o primeiro a ser chamado e executado pela JVM.

Observe o código Java abaixo:

~~~java

public class Teste{
    public static void main (String[] args){
        String nome = "João";
        imprimeNome("Empty");
    }
}
public static void imprimeNome(String nome){
    if(!nome.isEmpty()){
        System.out.println("Tudo bem " + nome + " ?");
    } else {
        System.out.println("O nome é " + nome + "?");
    }
}

~~~

Qual será a saída do programa acima?

a) Tudo bem Empty?

O que será impresso quando o seguinte programa escrito na linguagem JAVA for compilado e executado?

~~~java 

class Teste{
    public static void main(String args[]){
        char ch;
        String test2 = "abcde";
        String test = new String("abcde");
        if(test.equals(test2)){
            ch = (test == test2) ? test.charAt(0) : test.charAt(1);
        } else {
            ch = (test = test2)? test.charAt(2) : test.charAt(3);
        }
        System.out.println(ch);
    }
}

~~~

b) b

Agora vamos praticar um projeto chamado ProjetoTriangulo que ficará no diretório **ExerciciosDeJava10**.

Fiz a lógica do triangulo mas estou tendo problema na hora de comparar os lados para retornar a classificação do triangulo quanto aos lados.

Consegui resolver antes de ver o Guanabara terminar o exercicio.

Depois vi o Guanabara terminar os exercicios e por incrivel que pareça ele não tratou algumas condições que forma um triangulo no programa mesmo sendo um absurdo, por exemplo tres segmentos com valor 0, no código que ele digitou ele não tratou essa condição e o programa dele retorna um triangulo e ainda classifica o mesmo!!! como eu sei que ele só está sendo didático, **não estou criticando isso**, **apenas estou pontuando** que no caso eu tratei esse problema, mas seria legal ele deixar como desafio para os alunos.

Fim dos exercicios
