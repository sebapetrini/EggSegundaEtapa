/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Lancha;
import Entidades.Yate;
import java.util.Scanner;

/**
 *
 * @author Pablo Barberis
 * (Integer mastiles, Integer matricula, Double eslora, Integer año
 */
public class ServicioYate extends ServicioLancha{
    
    public Yate crearYate(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de camarotes");
        int camarotes = leer.nextInt();
                
        Lancha l1 = super.crearLancha();
        
        return new Yate(camarotes, l1.getPotencia(), l1.getMatricula(), l1.getEslora(), l1.getAño());
    }
    
}
