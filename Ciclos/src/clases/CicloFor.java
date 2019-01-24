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
public class CicloFor {

    public static void main(String[] args) {
        String palabra = "";
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Dime: ");
            palabra = teclado.nextLine();
            for (int i = 1; i <= 3; i++) {
                System.out.print(palabra + " ");
            }
        } while (!palabra.equals("adios"));
    }
}//Fin
