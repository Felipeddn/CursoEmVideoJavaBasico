/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeexercicio;

/**
 *
 * @author Felipe Dantas
 */
public class TesteExercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 10;
        long l = 1;
        String s = "Hello";
        
        //b
        s+=i; 
        //ela recebe inteiro porque o operador mais tem a função de concatenação então ele está juntando uma frase com uma variável
        
        //e
        i += l;
        
        System.out.printf("o valor em \ns é %s \ne o valor em \ni é %d \n", s, i);
        
        // nem se eu fizer uma soma que estoura o valor máximo para inteiros que é a variável i, retorna erro.
        i = 2147483;
        i += l;
        
        System.out.println("Valor de i:" + i);
    }
    
}
