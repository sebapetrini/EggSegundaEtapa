/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Salvador Caldarella
 */
public class Tienda {
    
    private String producto;
    private double precio;

    public Tienda() {
    }

    public Tienda(String nombre, double precio) {
        this.producto = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return producto;
    }

    public void setNombre(String nombre) {
        this.producto = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto=" + producto + ", Precio=" + precio;
    }
    
}
