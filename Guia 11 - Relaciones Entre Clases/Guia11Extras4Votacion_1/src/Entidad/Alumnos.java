
package Entidad;


public class Alumnos {
    private String nombreCompleto;
    private int dni;
    private Integer cantidadVotos=0;

    public Alumnos() {
    }

    public Alumnos(String nombreCompleto, int dni, Integer cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", cantidadVotos=" + cantidadVotos + '}';
    }

    
    
}
