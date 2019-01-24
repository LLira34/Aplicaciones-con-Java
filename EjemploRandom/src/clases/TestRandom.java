/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

/**
 *
 * @author Lab2
 */
public class TestRandom {
    public static void main(String[] args){
        Random r1= new Random();
        int num;
        boolean valor;
        
        num= r1.nextInt(100)+1; //Arroja valores del 0 al 99
        System.out.println(num);
        valor= r1.nextBoolean();
        System.out.println("¿Estare con Bere?");
        System.out.println(valor);
        
        for(int i=1;i<10;i++){
            System.out.println(r1.nextDouble());
        }
    }
}
