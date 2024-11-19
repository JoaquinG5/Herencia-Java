
package herencia2;
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

 //@author LILIANA
 
public class Herencia2y3 {
    public static void main(String[] args) {
    
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Electrodomestico f=new Electrodomestico() {};
        
        ArrayList<Electrodomestico>listaElec=new ArrayList();
        Lavadora l=new Lavadora();
        Televisor t=new Televisor();
        
        l.CrearLavadora(f);
        l.
        t.crearElectrodomestioo();
        
        String letra;
        
        do {
            
          
            System.out.println("agregar electrodomesticos a nuestra lista");
            System.out.println("inserte que electrodomestico agregara");
            letra=leer.next();
            
            if(letra.equalsIgnoreCase("t")){
             
                listaElec.add(t);
            
            
            }else if (letra.equalsIgnoreCase("l")){
            
            listaElec.add(l);
            
            }else{
            
            
                System.out.println("inserte otra letra");
            
            }
            
            System.out.println("agregara mas electrodomesticos(s/n)?");
            letra=leer.next();
            
            
        } while (letra.equalsIgnoreCase("s"));

        
        
        
        for (Electrodomestico aux : listaElec) {
            
            l.precioFinal(f);
            t.precioFinal(f);
        }
        
//        System.out.println("---------------------------------------");
//      
//      Televisor tele=new Televisor();
//      
//      tele.crearTelevisor();
//      tele.precioFinal(tele);
       
    }

}
