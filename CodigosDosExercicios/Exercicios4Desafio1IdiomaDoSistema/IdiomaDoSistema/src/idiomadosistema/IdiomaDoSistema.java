
package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {

    
    public static void main(String[] args) {
        //String lingua;
        Locale idioma = Locale.getDefault();      
        
        
        
        // link onde descobri como ver o tipo de uma variável
        //https://www.delftstack.com/pt/howto/java/how-to-check-type-of-a-variable-in-java/#:~:text=Utilize%20getClass().,atrav%C3%A9s%20do%20m%C3%A9todo%20da%20vari%C3%A1vel.
        
        System.out.println(idioma.getClass().getSimpleName()); // método para verificar o tipo da variável
        
        

        /*
        if (idioma == "pt_BR"){
         lingua = "português";
        }
        */
        
        System.out.print("Seu sistema está em ");
        System.out.println(idioma.getDisplayLanguage());
        System.out.println(idioma);
        
        //acabei encontrando a resposta no link
       //https://www.guj.com.br/t/descobrir-a-resolucao-da-tela/327242/3 
        
    }
    
}
