

package Servicios;

import Entidades.Alojamiento;
import Entidades.ExtraHotelero;

/**
 *
 * @author Sebastián A. Petrini
 */

public class ExtraHoteleroService extends AlojamientoService{
    
    public ExtraHotelero crearExtraHotelero(){
        System.out.println("Ingrese los datos del alojamiento Extra Hotelero: ");
        Alojamiento a = super.crearAlojamiento();
        String op;
        System.out.println("El alojamiento es privado S/N: ");
        do {
            op = Leer.next().substring(0, 1);
        } while (!(op.equalsIgnoreCase("s") || op.equalsIgnoreCase("n")));
        System.out.print("Ingrese los metros cuadrado de superficie: ");
        int sup = Leer.nextInt();
        
        return new ExtraHotelero(op.equalsIgnoreCase("s"), sup, a.getNombre(), a.getDireccion(), a.getLocalidad(), a.getGerente());
    }
    
    

}
