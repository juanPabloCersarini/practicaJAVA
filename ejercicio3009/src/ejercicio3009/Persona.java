/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3009;

/**
 *
 * @author Juan Pablo
 */
public class Persona {
    
    private String nombre,escala;
    private double peso, altura,IMC;
    private int edad;

    public Persona(String nombre, double peso, double altura, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        
    }

    
    
    public Persona(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    
    public double getIMC(){
        return IMC;
    }
    
    public String getEscala(){
        return escala;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setIMC(double IMC) {
        this.IMC=IMC;
    }
    
    public void setEscala(String escala){
        this.escala =escala;
    }
    
    public double calcularIMC(double peso, double altura){
        double indice;
        indice= peso/(altura*altura);
        this.IMC=indice;
        return this.IMC;
    }
    
    public String informarEscala(double IMC){
        String resultado;
        if (IMC <16){
            resultado = "DELGADEZ SEVERA";
            
        }else{
            if (IMC > 16 && IMC <16.99){
                resultado = "DELGADEZ MODERADA";
            }else{
                if (IMC >=17 && IMC <18.49){
                    resultado ="DELGADEZ ACEPTABLE";
                }else{
                    if(IMC>18.50 && IMC<24.99){
                        resultado="PESO NORMAL";
                    }else{
                        resultado="SOBREPESO";
                    }
                }
        }
            
        }
        this.escala=resultado;
        return this.escala;
    }
   /* @Override
    public String toString() {
        return  "Nombre= " + nombre + ", Apellido= " + apellido + ", Clave= " + clave;
    }*/
    
    

}
