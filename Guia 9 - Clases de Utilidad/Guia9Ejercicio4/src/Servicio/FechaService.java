

package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sebastián A. Petrini
 */

public class FechaService {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese el día de nacimiento");
        int dia;
        do {
            dia = Leer.nextInt();
        } while (dia<1 || dia>31);
        
        System.out.println("Ingrese el mes de nacimiento");
        int mes;
        do {
            mes = Leer.nextInt();
        } while (mes<1 || mes>12);
        System.out.println("Ingrese el anio de nacimiento");
        int anio;
        do {
            anio = Leer.nextInt();
        } while (anio<1900 || anio>2023);
        
        
        return new Date(anio - 1900, mes - 1, dia);
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public int diferencia(Date fnac, Date fecha){
      //   return fecha.getYear() - fnac.getYear();
        
        long dif = fecha.getTime() - fnac.getTime();
        
        return (int) (dif / ((1000L*60*60*24)*365)); //long milli=24*60*60*1000L;  La L para que obligue a que de un Long como resultado, si no da un int y se pasa de rango
                                                     //long micro=24*60*60*1000*1000L;
       
    }
}
