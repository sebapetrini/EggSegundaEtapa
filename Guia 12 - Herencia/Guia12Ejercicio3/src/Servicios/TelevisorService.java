

package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;

/**
 *
 * @author Sebastián A. Petrini
 */

public class TelevisorService extends ElectrodomesticoService{

       public Televisor crearTelevisor(){
           System.out.println("Ingreso de datos del Televisor");
           Electrodomestico e = super.crearElectrodomestico();
           System.out.print("Ingrese las pulgadas del Televisor: ");
           Integer resolucion = Leer.nextInt();
           String op;
           do {
               System.out.print("Tiene sintonizador TDT S/N: ");
               op = Leer.next().toUpperCase().substring(0, 1);
           } while (!(op.equals("S") || op.equals("N")));
           Boolean TDT;
           TDT = op.equals("S");
           return new Televisor(e, resolucion, TDT);
       }


    public Double precioFinal(Televisor e) {
        Double precio = super.precioFinal(e);
        if (e.getResolucion()>40)
            precio = precio * 1.3;
        if (e.getTDT())
            precio += 500;
        return precio; 
    }
    
    public void mostrarTelevisor(Televisor t){
        System.out.println("El Televisor es: ");
        System.out.println("Precio Inicial: " + t.getPrecio());
        System.out.println("Color: " + t.getColor());
        System.out.println("Clasificación Energética: " + t.getConsumoenerg());
        System.out.println("Peso: " + t.getPeso());
        System.out.println("Resolución en pulgadas: " + t.getResolucion());
        System.out.println("Contiene sintonizador TDT: " + t.getTDT());
        System.out.println("Precio Final producto: " + precioFinal(t));
    }
       
}
