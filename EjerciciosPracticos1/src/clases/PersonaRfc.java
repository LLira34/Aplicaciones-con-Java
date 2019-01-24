/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lira
 */
public class PersonaRfc {//Todas las clases esta herando de la clase Object
    
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String fechaNac;
    private String rfc;

    
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellidoP(String apellidoP){
        this.apellidoP=apellidoP;
    }
      public void setApellidoM(String apellidoM){
        this.apellidoM=apellidoM;
    }
      public void setFechaNac(String fechaNac){
        this.fechaNac=fechaNac;
    }
    public String getRfc(){
        return rfc;
    }
    
    public void cacularRfc(){
        int pos=0;
        char letra=' ';
        rfc=""+apellidoP.charAt(0);
        
        for(int i=1; i<apellidoP.length(); i++){
            letra=apellidoP.charAt(i);
            if(letra=='A'|| letra=='E'|| letra=='I'|| letra=='O'|| letra=='U'){
                pos=i;
                break;
            }
        }
        rfc=rfc+apellidoP.charAt(pos);
        rfc=rfc+apellidoM.charAt(0);
        rfc=rfc+nombre.charAt(0);
        rfc=rfc+fechaNac.substring(8);
        rfc=rfc+fechaNac.substring(3, 5);
        rfc=rfc+fechaNac.substring(0, 2);
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre+ "\n Apellido Paterno: "+ apellidoP+ "\n Apellido Materno: "+ apellidoM+
                "\n Fecha de Nacimiento: "+ fechaNac+ "\n Rfc: "+ rfc;
    }

}

