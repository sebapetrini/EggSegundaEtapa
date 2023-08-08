

package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 *
 * @author Sebastián A. Petrini
 */

public class ProductoDAO extends DAO{

    public void guardarProducto(Producto p) throws Exception {
        try {
            if (p == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) " + "VALUES ( '" + p.getCodigo() + "' , '" + p.getNombre() + "' , '" + p.getPrecio() + "', '" + p.getCodigo_fabricante() + "');";
            ABM(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void modificarProducto(Producto p) throws Exception {
        try {
            if (p == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE producto SET " + " codigo = '" + p.getCodigo() + "' , nombre = '" + p.getNombre() + "' , precio = " + p.getPrecio() + ", codigo_fabricante = " + p.getCodigo_fabricante() + " WHERE codigo = " + p.getCodigo() ;
            ABM(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void eliminarProducto(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE codigo = " + codigo + "";
            ABM(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public Collection<Producto> listarProducto(String filtro) throws Exception {
        try {
            String sql = "SELECT * FROM producto " + filtro;
            consultarBase(sql);
            Producto p;
            Collection<Producto> pl = new ArrayList();
            while (resultado.next()) {
                p = new Producto(resultado.getInt("codigo"), resultado.getString("nombre"), resultado.getDouble("precio"), resultado.getInt("codigo_fabricante"));
                pl.add(p);
            }
            desconectarBase();
            return pl;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
}
