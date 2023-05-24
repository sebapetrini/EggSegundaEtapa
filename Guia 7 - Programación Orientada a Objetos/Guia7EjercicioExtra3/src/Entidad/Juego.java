/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 * 
 * 
 * 
 * @author Soporte
 */

public class Juego {
    
    private int numAdivinar;
    private int numIntento;
    private int numChanse;
    private int gan1;
    private int gan2;

    public Juego() {
    }

    public Juego(int numAdivinar, int numIntento, int numChanse) {
        this.numAdivinar = numAdivinar;
        this.numIntento = numIntento;
        this.numChanse = numChanse;
        this.gan1 = 0;
        this.gan2 = 0;
        
        
    }

    public int getGan1() {
        return gan1;
    }

    public int getGan2() {
        return gan2;
    }

    public int getNumAdivinar() {
        return numAdivinar;
    }

    public int getNumIntento() {
        return numIntento;
    }

    public int getNumChanse() {
        return numChanse;
    }

    public void setGan1(int gan1) {
        this.gan1 = gan1;
    }

    public void setGan2(int gan2) {
        this.gan2 = gan2;
    }

    public void setNumAdivinar(int numAdivinar) {
        this.numAdivinar = numAdivinar;
    }

    public void setNumIntento(int numIntento) {
        this.numIntento = numIntento;
    }

    public void setNumChanse(int numChanse) {
        this.numChanse = numChanse;
    }
    
    public void iniciar_juego(){
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        boolean general = true;
        String sal;
        do {
            System.out.print("Ingrese un número a adivinar: ");
            numAdivinar = Leer.nextInt();
            System.out.print("Ingrese la cantidad de intentos: ");
            numIntento = Leer.nextInt();
            boolean salir = true;
            int intentos = 0;
            do {
                System.out.print("Ingrese su intento para adivinar el número: ");
                numChanse = Leer.nextInt();
                intentos++;
                if (numChanse == numAdivinar) {
                    salir = false;
                    System.out.println("Felicitacioes, adivinó el número en " + intentos + " intentos!!!!!");
                } else if (numChanse < numAdivinar) {
                    System.out.println("Su intento se quedó corto, el número es mas alto");
                } else if (numChanse > numAdivinar) {
                    System.out.println("Su intento se fue arriba, el número es mas bajo");
                }  
                if (intentos == numIntento){
                    salir = false;
                    System.out.println("Perdiste, se te terminaron los intentos :o(");
                }
                
            } while (salir);
            if (numChanse == numAdivinar)
                gan2++;
            else
                gan1++;
            System.out.print("Desea jugar otra partida (S/N): ");
            sal = Leer.next();
            if (sal.substring(0, 1).equalsIgnoreCase("N"))
                general=false;
            
        } while (general);
        if (gan1 > gan2 )
            System.out.println("El ganador es el jugador 1 con " + gan1 + " ganadas contra " + gan2 + " ganadas del jugador 2");
        else
            System.out.println("El ganador es el jugador 2 con " + gan2 + " ganadas contra " + gan1 + " ganadas del jugador 1");
    }
    
}
