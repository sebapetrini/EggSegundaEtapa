

package Servicios;

import Entidad.Barco;
import Entidad.BarcoMotor;

/**
 *
 * @author Sebastián A. Petrini
 */

public class BarcoMotorService extends BarcoService{
    public BarcoMotor crearBarcoMotor(){
        Barco b = super.crearBarco();
        System.out.print("Ingrese la potencia en CV: ");
        double potencia = Leer.nextDouble();
        return new BarcoMotor(potencia, b.getMatricula(), b.getEslora(), b.getFabricado());
    }
    
    public void mostrarBarcoMotor(BarcoMotor b){
        super.mostrarBarco(b);
        System.out.println("Potencia en CV: " + b.getPotencia());
    }
}
