/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab2
 */
public class TestVolados {
    public static void main(String[] args){ //psvm
        char entrada;
        String tiro;
        Random r1= new Random();
        boolean valor;
        
        entrada= JOptionPane.showInputDialog(null, "A que le vas, Sol o Aguila?[S/A]: ").charAt(0);
        valor= r1.nextBoolean(); //Devuelve falso o verdadero de forma aleatoria
        if(valor&&entrada=='S'|| !valor&&entrada=='A'){
            System.out.println("Le atinaste, cayo Sol");
        }else{
            System.out.println("Fallaste");
        }
        
    } 
}
