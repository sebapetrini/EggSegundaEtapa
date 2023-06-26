/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia11_extras.Entidades;

/**
 *
 * @author Lautaro
 */
public class Vehiculo {
    
    private String tipo;
    private String marca;
    private String color;

    public Vehiculo(String tipo, String marca, String color) {
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
    }

    public Vehiculo() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "tipo=" + tipo + ", marca=" + marca + ", color=" + color + '}';
    }
    
    
    }
    

