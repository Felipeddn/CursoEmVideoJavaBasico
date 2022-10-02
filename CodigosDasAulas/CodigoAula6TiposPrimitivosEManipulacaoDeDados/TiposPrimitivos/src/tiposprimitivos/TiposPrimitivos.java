
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Felipe Dantas 
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        /*
        float nota = 8.5f;
        String nome = "Felipe";
        System.out.print("Sua nota é " + nota);
        System.out.println("Sua nota é " + nota);
        System.out.printf("Sua nota é %.2f \n", nota );
        System.out.printf("Sua nota é %.4f \n", nota );
        System.out.printf("O aluno %s tirou a nota %.1f \n", nome, nota);
        System.out.format("O aluno %s tirou a nota %.1f \n", nome, nota);
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");

        String nome = teclado.nextLine();
        
        System.out.print("Digite a nota do aluno: ");
        
        float nota = teclado.nextFloat();
        System.out.format("O aluno %s tirou a nota %.1f \n", nome, nota);
        
    }
    
}
