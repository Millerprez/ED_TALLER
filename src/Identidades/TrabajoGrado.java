
package Identidades;

import java.io.Serializable;
import java.util.LinkedList;

public class TrabajoGrado implements Serializable {
    private String titulo;
    private int codigo;
    private String modalidad;
    private Asesor asesor;
    private Estudiante estudiantes[];
    private LinkedList<Estado> historial;

    public TrabajoGrado(String titulo, int codigo, String modalidad, Asesor asesor) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.modalidad = modalidad;
        this.asesor = asesor;
        this.estudiantes = new Estudiante[3];
        this.historial = new LinkedList<>();
    }

    public TrabajoGrado() {
        this.estudiantes = new Estudiante[3];
        this.historial = new LinkedList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }
    
    
    
    
    
    
    
    
}
