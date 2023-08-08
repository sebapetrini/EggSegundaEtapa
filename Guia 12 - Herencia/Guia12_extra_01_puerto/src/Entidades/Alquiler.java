/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Pablo Barberis Para cada Alquiler se guarda: el nombre, documento del
 * cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y
 * el barco que lo ocupará.
 */
public class Alquiler {

    private String nombre;
    private Integer dni;
    private LocalDate ingreso;
    private LocalDate egreso;
    private Integer posicion;
    private Barco barco;
    private Double precio;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer dni, LocalDate ingreso, LocalDate egreso, Integer posicion, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }

    public void setIngreso(int anio, int mes, int dia) {
        this.ingreso = LocalDate.of(anio, mes, dia);
    }

    public LocalDate getEgreso() {
        return egreso;
    }

    public void setEgreso(int anio, int mes, int dia) {
        this.egreso = LocalDate.of(anio, mes, dia);
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setearPrecio(Double precio) {
        
        double precioEslora = this.barco.eslora * 10;
        double diferenciaDias = (double) ChronoUnit.DAYS.between(getEgreso(), getIngreso());
        precio = precioEslora * diferenciaDias;        
        this.precio = precio;        
    }   
}
