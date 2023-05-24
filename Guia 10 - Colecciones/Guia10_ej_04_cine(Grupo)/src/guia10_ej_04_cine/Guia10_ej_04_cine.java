package guia10_ej_04_cine;

import Entidades.Pelicula;
import Servicios.ServicioPelicula;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Pablo Barberis
 */
public class Guia10_ej_04_cine {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPelicula sP = new ServicioPelicula();
        ArrayList<Pelicula> pelis = new ArrayList<>();
        String opc;

        do {
            pelis.add(sP.crearPelicula());

            System.out.println("Desea ingresar otra pelicula? (s/n)");
            opc = leer.next();

        } while (opc.equalsIgnoreCase("s"));
        System.out.println("----------------------------");
        sP.mostrarPeliculas(pelis);
        System.out.println("----------------------------");
        sP.mayores1h(pelis);
        System.out.println("----------------------------");
        sP.ordenarMenorMayor(pelis);
        System.out.println("----------------------------");
        sP.ordenarMayorMenor(pelis);
        System.out.println("----------------------------");
        sP.ordenarTitulos(pelis);
        System.out.println("----------------------------");
        sP.ordenarDirector(pelis);

    }

}
