/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Lab2
 */
public class Arregos {

    public static void main(String[] args) {
        double[] temp = {12.5, 20.7, 18.9, 32.0, 24.8, 21.0, 14.9};
        int dia = 0;
        Scanner teclado = new Scanner(System.in);
        boolean ban = false;

        do {
            try {
                System.out.println("La temperatura de que dia deseas saber?");
                dia = teclado.nextInt();
                System.out.println("La temperatura es " + temp[dia - 1]);
                ban= true;
            } catch (InputMismatchException e) {
                System.err.println("Error en la entrada, debe ser un entero we");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error, el rango de valores es del 1 al 7");
            }finally{
                teclado.nextLine();
            }
        } while (!ban);
        System.out.println("Temperaturas de la semana");
        double suma=0.0;
        for(double elemento: temp){
            System.out.println(elemento);
            suma += elemento;
        }
        System.out.println("El promedio de temperaturas es "+suma/temp.length);
    }
}//End
