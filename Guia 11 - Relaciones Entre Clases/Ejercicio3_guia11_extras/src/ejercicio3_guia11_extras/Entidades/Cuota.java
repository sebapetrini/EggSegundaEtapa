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
public class Cuota {
    
    
    private Integer nroCuota;
    private Double montoTotalCuota;
    private Boolean pagado;
   // private Integer fechaVencimiento;
    private String formaPago;

    public Cuota() {
    }

    public Cuota(Integer nroCuota, Double montoTotalCuota, Boolean pagado, String formaPago) {
        this.nroCuota = nroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagado = pagado;
        this.formaPago = formaPago;
    }

    public Integer getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(Integer nroCuota) {
        this.nroCuota = nroCuota;
    }

    public Double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(Double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "nroCuota=" + nroCuota + ", montoTotalCuota=" + montoTotalCuota + ", pagado=" + pagado + ", formaPago=" + formaPago + '}';
    }
    
    
    
}
