

package Servicio;

import java.util.Arrays;

/**
 *
 * @author Sebastián A. Petrini
 */

public class ArregloService {

    public void inicializarA(double[] v){
        for (int i = 0; i < v.length; i++) {
            v[i] = Math.random() * 100;            
        }        
    }
    
    public void mostrar(double [] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print("[ " + v[i] + " ]");            
        }
        System.out.println("");
    }
    
    public void ordenar(double[] v){
        Arrays.sort(v);
        double aux[] = new double[v.length];
        for (int i = 0; i < v.length; i++) {
            aux[(v.length-1)-i] = v[i];            
        }
        for (int i = 0; i < aux.length; i++) {
            v[i] = aux[i];         
        }    
    }
    
    public void inicializarB(double [] v, double [] v2){
       /* for (int i = 0; i < v2.length; i++) {
            if (i<11)
                v2[i] = v[i];
            else
                v2[i] = 0.5;
        }*/
     //  v2 = Arrays.copyOfRange(v, 0, 9);
       System.arraycopy(v, 0, v2, 0, 10);
       Arrays.fill(v2, 10, 20, 0.5);
   
    }
}
