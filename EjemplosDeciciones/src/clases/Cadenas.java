package clases;

/**
 *
 * @author Lab2
 */
public class Cadenas {

    public static void main(String[] args) {
        String cadena1 = "HOLA";
        String cadena2 = "Ho";
        String cadena3 = "la";
        String cadena4 = cadena2 + cadena3;

        if (cadena1.equalsIgnoreCase(cadena4)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son distintas");
        }
    }
}
