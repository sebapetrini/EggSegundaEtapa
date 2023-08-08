

package Persistencia;

import Entidades.Editorial;
import java.util.List;

/**
 *
 * @author Sebastián A. Petrini
 */

public class EditorialDAO extends DAO<Editorial> {

    
    public void borrarEditorial(Editorial objeto) {
        super.borrar(objeto);
    }

   
    public void reemplazarEditorial(Editorial objeto) { 
        super.reemplazar(objeto); 
    }

    
    public void guardarEditorial(Editorial objeto) {
        super.guardar(objeto); 
    }

    public Editorial buscaEditorial(Integer id){
        conectar(); 
        em.getTransaction().begin();
        Editorial resultado;
        resultado = em.find(Editorial.class, id);
        em.getTransaction().commit();     
        desconectar();
        return resultado;
    }
    
    public List<Editorial> listarEditorial(){
        conectar();
        List<Editorial> l = em.createQuery("SELECT e FROM Editorial e").getResultList();
        desconectar();
        return l;
    }
    
    public Editorial buscaEditorialN(String nombre){
        conectar(); 
        em.getTransaction().begin();
        List<Editorial> resultado = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nom").setParameter("nom", nombre).getResultList();
        em.getTransaction().commit();     
        desconectar();
        if (resultado == null || resultado.isEmpty())
            return null;
        return resultado.get(0);
    }
    
}
