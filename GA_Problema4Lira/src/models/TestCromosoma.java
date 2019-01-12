package models;

/**
 *
 * @author LLira
 */
public class TestCromosoma {
    public static void main(String[] args) {
        Cromosoma c1 = new Cromosoma();
        Cromosoma c2 = new Cromosoma();
        
        System.out.println("Cromosoma #1: ");
        System.out.println(c1.getGenes());
        System.out.println("X1= " + c1.getX1());
        System.out.println("X2= " + c1.getX2());
        System.out.println("Salud: " + c1.getSalud());
        System.out.println("\n");
        
        System.out.println("Cromosoma #2: ");
        System.out.println(c2.getGenes());
        System.out.println("X1= " + c2.getX1());
        System.out.println("X2= " + c2.getX2());
        System.out.println("Salud: " + c2.getSalud());
    }
} // End
