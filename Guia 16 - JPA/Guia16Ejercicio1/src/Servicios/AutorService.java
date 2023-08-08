

package Servicios;

import Entidades.Autor;
import Persistencia.AutorDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class AutorService {
    Scanner Leer;
    AutorDAO aD;

    public AutorService() {
        Leer = new Scanner(System.in).useDelimiter("\n"); 
        aD = new AutorDAO();
    }
    
    public void crearAutor(){
        System.out.print("Ingrese el nombre del Autor: ");
        String autor = Leer.next();
        String op;
        do {
            System.out.print("El autor esta de alta (S/N): ");
            op = Leer.next().toUpperCase().substring(0, 1);
        } while (!( op.equals("S") || op.equals("N")));       
        aD.guardarAutor(new Autor(autor, op.equals("S")));
    }
    
    public Autor crearAutorNuevo(){
        System.out.print("Ingrese el nombre del Autor: ");
        String autor = Leer.next();
        String op;
        do {
            System.out.print("El autor esta de alta (S/N): ");
            op = Leer.next().toUpperCase().substring(0, 1);
        } while (!( op.equals("S") || op.equals("N")));  
        Autor result = new Autor(autor, op.equals("S"));
        aD.guardarAutor(result);
        return result;
    }
    
    public void listarAutor(){
        System.out.println("-------------Lista de Autores-----------------");
        
        List<Autor> la = aD.listarAutor();
        for (Autor e : la) {
            System.out.println("ID: " + e.getId() + "    Nombre: " + e.getNombre());
        }   
    }
    
    public void listarAutorNombre(){
        System.out.print("Ingrese el nombre del Autor: ");
        String aNom = Leer.next();
        Autor result = aD.buscaAutorN(aNom);
        System.out.println("Autor Encontrado:");
        System.out.println("ID: " + result.getId() + " Nombre: " + result.getNombre() + " Alta: " + result.getAlta());
    }
  
    
    public Autor menuAutor(){
        Autor result = null;
        boolean salir = true;
        int op;
        do {
            System.out.println("Elija la opción: ");
            System.out.println("1 - Listar Autores");
            System.out.println("2 - Elegir Autor por ID");
            System.out.println("3 - Elegir Autor por Nombre");
            System.out.println("4 - Ingresar un nuevo Autor");
            System.out.println("5 - Salir sin hacer operación");
            op = Leer.nextInt();
            switch (op) {
                case 1:
                    listarAutor();
                    break;
                case 2:
                    int aID = Leer.nextInt();
                    result = aD.buscaAutor(aID);
                    if (result != null)
                        salir = false;
                    else
                        System.out.println("Autor no encontrado!!!!");
                    break;    
                case 3:
                    System.out.print("Ingrese el nombre del Autor: ");
                    String aNom = Leer.next();
                    result = aD.buscaAutorN(aNom);
                    if (result != null)
                        salir = false;
                    else
                        System.out.println("Autor no encontrado!!!!");
                    break;    
                case 4:
                    result = crearAutorNuevo();
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
