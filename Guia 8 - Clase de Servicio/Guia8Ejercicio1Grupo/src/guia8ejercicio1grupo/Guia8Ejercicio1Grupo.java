/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio1grupo;


import Entidad.CuentaBancaria;
import Servicio.BancarioServicio;
import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class Guia8Ejercicio1Grupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BancarioServicio bs = new BancarioServicio();
        CuentaBancaria cuenta = bs.craearCuenta();
        int op = 0;
        while (op != 6) {
            System.out.println("==============================");
            System.out.println("Seleccione una opcion");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar deposito");
            System.out.println("3 - Realizar retiro");
            System.out.println("4 - Realizar extraccion rapida");
            System.out.println("5 - Consultar dato da la cuenta");
            System.out.println("6 - Salir");
            System.out.println("==============================");
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("==============================");
                    bs.consultarSaldo(cuenta);
                    System.out.println("==============================");
                    continue;
                }
                case 2: {
                    System.out.println("==============================");
                    System.out.println("Ingresar cantidad a depositar");
                    double cantidad = sc.nextDouble();
                    bs.ingresar(cuenta, cantidad);
                    System.out.println("==============================");
                    System.out.println("Se a realizado el deposito");
                    System.out.println("==============================");
                    continue;
                }
                case 3: {
                    System.out.println("==============================");
                    System.out.println("Ingrese cantidad a retirar");
                    final double cantidadr = sc.nextDouble();
                    System.out.println("==============================");
                    bs.retirar(cuenta, cantidadr);
                    continue;
                }
                case 4: {
                    System.out.println("==============================");
                    if (cuenta.getSaldo() == 0.0) {
                        System.out.println("No se puede realizar la extraccion rapida. el saldo actuade la cuenta es $0000");
                        System.out.println("==============================");
                        continue;
                    }
                    bs.extraccionRapido(cuenta);
                    System.out.println("Se ha realizado la extraccion rapida");
                    System.out.println("==============================");
                    continue;
                }
                case 5: {
                    System.out.println("==============================");
                    bs.consultarDatos(cuenta);
                    System.out.println("==============================");
                    continue;
                }
                case 6: {
                    System.out.println("==============================");
                    System.out.println("Gracias por usar el programa");
                    System.out.println("==============================");
                    continue;
                }
                default: {
                    System.out.println("==============================");
                    System.out.println("Opcion invalida, intente de nuevo");
                    System.out.println("==============================");
                }
            }
        }
        
        
    }
    
}
