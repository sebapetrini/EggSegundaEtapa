
package guia11extras4votacion;

import Entidad.Alumnos;
import Entidad.Voto;
import Servicios.Simulador;
import java.util.ArrayList;
import java.util.HashSet;


public class Guia11Extras4Votacion {

   
    public static void main(String[] args) {
       Simulador votacion= new Simulador();
       ArrayList<String> nombreCompleto = new ArrayList<>();
       ArrayList<Integer> dni= new ArrayList<>();
       ArrayList<Alumnos> listaAlumnos = new ArrayList<>();
       HashSet<Voto> ListaVotados = new HashSet<>();
      
       
       votacion.crearNombres(nombreCompleto);
       votacion.crearDni(dni);
       listaAlumnos =votacion.listaAlumnos(nombreCompleto, dni);
       ListaVotados=votacion.ListaVotados(listaAlumnos);
       votacion.mostrarAlumnosVotados(ListaVotados);
       votacion.recuentoVotos(listaAlumnos);
       votacion.crearFacilitadores(listaAlumnos);
    }
    
}
