/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MaquinaDeCalcular laCalcu;
        // TODO code application logic here
        double numero1,numero2,res;
        laCalcu = new MaquinaDeCalcular();
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingresá el primer número: ");
        numero1 = Double.parseDouble(dato.nextLine());
        System.out.print("Ingresá el segundo número: ");
        numero2 = Double.parseDouble(dato.nextLine());
        
        System.out.print("La suma es: ");
        System.out.println(laCalcu.sumar(numero1, numero2));
        System.out.print("La resta es: ");
        System.out.println(laCalcu.restar(numero1, numero2));
        System.out.print("La multiplicación es: ");
        System.out.println(laCalcu.multiplicar(numero1, numero2));
        System.out.print("La división es: ");
        System.out.println(laCalcu.dividir(numero1, numero2));
    }
    
}
