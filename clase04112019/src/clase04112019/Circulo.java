/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04112019;

/**
 *
 * @author Juan Pablo
 */
public class Circulo extends Figuras{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
  

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    void area(){
        double area;
        area=3.14*(this.radio*this.radio);
        System.out.println("El área del círculo es: "+ area);
    }    
    @Override
    void tipo(){
        System.out.println("Esto es un circulo");
    }
}

