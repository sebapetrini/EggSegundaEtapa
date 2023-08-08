/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cliente;
import Persistencia.ClienteDAO;
import java.util.Scanner;

/**
 *
 * @author Pablo Barberis
 */
public class ClienteService {

    Scanner leer;
    ClienteDAO cD;

    public ClienteService() {
        leer = new Scanner(System.in).useDelimiter("\n");
        cD = new ClienteDAO();
    }

    public Cliente crearCliente() {

        System.out.println("Ingrese el DNI del cliente");
        Long documento = leer.nextLong();
        System.out.println("Ingrese el nombre del cliente");
        String nombre = leer.next();
        System.out.println("Ingrese el apellido del cliente");
        String apellido = leer.next();
        System.out.println("Ingrese el numero de telefono del cliente");
        String telefono = leer.next();
        Cliente c1 = new Cliente(documento, nombre, apellido, telefono);
        cD.guardarCliente(c1);
        return c1;
    }

    public Cliente buscarClienteporDni() {
        System.out.println("Ingrese el Dni del Cliente");
        Long documento = leer.nextLong();
        Cliente c1 = cD.buscarClienteDNI(documento);
//        System.out.println("ID: " + c1.getId());
//        System.out.println("DNI: " + c1.getDocumento());
//        System.out.println("NOMBRE: " + c1.getNombre());
//        System.out.println("APELLIDO: " + c1.getApellido());
//        System.out.println("TEL: " + c1.getTelefono());
        return c1;
    }

}
