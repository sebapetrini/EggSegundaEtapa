/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 * el nombre, documento del cliente, la fecha de alquiler, fecha de devolución,
 * la posición del amarre y el barco que lo ocupará.
 *
 * @author Ayrton
 */
public class Alquiler
{

    private String nombre;
    private int documento;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicion;
    private Barco barco;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getDocumento()
    {
        return documento;
    }

    public void setDocumento(int documento)
    {
        this.documento = documento;
    }

    public Date getFechaAlquiler()
    {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler)
    {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion()
    {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion)
    {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicion()
    {
        return posicion;
    }

    public void setPosicion(int posicion)
    {
        this.posicion = posicion;
    }

    public Barco getBarco()
    {
        return barco;
    }

    public void setBarco(Barco barco)
    {
        this.barco = barco;
    }

    public Alquiler(String nombre, int documento, Date fechaAlquiler, Date fechaDevolucion, int posicion, Barco barco)
    {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicion = posicion;
        this.barco = barco;
    }

    public Alquiler()
    {
    }

    @Override
    public String toString()
    {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicion=" + posicion + ", barco=" + barco + '}';
    }

}
