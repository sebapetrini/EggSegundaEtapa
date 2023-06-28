
package Entidad;

/**
 *Potencia en CV para barcos a motor.

 */
public class BarcoMotor extends Barco
{
    
    private double potencia;

    public BarcoMotor()
    {
    }

    public BarcoMotor(double potencia, String matricula, double eslora, int fabricado)
    {
        super(matricula, eslora, fabricado);
        this.potencia = potencia;
    }

    public double getPotencia()
    {
        return potencia;
    }

    public void setPotencia(double potencia)
    {
        this.potencia = potencia;
    }
    
    
    
    
}
