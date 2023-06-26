/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12_ej1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author CDRCONS02
 */
public class G12_Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich", "carnivoro", 15, "Doberman");
        perro1.alimentarse();

        Animal perro2 = new Perro("Teddy", "croquetas", 18, "Chihuahua");
        perro2.alimentarse();

        Animal gato1 = new Gato("Pelusa", "galetas", 15, "Siames");
        gato1.alimentarse();

        Animal caballo1 = new Caballo("Spark", "pasto", 25, "Fino");
        caballo1.alimentarse();

    }

}
