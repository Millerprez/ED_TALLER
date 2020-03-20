
package Identidades;

import java.io.Serializable;
import java.util.Date;

public class Estado implements Serializable{
    private Date fechaCreacion;
    private String descripcion;

    public Estado(Date fechaCreacion, String descripcion) {
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
    }

    public Estado() {
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
