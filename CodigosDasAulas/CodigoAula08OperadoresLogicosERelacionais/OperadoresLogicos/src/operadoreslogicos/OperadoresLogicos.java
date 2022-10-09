/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author felip
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Operador .E. &&
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado;
        
        /** 
        * o editor disse que o código do Guanabara é redundante porque só o fato 
        * de comparar os valores dessa forma já retornaria um valor verdadeiro ou
        * falso, ou seja, não é necessario o uso de operadores ternários. E vou
        * seguir o editor porque achei muito mais agradavel de ver.
        */
        
      
        //resultado = (x < y && y < z)? true : false;
        resultado = (x < y && y < z);
        //System.out.println("x < y && y < z, isso é verdadeiro ou falso? " + resultado);
        
        boolean resultado2 = (x < y && y == z);
        //System.out.println("x < y && y == z, isso é verdadeiro ou falso? " + resultado2);
        
        //Operador .OU. ||
        
        boolean resultado3 = (x < y || y == z);
        //System.out.println("x < y || y == z, isso é verdadeiro ou falso? " + resultado3);
        
        //Operador .XOR. ^
        
        boolean resultado4 = (x < y ^ y == z);
        //System.out.println("x < y ^ y == z, isso é verdadeiro ou falso? " + resultado4);
        
        boolean resultado5 = (x < y ^ y < z);
        System.out.println("x < y ^ y < z, isso é verdadeiro ou falso? " + resultado5);
        
        
    }
    
}
