/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.Lancha;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Pablo Barberis Para cada Alquiler se guarda: el nombre, documento del
 * cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y
 * el barco que lo ocupará.
 */
public class ServicioAlquiler {

    public Alquiler nuevoAlquiler() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Alquiler a1 = new Alquiler();
        System.out.println("Que tipo de Barco quiere amarrar?");
        System.out.println("1- Velero");
        System.out.println("2- Lancha");
        System.out.println("3- Yate");
        int opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                ServicioVelero sVelero = new ServicioVelero();
                Velero v1 = sVelero.crearVelero();
                int mastiles = v1.getMastiles();
                a1.setBarco(v1);
                
                break;
            case 2:
                ServicioLancha sLancha = new ServicioLancha();
                
                a1.setBarco(sLancha.crearLancha());
                break;
            case 3:
                ServicioYate sYate = new ServicioYate();
                
                a1.setBarco(sYate.crearYate());
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("Ingrese el nombre del dueño");
        a1.setNombre(leer.next());
        System.out.println("Ingrese el DNI");
        a1.setDni(leer.nextInt());
        System.out.println("ingrese la fecha de ingreso, dia, mes y año");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        
        a1.setIngreso(anio, mes, dia);
        System.out.println("Ingrese la fecha de egreso, dia, mes y año");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();

        a1.setEgreso(anio, mes, dia);
        System.out.println("Ingrese la posicion de amarre");
        
        a1.setPosicion(leer.nextInt());
        a1.getBarco().
        
        return a1;

    }

}
