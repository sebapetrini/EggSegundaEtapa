/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Edificiodeoficinas;
import Entidades.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Pablo Barberis
 */
public class ServicioEdificio {

    public Polideportivo crearPoli() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ancho");
        int ancho = leer.nextInt();
        System.out.println("Ingrese el largo");
        int largo = leer.nextInt();
        System.out.println("Ingrese la altura");
        int altura = leer.nextInt();
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Tiene techo? S/N");
        String opc = leer.next();
        boolean techo = opc.equalsIgnoreCase("S");

        return new Polideportivo(nombre, techo, ancho, largo, altura);
    }

    public Edificiodeoficinas crearEdificio() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ancho");
        int ancho = leer.nextInt();
        System.out.println("Ingrese el largo");
        int largo = leer.nextInt();
        System.out.println("Ingrese la altura");
        int altura = leer.nextInt();

        System.out.println("Ingrese la cantidad de oficinas");
        int oficinas = leer.nextInt();
        System.out.println("Ingrese la cantidad de personas por oficina");
        int personas = leer.nextInt();
        System.out.println("Ingrese la cantidad de pisos");
        int pisos = leer.nextInt();
        return new Edificiodeoficinas(oficinas, personas, pisos, ancho, largo, altura);
    }

    public void cantPersonas(Edificiodeoficinas e1) {
        System.out.println("La cantidad de personas por oficina es: " + e1.getOficinas() * e1.getPersonas());
        System.out.println("La cantidad de personas en el edificio es: " + e1.getPersonas() * e1.getOficinas() * e1.getPisos());
    }
}
