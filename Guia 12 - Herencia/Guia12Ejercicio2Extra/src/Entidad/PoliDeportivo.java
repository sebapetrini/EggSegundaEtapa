/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Servicios.edificioServicios;

/**
 *
 * Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado
 * o Abierto, esta clase implementará los dos métodos abstractos y los atributos
 * del padre.
 *
 * @author Ayrton
 */
public class PoliDeportivo extends Edificio implements edificioServicios
{

    protected String nombre;
    protected boolean techado;

    public PoliDeportivo()
    {
    }

    public PoliDeportivo(String nombre, boolean techado, double ancho, double alto, double largo)
    {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public boolean isTechado()
    {
        return techado;
    }

    public void setTechado(boolean techado)
    {
        this.techado = techado;
    }

    @Override
    public double calcularSuperficie()
    {
        return super.getAncho() * super.getLargo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularVolumen()
    {
        double superficie = calcularSuperficie();

        return superficie * super.getAlto();  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edificio crearEdificio()
    {
        System.out.println("Polideportivo: ");
        super.crearEdificio();
        System.out.println("Ingrese el nombre del polideportivo: ");
        nombre = leer.next();
        System.out.println("Esta techado? ");
        String opcion;
        do
        {
            opcion = leer.next().substring(0, 1);

        } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));

        techado = opcion.equalsIgnoreCase("s");

        return new PoliDeportivo(nombre, techado, super.ancho, super.alto, super.largo); //To change body of generated methods, choose Tools | Templates.
    }

}
