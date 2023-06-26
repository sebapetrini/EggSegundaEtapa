package enumeraciones;
/**
 */
public enum  Palo {
     ESPADA(1, "Espada"), BASTO(2, "Basto"), ORO(3, "Oro"), COPA(4, "Copa");

    private Integer numero;
    private String descripcion;

    private Palo(){
    }

    private Palo(Integer numero, String descripcion){
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public Integer getNumero(){
        return numero;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return descripcion;
    }
}
