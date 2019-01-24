package clases;

import java.text.DecimalFormat;

/**
 *
 * @author Lab2
 */
public class TestDecimalFormat {

    public static void main(String[] args) {
        DecimalFormat df; //Declaración
        DecimalFormat df2 = new DecimalFormat("%");
        DecimalFormat df3 = new DecimalFormat("$0,000.0#");
        float porcentaje = 0.85F; //Porcentaje de asistencia
        df = new DecimalFormat("$,000.00");
        System.out.println(df.format(2444345.8)); //Format es un metodo, no estatico porque esta enlazado con df(Objeto)
        System.out.println(df2.format(porcentaje));
        System.out.println(df3.format(4.5));
    }
}
