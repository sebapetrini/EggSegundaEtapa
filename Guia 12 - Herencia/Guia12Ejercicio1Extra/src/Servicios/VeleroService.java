

package Servicios;

import Entidad.Barco;
import Entidad.Velero;

/**
 *
 * @author Sebastián A. Petrini
 */

public class VeleroService extends BarcoMotorService{
    public Velero crearVelero(){
        Barco b = super.crearBarco();
        System.out.print("Ingrese la cantidad de mástiles: ");
        int mastil = Leer.nextInt();
        return new Velero(mastil, b.getMatricula(), b.getEslora(), b.getFabricado());
    }
    
    public void mostrarBarcoMotor(Velero b){
        super.mostrarBarco(b);
        System.out.println("La cantidad de mástiles es: " + b.getMastil());
    }
}
