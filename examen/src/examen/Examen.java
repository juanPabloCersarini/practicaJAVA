/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Juan Pablo
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SerVivo boby=new Perro(4);
        SerVivo Juan= new Humano(2);
        
        boby.comer();
        Juan.comer();
        System.out.println("");
        Juan.sumar();
        boby.sumar();
    }
    
}
