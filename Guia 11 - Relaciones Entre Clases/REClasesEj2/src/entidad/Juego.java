/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Axel
 */
public class Juego {

    //private Jugador jugador1;
    private ArrayList<Jugador> jugador= new ArrayList();
    private RevolverAgua ra=new RevolverAgua();

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugador, RevolverAgua ra) {
        this.jugador = jugador;
        this.ra = ra;
    }

    public List<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    public RevolverAgua getRa() {
        return ra;
    }

    public void setRa(RevolverAgua ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador=" + jugador + ", ra=" + ra + '}';
    }

    //llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
    //y el revolver para guardarlos en los atributos del juego.
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        
       // Jugador jugador1 = new Jugador();
        r.llenarRevolver();
        for (int i = 0; i < 6; i++) {
            Jugador jugador1 = new Jugador();
            jugador1.setId(i + 1);
            jugador1.setNombre("Jugador " + jugador1.getId());
            jugador1.setMojado(true);
            jugadores.add(jugador1);
            //System.out.println(jugador1.getNombre());
        }

    }
    //ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.

    public void ronda() {
        Jugador j1 = new Jugador();
       // ArrayList<Jugador> jugador = new ArrayList();
        llenarJuego(jugador, ra);
        Iterator it = jugador.iterator();
        do {
            j1=(Jugador) it.next();
            j1.disparo(ra, j1);
        } while (j1.isMojado());

    }
}
