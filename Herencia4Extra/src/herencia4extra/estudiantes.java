/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4extra;

import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class estudiantes extends facultad {
    
    
    protected String Curso;
   facultad f;
   estudiantes e;
  
    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

      public estudiantes() {
    }

    public estudiantes(String Curso, String nombre, String apellido, Integer nroIdentificacion, String estadoCivil) {
        super(nombre, apellido, nroIdentificacion, estadoCivil);
        this.Curso = Curso;
    }


    public void crearPersona(){
//
//      f=new facultad();
//      e=new estudiantes();s
//      f=crearPersona();
//      e.setNombre(f.getNombre());
//      e.setApellido(f.getApellido());
//      e.setNroIdentificacion(f.getNroIdentificacion());
//      e.setEstadoCivil(f.getEstadoCivil());
//      matriculacion();
      
      super.crearPersona();
      matriculacion();
      
    }
    
      public void matriculacion(){
          
          
          System.out.println("hola" + getNombre());
          System.out.println("en que materia te vas a anotar?");
          
            int opcion=0;
          
           do {
           
               System.out.println("ingrese la materia que quiere cursar:");
               System.out.println("1-matematica");
               System.out.println("2-quimica");
               System.out.println("3-fisica");
               System.out.println("4-biologia");
               System.out.println("5-sociedad y estado");
               System.out.println("6-pensamiento cientifico");
               opcion = leer.nextInt();
               
        
         switch(opcion){
            
             case 1:
                 f2.setCurso("matematica");
                 break;
              case 2:
                f2.setCurso("quimica");
                 break;
              case 3:
                 f2.setCurso("fisica");
                 break;
               case 4:
                f2.setCurso("biologia");
                 break;
               case 5:
                 f2.setCurso("sociedad y estado");
                  break;
               case 6:
                  f2.setCurso("pensamiento cientifico");
                   break;
               default:
                 setCurso("prefiero no estudiar");
                 break;
             
         }
          
        } while((opcion<1) || (opcion>4));
     
    }
          
          
          
      }
    
    
    

