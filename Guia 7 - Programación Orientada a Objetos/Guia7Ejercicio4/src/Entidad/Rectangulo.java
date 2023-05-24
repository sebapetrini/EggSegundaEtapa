/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Rectangulo {
     private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    public void CrearRect() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrse la base del rectangulo: ");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = leer.nextInt();
        
    }
    
    public int Superficie() {
        return base*altura;
        
    }
    
    public int Perimetro() {
        return (base+altura)*2;
    }
    
    public void Dibujo() {
        
        for(int i = 1; i <= altura; i++) {
            for(int j = 1; j <= base; j++) {
                if(i == 1 || i == altura || j == 1 || j == base) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }     
}
