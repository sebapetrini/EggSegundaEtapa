

package Entidad;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Meses {
    private String[] Mes = new String[12];
    private String mesSecreto;

    public Meses() {
        Mes[0] = "enero";
        Mes[1] = "febrero";
        Mes[2] = "marzo";
        Mes[3] = "abril";
        Mes[4] = "mayo";
        Mes[5] = "junio";
        Mes[6] = "julio";
        Mes[7] = "agosto";
        Mes[8] = "septiembre";
        Mes[9] = "octubre";
        Mes[10] = "noviembre";
        Mes[11] = "diciembre";
        mesSecreto = Mes[(int) (Math.random() * 12)];
    }

    public String[] getMes() {
        return Mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMes(String[] Mes) {
        this.Mes = Mes;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
}
