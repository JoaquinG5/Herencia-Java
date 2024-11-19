
package herencia1;
import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import java.util.Scanner;


 
public class Herencia1 {
    public static void main(String[] args) {
       
        Animal perro1= new Perro("jose","doberman",8,"croquetas");
        perro1.alimentarse();
        
        Animal perro2= new Perro("juan","salchicha",4,"verduras");
        perro2.alimentarse();
         
        Animal gato1= new Gato("j","siames",3,"lechuga");
        gato1.alimentarse();
        
        Animal caballo1= new Caballo("orlando","arabe",12,"terron de azucar");
        caballo1.alimentarse();
    }

}
