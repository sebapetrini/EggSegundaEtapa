package guia12_extra_02_edificio;

import Entidades.Edificio;
import Entidades.Edificiodeoficinas;
import Entidades.Polideportivo;
import Servicio.ServicioEdificio;
import java.util.ArrayList;

/*
 * @author Pablo Barberis
 */
public class Guia12_extra_02_edificio {

    public static void main(String[] args) {

        ArrayList<Edificio> listaEdificio = new ArrayList<>();
        ServicioEdificio s = new ServicioEdificio();
        listaEdificio.add(s.crearEdificio());
        listaEdificio.add(s.crearEdificio());
        listaEdificio.add(s.crearPoli());
        listaEdificio.add(s.crearPoli());
        int cont = 0;
        for (Edificio edificio : listaEdificio) {
            if (edificio instanceof Polideportivo) {
                Polideportivo p = (Polideportivo) edificio;
                System.out.println("La superficie del edificio es : " + p.calcularSuperficie());
                System.out.println("El volumen del edificio es: " + p.calcularVolumen());
                if (p.isTechado()) {
                    cont++;
                }
            } else {
                Edificiodeoficinas e = (Edificiodeoficinas) edificio;
                System.out.println("La superficie del edificio es : " + e.calcularSuperficie());
                System.out.println("El volumen del edificio es: " + e.calcularVolumen());
                s.cantPersonas(e);
            }
        }
        System.out.println("La cantidad de polideportivos techados es: " + cont);
    }

}
