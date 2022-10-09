
package operadoresaritmeticos;

/**
 *
 * @author Felipe Dantas
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // divisão simples para testar os operadores
        
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) /2;
        System.out.println("A média é igual a " + m);
        */
        
        /*
        // operador de incremento
        
        int numero = 5;
        numero++;
        System.out.println("numero++: " + numero);
        
        //operador de decremento
        
        numero--;
        System.out.println("numero--: " + numero);
        // Nesse caso a ordem é 5 + 5 e o incremento não acontece nessa operação
        
        //comportamento do  pós-incremento em uma operação aritmética
        
        int valor = 5 + numero++;
        System.out.println("valor + numero++: " + valor);
        // o número recebe o incremento só depois da soma.
        
        System.out.println("numero: " + numero);
        //O valor soma com número valendo 5
        System.out.println("valor: " + valor);
        */
        
        //Comportamento do pós-decremento em uma operação aritmética 
        
        /*
        
        int numero2 = 10;
        //System.out.println("numero2: " + numero2);
        int valor2 = 4 + numero2--;
        
        System.out.println("valor2 + numero: " + valor2);
        System.out.println("numero2: " + numero2);
        System.out.println("valor: "+ valor2);
       
        
        //comportamento do pré-incremento em uma operação aritmética
        
        System.out.println("numero2: " + numero2);
        System.out.println("Valor2: " + valor2);
        valor2 = 4 + --numero2;
        System.out.println("valor2 + --numero2: " + valor2);
        */
        
        //pós-incremento
        
        
        /*
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
        */
        
        /*
        System.out.println("Operações e atribuições em um comando");
        
        System.out.println("x = 4");
        int x = 4;
        System.out.println("x += 2");
        x += 2; // x = x + 2
        System.out.println("x = " + x);
        System.out.println("x *= 2");
        x *= 2;
        System.out.println("x = " + x);
        */
        
        /*
        System.out.println("Métodos de arredondadmento");
        System.out.println("");
        
        float valor = 8.9f;
        
        int arredondadoParaBaixo = (int) Math.floor(valor);
        System.out.println("8.9 arredondado para baixo com Math.floor: " + arredondadoParaBaixo);
        System.out.println("");
        
        valor = 8.1f;
        int arredondadoParaCima = (int) Math.ceil(valor);
        System.out.println("8.1 arredondado para cima com Math.ceil: " + arredondadoParaCima);
        System.out.println("");
        
        valor = 8.4f;
        int arredonda1 = Math.round(valor);
        System.out.println("8.4 arredondado aritméticamento com Math.round: "+ arredonda1);
        
        
        valor = 8.9f;
        int arredonda2= Math.round(valor);
        System.out.println("8.9 arredondado aritméticamento com Math.round: " + arredonda2);
        */
        
        System.out.println("Números aleatórios");
        System.out.println("");
        
        double valorAleatorio = Math.random();
        System.out.println("O valor aleatório gerado foi: "+ valorAleatorio);
        System.out.println("");
        
        int numeroGerado = (int) (5 + valorAleatorio * (10-5));
        System.out.println("Numero aleatório entre 5 e 10: " + numeroGerado);
        
        System.out.println("");
        System.out.println("");
        int fatorMultiplicador = (int) (valorAleatorio * (10-5));
        System.out.println("Fator multiplicador: "+ fatorMultiplicador);
                
        System.out.println("");
        System.out.println("");
        double valorAleatorio2 = Math.random();
        System.out.println("O valor aleatório gerado foi: "+ valorAleatorio2);
        System.out.println("");
        
        int numeroGerado2 = (int) (15 + valorAleatorio2 * (50-15));
        System.out.println("Numero aleatório entre 15 e 50: " + numeroGerado2);
        
        System.out.println("");
        System.out.println("");
        int fatorMultiplicador2 = (int) (valorAleatorio2 * (50-15));
        System.out.println("Fator multiplicador: "+ fatorMultiplicador2);
        
    }
    
}
