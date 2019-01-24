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
public class Pruebas {

    public static void main(String[] args) {
        int[] a = {2, 5, 8, 10, 20, 100, 200, 12, 1, 1000};
        int tam = 0;
        int suma = 0;
        String saludo = "Hola Abi";
        int tam2 = 0;

        tam2 = saludo.length();
        System.out.println("La palabra \"" + saludo + "\" tiene " + tam2 + " letras");

        tam = a.length;
        System.out.println("El arreglo tiene " + tam + " elementos");
        System.out.println("El primer elemento es " + a[0]);
        System.out.println("El ultimo elemento es " + a[tam - 1]);

        System.out.println("Los elementos del arreglo son: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t " + a[i]);
            suma += a[i];
        }
        System.out.println("\nLa suma de los elementos es " + suma);
    }
}//End
