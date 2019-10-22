/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21102019;

/**
 *
 * @author Juan Pablo
 */
public class DiaAnio {
    private int dia;
    private int mes;

    public DiaAnio(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }
    public DiaAnio(){
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public  boolean igual ( DiaAnio cumple){
        boolean esIgual=false;
        if ((this.dia==cumple.dia)&&(this.mes==cumple.mes)){
            esIgual = true;
        }
        return esIgual;
    }
    public  void visualizar(DiaAnio cumple){
       
            System.out.print("Es tu cumpleaños!! MUCHAS FELICIDADES\n" + cumple.dia + "/" + cumple.mes);
    }
    public  void visualizar(DiaAnio hoy, DiaAnio cumple){
       
            System.out.print("Hoy es " + hoy.dia + "/" + hoy.mes +"\nTenés que esperar para festejar al: " + cumple.dia + "/" + cumple.mes );
        
    }
    public void visualizar(){
        System.out.println("Dia: " + this.dia + " " + "Mes: " + this.mes  );
    }
}
