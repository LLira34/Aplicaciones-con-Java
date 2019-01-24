/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author FamLira
 */
public class MesesDia {
    public static void main(String[] args) {
        int mes=0;
        int dias=0;
        Scanner teclado= new Scanner(System.in);//<-----
        String[] meses={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        System.out.println("Ingresa el mes ");
        mes= teclado.nextInt();
        //mes= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de mes"));
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias=31;
                break;
            case 4: case 6: case 9: case 11:
                dias=30;
                break;
            case 2:
                dias=28;
                break;
                
            default :
                //JOptionPane.showMessageDialog(null,"Mes no válido");
                System.out.println("Mes no válido");
        }
        //JOptionPane.showMessageDialog(null,"El mes de "+meses[mes-1]+" tiene "+dias+" días");
        System.out.println("El mes de "+meses[mes-1]+" tiene "+dias+" días");
    }
    
}
