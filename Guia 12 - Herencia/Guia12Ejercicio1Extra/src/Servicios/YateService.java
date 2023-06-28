

package Servicios;

import Entidad.BarcoMotor;
import Entidad.Yate;

/**
 *
 * @author Sebastián A. Petrini
 */

public class YateService extends BarcoMotorService{
    public Yate crearYate(){
        BarcoMotor b = super.crearBarcoMotor();
        System.out.print("Ingrese la cantidad de camarotes: ");
        int camarotes = Leer.nextInt();
        return new Yate(camarotes, b.getPotencia(), b.getMatricula(), b.getEslora(), b.getFabricado());
    }
    
    public void mostrarYate(Yate b){
        super.mostrarBarcoMotor(b);
        System.out.println("Cantidad de Camarotes: " + b.getCamarotes());
    }
}
