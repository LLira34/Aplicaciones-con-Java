/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author LLira
 */
public class TestColaPrioridades {
    public static void main(String[] args) {
        ColaPrioridades cp = new ColaPrioridades(6);
        String tarea;
        cp.insertar("X", 2);
        cp.insertar("W", 2);
        cp.insertar("A", 3);
        cp.insertar("B", 1);
        tarea = cp.eliminar();
        System.out.println("Se atiende " + tarea);
        tarea = cp.eliminar();
        System.out.println("Se atiende " + tarea);
        tarea = cp.eliminar();
        System.out.println("Se atiende " + tarea);
        
        
        
        System.out.println("Cola Prioridad 1");
        for (int i = 0; i < 6; i++) {
            System.out.print("\t" + cp.getCola1().getTareas(i));
        }
        
        System.out.println("Frente = " + cp.getCola1().getFrente());
        System.out.println("Final = " + cp.getCola1().getFin());
        System.out.println("Cola Prioridad 2");
        
        for (int i = 0; i < 6; i++) {
            System.out.print("\t" + cp.getCola2().getTareas(i));
        }
        
        System.out.println("Frente = " + cp.getCola2().getFrente());
        System.out.println("Final = " + cp.getCola2().getFin());
        
        System.out.println("");
        System.out.println("Cola Prioridad 3");
        for (int i = 0; i < 6; i++) {
            System.out.print("\t" + cp.getCola3().getTareas(i));
        }
        
        System.out.println("Frente = " + cp.getCola3().getFrente());
        System.out.println("Final = " + cp.getCola3().getFin());
    }
}//End
