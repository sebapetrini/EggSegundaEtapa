

package Servicio;

/**
 *
 * @author Sebastián A. Petrini
 */

public class CadenaServicio {
    private String frase;
    private int largo;

    public CadenaServicio() {
    }

    public CadenaServicio(String frase) {
        this.frase = frase;
        this.largo = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public int getLargo() {
        return largo;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.largo = frase.length();
    }

  //  public void setLargo(int largo) {
  //      this.largo = largo;
  //  }
    
    
}
