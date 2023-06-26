package ejer3a_relaciones;
import entidad.Carta;
import servicio.cartaServicios;

/**
 */
public class Ejer3A_relaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          cartaServicios s = new cartaServicios();
        Carta carta = new Carta();
        
        s.menu(carta);   
    }
    }
    

