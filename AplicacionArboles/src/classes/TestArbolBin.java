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
public class TestArbolBin {
    public static void main(String[] args) {
        ArbolBin ab = new ArbolBin();
        Alumno a1= new Alumno(1, "Bere Arias", "GSI13", 7.5);
        Alumno a2= new Alumno(2, "Abi Oviedo", "GSI14", 8.5);
        Alumno a3= new Alumno(3, "Bere Arias", "GSI15", 9.5);
        String alumnos="";
        
        ab.insertar(a1);
        ab.insertar(a2);
        ab.insertar(a3);
        ab.recorridoIn(ab.getRaiz());
        alumnos = ab.getLista();
        
        Alumno a4 = new Alumno();
        a4.setNumControl(2);
        System.out.println("Lista de alumnos: ");
        System.out.println(alumnos);
        //a4= ab.buscar(a4);
        System.out.println("find data: ");
        System.out.println(a4.toString());
    }
}//End
