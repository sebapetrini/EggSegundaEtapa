
package guia9ejercicio3;

import Servicio.ArregloService;

/**
 Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 * 
 * @author Sebastián A. Petrini
 */

public class Guia9Ejercicio3 {
   
    public static void main(String[] args) {
        double vector1[] = new double[50];
        double vector2[] = new double[20];
        ArregloService as = new ArregloService();
        
        as.inicializarA(vector1);
        as.mostrar(vector1);
        as.ordenar(vector1);
        as.inicializarB(vector1, vector2);
        as.mostrar(vector1);
        as.mostrar(vector2);
        
    }
    

}


