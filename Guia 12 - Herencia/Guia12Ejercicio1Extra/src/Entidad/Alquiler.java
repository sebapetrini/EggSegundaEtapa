
package Entidad;

import java.util.Date;

/**
 * el nombre, documento del cliente, la fecha de alquiler, fecha de devolución,
 * la posición del amarre y el barco que lo ocupará.
 *
 */
public class Alquiler
{

    private String nombre;
    private int documento;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicion;
    private Barco barco;
    
    public Alquiler()
    {
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


}
