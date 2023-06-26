

package Entidades;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Lavadora extends Electrodomestico{
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, char consumoenerg, Double peso) {
        super(precio, color, consumoenerg, peso);
        this.carga = carga;
    }
    
    public Lavadora(Electrodomestico electro, int carga) {       
        this.precio = electro.precio;
        this.color = electro.color;
        this.consumoenerg = electro.consumoenerg;
        this.peso = electro.peso;
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    
}
