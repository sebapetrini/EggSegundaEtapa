/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pablo Barberis
 */
public class Lancha extends Barco{
    private Integer potencia;

    public Lancha() {
    }

    public Lancha(Integer potencia, Integer matricula, Double eslora, Integer año) {
        super(matricula, eslora, año);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

}
