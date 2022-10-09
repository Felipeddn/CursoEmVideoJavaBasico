/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostrings;

/**
 *
 * @author felip
 */
public class ComparacaoStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        
        String resultado;
        resultado = (nome1 == nome2) ? "iguais" : "diferentes";
        
        //System.out.println("As strings são "+ resultado);
        
        String resultado2;
        resultado2 = (nome1 == nome3) ? "iguais" : "diferentes";
        
        System.out.println("As strings são "+ resultado2);
    }
    
}
