/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.Barco;
import Entidades.Velero;
import java.util.Scanner;

/**
 *
 * (Integer mastiles, Integer matricula, Double eslora, Integer año
 */
public class ServicioVelero extends ServicioBarco{
 
    public Velero crearVelero(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el numero de mastiles");
        int mastiles= leer.nextInt();
        
        Barco b1 = super.crearBarco();
        
        return new Velero(mastiles, b1.getMatricula(), b1.getEslora(), b1.getAño());
    }

}
