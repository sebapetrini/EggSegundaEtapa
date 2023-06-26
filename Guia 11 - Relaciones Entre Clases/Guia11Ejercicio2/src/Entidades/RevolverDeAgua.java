

package Entidades;

/**
 *
 * @author Sebastián A. Petrini
 */

public class RevolverDeAgua {
    private Integer PosActual;
    private Integer PosAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer PosActual, Integer PosAgua) {
        this.PosActual = PosActual;
        this.PosAgua = PosAgua;
    }

    public Integer getPosActual() {
        return PosActual;
    }

    public Integer getPosAgua() {
        return PosAgua;
    }

    public void setPosActual(Integer PosActual) {
        this.PosActual = PosActual;
    }

    public void setPosAgua(Integer PosAgua) {
        this.PosAgua = PosAgua;
    }
    
    
}
