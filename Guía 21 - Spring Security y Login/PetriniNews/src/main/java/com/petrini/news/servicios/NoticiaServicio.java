

package com.petrini.news.servicios;

import com.petrini.news.Entidades.Noticia;
import com.petrini.news.MiException.MiException;
import com.petrini.news.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sebastián A. Petrini
 */

@Service
public class NoticiaServicio {

     @Autowired
     NoticiaRepositorio noticiaRepositorio;
     
     @Transactional
    public void crearNoticia(String titulo, String cuerpo) throws MiException{
        
        validar(titulo, cuerpo);
        
        Noticia noticia = new Noticia();

        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        
        noticiaRepositorio.save(noticia);        

    }
    
     @Transactional(readOnly = true)
    public List<Noticia> listarNoticias() {

        List<Noticia> noticias = new ArrayList();

        noticias = noticiaRepositorio.findAll();

        return noticias;
    }

    @Transactional
    public void modificarNoticia(String id, String titulo, String cuerpo) throws MiException {
        
        //validar(id, titulo, cuerpo);

        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);

        if (respuesta.isPresent()) {

            Noticia noticia = respuesta.get();

            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticiaRepositorio.save(noticia);
        }

    }

    @Transactional(readOnly = true)
    public Noticia getOne(String id) {
        return noticiaRepositorio.getOne(id);
    }

    private void validar(String titulo, String cuerpo) throws MiException {

        
        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("La noticia no puede estar  vacia o ser nula");
        }
          if (cuerpo.isEmpty() || cuerpo == null) {
            throw new MiException("La noticia no puede estar  vacia o ser nula");
        }
        
    }
    
    
    
     
}
