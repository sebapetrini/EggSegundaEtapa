/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. 
Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package entidad;

/**
 *
 * @author Axel
 */
public class RevolverAgua {

    private int posicionActual;
    private int posicionAgua;

    public RevolverAgua() {
    }

    public RevolverAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    //llenarRevolver(): le pone los valores de posición actual y de posición del agua. 
    //Los valores
    public void llenarRevolver() {
        posicionActual = (int) (Math.random() * 6 + 1);
        posicionAgua = (int) (Math.random() * 6 + 1);
        //System.out.println("ahora " + posicionActual + " " + posicionAgua);
        //System.out.println(mojar());
        //siguienteChorro();
       // System.out.println("suma 1: ");
       // System.out.println("despues " + posicionActual + " " + posicionAgua);
        //System.out.println(mojar());
    }

    //mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    //siguienteChorro(): cambia a la siguiente posición del tambor
    public int siguienteChorro() {
        if (posicionActual == 6) {
            return posicionActual = 1;
        } else {
            return posicionActual++;
        }

    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

}
