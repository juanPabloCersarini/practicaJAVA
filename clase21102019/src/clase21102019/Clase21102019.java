/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21102019;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class Clase21102019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DiaAnio hoy = new DiaAnio();
        DiaAnio cumple = new DiaAnio();
        int d,m;
        boolean same;
        Scanner input = new Scanner(System.in); 
        System.out.print("Ingresá el día de hoy: ");
        d = input.nextInt();
        System.out.print("ingresá el mes actual: ");
        m = input.nextInt();
        hoy.setDia(d);
        hoy.setMes(m);
        System.out.print("Ingresá el día de tu cumple: ");
        d = input.nextInt();
        System.out.print("Ingresá el mes de tu cumple: ");
        m = input.nextInt();
        cumple.setDia(d);
        cumple.setMes(m);
        same = hoy.igual(cumple);
        if (same){
            cumple.visualizar(cumple);
        }else{
            hoy.visualizar(hoy, cumple);
        }
        System.out.println("\nLa fecha de hoy es: ");
        hoy.visualizar();
        System.out.println("La fecha del cumple es: ");
        cumple.visualizar();
        
        
    }
    
}
