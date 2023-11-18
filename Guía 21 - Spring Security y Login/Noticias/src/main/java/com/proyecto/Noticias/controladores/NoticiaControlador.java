/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.Noticias.controladores;

import com.proyecto.Noticias.entidades.Noticia;
import com.proyecto.Noticias.excepciones.MiException;
import com.proyecto.Noticias.servicios.NoticiaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author RoxCampos
 * 
 */
@Controller
@RequestMapping("/noticia") //localhost:8080/Noticia
public class NoticiaControlador {
    
  @Autowired
    private NoticiaServicio noticiaServicio;
       
    @GetMapping("/registrar") //localhost:8080/Noticia/registrar
    public String registrar(){
        return "noticia_form.html";
    }
    
    
    @PostMapping("/registro")
    public String registro(@RequestParam String titulo, String cuerpo, String periodista, ModelMap modelo){
        
        try {
            noticiaServicio.crearNoticia(titulo,cuerpo,periodista);
            
            modelo.put("exito", "La noticia fue registrada correctamente!");
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
        
        return "noticia_list.html";
    }
    
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo){
        
        modelo.put("noticia", noticiaServicio.getOne(id));
        
        return "noticia_modificar.html";
    }
    
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String titulo, String cuerpo,String periodista, ModelMap modelo){
        try {
            noticiaServicio.modificarNoticia(id,titulo,cuerpo,periodista);
            
            return "redirect:../lista";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_modificar.html";
        }
        
    }
    
   // @GetMapping("{id}")
    public String eliminar(@PathVariable String id, ModelMap modelo) throws MiException{
        noticiaServicio.eliminar(id);
        
        return "noticia_modificar.html";
    }
}
