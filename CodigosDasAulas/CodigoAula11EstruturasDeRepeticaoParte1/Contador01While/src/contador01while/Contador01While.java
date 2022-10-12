/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01while;

/**
 *
 * @author Felipe Dantas
 */
public class Contador01While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int cc = 0;
        while(cc < 4){
            System.out.println((++cc)  + " Cambalhota");
            //System.out.println("Contador: " + cc);
        }
        */
        
        // comando continue
        /*
        int cc = 0;
        while(cc < 10){
            ++cc;
            if(cc == 5 || cc == 7 || cc == 9){
                //esse comando faz ele sair do looping e voltar para o teste lógico (cc < 10)
                continue;
            }
            System.out.println(cc  + " Cambalhota");
        }
        */
        
        //comando break
        int cc = 0;
        while(cc < 10){
            ++cc;
            if(cc == 2 || cc == 3 || cc == 4){
                //esse comando faz ele sair do looping e voltar para o teste lógico (cc < 10)
                continue;
            }
            if (cc == 7){
                break;
            }
            System.out.println(cc  + " Cambalhota");
        }
        
    }
    
}
