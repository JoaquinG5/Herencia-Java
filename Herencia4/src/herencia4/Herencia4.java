
package herencia4;
import java.util.Scanner;

 //@author LILIANA
 
public class Herencia4 {
    public static void main(String[] args) {

          Circulo circulo1= new Circulo(20d,25d);
          Rectangulo r2= new Rectangulo(30d,35d);
          
          circulo1.calcularArea();
          circulo1.calcularPerimetro();
          r2.calcularArea();
          r2.calcularPerimetro();


       
    }

}
