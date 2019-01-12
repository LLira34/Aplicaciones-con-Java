package models;

import java.util.Random;

/**
 *
 * @author LLira
 */
public class Cromosoma {
    private int[] genes; // Ceros y unos
    private int x1, x2; // Primer y segundo parametro de la solucion
    private double salud; // Salud del cromosoma
    
    public Cromosoma(){
        genes = new int[8];
        Random random = new Random();
        for (int i = 0; i < genes.length; i++) {
            genes[i] = random.nextInt(2);
        }
    }

    public int getX1() {
        x1 = 0;
        for (int i = 0; i < 4; i++) {
            x1 += genes[i]*(int)Math.pow(2, 3-i);
        }
        return x1;
    }

    public int getX2() {
        x2 = 0;
        for (int i = 4; i < 8; i++) {
            x2 += genes[i]*(int)Math.pow(2, 3-i+4);
        }
        return x2;
    }
    
    public String getGenes(){
        String salida = "Genes: ";
        for (int i = 0; i < 8; i++) {
            salida += genes[i] + ", ";
        }
        return salida;
    }

    public double getSalud(){
        x1 = getX1();
        x2 = getX2();
        salud = (50*x1 + 60*x2)/Math.pow(2, penalizaciones()); // Sin considerar restricciones
        return salud;
    }
    
    private int penalizaciones(){
        int np = 0;
        if (8*x1 + 4*x2 > 40) {
            np++;
        }
        if (4*x1 + 5*x2 > 40) {
            np++;
        }
        if (50*x1 + 13*x2 > 200) {
            np++;
        }
        if (x1 < 0) {
            np++;
        }
        if (x2<0) {
            np++;
        }
        return np;
    }
    
} // End