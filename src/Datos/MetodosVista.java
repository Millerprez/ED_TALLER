/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Identidades.Asesor;
import javax.swing.JOptionPane;

/**
 *
 * @author mp6-9
 */
public class MetodosVista {

    public MetodosVista() {
        ma = new MetodosArchivo();
    }
    
    MetodosArchivo ma;
    
    public void insertAsesor(String nombres, String identificacion, String apellidos, String carne, int numTrabajos){
        try {
            Asesor a = new Asesor(numTrabajos, nombres, apellidos, identificacion, carne);
            System.out.println(a.toString());
            ma.addAsesor(a);
            JOptionPane.showMessageDialog(null, "Asesor insertado con éxito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al parecer hubo un problema", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
