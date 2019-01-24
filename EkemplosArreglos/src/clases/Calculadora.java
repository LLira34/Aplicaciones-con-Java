/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lab2
 */
public class Calculadora {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
        int n1= Integer.parseInt(args[0]);
        int n2= Integer.parseInt(args[1]);
        int resultado;
        
        resultado= n1+n2;
        System.out.println("La suma es "+resultado);
    }
}//End
