/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
un vector con la palabra a buscar, la cantidad de letras encontradas 
y la cantidad jugadas máximas que puede realizar el usuario.
 */

package ejercicio2extraguia9encuentros25a32.Entidades;

/**
 *
 *author Alveiro Izarra
 */
public class Ahorcado {
   
    private String[]vecPalabra;
    private int cantidadLetrasEncontradas;
    private int cantidadJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] vecPalabra, int cantidadLetrasEncontradas, int cantidadJugadasMaximas) {
        this.vecPalabra = vecPalabra;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public String[] getVecPalabra() {
        return vecPalabra;
    }

    public void setVecPalabra(String[] vecPalabra) {
        this.vecPalabra = vecPalabra;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    
    

}