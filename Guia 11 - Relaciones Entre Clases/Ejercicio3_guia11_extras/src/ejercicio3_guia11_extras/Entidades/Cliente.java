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
public class Cliente {
    
    private String nombre;
 //   private String apellido;
 //   private Integer dni;
 //   private String mail;
    private String domicilio;
 //  private Integer telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", domicilio=" + domicilio + '}';
    }
    
    
}
