package clases;

import java.util.Scanner;

/**
 *
 * @author Lira
 */
public class TestTextos {

    public static void main(String[] args) {

        String texto = "";

        Scanner teclado = new Scanner(System.in); 
        System.out.println("Dame el texto");
        texto = teclado.nextLine();
        System.out.println(Textos.invertir(texto));
        System.out.println(Textos.calcularPalindromo(texto));

        System.out.println("El número de palabras que tiene la frase es de: " + Textos.calcularFrase(texto));

    }
}
