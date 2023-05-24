/*

 * Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
 * van a ser nombre y nota (representando la nota obtenida en el final).
 *
 * La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los
 * 8 estudiantes con sus respectivas notas.
 */
package Entidades;

/**
 *
 * 
 */

public class Estudiante {
    private String nombre;
    private double nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }      
}
