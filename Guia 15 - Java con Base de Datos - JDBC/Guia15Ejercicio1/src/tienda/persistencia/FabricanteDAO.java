

package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

/**
 *
 * @author Sebastián A. Petrini
 */

public class FabricanteDAO extends DAO{

    public void guardarFabricante(Fabricante f) throws Exception {
        try {
            if (f == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO fabricante (codigo, nombre) " + "VALUES ( '" + f.getCodigo() + "' , '" + f.getNombre() + "');";
            ABM(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    
    public void eliminarFabricante(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM fabricante WHERE codigo = " + codigo + "";
            ABM(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public Collection<Fabricante> listarFabricante() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante";
            consultarBase(sql);
            Fabricante f;
            Collection<Fabricante> fl = new ArrayList();
            while (resultado.next()) {
                f = new Fabricante();
                f.setCodigo(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
                fl.add(f);
            }
            desconectarBase();
            return fl;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
}
