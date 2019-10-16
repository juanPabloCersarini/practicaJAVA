/*Calcular el IMC
Clase Persona con nombre edad peso altura
*/
package ejercicio3009;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class Ejercicio3009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tam,edad;
        double altura,peso,indice;
        String nombre,resultado;
        Scanner input = new Scanner(System.in);
        System.out.println("Tamaño");
        tam = input.nextInt();
        Persona[] personas = new Persona[tam];
       // imc=0;
       // resultado="";
        for(int i=0; i<personas.length;i++){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Edad: ");
            edad = entrada.nextInt();
            System.out.println("Peso: ");
            peso = entrada.nextDouble();
            System.out.println("Altura ");
            altura = entrada.nextDouble();
            personas[i]= new Persona(nombre,peso,altura,edad);
            indice=personas[i].calcularIMC(peso, altura);
            resultado= personas[i].informarEscala(indice);
            personas[i].setIMC(indice);
            personas[i].setEscala(resultado);
            
        }
        for(int i=0; i<personas.length;i++){
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Edad: " + personas[i].getEdad());
            System.out.println("Peso: " + personas[i].getPeso());
            System.out.println("Altura: " + personas[i].getAltura());
            
            System.out.println("IMC: " + personas[i].getIMC());
            
            System.out.println("Tu estado es: " + personas[i].getEscala());
            
        }
        
    }
    
}
