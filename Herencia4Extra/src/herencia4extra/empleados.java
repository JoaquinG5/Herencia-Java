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
public class empleados extends facultad{
    
    protected Integer nroDespacho;
    protected Integer anioIncorporacion;
    facultad f2= new facultad();
    empleados em1= new empleados();

   
    public empleados() {
    }


    public empleados(Integer nroDespacho, Integer anioIncorporacion, String nombre, String apellido, Integer nroIdentificacion, String estadoCivil) {
        super(nombre, apellido, nroIdentificacion, estadoCivil);
        this.nroDespacho = nroDespacho;
        this.anioIncorporacion = anioIncorporacion;
    }

    public Integer getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(Integer nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    public Integer getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(Integer anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }
    
     public empleados crearEmpleados(){
//

     super.crearPersona();
     matriculacion();
     



      f2=new facultad();
      em1=new empleados();
      f2=crearPersona();
      em1.setNombre(f2.getNombre());
       em1.setApellido(f2.getApellido());
       em1.setNroIdentificacion(f2.getNroIdentificacion());
       em1.setEstadoCivil(f2.getEstadoCivil());
         System.out.println("ingrese su año de incorporacion");
       em1.setAnioIncorporacion(leer.nextInt());
         System.out.println("ingrese su numero de despacho");
       em1.setNroDespacho(leer.nextInt());
       
        return em1;
      
    }
    
    
    
}
