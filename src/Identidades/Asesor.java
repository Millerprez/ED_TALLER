
package Identidades;

import java.io.Serializable;

public class Asesor extends Persona implements Serializable{
    private int numTrabajos;

    public Asesor(int numTrabajos) {
        this.numTrabajos = numTrabajos;
    }
    
    public Asesor(int numTrabajos, String nombres, String apellidos, String identifiacion, String carne) {
        super(nombres, apellidos, identifiacion, carne);
        this.numTrabajos = numTrabajos;
    }

    public int getNumTrabajos() {
        return numTrabajos;
    }

    public void setNumTrabajos(int numTrabajos) {
        this.numTrabajos = numTrabajos;
    }
    
    @Override
    public String toString(){
        return "Nombre : " + this.getNombres() +
               " Apellidos : " + super.getApellidos() +
               " Identificación : " + super.getIdentifiacion() +
               " Carnét : " + super.getCarne() +
               " Número de trabajos : " + this.numTrabajos + "\n";
    }
    
}
