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
public class Perro extends SerVivo{

    Perro( ) {
        
    }

    public Perro(int patas) {
        super(patas);
    }
    
    @Override
    public void comer(){
        System.out.println("Come en su tazon y tiene "+patas+ " patas"); 
    }
    
    @Override
    public void sumar(){
        String a="pe";
        String b="RRO";
        System.out.println("Los perron suman cadenas: "+ a+b);
    }
}
