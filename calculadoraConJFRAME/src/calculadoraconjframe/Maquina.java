/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraconjframe;

/**
 *
 * @author Juan Pablo
 */
public class Maquina {
    private double numero1;
    private double numero2;
    private String signo;

    public Maquina(double numero1, double numero2, String signo) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.signo = signo;
    }
    
    public Maquina(){
        
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
    
      public double sumar(double a, double b){
        
        return a+b;
    }
            
    public double restar(double a, double b){
        
        return a - b;
    }        
    
    public double multiplicar(double a, double b){
        
        return a * b;
    }
    
    public double dividir(double a, double b){
        return a/b;
    }
}
    
    

