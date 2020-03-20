/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Identidades.Asesor;
import Identidades.Estudiante;
import Identidades.Programa;
import Identidades.TrabajoGrado;
import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetodosArchivo implements Serializable{

    public MetodosArchivo(){
        listPrograma = new LinkedList<>();
        listAsesor = new LinkedList<>();
    }
    private final LinkedList<Programa> listPrograma;
    private LinkedList<Asesor> listAsesor;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public void addPrograma(Programa programa) {
        try {
            listPrograma.add(programa);
            oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\mp6-9\\Desktop\\Programas.txt"));
            oos.writeObject(listPrograma);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(MetodosArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addEstudiante(Estudiante estudiante) {
        try {
            oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\mp6-9\\Desktop\\Estudiantes.txt"));
            oos.writeObject(estudiante);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(MetodosArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addAsesor(Asesor asesor) throws ClassNotFoundException {
        try {
            //Adding info into a list cos info will be lost every record
            listAsesor.add(asesor);
            oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\mp6-9\\Desktop\\Asesores.txt"));
            
            oos.writeObject(listAsesor);
            oos.close();
            System.out.println("LIST");
            listAsesor.stream().forEach((as) -> {
                System.out.println(as.toString());
            }); //Getting info from file
            
            System.out.println("FILE");
            ois = new ObjectInputStream(new FileInputStream("C:\\Users\\mp6-9\\Desktop\\Asesores.txt"));
            LinkedList<Asesor> li = (LinkedList<Asesor>) ois.readObject();
            ois.close();
            li.stream().forEach((a) -> {
                System.out.println(a.toString());
            }); //Getting info from file;
             
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(MetodosArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addTrabajoGrado(TrabajoGrado trabajoGrado) {
        try {
            oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\mp6-9\\Desktop\\TrabajosGrado.txt"));
            oos.writeObject(trabajoGrado);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(MetodosArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
