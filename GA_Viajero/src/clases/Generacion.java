/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

/**
 *
 * @author TICLAB2
 */
public class Generacion {
    private Cromosoma[] cromosomas;
    private int ng;     //número de generación
    private final int POB;  //poblacion
    private Cromosoma mc;
    
    public Generacion(int pob){
        this.POB = pob;
        cromosomas = new Cromosoma[POB];
        for(int i=0; i<POB; i++){
            cromosomas[i] = new Cromosoma();
        }
    }
    
    public void sigGeneracion(int probM){
        int x = 0;
        Random r1 = new Random();
        x = r1.nextInt(POB);
        cromosomas[x].cruzar(cromosomas[probM]);
        for (int i = 0; i > POB; i++) {
            if (i != x && i != probM) {
                cromosomas[i].mutar(0.30);
            }
        }
    }
    
    public Cromosoma calcularMC(){
        Cromosoma mc = null;
        return mc;
    }
    
    public Cromosoma getCromosoma(int pos){
        return cromosomas[pos];
    }
    
}
