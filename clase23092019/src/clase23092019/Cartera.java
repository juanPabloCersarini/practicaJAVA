/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase23092019;

/**
 *
 * @author Juan Pablo
 */
public class Cartera {
   
    
    public Cartera() {
       
    }

    
    public int buscarCantidadMayores(int edad[]){
        int cantMayores=0;
        for (int i=0; i<edad.length;i++){
            
            if (edad[i]>=18){
                cantMayores+=1;
            }
        }
        return cantMayores;
    }
    
    public int buscarCantidadMenores(int edad[]){
        int cantMenores=0;
        for (int i=0; i<edad.length;i++){
            
            if (edad[i]<18){
                cantMenores+=1;
            }
        }
        return cantMenores;
    }
    
    public double calcularPromedio(int edad[]){
        double promedio=0;
        int edades=0;
        int cantCli=1;
        
        for(int i=0; i<edad.length; i++){
            edades=edades+edad[i];
            cantCli=edad.length;
            promedio=edades/cantCli;
        }    
        return promedio;
    }
    
    public void buscarMasAltaYmasBaja(int edad[], String nom[]){
        int cant=0;
        for (int i=0; i<edad.length; i++){
            cant +=1;
        }
        int  laMayor[]= new int [cant];
        String nomLaMayor[]= new String [cant];
        int  laMenor[]= new int [cant];
        String nomLaMenor[]=new String [cant];
        int min=999;
        int max=0;
        for(int i=0; i<edad.length; i++){
            for (int j=0; j<nom.length;j++){
                if (edad[i]<min){
                    min=edad[i];
                    laMenor[i]=edad[i];
                    nomLaMenor[j]=nom[j];
                }
                if (edad[i]>max){
                    max=edad[i];
                    laMayor[i]=edad[i];
                    nomLaMayor[j]=nom[j];
                }
            }
        }
        System.out.println(laMenor.length + "-----");
        for (int i=0; i<=laMayor.length;i++){
            for( int j=0; j<nomLaMayor.length;j++){
               if (nomLaMayor[j]!=null){
                    System.out.println(nomLaMayor[j] + " tiene: " + laMayor[i] + " siendo la mayor edad");
               }
            }
            
        }
        
        for (int i=0; i<=laMenor.length;i++){
            for( int j=0; j<nomLaMenor.length;j++){
                if (nomLaMenor[j]!=null){
                    System.out.println(nomLaMenor[j] +  " tiene: " + laMenor[i] + " siendo la menor edad");
                }
            }
            
        }
    }
}
