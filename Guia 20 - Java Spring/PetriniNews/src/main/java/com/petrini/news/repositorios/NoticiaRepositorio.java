

package com.petrini.news.repositorios;

import com.petrini.news.Entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sebastián A. Petrini
 */

@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, String> {

}