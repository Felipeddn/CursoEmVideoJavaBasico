/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Qual o valor da primeira nota? ");
        float numero1 = teclado.nextFloat();
        System.out.print("Qual o valor da segunda nota? ");
        float numero2 = teclado.nextFloat();
        float media = (numero1 + numero2)/ 2;
        System.out.format("A média é %.1f. \n", media);
        if(media > 9){
            System.out.println("Parabéns!!");
        }
    }
    
}
