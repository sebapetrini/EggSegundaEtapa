/*
Definir los siguientes métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. 
También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario 
y muestre cuantas letras han sido encontradas y cuántas le faltan. 
Este método además deberá devolver true si la letra estaba y false si la letra no estaba, 
ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados 
e informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
Este método se llamará en el main.
 */

package ejercicio2extraguia9encuentros25a32.Servicios;

import ejercicio2extraguia9encuentros25a32.Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 *author Alveiro Izarra
 */
public class AhorcadoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String letra;
    int cuantasVeces;
    boolean son;
    
    
    public Ahorcado crearJuego() {
        Ahorcado juego = new Ahorcado();
        System.out.println("INGRESE LA PALABRA A ADIVINAR:");
        String palabra = leer.next();
        String[] vector = new String[palabra.length()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = palabra.substring(i, i+1);  
        }
        juego.setVecPalabra(vector);
        System.out.println("Ingrese la Cantidad de Jugadas Máxima: ");
        juego.setCantidadJugadasMaximas(leer.nextInt());
        return juego;
    }
    
    public void longitud(Ahorcado juego) {
        System.out.println("La longitud de la Palabra a Buscar es de " + juego.getVecPalabra().length + " letras."); 
    } 
    
    public void buscarLetra(Ahorcado juego) {
        String[] vecAux = new String[juego.getVecPalabra().length];
        mostrarAvance(vecAux);
        do {
            cuantasVeces = 0;
            System.out.println("");
            System.out.println("Ingrese una Letra para saber si está en la Palabra.");
            letra = leer.next();
            for (int i = 0; i < juego.getVecPalabra().length; i++) {
                if (juego.getVecPalabra()[i].equalsIgnoreCase(letra)) {
                    cuantasVeces++;
                    vecAux[i] = juego.getVecPalabra()[i];
                } 
            }
            System.out.println("");
            if (cuantasVeces == 0) {
                System.out.println("La letra ingresada NO pertenece a la palabra.");
                letrasEncontradas(juego);
                intentos(juego);
            } else {
                System.out.println("La letra ingresada SI pertenece a la palabra.");
                letrasEncontradas(juego);
                intentos(juego);
            }
            System.out.println("");
            mostrarAvance(vecAux);
            System.out.println("=================================================");
        } while ((juego.getCantidadJugadasMaximas() > 0) && (!(juego.getVecPalabra().length==juego.getCantidadLetrasEncontradas())));

    }
    
    public boolean letrasEncontradas(Ahorcado juego) {
        
        if (cuantasVeces != 0) {
            juego.setCantidadLetrasEncontradas(juego.getCantidadLetrasEncontradas() + cuantasVeces);
            System.out.println("Número de Letras (encontradas/faltantes): (" + juego.getCantidadLetrasEncontradas() + "/"
                    + (juego.getVecPalabra().length - juego.getCantidadLetrasEncontradas()) + ")");
           son =  true;
        } else {
            System.out.println("Número de Letras (encontradas/faltantes): (" + juego.getCantidadLetrasEncontradas() + "/"
            + (juego.getVecPalabra().length - juego.getCantidadLetrasEncontradas()) + ")");
            son = false;
        }
        return son;
    }
    
    public void intentos(Ahorcado juego) {
        if (son!=true) {
            juego.setCantidadJugadasMaximas(juego.getCantidadJugadasMaximas()-1); 
        }
        System.out.println("Número de Oportunidades Restantes: "+juego.getCantidadJugadasMaximas());
    }
    
    public void juego(Ahorcado juego) {
        longitud(juego);
        System.out.println("");
        buscarLetra(juego);
        System.out.println("");
        if (juego.getVecPalabra().length==juego.getCantidadLetrasEncontradas()) {
            System.out.println("Has GANADO!!! -- Descubriste la PALABRA!!!!");
        } else {
            System.out.println("Has PERDIDO -- Te has quedado SIN INTENTOS....");
        }
    
    }
    
    public void mostrarAvance(String[] vec) {
        for (int i = 0; i < vec.length; i++) {
            if (vec[i]== null) { 
                vec[i] = "_ ";
            }
            System.out.print(vec[i]+" ");
        }
        System.out.println("");
    }
    
    
}
 