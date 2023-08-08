

package Servicios;

import Entidades.Alojamiento;
import Entidades.Hotel;

/**
 *
 * @author Sebastián A. Petrini
 */

public class HotelService extends AlojamientoService{
    
    public Hotel crearHotel(){
        System.out.println("Ingrese los datos del Hotel: ");
        Alojamiento a = super.crearAlojamiento();
        System.out.print("Ingrese la cantidad de Habitaciones: ");
        int habitaciones = Leer.nextInt();
        System.out.print("Ingrese la cantidad de camas: ");
        int camas = Leer.nextInt();
        System.out.print("Ingrese la cantidad de pisos del Hotel: ");
        int pisos = Leer.nextInt();
        return new Hotel(habitaciones, camas, pisos, 0, a.getNombre(), a.getDireccion(), a.getLocalidad(), a.getGerente());
    }
    
    public void precioHabitacion(Hotel h) {
        h.setPrecio(50 + (1 * h.getCamas() * h.getHabitaciones()));
    }
    
    

}
