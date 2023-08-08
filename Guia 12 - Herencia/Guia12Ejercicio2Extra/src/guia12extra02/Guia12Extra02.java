/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12extra02;

import Entidad.Edificio;
import Entidad.EdificiodeOficinas;
import Entidad.PoliDeportivo;
import java.util.ArrayList;

/**
 *
 * @author Ayrton
 */
public class Guia12Extra02
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<Edificio> lista = new ArrayList();
        PoliDeportivo p = new PoliDeportivo();
        EdificiodeOficinas eO = new EdificiodeOficinas();

        lista.add(p.crearEdificio());
        lista.add(p.crearEdificio());
        lista.add(eO.crearEdificio());
        lista.add(eO.crearEdificio());

        int techados = 0;
        int abiertos = 0;

        for (Edificio edificio : lista)
        {
            if (edificio instanceof PoliDeportivo)
            {
                PoliDeportivo aux = (PoliDeportivo) edificio;
                System.out.println("La superficie es: " + aux.calcularSuperficie());
                System.out.println("El volumen es: " + aux.calcularVolumen());
                if (aux.isTechado())
                {
                    techados++;
                } else
                {

                    abiertos++;
                }

            } else
            {
                EdificiodeOficinas aux = (EdificiodeOficinas) edificio;
                System.out.println("La superficie es: " + aux.calcularSuperficie());
                System.out.println("El volumen es: " + aux.calcularVolumen());
                aux.cantidadPersonas();

            }
        }

        System.out.println("Hay " + techados + " polideportivos techados y " + abiertos + " abiertos");

    }

}
