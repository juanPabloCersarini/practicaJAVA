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
public class Humano extends SerVivo{

    public Humano(int patas) {
        super(patas);
    }

    @Override
    public void comer() {
        System.out.println("Come con cubiertos y tiene "+patas+" patas");
    }
    @Override
    public void sumar(){
        int a=5;
        int b = 6;
        int c=a+b;
        System.out.println("Los humanos suman enteros"+ c);
    }
}
