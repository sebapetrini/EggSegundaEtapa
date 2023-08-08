/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas,
 * Cantidad de Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o
 * cinco estrellas. Las características de las distintas categorías son las
 * siguientes: • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad
 * de Pisos, Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio
 * de las Habitaciones. • Hotel ***** Cantidad de Habitaciones, Número de camas,
 * Cantidad de Pisos, Gimnasio, Nombre del Restaurante, Capacidad del
 * Restaurante, Cantidad Salones de Conferencia, Cantidad de Suites, Cantidad de
 * Limosinas, Precio de las Habitaciones.
 *
 * @author Pablo Barberis
 */
public class Hotel extends Alojamiento {

    private int habitaciones;
    private int camas;
    private int pisos;
    private int precio;

    public Hotel() {
    }

    public Hotel(int habitaciones, int camas, int pisos, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precio = precio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }


}
