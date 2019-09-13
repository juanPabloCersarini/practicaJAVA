package ejerciciotablones;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class EjercicioTablones {
    
    // Función para validar el ingreso de datos
    
    public static boolean validar(int dato){
        boolean OK = true;
        if (dato>1 && dato<=30000){
            OK = true;  
        }else{
            OK = false;
        }
        return OK;
    }
    
    // Función que devuelve el resultado
    
    public static int buscarClavados(int[] contenedorA, int[] contenedorB, int tablones,int[] contenedorC, int clavos){
        int resultado=0;
        int entero;
        int limiteClavos = 2*clavos;
        
        //Primer paso: armar los vectores
        
        for (int i=0; i<contenedorA.length;i++){
            entero = (int) (Math.random()*limiteClavos+1);
            contenedorA[i]=entero;
        }
        
        for (int i =0; i<contenedorA.length;i++){
            entero = (int) (Math.random()*limiteClavos+1);
            if(contenedorA[i]<=entero){
                contenedorB[i]=entero;
            }else{
                i--;
            }
        }
        
        for (int i=0; i<contenedorC.length;i++){
            entero = (int) (Math.random()*limiteClavos+1);
            contenedorC[i]=entero;
        }
   
        //Segundo paso: ordenar los datos 
        Arrays.sort(contenedorA);
        Arrays.sort(contenedorB);
        Arrays.sort(contenedorC);
        
        //Buscar resultado
        
        int i=0;
        int j=0;
        boolean encontrado=true;
        while(i<=contenedorA.length && encontrado){
            if(contenedorA[i]<=contenedorC[j] && contenedorC[j]<=contenedorB[i]){
                resultado+=1;
                encontrado=true;
            }else{
                encontrado=false;
            }
            i++;
            j++;
        }
        if(resultado==0 || resultado<tablones){
            resultado = -1;
        }
        return resultado;
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tablones, clavos, clavados;
        boolean OK;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresar la cantidad de tablones [1 - 30000]: ");
        tablones = input.nextInt();
        OK = validar(tablones);
        while (OK == false) {
            System.out.print("ERROR"+"\n"+"Ingresar nuevamente la cantidad de tablones [1 - 30000]: ");
            tablones = input.nextInt();
            OK = validar(tablones);
        }
        System.out.print("Ingresar la cantidad de clavos [1 - 30000]: ");
        clavos = input.nextInt();
        OK = validar(clavos);
        while (OK == false) {
            System.out.print("ERROR"+"\n"+"Ingresar nuevamente la cantidad de clavos [1 - 30000]: ");
            clavos = input.nextInt();
            OK = validar(clavos);
        }
        int[] contenedorA = new int[tablones];
        int[] contenedorB = new int[tablones];
        int[] contenedorC = new int[clavos];
        clavados = buscarClavados(contenedorA,contenedorB,tablones,contenedorC,clavos);
        System.out.println("El resultado es: " + clavados);
    }  
}
