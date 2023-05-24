

package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class AhorcadoService {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        public Ahorcado crearJuego(){
            System.out.println("----------------Bienvenido al Ahorcado-----------------");
            System.out.println("");
            System.out.print("Ingrese la palabra a adivinar: ");
            String palabra = Leer.next();
            String[] v = new String[palabra.length()];
            for (int i = 0; i < v.length; i++) {
                v[i] = palabra.substring(i, i+1);
            }
            System.out.print("Ingrese la cantidad de intentos para la jugada: ");
            int intentos = Leer.nextInt();
            return new Ahorcado(v,0,intentos);           
        }
        
        public int longitud(Ahorcado a){
            System.out.println("La Longitud de la palabra es: " + a.getPalabra().length);
            return a.getPalabra().length;
        }
       
        public void buscar(Ahorcado a,String Letra){
            int cant = 0;
            for (int i = 0; i < a.getPalabra().length; i++) {
                if (a.getPalabra()[i].equalsIgnoreCase(Letra))
                    cant++;
            } 
            if (cant > 0)
                System.out.println("Mensaje: La letra se encontró en la palabra!!! ;o)");
            else
                System.out.println("Mensaje: La letra no se encontró en la palabra... :o(");            
        }

        public boolean encontradas(Ahorcado a, String Letra){         
            int cant = a.getCantLetrasEnc();
            for (int i = 0; i < a.getPalabra().length; i++) {
                if (a.getPalabra()[i].equalsIgnoreCase(Letra))
                    a.setCantLetrasEnc(a.getCantLetrasEnc()+1);       
            }
            System.out.println("Numero de letras encontradas: " + a.getCantLetrasEnc() + " Faltantes: " + (a.getPalabra().length-a.getCantLetrasEnc()));
            return (a.getCantLetrasEnc() == cant);
        }
        
        public void intentos(Ahorcado a){
            System.out.println("Número de intentos restantes: " + a.getCantInt());
        }
        
        public void juego(Ahorcado a){
            
            do {
                System.out.println("------------------------------------------------");
                System.out.println("");
                System.out.print("Ingrese una letra a bucar: ");
                String Letra = Leer.next();
                System.out.println("");
                int largo = longitud(a);
                buscar(a,Letra);
                if (encontradas(a,Letra)){
                    a.setCantInt(a.getCantInt()-1);
                    intentos(a);
                }
                if (a.getCantLetrasEnc() == largo)
                        break;
            } while (a.getCantInt()>0);
            if (a.getCantInt()==0)
                System.out.println("Lo siento, se le terminaron los intentos, ha perdido!!!!  :o(");
            else{
                System.out.print("Ha descubierto la palabra!!!!! "); 
                for (int i = 0; i < a.getPalabra().length; i++) {
                    System.out.print(a.getPalabra()[i]);                   
                }
                System.out.println("");
            }
        }
}
