

package Servicios;

import Entidad.Barco;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class BarcoService {
    Scanner Leer;

    public BarcoService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Barco crearBarco(){
        System.out.println("Ingreso de datos de la Embarcación: ");
        System.out.print("Ingrese la matricula: ");
        String matricula = Leer.next();
        System.out.print("Ingrese el largo de la eslora: ");
        double eslora = Leer.nextDouble();
        System.out.print("Ingrese el año de fabricación: ");
        int fabricado = Leer.nextInt();
        return new Barco(matricula, eslora, fabricado);
    }
    
    public void mostrarBarco(Barco b){
        System.out.println("Datos de la Embarcación: ");
        System.out.println("Matricula: " + b.getMatricula());
        System.out.println("Largo de la eslora: " + b.getEslora());
        System.out.println("Año de fabricación: " + b.getFabricado());
    }
    
}
