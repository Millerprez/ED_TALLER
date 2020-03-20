
package Identidades;

import java.io.Serializable;

public class Estudiante extends Persona implements Serializable{
    private int semestre;

    public Estudiante(int semestre) {
        this.semestre = semestre;
    }

    public Estudiante(int semestre, String nombres, String apellidos, String identifiacion, String carne) {
        super(nombres, apellidos, identifiacion, carne);
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    
    
    
    
    
}
