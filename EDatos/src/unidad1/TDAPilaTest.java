/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

/**
 *
 * @author LLira
 */
public class TDAPilaTest {
    public static void main(String[] args) {
        TDAPila p1= new TDAPila(10);
        int x; //variable
        p1.meter(100); //objeto
        p1.meter(200); //objeto
        p1.meter(50); //objeto
        while (!p1.estaVacia()){
            x= p1.sacar();
            System.out.println("Salió " + x);
        }//Cierrev while
    }
    
}//Ebd main
