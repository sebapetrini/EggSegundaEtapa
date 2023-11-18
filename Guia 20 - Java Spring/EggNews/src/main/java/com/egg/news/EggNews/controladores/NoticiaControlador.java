package com.egg.news.EggNews.controladores;

import com.egg.news.EggNews.MiException.MiException;
import com.egg.news.EggNews.entidades.Noticia;
import com.egg.news.EggNews.servicios.NoticiaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Salva
 */
@Controller
@RequestMapping("/noticia")// @RequestMapping configura la url que escucha el controlador
public class NoticiaControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;

    
    @GetMapping("/registrar") //localhost:8080/autor/registrar
    public String registrar(){
        return "noticia_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String titulo,String cuerpo, ModelMap modelo){
        
        try {
            noticiaServicio.crearNoticia(titulo, cuerpo);
            modelo.put("exito", "La Noticia fué cargada correctamente!");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_form.html";
        }
        
        return "index.html";
    }
    
    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        
        List <Noticia> noticias = noticiaServicio.listarNoticias();
        
        modelo.addAttribute("noticias", noticias);
        
        return "noticia_lista.html";
    }
    
    
    
    
    
    
    

}
