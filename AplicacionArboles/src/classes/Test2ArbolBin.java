/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author LLira
 */
public class Test2ArbolBin {
    public static void main(String[] args) {
        ArbolBin ab1 = new ArbolBin();
        ArbolBin ab2 = new ArbolBin();
        Alumno a1 = new Alumno(1234,"Bere","Spinnin",10.0);
        Alumno a2 = new Alumno(1000,"Abi","Spinnin",10.0);
        Alumno a3 = new Alumno(1111,"Cain","Spinnin",10.0);
        String lista = "";
        
        ab1.insertar(a1);
        ab1.insertar(a2);
        ab1.insertar(a3);
        ab1.recorridoIn(ab1.getRaiz());
        lista = ab1.getLista();
        
        System.out.println("Lista inicial");
        System.out.println(lista);
        
        ab1.eliminar(ab1.getRaiz(), ab2, 1234);
        ab2.recorridoIn(ab2.getRaiz());
        lista = ab2.getLista();
        
        System.out.println("Lista nueva");
        System.out.println(lista);
    }
}//End
