/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ATrejo
 */
public class TestElevador {
    public static void main(String[] args) {
        Elevador e1= new Elevador(0,4);
        e1.cerrarPuerta();
        e1.bajarPiso();
//        e1.subirPiso();
//        e1.subirPiso();
//        e1.subirPiso();
//        e1.subirPiso();
//        e1.subirPiso();
        System.out.println("Piso: "+e1.getPisoActual());
    }
}
