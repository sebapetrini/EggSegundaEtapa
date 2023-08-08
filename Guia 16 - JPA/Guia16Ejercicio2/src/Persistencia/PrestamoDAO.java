/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Cliente;
import Entidades.Libro;
import Entidades.Prestamo;
import java.util.List;

/**
 *
 * @author Pablo Barberis
 */
public class PrestamoDAO extends DAO<Prestamo> {

    public void guardarPrestamo(Prestamo prestamo) {
        super.guardar(prestamo);
    }

    public void reemplazarPrestamo(Prestamo prestamo) {
        super.reemplazar(prestamo);
    }

    public void borrarPrestamo(Prestamo prestamo) {
        super.borrar(prestamo);
    }

    public List<Prestamo> buscarPrestamo(Cliente cliente) {
        conectar();
        List<Prestamo> resultado = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.documento = :documento").setParameter("documento", cliente.getDocumento()).getResultList();
        desconectar();
        return resultado;
    }
    
    public List<Prestamo> listarPrestamos(){
        conectar();
        List<Prestamo> resultado = em.createQuery("SELECT p FROM Prestamo p WHERE p.fechaDevolucion IS NULL").getResultList();
        desconectar();
        return resultado;
    }

}
