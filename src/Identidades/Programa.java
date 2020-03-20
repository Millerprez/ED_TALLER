
package Identidades;

import java.io.Serializable;
import java.util.LinkedList;

public class Programa implements Serializable {
    private String nombre;
    private int codigo;
    private String ciclo;
    private LinkedList<TrabajoGrado> trabajosGrado;
    

    public Programa() {
        this.trabajosGrado = new LinkedList<>();
    }
    
    
}
