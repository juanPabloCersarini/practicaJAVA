
package examen;

/**
 *
 * @author Juan Pablo
 */
public abstract class SerVivo {
    protected int patas;

    public SerVivo() {
    }

    public SerVivo(int patas) {
        this.patas = patas;
    }
    
    public abstract void comer();
    
    public void sumar(){
        String a = null,b = null;
        System.out.println("La suma es: "+ a+b);
    }
}
