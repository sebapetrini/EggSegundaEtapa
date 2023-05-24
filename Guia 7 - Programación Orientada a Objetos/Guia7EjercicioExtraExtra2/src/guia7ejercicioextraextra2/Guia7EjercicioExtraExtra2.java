/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextraextra2;

import Entidad.Estudiante;

/**
 *
 2) Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y otro para 
mostrar por pantalla los estudiantes que tienen una nota media superior.


 * 
 * 
 * @author soporte
 */
public class Guia7EjercicioExtraExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

             
        Estudiante[] e = new Estudiante[3];
        
        for (int i = 0; i < 3; i++) {
            e[i] = new Estudiante();
            e[i].calculo_nota_media();
        }
        
        for (int i = 0; i < 3; i++) {
            e[i].mostrar_estudiantes_aprobados();
        }        
    } 
    
}
