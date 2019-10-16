/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3009;

/**
 *
 * @author Juan Pablo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int clave;

    public Persona(String nombre, String apellido, int clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
    }
    
    public Persona(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return  "Nombre= " + nombre + ", Apellido= " + apellido + ", Clave= " + clave;
    }
    
    
    
}
