/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lab2
 */
public class LectorTextos {
    public static void main(String[] args) {
        File archivo= new File("f:\\cancion.txt");
        String linea="";
        try{
            Scanner lector= new Scanner(archivo);
            while(lector.hasNext()){
                linea= lector.nextLine();
                System.out.println(linea);
            }
  
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
        
    }
    
}//Fin clase
