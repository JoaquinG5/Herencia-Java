
package herencia2;
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

 //@author LILIANA
 
public class Herencia2 {
    public static void main(String[] args) {
    
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        Televisor tele1=new Televisor();
        Lavadora lava1=new Lavadora();
     
        tele1.crearTelevisor();
        tele1.precioFinal();
        
        lava1.CrearLavadora();
        lava1.precioFinal();

    }
}
