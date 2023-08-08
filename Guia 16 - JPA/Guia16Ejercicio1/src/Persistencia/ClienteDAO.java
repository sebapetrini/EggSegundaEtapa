

package Persistencia;

import Entidades.Cliente;
import java.util.List;

/**
 *
 * @author Sebastián A. Petrini
 */

public class ClienteDAO extends DAO<Cliente>{

    public void borrarCliente(Cliente objeto) {
        super.borrar(objeto);
    }
  
    public void reemplazarCliente(Cliente objeto) {
        super.reemplazar(objeto); 
    }


    public void guardarCliente(Cliente objeto) {
        super.guardar(objeto); 
    }

    public Cliente buscaCliente(Integer id){
        conectar(); 
        em.getTransaction().begin();
        Cliente resultado;
        resultado = em.find(Cliente.class, id);
        em.getTransaction().commit();     
        desconectar();
        return resultado;
    }
    
    public Cliente buscaClienteN(String nombre, String apellido){
        conectar(); 
        em.getTransaction().begin();
        List<Cliente> resultado = em.createQuery("SELECT c FROM Cliente c WHERE c.nombre LIKE :nom and c.apellido LIKE :ape").setParameter("nom", nombre).setParameter("ape", apellido).getResultList();
        em.getTransaction().commit();     
        desconectar();
        if (resultado == null || resultado.isEmpty())
            return null;
        return resultado.get(0);
    }
    
    public Cliente buscaClienteDoc(Long documento){
        conectar(); 
        em.getTransaction().begin();
        List<Cliente> resultado = em.createQuery("SELECT c FROM Cliente c WHERE c.documento = :doc").setParameter("doc", documento).getResultList();
        em.getTransaction().commit();     
        desconectar();
        if (resultado == null || resultado.isEmpty())
            return null;
        return resultado.get(0);
    }
    
    public List<Cliente> listarCliente(){
        conectar();
        List<Cliente> l = em.createQuery("SELECT c FROM Cliente c").getResultList();
        desconectar();
        return l;
    }
    
    
}
