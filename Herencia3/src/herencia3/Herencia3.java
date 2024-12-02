
package herencia3;
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

 //@author LILIANA
 
public class Herencia3 {
    public static void main(String[] args) {
       
        
//        Televisor t1=new Televisor(42,true);
//        Televisor t2=new Televisor(32,false);
//        Lavadora l1=new Lavadora(55);
//        Lavadora l2=new Lavadora(60);
        
        ArrayList<Electrodomestico>listaElectro=new ArrayList();
        
        listaElectro.add(t1);
        listaElectro.add(t2);
        listaElectro.add(l1);
        listaElectro.add(l2);
        
    

        
        for (Electrodomestico aux : listaElectro) {
            
         if (aux instanceof Electrodomestico){
        
         t1.precioFinal();
         t2.precioFinal(); 
         l1.precioFinal();
         l1.precioFinal();
         
         }
       
            
        }
        
       
      
            
    
            
        
        
    }

}
