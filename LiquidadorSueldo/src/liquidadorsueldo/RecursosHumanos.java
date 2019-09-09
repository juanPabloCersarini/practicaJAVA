package liquidadorsueldo;

/**
 *
 * @author Juan Pablo
 */
public class RecursosHumanos extends Empresa{
      
      
    public double calcularBono(double sueldo){
        double bono;
        if (sueldo>2000){
            bono= sueldo*0.15;
        }else{
            bono=sueldo*0.20;
        }
        return bono;
    }
    
    public boolean averiguarHijos(String hijos){
        boolean tieneHijos;
        if ("s".equals(hijos) || "S".equals(hijos)){ 
            tieneHijos = true;
        }else{
            tieneHijos = false;
        }
        return tieneHijos;
    }
    public double calcularPlusHijos(double sueldo, boolean tieneHijos){
        double plusH;
        if (tieneHijos){
            plusH = sueldo*0.05;
        }else{
            plusH = 0;
        }
        return plusH;
    }
    
    public  double calcularPlusCat(double sueldo, int cat){
        double plusC;
        if(cat<=3){
            plusC= sueldo*0.10;
        }else{
            if(cat>=4 && cat<=6){
                plusC=sueldo*0.12;                
            }else{
                plusC=sueldo*0.20;
            }
        }
        return plusC;
    }
    public double calcularPlus(double sueldo,boolean tieneH, int cat){
        double plusPorHijos, plusPorCat,plusTotal;
        plusPorHijos= calcularPlusHijos( sueldo, tieneH);
        plusPorCat=calcularPlusCat(sueldo,cat);
        if ((tieneH)&&(cat<=6)){
            plusTotal=plusPorHijos + plusPorCat;
        }else{
            plusTotal=plusPorHijos;
        }
        return plusTotal;
    }
           
        
    
}
