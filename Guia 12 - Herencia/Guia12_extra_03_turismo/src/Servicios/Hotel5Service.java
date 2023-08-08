
package Servicios;

import Entidades.Hotel4;
import Entidades.Hotel5;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Hotel5Service extends Hotel4Service{
    
    public Hotel5 crearHotel5(){
        Hotel4 h = super.crearHotel4();
        System.out.print("Ingrese la cantidad de salones para conferencias: ");
        int salones = Leer.nextInt();
        System.out.print("Ingrese la cantidad de Suites: ");
        int suit = Leer.nextInt();
        System.out.print("Ingrese la cantidad de Limusinas con las que cuentra el Hotel: ");
        int limo = Leer.nextInt();
        return new Hotel5(salones, suit, limo, h.getGym(), h.getRestaurante(), h.getCapRestaurante(), h.getHabitaciones(), h.getCamas(), h.getPisos(), 0, h.getNombre(), h.getDireccion(), h.getDireccion(), h.getGerente());
    }
    
    public void precioHabitacion(Hotel5 h) {
        super.precioHabitacion(h);
        int preciosuma = h.getPrecio();
        preciosuma += 15 * h.getLimosinas();
        h.setPrecio(preciosuma);
    }
}
