
package herencia2extra;
import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

 //@author LILIANA
 
public class Herencia2extra {
    public static void main(String[] args) {
       
     ArrayList<Edificio> listaEdificios= new ArrayList();
        
     Edificio p1= new Polideportivo("fernando small","techado", 20.5, 40.5, 50.3);
     Edificio p2= new Polideportivo("tonna fc","no techado",25.3,53.4,47.8);

     Edificio e1= new EdificioDeOficinas(5,10,3, 4.4, 5.5, 6.6);
     Edificio e2= new EdificioDeOficinas(4, 6, 7, 4.6, 4.4, 8.7);
     
     
      listaEdificios.add(p1);
      listaEdificios.add(p2);
      listaEdificios.add(e1);
      listaEdificios.add(e2);
     
        for (Edificio aux : listaEdificios) {
            if (aux instanceof Polideportivo) {
               aux.calcularSuperficie();
               aux.calcularVolumen();   
              ((Polideportivo) aux).tipoInstalacionTecho();
            }
            if(aux instanceof EdificioDeOficinas){
              aux.calcularSuperficie();
              aux.calcularVolumen();
            ((EdificioDeOficinas)aux).cantPersonas();
            
        }
            
        }
     
    }

}
