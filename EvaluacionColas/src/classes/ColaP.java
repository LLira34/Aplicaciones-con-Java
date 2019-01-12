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
public class ColaP {
    private String[] tareas;
    private int prioridad;
    private int frente;
    private int fin;
    private int tot;

    public ColaP(int tam, int prioridad) {
        tareas = new String[tam];
        this.prioridad = prioridad;
        frente = 0;
        fin = 0;
        tot = 0;
    }

    public void insertar(String tarea) {
        if (!isFull()) {
            tareas[fin] = tarea;
            fin++;
            tot++;
            if (fin == tareas.length) {
                fin = 0;
            }
        }
    }

    public String eliminar() {
        String salida = null;
        if (!isEmpty()) {
            salida = tareas[frente];
            frente++;
            tot--;
            if (frente == tareas.length) {
                frente = 0;
            }
        }
        return salida;
    }

    public boolean isEmpty() {
        return (tot == 0);
    }

    public boolean isFull() {
        return (tot == tareas.length);
    }

    //Generate getters and setters
    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public int getFrente() {
        return frente;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    
    public String getTareas(int pos){
        return tareas[pos];
    }
    
    
}//End