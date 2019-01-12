/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author LLira
 */
public class ColaFF {
    private int n; //Numero de elementos
    private int[] datos; //arreglo de elementos tipo int
    private int frente;
    private int fin;

    public ColaFF(int tam) {
        datos = new int[tam];
        frente = 0;
        fin = 0;
    }

    public void insertar(int valor) {
        datos[fin++] = valor;
    }

    public int eliminar() {
        int salida;
        salida = datos[frente];
        for (int i = 0; i <= fin; i++) {
            datos[i] = datos[i + 1];
        }
        fin--;
        return salida;
    }
    
    public int getN(){
        n= fin; 
        return n;
    }
    
    public boolean isEmpty(){
        return (fin==0);
    }
    
    public boolean isFull(){
        return (fin==datos.length);
    }

}//End
