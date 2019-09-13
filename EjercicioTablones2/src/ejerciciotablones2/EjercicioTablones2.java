package ejerciciotablones2;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class EjercicioTablones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carpinteria carpintero = new Carpinteria();
        int tablones, clavos, clavados;
        carpintero.pedirDatos();
        tablones=carpintero.getTablones();
        clavos = carpintero.getClavos();
       
        int[] contenedorA = new int[tablones];
        int[] contenedorB = new int[tablones];
        int[] contenedorC = new int[clavos];
        clavados = carpintero.buscarClavados(contenedorA, contenedorB, tablones, contenedorC, clavos);
        System.out.println("El resultado es: " + clavados);
    } 
    
}
