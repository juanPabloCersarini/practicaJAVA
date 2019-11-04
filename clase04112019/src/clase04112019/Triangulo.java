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
public class Triangulo extends Figuras{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

  
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    @Override
    void area() {
        double area;
        area=(this.base*this.altura)/2;
        System.out.println("El área del triangulo es:  "+ area);
    }
    @Override
    void tipo(){
        System.out.println("Es un triángulo");
    }
   
}
 