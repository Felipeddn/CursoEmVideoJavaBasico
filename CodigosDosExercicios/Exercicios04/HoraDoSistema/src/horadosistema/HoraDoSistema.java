package horadosistema;

import java.util.Date;

/**
 *
 * @author Felipe
 */
public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        //new é uma palavra que cria um novo objeto
        System.out.print("A hora do sistema é ");
        System.out.println(relogio.toString());
    }
    
}
