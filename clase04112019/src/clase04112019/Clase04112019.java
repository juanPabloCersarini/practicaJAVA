package clase04112019;

import java.util.Scanner;

public class Clase04112019 {

   /* Crear una clase abstracta figura con 2 metodos (area() y tipo())
    * Crear clases hijas:
    * - triangulo (atributos base y altura)
    * - el método área() mostrará el area del triangulo y el metodo tipo()
    *   mostrará un cartel indicando que la figura es un triángulo.
    * - circulo (atributos radio (entero)
    * - el metodo area mostrara el area del circulo
    * - el metodo tipo mostrara un cartel que la figura es un circulo
    */
    public static void main(String[] args) {
              // TODO code application logic here
        Figuras fig = new Triangulo(10,5);
        
       fig.area();
       fig.tipo();
        fig = new Circulo(3);
        fig.area();
        fig.tipo();
    }
    
}
