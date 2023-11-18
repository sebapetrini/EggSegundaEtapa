
package com.egg.biblioteca.repositorios;

/**
 *
 * @author Sebastián A. Petrini
 */

import com.egg.biblioteca.entidades.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepositorio extends JpaRepository<Imagen, String>{

}
