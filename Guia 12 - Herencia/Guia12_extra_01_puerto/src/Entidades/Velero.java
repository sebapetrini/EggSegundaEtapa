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
public class Velero extends Barco{
    private Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles, Integer matricula, Double eslora, Integer año) {
        super(matricula, eslora, año);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

}
