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
public final class Yate extends Lancha{
    
    private Integer camarotes;
    
    public Yate() {
    }
    
    public Yate(Integer camarotes, Integer potencia, Integer matricula, Double eslora, Integer año) {
        super(potencia, matricula, eslora, año);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    
    
}
