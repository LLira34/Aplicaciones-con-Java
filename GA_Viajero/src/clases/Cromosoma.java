/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

/**
 *
 * @author Geovanni
 */
public class Cromosoma {
    
    private int [] genes;
    private int salud;
    private final int TAM= 11;
    private int [][] distancias={
        {0,10,20,30,40,5,60,70,80,90,100},
        {10,0,10,5,30,40,50,60,70,80,2},
        {20,10,0,10,20,30,40,5,60,70,80},
        {30,5,10,0,10,20,30,2,5,60,70},
        {40,30,20,10,0,10,15,30,40,50,60},
        {5,40,30,20,10,0,10,20,30,5,50},
        {60,50,40,30,15,10,0,10,20,30,5},
        {70,60,5,2,30,20,10,0,5,20,30},
        {80,70,60,5,40,30,20,5,0,10,5},
        {90,80,70,60,50,5,30,20,10,0,5},
        {100,2,80,70,60,50,5,30,5,5,0}           
    };
    
    public Cromosoma(){
        genes = new int [TAM];
        int[] ciudades = {1,2,3,4,5,6,7,8,9,10,11};
        Random r1 = new Random();
        int x= 0;
        for(int i=0; i<TAM; i++){
            x = r1.nextInt(TAM-i);
            genes[i] = ciudades[x];
            for(int k=x;k<TAM-1;k++){
                ciudades[k]= ciudades[k+1];
            }            
        }        
    }
    
    public String toString(){
        String cromosoma="";
        for(int i=0; i<TAM-1; i++){
            cromosoma += genes[i]+", ";
        }
        cromosoma += genes[TAM-1];
        return cromosoma;
    }
    
    public void calcularSalud(){
        salud=0;
        for (int i = 0; i<TAM-1;i++){
            salud += distancias[genes[i]-1][genes[i+1]-1];
        }
        salud+=distancias[genes[TAM-1]-1][ genes[0]-1];
    }
    
    public int getSalud(){
        calcularSalud();
        return salud;
    }
    
    public void mutar(double probM){
        Random r1 = new Random();
        double x=0.0;
        int pos = 0;
        int tempo = 0;
        for(int i=0; i<TAM;i++){
            x= r1.nextDouble(); //Devluelve un valor entre 0 y 1
            if(x<probM){
                pos = r1.nextInt(TAM);
                tempo = genes[i];
                genes[i] = genes[pos];
                genes[pos] = tempo;
            }
        }   
    }
    
    public void cruzar(Cromosoma c2){
        int x;
        int t;
        int p;
        int pos = calcularPuntoCruce();
        int[] tempo = new int[3];
        tempo[0] = c2.genes[pos];
        tempo[1] = c2.genes[pos+1];
        tempo[2] = c2.genes[pos+2];
        for(int i=pos; i<3; i++){
            x = c2.genes[i];
            p = buscarGen(x);
            t = c2.genes[p];
            genes[p] =  genes[i];
            genes[i] = t;
        }
        for(int i=pos; i<3; i++){
            x = this.genes[i];
            p = buscarGen(x);
            genes[p] = genes[i];
            genes[i] = tempo[i];
        }
    }
    
    public int calcularPuntoCruce(){
        int pos = 0;
        int[] suma1 = new int[11];
        int[] suma2 = new int[10];
        for(int i=0; i<TAM-1; i++){
            suma1[i] += distancias[genes[i]-1][genes[i+1]-1];
        }
        suma1[TAM-1] += distancias[genes[TAM-1]-1][genes[0]-1];
        for(int i=0; i<TAM-2; i++){
            suma2[i] += suma1[i] + suma1[i+1];            
            if(suma2[pos] < suma2[i]){
                pos = i;
            }
        }
        return pos;
    }
    
    public int buscarGen(int g){
        int pos = 0;
        while(genes[pos] != g){
            pos++;
        }
        return pos;
    }
}
