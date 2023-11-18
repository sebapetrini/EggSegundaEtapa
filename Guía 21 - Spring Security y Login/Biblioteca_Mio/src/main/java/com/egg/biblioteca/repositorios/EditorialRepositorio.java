
package com.egg.biblioteca.repositorios;

/**
 *
 * @author Sebastián A. Petrini
 */

import com.egg.biblioteca.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial,String> {

}
