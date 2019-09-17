
package clase16092019;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class Clase16092019 {
    static int matriz1 [][]=null;
    static int matriz2 [][]=null;
    static Scanner input = new Scanner(System.in); 
    
    
    public static int[][] definirTamanio(int [][] X) {
        System.out.println("Ingrese el tamaño de la matriz filas&columnas: ");
        String datosIngresados= input.next();
        String datos []=datosIngresados.split("&");
        int filas = Integer.parseInt(datos[0]);
        int columnas = Integer.parseInt(datos[1]);
        X = new int [filas] [columnas];
        return X; 
    }
    public static void ingresarValores(int [][]X){
        System.out.println("Ingrese valores de la matriz");
        for (int i = 0; i<X.length; i++){
            for (int j=0; j<X[i].length;j++){
                X[i][j]= Integer.parseInt(input.next());
            }
        }
    }
    public static void mostrarValores(int [][]X){
        System.out.println("Estos son valores de la matriz");
        for (int i = 0; i<X.length; i++){
            for (int j=0; j<X[i].length;j++){
                System.out.print(X[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static int[][] matrizInvertida(int[][]X){
         
        int nueva[][]= new int [X[0].length][X.length];
        //System.out.println(X.length + " " + X[0].length);
        for (int i=0; i<X.length;i++){
            for(int j=0; j<X[i].length;j++){
                nueva[j][i]=X[i][j];
            }
        }
        return nueva;
    }
    public static void mostrarInvertida(int [][]X){
        System.out.println("Estos son valores de la matriz invertida");
        for (int i = 0; i<X.length; i++){
            for (int j=0; j<X[i].length;j++){
                System.out.print(X[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        /* para definir matrices 
        *  int array[][]=new int[filas][columnas]
        */
        
        int vector [][] = definirTamanio(matriz1);
        System.out.println("Filas: "+ vector.length);
        System.out.println("Columnas: " + vector[0].length);
        System.out.println();
        ingresarValores(vector);
        System.out.println("-------------------");
        mostrarValores(vector);
        matriz2=matrizInvertida(vector);
        mostrarInvertida(matriz2);
    }
    
}
