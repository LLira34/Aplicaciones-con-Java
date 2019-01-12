/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author LLira
 */
public class MergeTest {
    public static void main(String[] args) {
      int[] vector1 = {3,5,8,12,17};
      int[] vector2 = {1,6,9,24,50,100,102,190,234};
      int[] vector3;
      
      vector3 = Ordenamientos.mezcla(vector1, vector2);
        System.out.println("Arreglo ordenado.");
        for (int elemento: vector3) {
            System.out.print("\t  " + elemento);
        }
    }
	
} // End
