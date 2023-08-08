/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Cliente;
import Entidades.Libro;
import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Pablo Barberis
 */
public class ClienteDAO extends DAO<Cliente>{
    
    public void guardarCliente(Cliente cliente){
        super.guardar(cliente);
    }
    
    public void reemplazarCliente(Cliente cliente){
        super.reemplazar(cliente);
    }
    
    public void borrarCliente(Cliente cliente){
        super.borrar(cliente);
    }
    
        public Cliente buscarClienteDNI(Long documento){
        conectar(); 
        em.getTransaction().begin();
        List<Cliente> resultado = em.createQuery("SELECT c FROM Cliente c WHERE c.documento = :documento").setParameter("documento",documento).getResultList();
        em.getTransaction().commit();     
        desconectar();
        if (resultado == null || resultado.isEmpty())
            return null;
        return resultado.get(0);
    }
    
}
