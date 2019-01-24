package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab2
 */
public class JuegoAhorcado {

    public static void main(String[] args) {
        Ahorcado juego = new Ahorcado();
        String nombre = "";
        char letra = ' ';

        nombre = JOptionPane.showInputDialog("Dame tu nombre: ");
        juego.setJugador(nombre);
        juego.seleccionarPalabra();
        do {
            juego.calcularDisplay();
            JOptionPane.showMessageDialog(null, juego.getDisplay());
            letra = JOptionPane.showInputDialog("Dame una letra: ").charAt(0);
            juego.setLetra(letra);
            if (juego.verificarLetra()) {
                JOptionPane.showMessageDialog(null, "Correcto");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrecto" + "\nTienes " + juego.getErrores() + " errores");
            }
        } while (!juego.yaGano() && !juego.yaPerdio());
        if (juego.yaPerdio()) {
            JOptionPane.showMessageDialog(null, "Estas ahorcado" + "\nla palabra es " + juego.getPalabra());
        } else {
            JOptionPane.showMessageDialog(null, "Ganaste" + nombre);
        }
    }
}//Fin
