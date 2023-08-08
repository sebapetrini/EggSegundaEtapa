/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cliente;
import Entidades.Libro;
import Entidades.Prestamo;
import Persistencia.LibroDAO;
import Persistencia.PrestamoDAO;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pablo Barberis
 */
public class PrestamoService {

    Scanner leer;
    ClienteService cS;
    LibroService lS;
    LibroDAO lD;
    PrestamoDAO pD;

    public PrestamoService() {
        leer = new Scanner(System.in).useDelimiter("\n");
        cS = new ClienteService();
        lS = new LibroService();
        lD = new LibroDAO();
        pD = new PrestamoDAO();
    }

    public void crearPrestamo() {
        Cliente c1 = cS.crearCliente();
        lS.listarLibro();
        System.out.println("Ingrese el nombre del libro a recibir");
        String nombre = leer.next();
        Libro busq = lD.buscarLibro(nombre);
        if (busq.getEjemplaresRestantes() == 0) {
            System.out.println("El libro solicitado no tiene ejemplares disponibles");
        } else {
            Prestamo p1 = new Prestamo(new Date(), null, busq, c1);
            pD.guardarPrestamo(p1);
            lD.prestarLibro(busq);
        }
    }

    public void crearPrestamoClienteRegistrado(Cliente cliente) {
        lS.listarLibro();
        System.out.println("Ingrese el nombre del libro a recibir");
        String nombre = leer.next();
        Libro busq = lD.buscarLibro(nombre);
        if (busq.getEjemplaresRestantes() == 0) {
            System.out.println("El libro solicitado no tiene ejemplares disponibles");
        } else {
            Prestamo p1 = new Prestamo(new Date(), null, busq, cliente);
            pD.guardarPrestamo(p1);
            lD.prestarLibro(busq);
        }
    }

    public void devolucion() {
        Cliente busq = cS.buscarClienteporDni();
        List<Prestamo> listaPrestamos = pD.buscarPrestamo(busq);
        System.out.println("LIBROS DISPONIBLES PARA DEVOLVER:");

        for (Prestamo Prestamo : listaPrestamos) {
            System.out.println(Prestamo.getLibro().getTitulo());
        }

        System.out.println("Ingrese el libro que quiere devolver");
        String libro = leer.next();
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getLibro().getTitulo().equalsIgnoreCase(libro)) {
                prestamo.setFechaDevolucion(new Date());
                
                prestamo.getLibro().setEjemplaresPrestados(prestamo.getLibro().getEjemplaresPrestados() - 1);
                prestamo.getLibro().setEjemplaresRestantes(prestamo.getLibro().getEjemplaresRestantes() + 1);
                pD.reemplazarPrestamo(prestamo);
            } else {
                System.out.println("No se encuentra el libro");
            }
        }
    }

    public void modificarPrestamo() {
        Cliente c1 = cS.buscarClienteporDni();
        List<Prestamo> listaPrestamo = pD.buscarPrestamo(c1);
        System.out.println("LISTA DE PRESTAMOS DEL CLIENTE " + c1.getNombre() + ", " + c1.getApellido());
        System.out.println("");
        System.out.println("INGRESE EL NOMBRE DEL LIBRO QUE DESA MODIFICAR");
        String nombre = leer.next();
        for (Prestamo prestamo : listaPrestamo) {
            if (prestamo.getLibro().getTitulo().equalsIgnoreCase(nombre)) {

            }
        }
        System.out.println("Ingrese el libro que");
    }

    public void verPrestamosPorCliente(Cliente cliente) {

        List<Prestamo> listaPrestamo = pD.buscarPrestamo(cliente);
        System.out.println("PRESTAMOS DE: " + cliente.getNombre());
        for (Prestamo prestamo : listaPrestamo) {
            System.out.println("Libro: " + prestamo.getLibro().getTitulo() + " Fecha de alquiler: " + prestamo.getFechaPrestamo());
        }
    }

    public void listarPrestamos() {

        List<Prestamo> listaPrestamo = pD.listarPrestamos();

        for (Prestamo prestamo : listaPrestamo) {
            System.out.println("Nombre Cliente: " + prestamo.getCliente().getNombre() + " " + prestamo.getCliente().getApellido() 
                    + "Libro: " + prestamo.getLibro() + " Fecha de alquiler: " + prestamo.getFechaPrestamo() 
                    + "Fecha devolucion: " + prestamo.getFechaDevolucion());
        }
    }

    public void menuPrestamo() {
        int opc;
        do {
            System.out.println("Ingrese la opcion deseada");
            System.out.println("");
            System.out.println("1- Ingresar nuevo cliente");
            System.out.println("2- Nuevo prestamo");
            System.out.println("3- Devolucion");
            System.out.println("4- Modificar prestamo");
            System.out.println("5- Ver libros disponibles");
            System.out.println("6- Ver prestamos por clientes");
            System.out.println("7- Mostrar todos los prestamos");
            System.out.println("0- Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    cS.crearCliente();
                    break;
                case 2:
                    System.out.println("Esta registrado en el sistema? S/N");
                    String reg = leer.next();
                    if (reg.equalsIgnoreCase("S")) {
                        Cliente busq = cS.buscarClienteporDni();
                        crearPrestamoClienteRegistrado(busq);
                    }
                    if (reg.equalsIgnoreCase("N")) {
                        crearPrestamo();
                    }
                    break;
                case 3:
                    devolucion();
                    break;
                case 4:
                    System.out.println("ESTE METODO NO EXISTE :)");
                    break;
                case 5:
                    lS.listarLibrosDisponibles();
                    break;
                case 6:
                    Cliente c1 = cS.buscarClienteporDni();
                    verPrestamosPorCliente(c1);
                    break;
                case 7:
                    listarPrestamos();
                default:
                    System.out.println("ADIOS!");
            }
        } while (opc != 0);

    }

}
