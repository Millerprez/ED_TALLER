
package Identidades;

public class Persona {
   private String nombres;
   private String apellidos;
   private String identifiacion;
   private String carne;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, String identifiacion, String carne) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identifiacion = identifiacion;
        this.carne = carne;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentifiacion() {
        return identifiacion;
    }

    public void setIdentifiacion(String identifiacion) {
        this.identifiacion = identifiacion;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }
   
    public String toString(){
        return "Nombre : " + this.getNombres()+" | " +
               "Apellidos : " + this.getApellidos()+" | " +
               "Identificación" + this.getIdentifiacion()+" | " +
               "Carnét" + this.getCarne();
               
    }
   
}
