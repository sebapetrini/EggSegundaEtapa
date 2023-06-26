/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import Enumeraciones.Palo;
import java.util.ArrayList;

/**
 *
 * @author Ayrton
 */
public class Carta
{

    private Integer numero;
    private Palo palo;
    private boolean enMazo;
    ArrayList<Carta> listaCarta = new ArrayList();

    //si es new Array List no se agrega al constructor para crear
    public Carta()
    {
    }

    public Carta(Integer numero, Palo palo, boolean enMazo)
    {
        this.numero = numero;
        this.palo = palo;
        this.enMazo = enMazo == true;

    }

    public Integer getNumero()
    {
        return numero;
    }

    public void setNumero(Integer numero)
    {
        this.numero = numero;
    }

    public Palo getPalo()
    {
        return palo;
    }

    public void setPalo(Palo palo)
    {
        this.palo = palo;
    }

    public boolean isEnMazo()
    {
        return enMazo;
    }

    public void setEnMazo(boolean enMazo)
    {
        this.enMazo = enMazo;
    }

    public ArrayList<Carta> getListaCarta()
    {
        return listaCarta;
    }

    public void setListaCarta(ArrayList<Carta> listaCarta)
    {
        this.listaCarta = listaCarta;
    }

    @Override
    public String toString()
    {
        return numero + " " + palo;
    }

}
