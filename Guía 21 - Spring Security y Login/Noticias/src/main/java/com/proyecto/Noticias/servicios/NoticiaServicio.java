/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.Noticias.servicios;

import com.proyecto.Noticias.entidades.Noticia;
import com.proyecto.Noticias.excepciones.MiException;
import com.proyecto.Noticias.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author RoxCampos
 */
@Service
public class NoticiaServicio {
     @Autowired
    NoticiaRepositorio noticiaRepositorio;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo,String periodista) throws MiException{
        
        validar(titulo, cuerpo, periodista);
        
        Noticia noticia = new Noticia();

        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setPeriodista(periodista);
        noticia.setFechaPublicacion(new Date());
        

        noticiaRepositorio.save(noticia);
    }

    @Transactional(readOnly = true)
    public List<Noticia> listarNoticias() {

        List<Noticia> noticias = new ArrayList();

        noticias = noticiaRepositorio.findAll();

        return noticias;
    }
    
    @Transactional
    public void modificarNoticia(String id, String titulo, String cuerpo, String periodista) throws MiException{
        validar(titulo, cuerpo,periodista);

         Optional<Noticia> respuesta = noticiaRepositorio.findById(id);

        if (respuesta.isPresent()) {

          Noticia noticia = respuesta.get();

            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticia.setPeriodista(periodista);
            noticia.setFechaPublicacion(new Date());
                   
            noticiaRepositorio.save(noticia);
        }
    }
    
    @Transactional(readOnly = true)
    public Noticia getOne(String id ){
        return noticiaRepositorio.getOne(id);
    }
    @Transactional
    public void eliminar(String id) throws MiException{
        
        Noticia noticia = noticiaRepositorio.getById(id);
        
        noticiaRepositorio.delete(noticia);

    }
    
    private void validar(String titulo, String cuerpo, String periodista) throws MiException {
        
        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("el titulo de la noticia no puede ser nulo o estar vacio");
        }
        if (cuerpo.isEmpty() || cuerpo == null) {
            throw new MiException("el cuerpo de la noticia no puede ser nulo o estar vacio");
        }
        if (periodista.isEmpty() || periodista == null) {
            throw new MiException("el autor de la noticia no puede ser nulo o estar vacio");
        }
       
    }
}
