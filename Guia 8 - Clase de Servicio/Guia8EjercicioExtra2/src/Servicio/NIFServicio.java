

package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class NIFServicio {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
    public NIF crearNif(){
        char[] nif = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'}; 
        System.out.print("Ingrese el número de Documento: ");
        long DNI = Leer.nextLong();
        return new NIF(DNI, nif[(int)DNI%23]);       
    }
    public void mostrar(NIF n){
        System.out.println("El NIF es: " + n.getDNI() + "-" + n.getNIF());
    }
    
}
