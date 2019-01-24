package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab2
 */
public class TestAhorcado {

    public static void main(String[] args) {
        Ahorcado a1 = new Ahorcado();
        char letra = ' ';

        a1.seleccionarPalabra();
        a1.calcularDisplay();
        JOptionPane.showMessageDialog(null, a1.getDisplay());
        letra = JOptionPane.showInputDialog("Letra?").charAt(0);
        a1.setLetra(letra);
        if (a1.verificarLetra()) {
            JOptionPane.showMessageDialog(null, "Correcto!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrecto!");
        }
        JOptionPane.showMessageDialog(null, a1.getPalabra());
        a1.calcularDisplay();
        JOptionPane.showMessageDialog(null, a1.getDisplay());
    }
}
