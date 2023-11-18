
package com.egg.biblioteca.entidades;

/**
 *
 * @author Sebastián A. Petrini
 */

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Libro {
    @Id
    private Long isbn;
    private String titulo;
    private Integer ejemplares;
    
    @Temporal(TemporalType.DATE)
    private Date alta;
    
    @ManyToOne
    private Autor autor;
    
    @ManyToOne
    private Editorial editorial;

//    @OneToOne
//    private Imagen imagen;
        
}
