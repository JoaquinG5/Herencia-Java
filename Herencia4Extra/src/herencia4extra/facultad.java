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
 * Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
 * 
 * 
 * 
 * 
 */
public class facultad {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    protected String nombre;
    protected String apellido;
    protected Integer nroIdentificacion;
    protected String estadoCivil;
    facultad f= new facultad();

    public facultad() {
    }

    public facultad(String nombre, String apellido, Integer nroIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroIdentificacion = nroIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNroIdentificacion() {
        return nroIdentificacion;
    }

    public void setNroIdentificacion(Integer nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
     int opcion=0;
     
     
     
     
    public facultad crearPersona(){
        
       
        
        System.out.println("ingrese el nombre");
        f.setNombre(leer.next());
        System.out.println("ingrese el apellido");
        f.setApellido(leer.next());
        System.out.println("ingrese su numero de identificacion");
        f.setNroIdentificacion(leer.nextInt());
        EstadoCivil();
        return f;
        
    }

    
    public void EstadoCivil(){
        
        int opcion = leer.nextInt();
        
        do {
           
            System.out.println("ingrese su estado civil:1-soltero,2- casado, 3- divorciado, 4-viudo, 5-no responde");
        
         switch(opcion){
            
             case 1:
                 System.out.println("soltero");
                 f.setEstadoCivil(leer.next());
                 break;
              case 2:
                 System.out.println("casado");
                 f.setEstadoCivil(leer.next());
                 break;
              case 3:
                 System.out.println("divorciado");
                 f.setEstadoCivil(leer.next());
                 break;
               case 4:
                 System.out.println("viudo");
                f.setEstadoCivil(leer.next());
                 break;
               default:
                 System.out.println("soltero");
                f.setEstadoCivil(leer.next());
                 break;
             
         }
          
        } while((opcion<1) || (opcion>4));
     
    }
    
    
    public void cambioEstadoCivil(){
        
        System.out.println("mi estado civil es " + getEstadoCivil());
        
           int opcion = leer.nextInt();
        
        do {
           
            System.out.println("ingrese su estado civil:1-soltero,2- casado, 3- divorciado, 4-viudo, 5-no responde");
        
         switch(opcion){
            
             case 1:
                 System.out.println("soltero");
                 setEstadoCivil(leer.next());
                 break;
              case 2:
                 System.out.println("casado");
                 setEstadoCivil(leer.next());
                 break;
              case 3:
                 System.out.println("divorciado");
                 setEstadoCivil(leer.next());
                 break;
               case 4:
                 System.out.println("viudo");
                 setEstadoCivil(leer.next());
                 break;
               default:
                 System.out.println("soltero");
                 setEstadoCivil(leer.next());
                 break;
             
         }
          
        } while((opcion<1) || (opcion>4));
     
        
        
        
    }
    
    
    
    
        
    }
    
    
    
    
    

