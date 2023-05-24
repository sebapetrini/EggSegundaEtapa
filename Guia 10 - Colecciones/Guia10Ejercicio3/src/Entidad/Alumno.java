

package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Alumno {
    private String nombre;
    private ArrayList<Double> nota;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Double> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Double> getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(ArrayList<Double> nota) {
        this.nota = nota;
    }

    
    
}
