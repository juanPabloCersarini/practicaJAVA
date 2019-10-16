/* TP:
    Dados N clientes, pedir nombre y edad de c/u de ellos y obtener:
    - cantidad de clientes mayores de edad
    - cantidad de clientes menores de edad
    - promedio de edades
    - edad mas alta (informando nombre del o de los clientes)
    - edad mas baja (informando nombre del o de los clientes)
 */
package clase23092019;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class Clase23092019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cartera clientela = new Cartera();
        int medida;
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantos clientes existen??");
        medida=input.nextInt();
        int [] edad = new int[medida];
        String [] nom = new String[medida];
        for (int i=0; i<=medida-1;i++){
            System.out.println("Ingrese nombre: ");
            nom[i]=input.next();
            System.out.println("Ingrese edad: ");
            edad[i]=input.nextInt();
        }
        int mayores,menores;
        double promedio;
        mayores = clientela.buscarCantidadMayores(edad);
        System.out.println("Hay " + mayores + " mayores de edad");
        menores = clientela.buscarCantidadMenores(edad);
        System.out.println("Hay " + menores + " menores de edad");
        promedio = clientela.calcularPromedio(edad);
        System.out.println("El promedio de edad es: " + promedio);
        clientela.buscarMasAltaYmasBaja(edad, nom);
    }
    
}
