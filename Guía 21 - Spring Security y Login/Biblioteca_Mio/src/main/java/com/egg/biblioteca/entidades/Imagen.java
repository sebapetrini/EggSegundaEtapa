
package com.egg.biblioteca.entidades;

/**
 *
 * @author Sebastián A. Petrini
 */

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import org.hibernate.annotations.GenericGenerator;
import lombok.Data;

@Entity
@Data
public class Imagen {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id; 
    private String mime;  
    private String nombre; 
    @Lob @Basic(fetch = FetchType.LAZY)
    private byte[] contenido;
}
