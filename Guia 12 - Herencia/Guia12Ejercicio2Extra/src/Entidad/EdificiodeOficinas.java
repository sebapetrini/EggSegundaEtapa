/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Servicios.edificioServicios;

/**
 *
 * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y número de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre.
 *
 * @author Ayrton
 */
public class EdificiodeOficinas extends Edificio implements edificioServicios
{

    protected int numeroOficinas;
    protected int personasPorOficina;
    protected int pisos;

    public EdificiodeOficinas()
    {
    }

    public EdificiodeOficinas(int numeroOficinas, int personasPorOficina, int pisos, double ancho, double alto, double largo)
    {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.pisos = pisos;
    }

    public int getNumeroOficinas()
    {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas)
    {
        this.numeroOficinas = numeroOficinas;
    }

    public int getPersonasPorOficina()
    {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina)
    {
        this.personasPorOficina = personasPorOficina;
    }

    public int getPisos()
    {
        return pisos;
    }

    public void setPisos(int pisos)
    {
        this.pisos = pisos;
    }

    public void cantidadPersonas()
    {
        int personaPorPiso = numeroOficinas * personasPorOficina;
        System.out.println("La cantidad de personas por piso es: " + personaPorPiso);
        System.out.println("Cantidad total de personas en el edificio: " + personaPorPiso * pisos);

    }

    @Override
    public double calcularSuperficie()
    {
        return super.getAncho() * super.getLargo() * pisos; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularVolumen()
    {
        return calcularSuperficie() * super.getAlto() * pisos; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edificio crearEdificio()
    {
        System.out.println("Oficinas: ");
        super.crearEdificio();
        System.out.println("Cuantos pisos tiene el edificio? ");
        pisos = leer.nextInt();
        System.out.println("Cuantas oficinas hay por piso? ");
        numeroOficinas = leer.nextInt();
        System.out.println("Cuantas personas hay por oficina? ");
        personasPorOficina = leer.nextInt();

        return new EdificiodeOficinas(numeroOficinas, personasPorOficina, pisos, super.ancho, super.alto, super.largo); //To change body of generated methods, choose Tools | Templates.
    }

}
