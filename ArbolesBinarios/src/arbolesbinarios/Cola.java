/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

/**
 *
 * @author Ashley Quintero
 */
public class Cola {
   
    NodoList principio;
    NodoList fin;
    int num;
 
    public Cola() {
        this(0);
    }
 
    public Cola(int cola) {
        num = cola;
        principio = fin = null;
    }

    public boolean Empty() {
        return principio == null;
    }
    
    public void Dequeue() {
        if(Empty()){
            return;
        }else if(principio==fin){
            principio = fin = null;
        }else{
            principio = principio.sig;
        }
    }
 
    public void Enqueue(NodoArbol raiz) {
        if(Empty()){
            principio = fin = new NodoList(raiz);
        }else{
            fin = fin.sig = new NodoList(raiz);
        }
    }
}
    

