

package Servicios;

import Entidades.Editorial;
import Persistencia.EditorialDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class EditorialService {
    Scanner Leer;
    EditorialDAO eD;
    public EditorialService() {
        Leer = new Scanner(System.in).useDelimiter("\n");
        eD = new EditorialDAO();
    }
     
    public void crearEditor(){
        System.out.print("Ingrese el nombre de la Editorial: ");
        String nombre = Leer.next();
        String op;
        do {
            System.out.print("La Editorial esta de alta (S/N): ");
            op = Leer.next().toUpperCase().substring(0, 1);
        } while (!( op.equals("S") || op.equals("N")));
        
        eD.guardarEditorial(new Editorial(nombre, op.equals("S")));
        
    }
    
    public Editorial crearEditorN(){
        System.out.print("Ingrese el nombre de la Editorial: ");
        String nombre = Leer.next();
        String op;
        do {
            System.out.print("La Editorial esta de alta (S/N): ");
            op = Leer.next().toUpperCase().substring(0, 1);
        } while (!( op.equals("S") || op.equals("N")));
        Editorial result = new Editorial(nombre, op.equals("S"));
        eD.guardarEditorial(result);
        return result;
    }
    
    public void listarEditorial(){
        System.out.println("-------------Lista de Editoriales-----------------");
        List<Editorial> l = eD.listarEditorial();
        for (Editorial e : l) {
            System.out.println("ID: " + e.getId() + "    Nombre: " + e.getNombre());
        }
    }
    
    public Editorial menuEditorial(){
        Editorial result = null;
        boolean salir = true;
        int op;
        do {
            System.out.println("Elija la opción: ");
            System.out.println("1 - Listar Editoriales");
            System.out.println("2 - Elegir Editorial por ID");
            System.out.println("3 - Elegir Editorial por Nombre");
            System.out.println("4 - Ingresar una nueva Editorial");
            System.out.println("5 - Salir sin hacer operación");
            op = Leer.nextInt();
            switch (op) {
                case 1:
                    listarEditorial();
                    break;
                case 2:
                    int eID = Leer.nextInt();
                    result = eD.buscaEditorial(eID);
                    if (result != null)
                        salir = false;
                    else
                        System.out.println("Editorial no encontrada!!!!");
                    break;    
                case 3:
                    String aNom = Leer.next();
                    result = eD.buscaEditorialN(aNom);
                    if (result != null)
                        salir = false;
                    else
                        System.out.println("Editorial no encontrada!!!!");
                    break;    
                case 4:
                    result = crearEditorN();
                    salir = false;
                    break;      
                 case 5:
                    salir = false;
                    break;    
            }
        } while (salir);
        return result;
    }
}
