
package pruebacadenas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class PruebaCadenas {
        
        public static String reemplazar(String cadena){
            String cadenaNueva;
            cadenaNueva = cadena.replace("\\s","");
            cadenaNueva = cadenaNueva.toLowerCase().replace(",", "").replace(".", "").replace(";", "").replace(":", "");
            return cadenaNueva;
        }
        
        public static String ordenar(String cadena) {
            char[] caracteres = cadena.toCharArray();
            Arrays.sort(caracteres);
            return new String(caracteres);
        }
        
        public static int buscarAnagrama(String cadena1, String cadena2){
            int cantidadAnagramas=0;
            int posicionFinal=cadena2.length();
            int posicionInicio=0;
            String aux, auxOrden, cadena2Orden;
            cadena2Orden = reemplazar(cadena2);
            cadena2Orden = ordenar(cadena2Orden);
            while (posicionFinal<=cadena1.length()){
                aux = cadena1.substring(posicionInicio, posicionFinal);
                auxOrden=reemplazar(aux);
                auxOrden = ordenar(auxOrden);
                if (auxOrden.equalsIgnoreCase(cadena2Orden)){
                    cantidadAnagramas+=1;
                }
                posicionInicio+=1;
                posicionFinal+=1;
            }
            return cantidadAnagramas;
        }
    
        public static void mostrarResultados(int anagramas){
            System.out.println("La cadena B y/o anagramas de B en la cadena A aparecen " + anagramas + " veces.");
        }
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        String cadena1,cadena2;
        int anagramas;
        System.out.print("Ingrese primer cadena: ");
        cadena1=input.nextLine();
        System.out.print("Ingrese segunda cadena: ");
        cadena2=input.nextLine();
        anagramas=buscarAnagrama(cadena1,cadena2);
        mostrarResultados(anagramas);
    }
}


    

