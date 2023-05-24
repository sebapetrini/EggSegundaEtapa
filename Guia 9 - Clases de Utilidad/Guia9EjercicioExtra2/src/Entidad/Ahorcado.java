

package Entidad;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Ahorcado {
    private String[] palabra;
    private int cantLetrasEnc;
    private int cantInt;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetrasEnc, int cantInt) {
        this.palabra = palabra;
        this.cantLetrasEnc = cantLetrasEnc;
        this.cantInt = cantInt;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getCantLetrasEnc() {
        return cantLetrasEnc;
    }

    public int getCantInt() {
        return cantInt;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setCantLetrasEnc(int cantLetrasEnc) {
        this.cantLetrasEnc = cantLetrasEnc;
    }

    public void setCantInt(int cantInt) {
        this.cantInt = cantInt;
    }
    
    
}
