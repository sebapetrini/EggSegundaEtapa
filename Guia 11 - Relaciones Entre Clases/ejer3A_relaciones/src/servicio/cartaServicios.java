package servicio;
import entidad.Carta;
import enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
/**
 */
public class cartaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarMazo(Carta carta){
        ArrayList<Carta> listaCarta = new ArrayList();
        int n = 0;
        Palo p = carta.getPalo().ESPADA;
        Palo aux = p;

        for (int i = 0; i < 40; i++){
            n++;
            if (n == 8){
                n = n + 2;
            }
            if (i == 10){
                p = carta.getPalo().BASTO;
                n = 1;
            }
            if (i == 20){
            
                p = carta.getPalo().ORO;
                n = 1;
            }
            if (i == 30){
            
                p = carta.getPalo().COPA;
                n = 1;
            }
            listaCarta.add(new Carta(n, p, true));
        }
        carta.setListaCarta(listaCarta);
    }

    //mostrarBaraja(): muestra todas las cartas
    //hasta el final. Es decir, si se saca una carta y luego se llama al método,
    //este no mostrara esa primera carta.
    public void mostrarMazo(Carta carta){
        ArrayList<Carta> listaCartas = new ArrayList();
        listaCartas.addAll(carta.getListaCarta());
        for (Carta cartas : listaCartas)
        {
            if (cartas.isEnMazo()){
                System.out.println(cartas);
            }
        }
    }

    //• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(Carta carta){
        Random rnd = new Random();
        ArrayList<Carta> listaCartas = new ArrayList();
        listaCartas.addAll(carta.getListaCarta());
        int rnd1 = new Random().nextInt(40) + 1;
        rnd.setSeed(rnd1);
        Collections.shuffle(listaCartas, rnd);

        //Collections.shuffle(listaCartas, Seed);
        carta.setListaCarta(listaCartas);
    }

    /*siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
 * no haya más o se haya llegado al final, se indica al usuario que no hay más
 * cartas.*/
    public void siguienteCarta(Carta carta){
        ArrayList<Carta> listaCartas = new ArrayList();
        listaCartas.addAll(carta.getListaCarta());
        boolean auxBool = true;
        for (Carta cartas : listaCartas){
            if (cartas.isEnMazo()){
                System.out.println("la carta siguiente a dar es " + cartas);
                cartas.setEnMazo(false);
                auxBool = false;
                break;
            }
        }
        if (auxBool){
            System.out.println("No hay mas cartas");
        }
        carta.setListaCarta(listaCartas);
    }

    /*• cartasDisponibles(): indica el número de cartas que aún se puede
    repartir.*/
    public void cartasDisponibles(Carta carta){
    
        ArrayList<Carta> listaCartas = new ArrayList();
        listaCartas.addAll(carta.getListaCarta());
        Integer con = 0;

        for (Carta cartas : listaCartas){
            if (cartas.isEnMazo()){
                con++;
            }
        }
        System.out.println("Las cartas disponibles son: " + con);
    }

    /*
     * • darCartas(): dado un número de cartas que nos pidan, le devolveremos
     * ese número de cartas. En caso de que haya menos cartas que las pedidas,
     * no devolveremos nada, pero debemos indicárselo al usuario.
     */
    public void darCartas(Carta carta)
    {
        ArrayList<Carta> listaCartas = new ArrayList();
        listaCartas.addAll(carta.getListaCarta());
        System.out.println("Ingrese la cantidad de cartas que desea");
        int pedir = leer.nextInt();
        int contador = 0;

        for (Carta cartas : listaCartas){
            if (cartas.isEnMazo()){
                contador++;
            }
        }
        if (contador < pedir)
        {
            System.out.println("No hay suficientes cartas");
        } else{
        
            for (Carta cartas : listaCartas){
            
                if (cartas.isEnMazo() && pedir > 0){
                
                    cartas.setEnMazo(false);
                    pedir--;
                }
            }
        }
        carta.setListaCarta(listaCartas);
    }

    /*•cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
 * ninguna indicárselo al usuario*/
    public void cartasMonton(Carta carta)
    {
        ArrayList<Carta> listaCartas = new ArrayList();
        listaCartas.addAll(carta.getListaCarta());
        for (Carta cartas : listaCartas)
        {
            if (!cartas.isEnMazo())
            {
                System.out.println(cartas);
            }
        }
    }

    public void menu(Carta carta){
        int opcion = 0;
        llenarMazo(carta);
        do{
    
            System.out.println(" ");
            System.out.println("Menu");
            System.out.println("------------------------------");
            System.out.println("1. Mostrar cartas");
            System.out.println("2. Mezclar cartas");
            System.out.println("3. Ver siguiente carta");
            System.out.println("4. Repartir cartas");
            System.out.println("5. Cartas disponibles");
            System.out.println("6. Cartas utilizadas");
            System.out.println("7. Salir");
            System.out.println("------------------------------");
            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();

            switch (opcion){
            
                case 1:
                    mostrarMazo(carta);
                    break;
                case 2:
                    barajar(carta);
                    break;
                case 3:
                    siguienteCarta(carta);
                    break;
                case 4:
                    darCartas(carta);
                    break;
                case 5:
                    cartasDisponibles(carta);
                    break;
                case 6:
                    cartasMonton(carta);
                    break;
                case 7:
                    System.out.println("Hasta luego");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
            }

        } while (opcion != 7);
    } 
}
