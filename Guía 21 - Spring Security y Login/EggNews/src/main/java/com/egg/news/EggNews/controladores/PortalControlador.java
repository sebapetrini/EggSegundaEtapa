package com.egg.news.EggNews.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Salva
 */
@Controller
@RequestMapping("/")// @RequestMapping configura la url que escucha el controlador
public class PortalControlador {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }
}
