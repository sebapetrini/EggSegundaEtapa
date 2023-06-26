/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * nombre, raza, edad y tamaño
 */
public class Perro
{

    String nombre;
    String raza;
    int edad;
    String tamanio;
    boolean adoptado;

    public Perro()
    {
    }

    public Perro(String nombre, String raza, int edad, String tamanio, boolean adoptado)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.adoptado = adoptado;
    }

    public boolean isAdoptado()
    {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado)
    {
        this.adoptado = adoptado;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getRaza()
    {
        return raza;
    }

    public void setRaza(String raza)
    {
        this.raza = raza;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getTamanio()
    {
        return tamanio;
    }

    public void setTamanio(String tamanio)
    {
        this.tamanio = tamanio;
    }

    @Override
    public String toString()
    {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + ", adoptado=" + adoptado + '}';
    }

}
