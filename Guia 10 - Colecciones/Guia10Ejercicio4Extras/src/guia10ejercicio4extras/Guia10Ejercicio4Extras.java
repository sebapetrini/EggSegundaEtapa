
package guia10ejercicio4extras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap

 * 
 * @author Sebastián A. Petrini
 */

public class Guia10Ejercicio4Extras {
   
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<Integer, String> cp = new HashMap();
        cp.put(8328, "Allen");
        cp.put(8332, "General Roca");
        cp.put(8400, "Bariloche");
        cp.put(1615, "Grand Bourg");
        cp.put(7620, "Balcarce");
        cp.put(6430, "Adolfo Alsina");
        cp.put(1870, "Avellaneda");
        cp.put(6640, "Bragado");
        cp.put(7136, "Chascomus");
        cp.put(1828, "Banfield");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el CP de la ciudad a agregar: ");
            Integer c = Leer.nextInt();
            System.out.print("Ingrese el nombre de la Ciudad: ");
            String n = Leer.next();
            cp.put(c, n);
        }
        for (Map.Entry<Integer, String> entry : cp.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Codigo Postal: " + key + " " + value);
        }        
        System.out.print("Ingrese el CP de la ciudad a buscar: ");
        Integer c = Leer.nextInt();
        boolean enc = false;
        for (Map.Entry<Integer, String> entry : cp.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key == c){
                System.out.println("La ciudad buscada es: " + value);
                enc = true;
            }
        }
        if (!enc)
            System.out.println("LA Ciudad no esta en la lista!!!!!");
        System.out.println("");
        System.out.print("Ingrese el CP de la ciudad a agregar: ");
        c = Leer.nextInt();
        System.out.print("Ingrese el nombre de la Ciudad: ");
        String n = Leer.next();
        cp.put(c, n);
        int cont =0;
        int aux = cp.size();
        do {
            System.out.print("Ingrese el CP de la ciudad a agregar: ");
            c = Leer.nextInt();
            cp.remove(c);
            if (aux > cp.size()){
                System.out.println("La Ciudad fue eliminada con éxito!!!");
                aux = cp.size();
                cont++;
            }else
                System.out.println("La ciudad no se encuentra en la lista...");
            
        } while (cont<3);
        System.out.println("");
        for (Map.Entry<Integer, String> entry : cp.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Codigo Postal: " + key + " " + value);
        }   
        
    }

}
