
package Entidad;

/**
 * Potencia en CV y número de camarotes para yates de lujo.
 *
 */
public class Yate extends BarcoMotor
{
    
    private int camarotes;

    public Yate(int camarotes, double potencia, String matricula, double eslora, int fabricado)
    {
        super(potencia, matricula, eslora, fabricado);
        this.camarotes = camarotes;
    }

    public int getCamarotes()
    {
        return camarotes;
    }

    public void setCamarotes(int camarotes)
    {
        this.camarotes = camarotes;
    }
    
    
    
    

}
