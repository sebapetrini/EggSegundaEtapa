
package Entidad;

import java.util.ArrayList;
import java.util.HashSet;


public class Voto {
   private Alumnos alumnos;
   private HashSet<Alumnos> ListaVotados;

    public Voto() {
    }

    public Voto(Alumnos alumnos, HashSet<Alumnos> ListaVotados) {
        this.alumnos = alumnos;
        this.ListaVotados = ListaVotados;
    }

    public Alumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }

    public HashSet<Alumnos> getListaVotados() {
        return ListaVotados;
    }

    public void setListaVotados(HashSet<Alumnos> ListaVotados) {
        this.ListaVotados = ListaVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnos=" + alumnos + ", ListaVotados=" + ListaVotados + '}';
    }

     
}
