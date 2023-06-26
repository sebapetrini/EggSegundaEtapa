/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio3_guiaextras.Entidades;

import java.util.Objects;

/**
 *
 * @author Lautaro
 * 
 *  * Implemente un programa para una Librería haciendo uso de un HashSet para evitar
 * datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
 * información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
 * el título del libro, autor, número de ejemplares y número de ejemplares prestados.
 * También se creará en el main un HashSet de tipo Libro que guardará todos los libros
 * creados.
 * En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
 * sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
 * se le pregunta al usuario si quiere crear otro Libro o no.
 * La clase Librería contendrá además los siguientes métodos:
 * • Constructor por defecto.
 * • Constructor con parámetros.
 * • Métodos Setters/getters
 * • Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
 * busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
 * método. El método se incrementa de a uno, como un carrito de compras, el
 * atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
 * cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
 * que no queden ejemplares disponibles para prestar. Devuelve true si se ha
 * podido realizar la operación y false en caso contrario.
 * • Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
 * lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
 * El método decrementa de a uno, como un carrito de compras, el atributo
 * ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
 * vez que se produzca la devolución de un libro. No se podrán devolver libros
 * donde que no tengan ejemplares prestados. Devuelve true si se ha podido
 * realizar la operación y false en caso contrario.
 * • Método toString para mostrar los datos de los libros.
 */
public class Libreria {
    
    private String titulo;
    private String autor;
    private Integer ejemplares;
    private Integer ejemplaresPrest;

    public Libreria() {
    }

    public Libreria(String titulo, String autor, Integer ejemplares, Integer ejemplaresPrest) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrest = ejemplaresPrest;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrest() {
        return ejemplaresPrest;
    }

    public void setEjemplaresPrest(Integer ejemplaresPrest) {
        this.ejemplaresPrest = ejemplaresPrest;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libreria other = (Libreria) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            
            return false;
        }
        System.out.println("Objeto repetido no será ingresado");
        return true;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " Autor: " + autor + " Ejemplares: " + ejemplares + ", Ejemplares Prestados: " + ejemplaresPrest + '}';
    }
    
    
    
}
