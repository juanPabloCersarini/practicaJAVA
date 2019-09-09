/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liquidadorsueldo;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class LiquidadorSueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sueldo, bono,plus,sueldoTotal;
        String hijos;
        int categoria;
        boolean tieneHijos;
        Empresa miEmpresa = new Empresa();
        RecursosHumanos RRHH = new RecursosHumanos();
        miEmpresa.CaputarDatos();
        sueldo = miEmpresa.getSueldoBase();
        hijos = miEmpresa.getHijos();
        categoria = miEmpresa.getCategoría();
        tieneHijos = RRHH.averiguarHijos(hijos);
        bono = RRHH.calcularBono(sueldo);
        plus = RRHH.calcularPlus(sueldo, tieneHijos, categoria);
        System.out.println(miEmpresa.toString());
        sueldoTotal = sueldo + bono + plus;
        System.out.println("El sueldo a cobrar es: "+ sueldoTotal);
    }
    
}
