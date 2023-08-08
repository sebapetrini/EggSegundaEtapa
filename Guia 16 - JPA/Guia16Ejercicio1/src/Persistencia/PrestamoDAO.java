

package Persistencia;

import Entidades.Prestamo;
import java.util.List;

/**
 *
 * @author Sebastián A. Petrini
 */

public class PrestamoDAO extends DAO<Prestamo>{

    public void borrarPrestamo(Prestamo objeto) {
        super.borrar(objeto); 
    }

    public void reemplazarPrestamo(Prestamo objeto) {
        super.reemplazar(objeto);
    }

    public void guardarPrestamo(Prestamo objeto) {
        super.guardar(objeto);
    }
    
    public Prestamo buscarPrestamo(Integer id){
        conectar(); 
        em.getTransaction().begin();
        Prestamo resultado;
        resultado = em.find(Prestamo.class, id);
        em.getTransaction().commit();     
        desconectar();
        return resultado;
    }
/*    
    public Prestamo buscarPrestamo(String titulo){
        conectar(); 
        em.getTransaction().begin();
        List<Libro> resultado = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :tit").setParameter("tit", "%" + titulo + "%").getResultList();
        em.getTransaction().commit();     
        desconectar();
        if (resultado == null || resultado.isEmpty())
            return null;
        return resultado.get(0);
    }
*/    
    
    public List<Prestamo> listaPrestamo(){
        conectar();
        List<Prestamo> l = em.createQuery("SELECT p FROM Prestamo p").getResultList();
        desconectar();
        return l;
    }
    
    public List<Prestamo> listaPrestamoCliente(String nombre){
        conectar();
        List<Prestamo> l = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.nombre LIKE :nom").setParameter("nom", "%" + nombre + "%").getResultList();
        desconectar();
        return l;
    }
    
    public List<Prestamo> listaPrestamoLibro(String titulo){
        conectar();
        List<Prestamo> l = em.createQuery("SELECT p FROM Prestamo p WHERE p.libro.titulo LIKE :tit").setParameter("tit", titulo).getResultList();
        desconectar();
        return l;
    }
    
    
    
}
