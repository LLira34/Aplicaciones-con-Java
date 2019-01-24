/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashley Quintero
 */
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
         int opc = 0;
         int numero = 0;
         NodoArbol nuevo, n1 = null;
         Arbol raiz = new Arbol();
         
        raiz.inicarRaiz();
        do{
            System.out.println("Menu de opciones "
                    + "\n 1) Insertar "
                    + "\n 2) Recorrido ProOrden"
                    + "\n 3) Recorrido InOrden"
                    + "\n 4) Recorrido PosOrden"
                    + "\n 5) Salir");
            opc = leer.nextInt();
            switch(opc){
                case 1: 
                    System.out.println("Dame un numero positivo: ");
                    numero = leer.nextInt();
                    nuevo = new NodoArbol();
                    nuevo.CreaNodo(numero);
                    n1 = raiz.insertaArbol(nuevo, n1);
                    break;
                case 2: 
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(opc != 4 );
    }
    
}
