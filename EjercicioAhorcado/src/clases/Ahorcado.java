package clases;

import java.util.Random;

/**
 *
 * @author Lab2
 */
public class Ahorcado {

    //Declaration de atributos
    private String jugador;
    private String palabra;
    private char letra;
    private String display;
    private int errores;
    private final int MAX_ERRORES = 7;
    private String[] palabras = {"AMERICANO", "BASQUETBOL", "TENIS", "BOX", "VOLEIBOL", "BEISBOL", "AJEDREZ", "RUGBY", "ESGRIMA", "NATACION", "CAMINATA", "CLAVADOS", "ATLETISMO", "CICLISMO"};
    private boolean[] correctas; //<<--

    //Declaration de metodos 
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void seleccionarPalabra() {
        Random r1 = new Random();
        int pos = 0;
        pos = r1.nextInt(palabras.length);
        palabra = palabras[pos];
        correctas = new boolean[palabra.length()]; //<<---
    }

    public void calcularDisplay() {
        display = "";
        for (int i = 0; i < palabra.length(); i++) {
            //display= display+"_ ";
            if (correctas[i]) {
                display += palabra.charAt(i) + " ";
            } else {
                display += "_ ";
            }
        }
    }

    public boolean verificarLetra() {
        boolean ban = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (letra == palabra.charAt(i)) {
                correctas[i] = true;
                ban = true; //Encontró una letra idéntica
            }
        }
        if (!ban) {//ban= flase;
            errores++;
        }
        return ban;
    }

    public boolean yaPerdio() {
        /* if(errores>=MAX_ERRORES){
            return true;
        }else {
            return false;
        }*/
        return (errores >= MAX_ERRORES);
    }

    public boolean yaGano() {
        boolean banOk = true;
        for (int i = 0; i < correctas.length; i++) {
            if (!correctas[i]) {
                banOk = false;
                break;
            }
        }
        return banOk;
    }

    public String getDisplay() {
        return display;
    }

    public int getErrores() {
        return errores;
    }

    public String getPalabra() {
        return palabra;
    }

}//Fin de la clase
