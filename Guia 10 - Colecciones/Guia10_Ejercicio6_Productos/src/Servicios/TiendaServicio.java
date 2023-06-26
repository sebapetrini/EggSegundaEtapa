/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicios;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Salvador Caldarella
 */
public class TiendaServicio {

    private Map<String, Double> productos; // HashMap para almacenar los productos y sus precios

    /**
     * Constructor de la clase TiendaServicio. Inicializa el HashMap de
     * productos.
     */
    public TiendaServicio() {
        productos = new HashMap<>();
    }

    /**
     * Agrega un nuevo producto con su precio al HashMap de productos.
     *
     * @param nombre nombre del producto a agregar
     * @param precio precio del producto a agregar
     */
    public void agregarProducto(String nombre, double precio) {
        productos.put(nombre, precio);
        System.out.println("Producto agregado correctamente.");
        System.out.println();
    }

    /**
     * Modifica el precio de un producto existente en el HashMap de productos.
     *
     * @param nombre nombre del producto a modificar
     * @param nuevoPrecio nuevo precio del producto
     */
    public void modificarPrecio(String nombre, double nuevoPrecio) {
        if (productos.containsKey(nombre)) {
            productos.put(nombre, nuevoPrecio);
            System.out.println("Precio modificado correctamente.");
            System.out.println();
        } else {
            System.out.println("El producto no existe.");
            System.out.println();
        }
    }

    /**
     * Elimina un producto del HashMap de productos.
     *
     * @param nombre nombre del producto a eliminar
     */
    public void eliminarProducto(String nombre) {
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
            System.out.println();
        } else {
            System.out.println("El producto no existe.");
            System.out.println();
        }
    }

    /**
     * Muestra todos los productos y sus precios almacenados en el HashMap.
     */
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles.");
            System.out.println();
        } else {
            System.out.println("Productos:");
            System.out.println();

        }

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String nombre = entry.getKey();
            double precio = entry.getValue();
            System.out.println(nombre + " - Precio: " + precio);
            System.out.println();
        }

        //System.out.println(productos); metodo simple

    }

}
