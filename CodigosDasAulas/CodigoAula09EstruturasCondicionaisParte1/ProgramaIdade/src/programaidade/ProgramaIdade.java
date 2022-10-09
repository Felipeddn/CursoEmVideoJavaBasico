/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

//importando bibliotecas
import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author Felipe Dantas
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando objetos para ter acesso a métodos e atributos das bibliotecas Scanner e LocalDate
        Scanner teclado = new Scanner(System.in);
        LocalDate data = LocalDate.now();
        
        //ano atual
        int anoAtual = data.getYear();
        
        // ano de nascimento
        System.out.print("Qual sua data de nascimento (aaaa)? ");
        int anoNascimento = teclado.nextInt();
        
        // calculando para obter idade
        int idade = anoAtual - anoNascimento;
        
        //mostando mensagem conforme idade
        System.out.println("Sua idade é "+ idade);
        if(idade >= 18){
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
    
}
