
package testetipos;

/**
 *
 * @author Felipe Dantas
 */
public class TesteTipos {

    
    public static void main(String[] args) {
        
        /*
        int idade = 30;
        
        String valor = idade; //incompatibilidade de dados: inteiro não pode ser convertido para string.
        String valor = (String) idade;
        String valor = (int) idade;
        // Todas essas formas são formas equivocadas de transferir valores de tipos diferente entre variáveis.
        */
        
        //Essa é a forma correta de transferir dados entre variáveis de tipos diferentes.
        /*
        String valor = Integer.toString(idade);
        System.out.println(valor);
        */
        
        String valor = "30";
        /*
        int idade = valor;
        int idade = (int) valor;
        int idade = (string) valor;
        */
        
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
        
        String valor2 = "30.5";
        float idade2 = Float.parseFloat(valor2);
        System.out.println(idade2);
        System.out.printf("A idade é %.3f \n", idade2);
                
    }
    
}
