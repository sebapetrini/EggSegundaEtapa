
package Entidad;

/**
 * su matrícula, su eslora en metros y año de fabricación.

 */
public class Barco
{
    
    private String matricula;
    private double eslora;
    private int fabricado;

    public Barco()
    {
    }

    public Barco(String matricula, double eslora, int fabricado)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricado = fabricado;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public double getEslora()
    {
        return eslora;
    }

    public void setEslora(double eslora)
    {
        this.eslora = eslora;
    }

    public int getFabricado()
    {
        return fabricado;
    }

    public void setFabricado(int fabricado)
    {
        this.fabricado = fabricado;
    }
    
    

}
