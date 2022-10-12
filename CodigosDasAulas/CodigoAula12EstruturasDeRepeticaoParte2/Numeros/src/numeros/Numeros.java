/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarando variáveis
        int numero, soma = 0;
        String resposta;
        
        //criando objeto para acessar o método de ler teclado
        Scanner teclado = new Scanner (System.in);
        
        
        do {
            System.out.println("Digite um numero");
            numero = teclado.nextInt();
            soma += numero;
            System.out.println("Quer continuar? [S/N]: ");
            //Parece que tem problema se usar o nextLine(), vou deixar para testar.
            //Se manter o nextLine() ele encerra ao apertar, com o next(), não temos esse problema.
            resposta = teclado.next().toUpperCase();
        }while(resposta.equals("S"));
        System.out.println("A soma dos valores digitados é "+ soma);
    }
    
}
