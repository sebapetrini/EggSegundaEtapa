/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Barco;
import Entidades.Lancha;
import java.util.Scanner;

/**
 *
 * @author Pablo Barberis
 */
public class ServicioLancha extends ServicioBarco {

    public Lancha crearLancha() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los CV");
        int potencia = leer.nextInt();
        Barco b1 = super.crearBarco();

        return new Lancha(potencia, b1.getMatricula(), b1.getEslora(), b1.getAño());

    }

}
