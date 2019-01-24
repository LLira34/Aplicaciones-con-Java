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
public class TestReloj {
    public static void main(String[] args) {
        System.out.println("Hola "+args[0]);
        Reloj r1= new Reloj(); //Instanciando
        System.out.println("Hora: "+r1.mostrarHora());
        r1.setHora(9);
        r1.setMinuto(22);
        System.out.println("Hora: "+r1.mostrarHora());
    }
}
