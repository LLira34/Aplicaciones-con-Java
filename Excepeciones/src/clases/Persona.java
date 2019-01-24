/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ATrejo
 */
public class Persona {
    //Atributos
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String fechaNac;
    private String rfc;
    
    //Métodos
    private boolean tieneNumeros(String str){ //nuevo metodo que revisa si se contienen numeros
        if(str.matches(".*\\d.*")) //metodo matches de String
            return true;
        else
            return false;
    }
    
    public void setNombre(String nombre) throws Exception{ //Se define nueva exepcion
        if(nombre == null || nombre.isEmpty())                                //Metodo isEmpty de String
            throw new Exception("El nombre no puede ser nulo");
        if(tieneNumeros(nombre))
            throw new Exception("El nombre no puede contener numeros");
        this.nombre= nombre;
    }
    
    public void setApellidoP(String apellidoP) throws Exception{
        if(apellidoP == null || apellidoP.isEmpty())
            throw new Exception("El apellido paterno no puede ser nulo");
        if(tieneNumeros(apellidoP))
            throw new Exception("El apellido paterno no puede contener numeros");
        this.apellidoP= apellidoP;
    }
    
    public void setApellidoM(String apellidoM) throws Exception{
        if(apellidoM == null || apellidoM.isEmpty())
            throw new Exception("El apellido materno no puede ser nulo");
        if(tieneNumeros(apellidoM))
            throw new Exception("El apellido materno no puede contener numeros");
        this.apellidoM= apellidoM;
    }
    
    public void setFechaNac(String fechaNac) throws Exception{
        if(!fechaNac.matches("\\d{2}/\\d{2}/\\d{4}"))
            throw new Exception("Se debe respetar el formato de fecha (dd/mm/aaaa)");
        this.fechaNac= fechaNac;
    }
    
    public void calcularRfc(){
        rfc= ""+apellidoP.charAt(0);
        int pos=0;
        char letra=' ';
        for(int i=1;i<apellidoP.length();i++){
            letra= apellidoP.charAt(i);
            if(letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U'){
                pos=i;
                break;
            }
        }
        rfc= rfc+apellidoP.charAt(pos);
        rfc= rfc+apellidoM.charAt(0);
        rfc= rfc+nombre.charAt(0);
        rfc= rfc+fechaNac.substring(8);
        rfc= rfc+fechaNac.substring(3, 5);
        rfc= rfc+fechaNac.substring(0, 2);
    }
    
    public String getRfc(){
        return rfc;
    }
    
}//Fin de la clase