

package Persistencia;

import Entidades.Libro;
import java.util.List;

/**
 *
 * @author Sebastián A. Petrini
 */

public class LibroDAO extends DAO<Libro>{

    public void borrarLibro(Libro objeto) {
        super.borrar(objeto); 
    }

    public void reemplazarLibro(Libro objeto) {
        super.reemplazar(objeto);
    }

    public void guardarLibro(Libro objeto) {
        super.guardar(objeto);
    }
    
    public Libro buscarLibro(Long isbn){
        conectar(); 
        em.getTransaction().begin();
        Libro resultado;
        resultado = em.find(Libro.class, isbn);
        em.getTransaction().commit();     
        desconectar();
        return resultado;
    }
    
    public Libro buscarLibro(String titulo){
        conectar(); 
        em.getTransaction().begin();
        List<Libro> resultado = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :tit").setParameter("tit", "%" + titulo + "%").getResultList();
        em.getTransaction().commit();     
        desconectar();
        if (resultado == null || resultado.isEmpty())
            return null;
        return resultado.get(0);
    }
    
    
    public List<Libro> listaLibro(){
        conectar();
        List<Libro> l = em.createQuery("SELECT l FROM Libro l").getResultList();
        desconectar();
        return l;
    }
    
    public List<Libro> listaLibroAutor(String nombre){
        conectar();
        List<Libro> l = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nom").setParameter("nom", "%" + nombre + "%").getResultList();
        desconectar();
        return l;
    }
    
    public List<Libro> listaLibroEditorial(String nombre){
        conectar();
        List<Libro> l = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nom").setParameter("nom", nombre).getResultList();
        desconectar();
        return l;
    }
}
