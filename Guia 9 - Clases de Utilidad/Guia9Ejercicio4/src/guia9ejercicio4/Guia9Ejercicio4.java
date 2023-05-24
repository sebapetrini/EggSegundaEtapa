
package guia9ejercicio4;

import Servicio.FechaService;
import java.util.Date;

/**
 *
 Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario)
 * 
 * @author Sebastián A. Petrini
 */

public class Guia9Ejercicio4 {
   
    public static void main(String[] args) {
        FechaService fs = new FechaService();
        Date fnacim = fs.fechaNacimiento();
        Date factual = fs.fechaActual();
        
        System.out.println("Fecha nacimiento: " + fnacim.toString());
        System.out.println("Fecha actual: " + factual.toString());
        System.out.println("La diferencia entre la fecha de nacimeinto y la actual es: " + fs.diferencia(fnacim, factual) + " Años");

    }

}
