/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Barco;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Pablo Barberis
 */
public class ServicioBarco {

    public Barco crearBarco() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la matricula");
        int matricula = leer.nextInt();
        System.out.println("Ingrese la eslora en metros");
        double eslora = leer.nextDouble();
        System.out.println("Ingrese el año del barco");
        int anio=leer.nextInt();
        
        return new Barco(matricula, eslora, anio);

    }
    
     public void setearPrecio(Double precio) {
        
        double precioEslora = this.barco.eslora * 10;
        double diferenciaDias = (double) ChronoUnit.DAYS.between(getEgreso(), getIngreso());
        precio = precioEslora * diferenciaDias;        
        this.precio = precio;        
    }  

}
