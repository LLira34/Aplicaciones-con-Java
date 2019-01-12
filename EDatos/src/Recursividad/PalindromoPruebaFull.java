/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.util.Scanner;

/**
 *
 * @author LLira
 */
public class PalindromoPruebaFull {
    public static void main(String[] args) {
        Scanner em = new Scanner(System.in);
        String cade = em.nextLine();
        
        int con = 1; //Contador
        for(int i=0; i<cade.length(); i++){
            if(cade.charAt(i) != cade.charAt(cade.length()-1-i)){
                con = 0; break;
            }
        }
        System.out.println(con == 1 ? "Es palindromo" : "No es palindromo");
    }
    
}//End_Class
