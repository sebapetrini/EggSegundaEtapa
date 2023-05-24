

package Entidad;

/**
 *
 * @author Sebastián A. Petrini
 */

public class NIF {

    private long DNI;
    private char NIF;

    public NIF() {
    }

    public NIF(long DNI, char NIF) {
        this.DNI = DNI;
        this.NIF = NIF;
    }

    public long getDNI() {
        return DNI;
    }

    public char getNIF() {
        return NIF;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setNIF(char NIF) {
        this.NIF = NIF;
    }
    
    
          
}
