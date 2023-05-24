

package Entidad;

import java.util.Date;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Persona {
       private String Nombre;
       private Date fnacimiento;

    public Persona() {
    }

    public Persona(String Nombre, Date fnacimiento) {
        this.Nombre = Nombre;
        this.fnacimiento = fnacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
    
       
}
