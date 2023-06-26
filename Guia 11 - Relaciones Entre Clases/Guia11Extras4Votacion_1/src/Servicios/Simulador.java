package Servicios;

import Entidad.Alumnos;
import Entidad.Voto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Simulador {

    Random random = new Random();

    public void crearNombres(ArrayList<String> nombreCompleto) {

        ArrayList<String> nombre = new ArrayList<>();
        ArrayList<String> apellido = new ArrayList<>();

        nombre.add("Juan");
        nombre.add("Gaston");
        nombre.add("Julian");
        nombre.add("Andres");
        nombre.add("Juana");
        nombre.add("Elisa");
        nombre.add("Sabrina");
        nombre.add("Agustina");
        nombre.add("Sofia");
        nombre.add("Rodrigo");
        nombre.add("Franco");

        apellido.add("Martinez");
        apellido.add("Luna");
        apellido.add("Romero");
        apellido.add("Ojeda");
        apellido.add("Campos");
        apellido.add("Gimenez");
        apellido.add("Diaz");
        apellido.add("Leon");
        apellido.add("Torres");
        apellido.add("Acevedo");

        int nombreSize = nombre.size();
        int apellidoSize = apellido.size();
        int maxSize = Math.min(nombreSize, apellidoSize); // Tamaño máximo para el bucle
        for (int i = 0; i < 100; i++) {
            int nombreIndex = random.nextInt(nombreSize);
            int apellidoIndex = random.nextInt(apellidoSize);

            String nombreAleatorio = nombre.get(nombreIndex);
            String apellidoAleatorio = apellido.get(apellidoIndex);

            String nombreCompletoAleatorio = nombreAleatorio + " " + apellidoAleatorio;
            nombreCompleto.add(nombreCompletoAleatorio);

        }

        System.out.println(nombreCompleto);
        for (String ncompleto : nombreCompleto) {
            System.out.println(ncompleto);
        }

    }

    public void crearDni(ArrayList<Integer> dni) {

        for (int i = 0; i < 100; i++) {
            int dnis = random.nextInt(45000000) + 5000000;
            dni.add(dnis);
        }
        for (Integer nDni : dni) {
            System.out.println(nDni);
        }

    }

    public ArrayList<Alumnos> listaAlumnos(ArrayList<String> nombreCompleto, ArrayList<Integer> dni) {
        ArrayList<Alumnos> listaAlumnos = new ArrayList<>();
        Iterator<String> ik = nombreCompleto.iterator();
        Iterator<Integer> iv = dni.iterator();

        while (iv.hasNext() && ik.hasNext()) {
            Alumnos alumnos = new Alumnos();
            alumnos.setNombreCompleto(ik.next());
            alumnos.setDni(iv.next());
            listaAlumnos.add(alumnos);

        }

        for (Alumnos lista : listaAlumnos) {
            System.out.println(lista);
        }

        return listaAlumnos;
    }

    public HashSet<Voto> ListaVotados(ArrayList<Alumnos> listaAlumnos) {
       
        HashSet<Voto> Votos = new HashSet();

        for (Alumnos listaA : listaAlumnos) {
             HashSet<Alumnos> Votados = new HashSet();
             Voto voto = new Voto();
             voto.setAlumnos(listaA);
            do {
                
           
                int voto1 = random.nextInt(listaAlumnos.size());
                if (!voto.getAlumnos().equals(listaAlumnos.get(voto1))) {
                    
                   
                    Votados.add(listaAlumnos.get(voto1));

                }
              
            } while (Votados.size() < 3);
            for (Alumnos Vot : Votados) {
                Vot.setCantidadVotos(Vot.getCantidadVotos()+1);
            }
            voto.setListaVotados(Votados);
            Votos.add(voto);
            
        }
       
        return Votos;
    }

    public void mostrarAlumnosVotados(HashSet<Voto> ListaVotados) {
  
        for (Voto Votos : ListaVotados) {
            System.out.println(Votos);
        }
    }

    public void recuentoVotos(ArrayList<Alumnos> listaAlumnos) {
Collections.sort(listaAlumnos, (a2,a1)-> a1.getCantidadVotos().compareTo(a2.getCantidadVotos()));
        for (Alumnos listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno.getNombreCompleto()+" "+listaAlumno.getCantidadVotos());
        }
    }
    

    public void crearFacilitadores(ArrayList<Alumnos> listaAlumnos) {
        System.out.println("Lista de Facilitadores Titulares: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(listaAlumnos.get(i).getNombreCompleto()+" "+listaAlumnos.get(i).getCantidadVotos());          
        }
        System.out.println("Lista de Facilitadores Suplentes: ");
        for (int i = 5; i < 10; i++) {
            System.out.println(listaAlumnos.get(i).getNombreCompleto()+" "+listaAlumnos.get(i).getCantidadVotos());          
        }
        
    }
}
