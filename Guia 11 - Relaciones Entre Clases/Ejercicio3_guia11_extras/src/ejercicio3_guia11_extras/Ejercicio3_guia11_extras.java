/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia11_extras;

import ejercicio3_guia11_extras.Entidades.Poliza;
import ejercicio3_guia11_extras.Servicios.ClienteServicio;

/**
 *
 * @author Lautaro
 */
public class Ejercicio3_guia11_extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClienteServicio m1= new ClienteServicio();
        Poliza pablo = new Poliza();
        
        m1.crearPoliza();
        
    }
    
}
