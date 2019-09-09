
package liquidadorsueldo;

import java.util.Scanner;

/**
 * La idea es calcular el sueldo a cobrar por el empleado según lo siguiente:
 * Se paga bono adicional del 15% si el sueldo base supera los 2000 o 20% en caso contrario
 * Plus del 5% si tiene hijos
 * Plus por categoria:
 *  - 1,2,3 -> paga el 20%
 *  - 4,5,6 -> paga el 12%
 *  - 7,8,9 -> paga un 20% pero no paga plus por hijo
 * 
 * @author Juan Pablo
 */
public class Empresa {
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private double sueldoBase;
    private String hijos;
    private int categoría;

    public Empresa() {
    }

    public Empresa(String nombreEmpleado, String apellidoEmpleado, double sueldoBase, String hijos, int categoría) {
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.sueldoBase = sueldoBase;
        this.hijos = hijos;
        this.categoría = categoría;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getHijos() {
        return hijos;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }

    public int getCategoría() {
        return categoría;
    }

    public void setCategoría(int categoría) {
        this.categoría = categoría;
    }
    
    public void CaputarDatos(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nombre del Empleado: ");
        this.nombreEmpleado = input.nextLine();
        System.out.print("Apellido del Empleado: ");
        this.apellidoEmpleado = input.nextLine();
        System.out.print("Ingresar el sueldo Base: ");
        this.sueldoBase = Double.parseDouble(input.nextLine());
        System.out.print("Tiene hijos (s/n)?: ");
        this.hijos = input.nextLine();
        System.out.print("Ingrese categoría (1 - 9): ");
        this.categoría = Integer.parseInt(input.nextLine());
    }
    
    public String toString(){
        return "*************************"+"\n"+
               "* LIQUIDACION DE SUELDO *"+"\n"+
               "*************************"+"\n"+
               "Nombre y Apellido del Empleado: " + this.nombreEmpleado +" " + this.apellidoEmpleado;
    }
}
