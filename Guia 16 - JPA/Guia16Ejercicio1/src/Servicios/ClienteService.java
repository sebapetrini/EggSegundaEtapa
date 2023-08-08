

package Servicios;

import Entidades.Cliente;
import Persistencia.ClienteDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class ClienteService {
    Scanner Leer;
    ClienteDAO cD;
    
    public ClienteService() {
        Leer = new Scanner(System.in).useDelimiter("\n"); 
        cD = new ClienteDAO();
    }
    
    public void crearCliente(){
        System.out.print("Ingrese el Documento del Cliente: ");
        Long doc = Leer.nextLong();
        System.out.print("Ingrese el Nombre del Cliente: ");
        String nombre = Leer.next();
        System.out.print("Ingrese el Apellido del Cliente: ");
        String apellido = Leer.next();
        System.out.print("Ingrese el Telefono del Cliente: ");
        String tel = Leer.next();
        cD.guardarCliente(new Cliente(doc,nombre,apellido,tel));
    }
    
    public Cliente crearClienteNuevo(){
        System.out.print("Ingrese el Documento del Cliente: ");
        Long doc = Leer.nextLong();
        System.out.print("Ingrese el Nombre del Cliente: ");
        String nombre = Leer.next();
        System.out.print("Ingrese el Apellido del Cliente: ");
        String apellido = Leer.next();
        System.out.print("Ingrese el Telefono del Cliente: ");
        String tel = Leer.next();
        Cliente result = new Cliente(doc,nombre,apellido,tel);
        cD.guardarCliente(result);
        return result;
    }
    
    public void listarCliente(){
        System.out.println("-------------Lista de Clientes-----------------");
        
        List<Cliente> lc = cD.listarCliente();
        for (Cliente c : lc) {
            System.out.println("ID: " + c.getId() +"Documento: " + c.getDocumento() + "    Nombre: " + c.getNombre() +  "    Apellido: " + c.getApellido() +  "    Telefono: " + c.getTelefono() );
        }   
    }
    
    public void listarCienteNombre(){
        System.out.print("Ingrese el Nombre del Cliente: ");
        String cNom = Leer.next();
        System.out.print("Ingrese el Apellido del Cliente: ");
        String cApe = Leer.next();
        Cliente c = cD.buscaClienteN(cNom, cApe);
        System.out.println("Cliente Encontrado:");
        System.out.println("ID: " + c.getId() +"Documento: " + c.getDocumento() + "    Nombre: " + c.getNombre() +  "    Apellido: " + c.getApellido() +  "    Telefono: " + c.getTelefono() );
    }
  
    
    public Cliente menuCliente(){
        Cliente result = null;
        boolean salir = true;
        int op;
        do {
            System.out.println("Elija la opción: ");
            System.out.println("1 - Listar Clientes");
            System.out.println("2 - Elegir Cliente por ID");
            System.out.println("3 - Elegir Cliente por Nombre");
            System.out.println("4 - Ingresar un nuevo Cliente");
            System.out.println("5 - Elegir Cliente por Documento");
            System.out.println("0 - Salir sin hacer operación");
            op = Leer.nextInt();
            switch (op) {
                case 1:
                    listarCliente();
                    break;
                case 2:
                    int cID = Leer.nextInt();
                    result = cD.buscaCliente(cID);
                    if (result != null)
                        salir = false;
                    else
                        System.out.println("Cliente no encontrado!!!!");
                    break;    
                case 3:
                    System.out.print("Ingrese el nombre del Cliente: ");
                    String cNom = Leer.next();
                    System.out.print("Ingrese el Apellido del Cliente: ");
                    String cApe = Leer.next();
                    result = cD.buscaClienteN(cNom, cApe);
                    if (result != null)
                        salir = false;
                    else
                        System.out.println("Cliente no encontrado!!!!");
                    break;    
                case 4:
                    result = crearClienteNuevo();
                    salir = false;
                    break;      
                case 5:
                    Long cDoc = Leer.nextLong();
                    result = cD.buscaClienteDoc(cDoc);
                    if (result != null)
                        salir = false;
                    else
                        System.out.println("Cliente no encontrado!!!!");
                    break; 
                case 0:
                    salir = false;
                    break;    
            }
        } while (salir);
        return result;
    }
    
}
