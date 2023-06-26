

package Entidades;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Televisor extends Electrodomestico {
    private Integer resolucion;
    private Boolean TDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean TDT, Double precio, String color, char consumoenerg, Double peso) {
        super(precio, color, consumoenerg, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }
    
    public Televisor(Electrodomestico electro,Integer resolucion, Boolean TDT) {
        this.precio = electro.precio;
        this.color = electro.color;
        this.consumoenerg = electro.consumoenerg;
        this.peso = electro.peso;
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    
}
