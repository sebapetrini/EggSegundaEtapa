

package Servicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class MesesService {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    public void adivinaMes(Meses m){
        String mes;
        do {
            System.out.print("Ingrese el mes que pieza que es el secreto en minúsculas: ");
            mes = Leer.next();
            if (mes.equals(m.getMesSecreto()))
                System.out.println("Adivine el mes secreto!!!!! es: " + m.getMesSecreto());
            else
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes!!!");
        } while (!mes.equals(m.getMesSecreto()));
        
    }

}
