/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4extra;

/**
 *
 * @author LILIANA
 */
public class profesores extends empleados{
    
    
    
    protected String departamento;
    
    profesores p1;

 
    public profesores() {
    }

    public profesores(String departamento, Integer nroDespacho, Integer anioIncorporacion, String nombre, String apellido, Integer nroIdentificacion, String estadoCivil) {
        super(nroDespacho, anioIncorporacion, nombre, apellido, nroIdentificacion, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

   
    
    
    
    
    
     public profesores crearPersona(){

     super.crearPersona();
     matriculacion();
        
     
     
     return p1;
      
    }
    
           public void matriculacion(){
          
          
          System.out.println("hola" + getNombre());
         
          
            int opcion=0;
          
           do {
            
               
               System.out.println("a que departamento pertenecen?");
               System.out.println("1-matematica");
               System.out.println("2-quimica");
               System.out.println("3-fisica");
               System.out.println("4-biologia");
               System.out.println("5-sociedad y estado");
               System.out.println("6-pensamiento cientifico");
               opcion = leer.nextInt();
               
        
         switch(opcion){
            
             case 1:
                 p1.setDepartamento("matematica");
                 break;
              case 2:
               p1.setDepartamento("quimica");
                 break;
              case 3:
                 p1.setDepartamento("fisica");
                 break;
               case 4:
                p1.setDepartamento("biologia");
                 break;
               case 5:
                 p1.setDepartamento("sociedad y estado");
                  break;
               case 6:
                 p1.setDepartamento("pensamiento cientifico");
                   break;
               default:
                 p1.setDepartamento("prefiero no estudiar");
                 break;
             
         }
          
        } while((opcion<1) || (opcion>4));
     
    }
          
          
          
      }
    
     
     
     
     
     


