/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lab2
 */
public class Temperaturas {

    public static void main(String[] args) {
        double[] temp = {12.3, 99.6, 48.2, 65.8, 120.4, 23.9};
        String[] nombres = {"Pablo", "Ana", "Abigail", "Lalo", "Carolina", "Cain", "Ganzo"};

        double max = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        System.out.println("La temperatura maxima es " + max);

        System.out.println("Temperaturas originales");
        for (int i = 0; i < temp.length; i++) {
            System.out.println("\n" + temp[i]);
        }

        System.out.println("");
        temp = ordBurbuja(temp);

        System.out.println("Temperaturas ordenadas");
        for (int i = 0; i < temp.length; i++) {
            System.out.print("\t " + temp[i]);
        }

        System.out.println("\nLIsta de nombres originales");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        nombres = ordBurbuja(nombres);
        System.out.println("Lista ordenada");
        for (int i = 0; i < temp.length; i++) {
            System.out.print("\t " + temp[i]);
        }
    }

    public static double[] ordBurbuja(double[] datos) {
        double tempo = 0.0;//<--
        for (int pivote = 0; pivote < datos.length - 1; pivote++) {
            for (int k = pivote + 1; k < datos.length; k++) {
                if (datos[k] < datos[pivote]) {
                    tempo = datos[k];
                    datos[k] = datos[pivote];
                    datos[pivote] = tempo;
                }
            }
        }
        return datos;
    }

    public static String[] ordBurbuja(String[] datos) {
        double tempo = 0.0;//<--
        for (int pivote = 0; pivote < datos.length - 1; pivote++) {
            for (int k = pivote + 1; k < datos.length; k++) {
                if (datos[k].compareTo(datos[pivote]) < 0) {
                    tempo = Double.parseDouble(datos[pivote]);
                    datos[k] = datos[pivote];
                    //datos[pivote] = tempo;
                }
            }
        }
        return datos;
    }
}//End
