

package com.petrini.news.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Sebastián A. Petrini
 */

@Controller
@RequestMapping("/")
public class PortalControlador {

    @GetMapping("/")
    public String index() {

        return "index.html";
    }
  
}