

package Servicios;

import Entidades.Hotel;
import Entidades.Hotel4;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Hotel4Service extends HotelService{
    
    public Hotel4 crearHotel4(){
        Hotel h = super.crearHotel();
        System.out.println("Ingrese la categoría del gimnacio (A o B): ");
        String gym;      
        do {
            gym = Leer.next().toUpperCase().substring(0, 1);
        } while (!(gym.equals("A") || gym.equals("B")));
        System.out.print("Ingrese el nombre del Restaurante: ");
        String restaurante = Leer.next();
        int capRest = Leer.nextInt();
        return new Hotel4(gym, restaurante, capRest, h.getHabitaciones(), h.getCamas(), h.getPisos(), 0, h.getNombre(), h.getDireccion(), h.getDireccion(), h.getGerente());
    }
    
    public void precioHabitacion(Hotel4 h) {
        super.precioHabitacion(h);
        int preciosuma = h.getPrecio();
        if (h.getCapRestaurante() < 30){
            preciosuma+=10;
        }else if (h.getCapRestaurante() < 51){
            preciosuma+=30;
        }else
            preciosuma+=50;
        switch (h.getGym().toUpperCase()) {
            case "A":
                preciosuma+=50;
                break;
            case "B":
                preciosuma+=30;
                break;
        }   
        h.setPrecio(preciosuma);
    }

}
