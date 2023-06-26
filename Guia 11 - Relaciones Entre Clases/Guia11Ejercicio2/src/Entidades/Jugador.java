

package Entidades;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Jugador {
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mojado = true;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    
}
