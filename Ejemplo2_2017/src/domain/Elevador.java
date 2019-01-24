
package domain;


public class Elevador {
    //Definición de atributos
    private final int CAPACIDAD=8;  //número máximo de personas
    private int pisoActual;
    private final int PISO_MIN;
    private final int PISO_MAX;
    private boolean puertaAbierta;
    
    public Elevador(int pisoMin, int pisoMax){
        PISO_MIN= pisoMin;
        PISO_MAX= pisoMax;
        pisoActual= pisoMin;
        puertaAbierta= true;
    }
    
    public void abrirPuerta(){
        puertaAbierta= true;
    }
    
    public void cerrarPuerta(){
        puertaAbierta= false;
    }
    
    public void subirPiso(){
        if(puertaAbierta==false && pisoActual<PISO_MAX){
            pisoActual= pisoActual+1; // pisoActual++
        }
    }
    
    public void bajarPiso(){
        if(!puertaAbierta && pisoActual>PISO_MIN){
            pisoActual--; //pisoActual= pisoActual-1
        }
    }
    
    public int getPisoActual(){
        return pisoActual;
    }
    
    public boolean isPuertaAbierta(){
        return puertaAbierta;
    }
    
}// Fin de la clase
