/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testedoexerciciodeequivalentes;

/**
 *
 * @author Felipe Dantas
 */
public class TesteDoExercicioDeEquivalentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a =5, b =2;
        //c eliminado teste dois abaixo
        
        a = 3;
        b = 3;
        
        // com o teste dos dois valores a opção correta é a b)
        
        String c;
        if(a > b){
            c = "Primeiro é Maior";
        } else {
            c = "Segundo é Maior";
        }
        
        System.out.println("Resposta do correta: " + c);
        
        // opção a
        c = (a < b)? "Segundo é Maior" : "Primeiro é Maior";
        System.out.println("a)"+ c);
        
        //opção b
        c = (a <= b)? "Segundo é Maior" : "Primeiro é Maior";
        System.out.println("b)" + c);
        
        //opção c
        c = (a > b)? "Segundo é Maior" : "Primeiro é Maior";
        System.out.println("c)"+ c);
        
        // opção d
        c = (a >= b)? "Primeiro é Maior" : "Segundo é Maior";
        System.out.println("d)" + c);
        

        //depois do primeiro print c é eliminado
        //a, c e d eliminados quando a e b são iguais, ou seja resposta certa b
        
    }
    
}
