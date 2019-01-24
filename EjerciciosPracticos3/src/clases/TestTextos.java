/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editorhol
 */
package clases;


import java.util.Scanner;


/**
 *
 * @author Alondra
 */
public class TestTextos {

    public static void main(String[] args) {

        String texto = "";
        Scanner teclado = new Scanner(System.in);//se lee lo ingresado 
        System.out.println("Dame el texto");
        texto = teclado.nextLine();//todo lo que se lee en la siguiente linea

        System.out.println(Textos.invertir(texto));
        System.out.println(Textos.calcularPalindromo(texto));
        
        
        
    }
}
