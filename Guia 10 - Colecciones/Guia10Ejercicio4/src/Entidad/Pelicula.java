

package Entidad;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Pelicula {
     private String titulo;
     private String director;
     private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String título, String director, Double duracion) {
        this.titulo = título;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTítulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setTítulo(String título) {
        this.titulo = título;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
      
}
