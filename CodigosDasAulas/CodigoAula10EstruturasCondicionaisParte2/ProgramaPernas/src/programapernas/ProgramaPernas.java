/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Felipe Dantas
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando objeto para acessar método de entrada de dados
        Scanner keyboard = new Scanner (System.in);
        
        // atribuindo valor 
        System.out.println("Digite a quantidade de pernas que o ser tem: ");
        int legs = keyboard.nextInt();
        String type;
        
        switch (legs) {
            case 1:
                type = "Saci";
                break;
            case 2:
                type = "Bípede";
                break;
            case 4:
                type = "Quadrupede";
                break;
            // eu não soube a sintaxe dessa opção
            case 6:
                type = "Insect";
                break;
            case 8:
                type = "Spider";
                break;
            default:
                type = "ET";
        }
        
        System.out.println("Baseado no tipo de pernas o tipo do ser é: " + type);
    }
    
}
