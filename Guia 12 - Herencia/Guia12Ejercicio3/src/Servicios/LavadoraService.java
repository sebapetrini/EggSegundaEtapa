

package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;

/**
 *
 * @author Sebastián A. Petrini
 */

public class LavadoraService extends ElectrodomesticoService {

    public Lavadora crearLavadora (){
        System.out.println("Ingreso de datos de la Lavadora");
        Electrodomestico e = super.crearElectrodomestico();
        System.out.print("Ingrese el peso de carga de la Lavadora: ");
        Integer carga = Leer.nextInt();
        return new Lavadora(e,carga);
    }
    
    public Double precioFinal(Lavadora l){
        Double pl = super.precioFinal(l);
        if (l.getCarga()>30)
            pl += 500;
        return pl;
    }
    
    public void mostrarLavadora(Lavadora l){
        System.out.println("El Lavadora es: ");
        System.out.println("Precio Inicial: " + l.getPrecio());
        System.out.println("Color: " + l.getColor());
        System.out.println("Clasificación Energética: " + l.getConsumoenerg());
        System.out.println("Peso: " + l.getPeso());
        System.out.println("Capacidad de carga: " + l.getCarga());
        System.out.println("Precio Final producto: " + precioFinal(l));
    }
    
}
