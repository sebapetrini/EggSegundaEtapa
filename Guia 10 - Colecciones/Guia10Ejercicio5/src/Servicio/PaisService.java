

package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class PaisService {
    Scanner Leer;
    
    public PaisService(){
        Leer  = new Scanner(System.in).useDelimiter("\n");
    }
   
    public Pais crearPais(){
        System.out.print("Ingrese el nombre del Pais: ");
        String pais = Leer.next();
        return new Pais(pais);
    }
    
    public void mostrarPaises(HashSet<Pais> p){
        Iterator<Pais> it = p.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getNombre());
        }
    }
    
    public void mostrarPaisesOrdenados(HashSet<Pais> p){
        /*
        ArrayList<Pais> listaPais = new ArrayList(paises);
        Comparator<Pais> cm1 = Comparator.comparing(Pais::getNombre);
        Collections.sort(listaPais, cm1);
        */
        
        ArrayList<Pais> lp = new ArrayList(p);
        lp.sort((pa,pb) -> pa.getNombre().compareTo(pb.getNombre()));
        Iterator<Pais> it = lp.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getNombre());
        }
    }
    
    public void eliminarPais(HashSet<Pais> p){
        System.out.print("Ingrese el País a eliminar: ");
        String pais = Leer.next();
        boolean encontro = false;
        Iterator<Pais> it = p.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(pais)){
                it.remove();
                encontro = true;
            }
        }
        if (!encontro)
            System.out.println("No se encontró el País");
        else {
            for (Pais p1 : p) {
                System.out.println(p1.getNombre());
            }
        }
    }
}
