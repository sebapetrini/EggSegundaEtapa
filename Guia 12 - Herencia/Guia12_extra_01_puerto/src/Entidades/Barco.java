/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pablo Barberis
 * su matrícula, su eslora en metros y año de fabricación.
 */
public class Barco{
    protected Integer matricula;
    protected Double eslora;
    protected Integer año;

    public Barco() {
    }

    public Barco(Integer matricula, Double eslora, Integer año) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año = año;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }
    

}
