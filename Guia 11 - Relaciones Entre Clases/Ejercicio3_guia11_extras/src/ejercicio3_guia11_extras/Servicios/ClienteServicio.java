/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia11_extras.Servicios;

import ejercicio3_guia11_extras.Entidades.Cliente;
import ejercicio3_guia11_extras.Entidades.Cuota;
import ejercicio3_guia11_extras.Entidades.Poliza;
import ejercicio3_guia11_extras.Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lautaro
 */
public class ClienteServicio {
    
    
    public Cliente crearCliente(){
            ArrayList<Cliente> clienteListado = new ArrayList();
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese el nombre");
            String nombre=leer.next();
            System.out.println("Ingrese el domicilio");
            String domicilio=leer.next();
            clienteListado.add(new Cliente(nombre, domicilio));

        return new Cliente(nombre, domicilio);
    }
    
    public Vehiculo crearVehiculo(){
        ArrayList<Vehiculo>vehiculoListado = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tipo  Camioneta/sedan/camión");
        String tipo = leer.next();
        System.out.println("Ingrese la marca");
        String marca = leer.next();
        System.out.println("Ingrese el color");
        String color = leer.next();
        vehiculoListado.add(new Vehiculo(tipo, marca, color));
        
        return new Vehiculo(tipo, marca, color);
    }
    
//      private Cliente cliente;
//    private Vehiculo vehiculo;
//    private Integer nroPoliza;
// //   private Integer fechaInicio;
// //   private Integer fechaFinal;
//    private Integer cantCuotas;
//    private String formaPago;
//    private Double montoTotalAsegurado;
//    private Boolean granizo;
//    private Double montoGranizo;
//    private String tipoCobertura;
    
    
    
    public Poliza crearPoliza(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Poliza> polizaLista = new ArrayList();
        ArrayList<Cuota> cuotaLista = new ArrayList();
        System.out.println("Ingrese el cliente");
        Cliente cliente = crearCliente();
        System.out.println("Ingrese el vehiculo");
        Vehiculo vehiculo = crearVehiculo(); 
        int rnd1 =new Random().nextInt(4000)+1;
        int cantCuotas = 12;
        System.out.println("Ingrese el monto total asegurado");
        Double montoTotalAsegurado = leer.nextDouble();
        System.out.println("Ingrese la forma de pago");
        System.out.println("Contado-Tarjeta-Debito-Transferencia");
        String formaPago=leer.next();
        System.out.println("Ingrese el tipo de Cobertura");
        System.out.println("Total --- Tercero--- Robo");
        String tipoCoberturaOpc = leer.next();
        Double montoTotalCuota=0.0;
        String tipoCobertura="";
        boolean granizo=false;        
        switch(tipoCoberturaOpc.toLowerCase()){
            case "total":
                montoTotalCuota=(montoTotalAsegurado*0.44)/100;
                tipoCobertura = "total";
                break;
            case "tercero":
               montoTotalCuota=(montoTotalAsegurado*0.38)/100;
               tipoCobertura = "tercero";
               break;
            case "robo":
                montoTotalCuota=(montoTotalAsegurado*0.30)/100;
                tipoCobertura = "robo";
                break;
        }
        
        System.out.println("Tiene cobertura p/granizo s/n");
        String granizo1=leer.next();
        if (granizo1.equalsIgnoreCase("s")){
            granizo =true;
            System.out.println("Ingrese el monto asegurado");
            Double montoGranizo=leer.nextDouble();
        }else {
            granizo = false;
            Double montoGranizo = 0.0;
        }
        
        for (int i = 0; i < cantCuotas; i++) {
            cuotaLista.add(new Cuota(i+1, montoTotalCuota, false, formaPago));
        }
        
        polizaLista.add(new Poliza(cuotaLista,cliente, vehiculo, rnd1, cantCuotas, formaPago, montoTotalAsegurado, granizo, montoTotalAsegurado, tipoCobertura));
        
        System.out.println(polizaLista);
        
        
        for (Poliza aux : polizaLista) {
            System.out.println("====================DATOS POLIZA==================");
            System.out.println("Nombre Cliente "+aux.getCliente().getNombre());
            System.out.println("Domicilio: "+aux.getCliente().getDomicilio());
            System.out.println("Poliza NRO: "+aux.getNroPoliza());
            System.out.println("Tipo Cobertura: "+aux.getTipoCobertura());
            System.out.println("====================DATOS CUOTAS==================");
            System.out.println("Monto Total Asegurado: "+aux.getMontoTotalAsegurado());
            System.out.println("Monto Cuota: "+aux.getCuota().get(0));
            System.out.println("Forma de pago: "+aux.getFormaPago());
            System.out.println("====================DATOS VEHICULO==================");
            System.out.println("Vehiculo Tipo: "+aux.getVehiculo().getTipo());
            System.out.println("Vehiculo Color: "+aux.getVehiculo().getColor());
            System.out.println("Vehiculo Marca: "+aux.getVehiculo().getMarca());
        }   
        
        return new Poliza(cuotaLista, cliente, vehiculo, rnd1, cantCuotas, formaPago, montoTotalAsegurado, granizo, montoTotalAsegurado, tipoCobertura);
    }
    
    
    
    
    
}
