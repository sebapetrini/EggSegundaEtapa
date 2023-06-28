
package Entidad;

/**
 *
 */
public class Velero extends Barco
{
    
    private int mastil;

    public Velero()
    {
    }

    public Velero(int mastil, String matricula, double eslora, int fabricado)
    {
        super(matricula, eslora, fabricado);
        this.mastil = mastil;
    }

    public int getMastil()
    {
        return mastil;
    }

    public void setMastil(int mastil)
    {
        this.mastil = mastil;
    }
    
    
    
}
