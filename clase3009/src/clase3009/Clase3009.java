/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3009;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class Clase3009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tam, clave;
        String nom,ape;
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantas personas?--> ");
        tam= input.nextInt();
        Persona[] Personas = new Persona[tam];
        
        for (int i=0; i<Personas.length; i++){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Nombre: ");
            nom = entrada.nextLine();
            System.out.println("Apellido: ");
            ape = entrada.nextLine();
            System.out.println("Clave: ");
            clave = entrada.nextInt();
            Personas[i]= new Persona(nom,ape,clave);
        }
        for (int i=0; i<Personas.length;i++){
            System.out.println("Personas del vector: ");
            System.out.println("Apellido: " + Personas[i].getApellido() + " " +
                    "Nombre: " + Personas[i].getNombre() + " Clave: " + Personas[i].getClave());
            System.out.println("Con toString: ");
            System.out.println(Personas[i].toString());
            
        }
        
    }
    
}
