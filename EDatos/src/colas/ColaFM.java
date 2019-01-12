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
public class ColaFM {
    private int frente;
    private int fin;
    private int[] datos;
    private int n;

    public ColaFM(int tam) {
        frente = 0;
        fin = 0;
        datos = new int[tam];
    }

    public void insertar(int valor) {
        datos[fin++] = valor;
        if (fin == datos.length) {
            for (int i = frente; i < fin; i++) {
                datos[i - frente] = datos[i];
            }
        }
        fin -= frente;
    }

    public int eliminar() {
        int salida;
        salida = datos[frente++];
        return datos[frente++];
    }

    public int getN() {
        n = fin;
        return n;
    }

    public boolean isEmpty() {
        return (fin == 0);
    }

    public boolean isFull() {
        return (fin == datos.length);
    }
}//End
