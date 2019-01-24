/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lira
 */
public class Fecha {
     public static boolean esBisiesto(int año) {
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
      public static int calcularDias(int mes, int año) {
        int dias=0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if (esBisiesto(año)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                dias = 0;
        }
        return dias;
    
      }
    public  static boolean esValida(String fecha) {
          int dias=0;
          int mes=0;
          int año=0;
          int dia=0;
          
         dia=Integer.parseInt(fecha.substring(0,2));
         mes=Integer.parseInt(fecha.substring(3,5));
         año=Integer.parseInt(fecha.substring(6));
         
         dias=calcularDias(mes, año);
         if(dia>=1 && dia<=dias){
             return true;
         }else{
             return false;
         }
         
    }
}

