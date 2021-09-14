
package Ejercicio01;

/**
 *
 * @author WEN
 */
public class Sueldo {
   
    int horas,tarifa;
    public Sueldo(){
        
    }
    
    public int getHoras(){
        return horas;
    }
    public int getTarifa(){
        return tarifa;
    }
    
    public void setHoras(int horas){
        this.horas=horas;
    }
     public void setTarifa(int tarifa){
        this.tarifa=tarifa;
    }
       public double sueldobasico(){
        return(horas*tarifa);
    }
       public double sueldobruto(){
        return((horas*tarifa)+((horas*tarifa)*0.35));
    }
       public double sueldoneto(){
        return((horas*tarifa)-((horas*tarifa)*0.12));
    }
}
