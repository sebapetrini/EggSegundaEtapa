

package Entidades;

/**
 *

 
 * @author Sebastián A. Petrini
 */

public class Electrodomestico {
    
    protected Double precio;
    protected String color;
    protected char consumoenerg; 
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoenerg, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoenerg = consumoenerg;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoenerg() {
        return consumoenerg;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoenerg(char consumoenerg) {
        this.consumoenerg = consumoenerg;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    
}
