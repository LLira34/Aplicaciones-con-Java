package clases;

/**
 *
 * @author Alondra
 */
public class Fecha {

    public static boolean esBisiesto(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * dado el mes y el años devuelve el numero de dias que contiene dicho mes
     *
     * @param mes int
     * @param year int
     * @return int
     *
     */
    public static int calcularDias(int mes, int year) {
        int dias = 0;

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
                if (esBisiesto(year)) {
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

    public static boolean esValida(String fecha) {
        return false;
    }
}
