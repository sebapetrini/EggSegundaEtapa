
package guia12ejercicio3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.LavadoraService;
import Servicios.TelevisorService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 
 * @author Sebastián A. Petrini
 */

public class Guia12Ejercicio3 {
   
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        TelevisorService tS = new TelevisorService();
        LavadoraService lS = new LavadoraService();
        ArrayList <Electrodomestico> electros = new ArrayList(); 
        int op;
        do {
            System.out.println("Ingrese el Electrodoméstico a incorporar: ");
            System.out.println("1 - Lavadora");
            System.out.println("2 - Televisor");
            System.out.println("3 - Salir");
            op= Leer.nextInt();
            switch (op) {
                case 1:
                    electros.add(lS.crearLavadora());
                    break;
                case 2:
                    electros.add(tS.crearTelevisor());
                    break;
            }            
        } while (op != 3);
        Double ptotal = 0d;
        Double ptotalL = 0d;
        Double ptotalT = 0d;
        Double aux;
        for (Electrodomestico electro : electros) {
            if (electro instanceof Lavadora){
                aux = lS.precioFinal(electro);
                ptotal += aux;
                ptotalL += aux;
                System.out.println("El precio inicial de la Lavadora es: " + electro.getPrecio() + " El precio Final: " + aux);
            }
            if (electro instanceof Televisor){
                aux = tS.precioFinal(electro);
                ptotal += aux;
                ptotalT += aux;
                System.out.println("El precio inicial del Televisor es: " + electro.getPrecio() + " El precio Final: " + aux);
            }
        }
        System.out.println("------------- Totales ------------------");
        System.out.println("Precio Total de las Lavadoras: " + ptotalL);
        System.out.println("Precio Total de los Televisores: " + ptotalT);
        System.out.println("Precio Total de los Electrodomésticos: " + ptotal);
      
    }

}
