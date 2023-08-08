

package Persistencia;

import Entidades.Autor;
import java.util.List;

/**
 *
 * @author Sebastián A. Petrini
 */

public class AutorDAO extends DAO<Autor> {

    public void borrarAutor(Autor objeto) {
        super.borrar(objeto);
    }
  
    public void reemplazarAutor(Autor objeto) {
        super.reemplazar(objeto); 
    }


    public void guardarAutor(Autor objeto) {
        super.guardar(objeto); 
    }

    public Autor buscaAutor(Integer id){
        conectar(); 
        em.getTransaction().begin();
        Autor resultado;
        resultado = em.find(Autor.class, id);
        em.getTransaction().commit();     
        desconectar();
        return resultado;
    }
    
    public Autor buscaAutorN(String nombre){
        conectar(); 
        em.getTransaction().begin();
        List<Autor> resultado = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nom").setParameter("nom", nombre).getResultList();
        em.getTransaction().commit();     
        desconectar();
        if (resultado == null || resultado.isEmpty())
            return null;
        return resultado.get(0);
    }
    
    public List<Autor> listarAutor(){
        conectar();
        List<Autor> l = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return l;
    }
}
