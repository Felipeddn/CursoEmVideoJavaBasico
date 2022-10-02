package resolucaodatela;

import java.awt.Toolkit;
import java.awt.Dimension;

/**
 *
 * @author Felipe Dantas
 */
public class ResolucaoDaTela {

    public static void main(String[] args) {
        //alt + enter aparece uma lista de opções, em uma dessas opções existe a possibilidade de importar a biblioteca em questão
        Toolkit ferramentasDeTela = Toolkit.getDefaultToolkit();
        Dimension resolucao = ferramentasDeTela.getScreenSize();
        
        
        System.out.print("Sua tela tem resolução ");
        System.out.println(resolucao.width + "x" + resolucao.height);
        
        //acabei encontrando a resposta no link
       //https://www.guj.com.br/t/descobrir-a-resolucao-da-tela/327242/3
        
    }
    
}
