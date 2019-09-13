package ejerciciotablones2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class Carpinteria {
    int tablones;
    int clavos;
    //int[] contenedorA = new int[tablones];
    //int[] contenedorB = new int[tablones];
    //int[] contenedorC = new int[clavos];
   

    public Carpinteria(int[] contenedorA, int[] contenedorB, int[] contenedorC, int tablones, int clavos) {
       // this.contenedorA = contenedorA;
       // this.contenedorB = contenedorB;
       // this.contenedorC = contenedorC;
        this.tablones = tablones;
        this.clavos = clavos;
    }
    
    public Carpinteria(){
        
    }

    /*public int[] getContenedorA() {
        return contenedorA;
    }

    public void setContenedorA(int[] contenedorA) {
        this.contenedorA = contenedorA;
    }

    public int[] getContenedorB() {
        return contenedorB;
    }

    public void setContenedorB(int[] contenedorB) {
        this.contenedorB = contenedorB;
    }

    public int[] getContenedorC() {
        return contenedorC;
    }

    public void setContenedorC(int[] contenedorC) {
        this.contenedorC = contenedorC;
    }*/

    public int getTablones() {
        return tablones;
    }

    public void setTablones(int tablones) {
        this.tablones = tablones;
    }

    public int getClavos() {
        return clavos;
    }

    public void setClavos(int clavos) {
        this.clavos = clavos;
    }
    
    public boolean validar(int dato){
        boolean OK = false;
        if (dato>1 && dato<=30000){
            OK = true;  

        }
        return OK;
    }
    
    public void pedirDatos(){
        Scanner input = new Scanner(System.in);
        boolean OK;
        System.out.print("Ingresar la cantidad de tablones [1 - 30000]: ");
        this.tablones = input.nextInt();
        OK = validar(this.tablones);
        while (OK == false) {
            System.out.print("ERROR"+"\n"+"Ingresar nuevamente la cantidad de tablones [1 - 30000]: ");
            this.tablones = input.nextInt();
            OK = validar(this.tablones);
        }
        System.out.print("Ingresar la cantidad de clavos [1 - 30000]: ");
        this.clavos = input.nextInt();
        OK = validar(this.clavos);
        while (OK == false) {
            System.out.print("ERROR"+"\n"+"Ingresar nuevamente la cantidad de clavos [1 - 30000]: ");
            this.clavos = input.nextInt();
            OK = validar(this.clavos);
        }
    }
    public int buscarClavados(int[] contenedorA, int[] contenedorB, int tablones,int[] contenedorC, int clavos){
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
                System.out.println("ok");
                encontrado=true;
            }else{
                encontrado=false;
            }
            i++;
            j++;
        }
        System.out.println(resultado);
        if(resultado==0 || resultado<this.tablones){
            resultado = -1;
        }
        return resultado;
    }
}
