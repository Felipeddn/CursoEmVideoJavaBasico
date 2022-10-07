/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author felip
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = 4;
        numero2 = 8;
        //pode ser colocado parenteses (numero1 > numero2)
        int resultado = numero1 > numero2 ? 0 : 1;
        //System.out.println("A variável resultado recebeu o valor " + resultado);
        
        int numero3 = 14;
        
        int resultado2 = numero3 > numero2 ? 0 : 1;
        
        //System.out.println("A variável resultado2 recebeu o valor " + resultado2);
        
        int resultado3 = numero3 > numero2 ? numero3 : numero2 ;
        
        //System.out.println("A variável resultado3 recebeu o valor " + resultado3);
        
        int numero4 = 18;
        
        int resultado4 = numero3 > numero4 ? numero3 : numero4;
        
        //System.out.println("A variável resultado4 recebeu o valor " + resultado4);
        
        //Operadores ternarios aceita formulas 
        int resultado5 = numero3 > numero4 ? numero3 + numero4 : numero3 - numero4;
        
        //System.out.println("A variável resultado5 recebeu o valor " + resultado5);
        
        int numero5 = 8;
        
        int resultado6 = numero3 > numero5 ? numero3 + numero5 : numero3 - numero5;
        
        System.out.println("A variável resultado6 recebeu o valor " + resultado6);
        
    }
    
}
