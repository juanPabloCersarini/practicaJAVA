/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagramasconjframe;

import java.util.Arrays;

/**
 *
 * @author Juan Pablo
 */
public class Libro {
    private String cadena1;
    private String cadena2;

    public Libro(String cadena1, String cadena2) {
        this.cadena1 = cadena1;
        this.cadena2 = cadena2;
    }
    
    public Libro(){
        
    }

    public String getCadena1() {
        return cadena1;
    }

    public void setCadena1(String cadena1) {
        this.cadena1 = cadena1;
    }

    public String getCadena2() {
        return cadena2;
    }

    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }
    
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
    
    public int buscarAnagrama(String cadena1, String cadena2){
            int cantidadAnagramas=0;
            int posicionFinal=this.cadena2.length();
            int posicionInicio=0;
            String aux, auxOrden, cadena2Orden;
            cadena2Orden = reemplazar(this.cadena2);
            cadena2Orden = ordenar(cadena2Orden);
            while (posicionFinal<=this.cadena1.length()){
                aux = this.cadena1.substring(posicionInicio, posicionFinal);
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
}
