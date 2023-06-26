/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia11_extras.Entidades;

import java.util.ArrayList;

/**
 *
 * @author Lautaro
 */
public class Poliza {
    
    ArrayList<Cuota> cuota;
    ArrayList<Poliza> poliza = new ArrayList();
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Integer nroPoliza;
 //   private Integer fechaInicio;
 //   private Integer fechaFinal;
    private Integer cantCuotas;
    private String formaPago;
    private Double montoTotalAsegurado;
    private Boolean granizo;
    private Double montoGranizo;
    private String tipoCobertura;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, Integer nroPoliza, Integer cantCuotas, String formaPago, Double montoTotalAsegurado, Boolean granizo, Double montoGranizo, String tipoCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.nroPoliza = nroPoliza;
        this.cantCuotas = cantCuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Poliza(ArrayList<Cuota> cuota, Cliente cliente, Vehiculo vehiculo, Integer nroPoliza, Integer cantCuotas, String formaPago, Double montoTotalAsegurado, Boolean granizo, Double montoGranizo, String tipoCobertura) {
        this.cuota = cuota;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.nroPoliza = nroPoliza;
        this.cantCuotas = cantCuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    
    
    
    
    public ArrayList<Poliza> getPoliza() {
        return poliza;
    }

    public void setPoliza(ArrayList<Poliza> poliza) {
        this.poliza = poliza;
    }

    
    
    public ArrayList<Cuota> getCuota() {
        return cuota;
    }

    public void setCuota(ArrayList<Cuota> cuota) {
        this.cuota = cuota;
    }

    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(Integer nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public Double getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(Double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", nroPoliza=" + nroPoliza + ", cantCuotas=" + cantCuotas + ", formaPago=" + formaPago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }
    
    
    
    
}
