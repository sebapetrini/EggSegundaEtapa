

package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class ElectrodomesticoService {
    Scanner Leer;

    public ElectrodomesticoService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    
    private char comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        switch (letra) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                return letra;
            default:
                return 'F';
        }        
    }
    
    private String comprobarColor(String color){
        if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris"))
            return color;
        else
            return "Blanco";        
    }
    
    public Electrodomestico crearElectrodomestico(){
        System.out.print("Ingrese el precio del Electrodoméstico: ");    
        Double precio = Leer.nextDouble() + 1000;
        System.out.print("Ingrese el color del Electrodoméstico: ");
        String color = comprobarColor(Leer.next());
        System.out.print("Ingrese la calificación del consumo eléctrico del Electrodoméstico: ");
        char consumoenerg = comprobarConsumoEnergetico(Leer.next().toUpperCase().charAt(0)); 
        System.out.print("Ingree el peso del Electrodoméstico: ");
        Double peso = Leer.nextDouble();
        return new Electrodomestico(precio, color, consumoenerg, peso);
    }
   
    public Double precioFinal(Electrodomestico e){
        Double precio=0d;
        
        switch (e.getConsumoenerg()) {
            case 'A':
                precio = e.getPrecio() + 1000;
                break;
            case 'B':
                precio = e.getPrecio() + 800;
                break;
            case 'C':
                precio = e.getPrecio() + 600;
                break;
            case 'D':
                precio = e.getPrecio() + 500;
                break;
            case 'E':
                precio = e.getPrecio() + 300;
                break;
            case 'F':
                precio = e.getPrecio() + 100;
                break;
        }       
        if (e.getPeso()>= 1 && e.getPeso()<=19)
            precio = precio + 100;
        else if (e.getPeso()>= 20 && e.getPeso()<=49)
            precio = precio + 500;
        else if (e.getPeso()>= 50 && e.getPeso()<=79)
            precio = precio + 800;
        else if (e.getPeso()>= 80)
            precio = precio + 1000;
        return precio;
    }
    
}
