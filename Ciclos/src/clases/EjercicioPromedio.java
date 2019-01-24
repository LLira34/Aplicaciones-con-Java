package clases;

import java.util.Scanner;

/**
 *
 * @author Lab2
 */
public class EjercicioPromedio {

    public static void main(String[] args) {
        int nc = 0; //Numero de calificaciones
        double calif = 0.0; //Calificacion del alumno
        double promedio = 0.0; //Preomedio del alumno
        double suma = 0.0; //Acumula la suma de las calificaciones
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantas materias tienes?");
        nc = teclado.nextInt();
        for (int i = 1; i <= nc; i++) {
            System.out.println("Dame calificacion " + i + ": ");
            calif = teclado.nextDouble();
            suma += calif;
        }
        promedio = suma / nc;
        System.out.println("Tu promedio es: " + promedio);
    }
}// Fin de la clase
