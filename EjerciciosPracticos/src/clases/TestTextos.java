/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Lab2
 */
public class TestTextos {

    public static void main(String[] args) {
        String texto = "";
        Scanner teclado = new Scanner(System.in);

        //System.out.println("Hola");
        System.out.println("Dame una frase: ");
        texto = teclado.nextLine();
        
        System.out.println(Textos.invertir(texto));
    }

}
