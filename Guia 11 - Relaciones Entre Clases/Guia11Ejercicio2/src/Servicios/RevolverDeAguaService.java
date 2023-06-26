

package Servicios;

import Entidades.RevolverDeAgua;
import java.util.Objects;

/**
 *
 * @author Sebastián A. Petrini
 */

public class RevolverDeAguaService {
    
    public RevolverDeAgua llenarRevolver(){
        Integer pos = (int) (Math.random()*6 +1);
        Integer pos2 = (int) (Math.random()*6 +1);
        return new RevolverDeAgua(pos,pos2);
    }
    
    public boolean mojar(RevolverDeAgua r) {
        return Objects.equals(r.getPosActual(), r.getPosAgua());
    }  
    
    public void siguienteChorro(RevolverDeAgua r){
        if (r.getPosActual()==6)
            r.setPosActual(1);
        else
            r.setPosActual(r.getPosActual() + 1);
    }
    
    public boolean disparo(Revolver r){
        if (mojar(r))
            return true;
        else{
            siguienteChorro(r);
            return false;
        }
            
    }
}
