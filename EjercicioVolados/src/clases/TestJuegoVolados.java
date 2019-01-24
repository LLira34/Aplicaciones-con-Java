/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab2
 */
public class TestJuegoVolados {

    public static void main(String[] args) {
        JuegoVolados jv;
        String nombre = "";
        int saldoInicial = 0;
        int apuesta = 0;
        String tiro = "";
        int resp = 0;

        nombre = JOptionPane.showInputDialog(null, "Como te llamas we?");
        saldoInicial = Integer.parseInt(JOptionPane.showInputDialog("Saldo inicial?"));
        jv = new JuegoVolados(nombre, saldoInicial);
        do {
            apuesta = Integer.parseInt(JOptionPane.showInputDialog("Cuanto apuestas pendejo?"));
            tiro = JOptionPane.showInputDialog("Que le vas, SOL o AGUILA");
            jv.setApuesta(apuesta);
            jv.setTiro(tiro.toUpperCase().charAt(0));
            System.out.println("Cayo: " + jv.lanzarVolado());
            if (jv.verificarVolado()) {
                JOptionPane.showMessageDialog(null, "Ganaste" + "\nSaldo: " + jv.getSaldo());
            } else {
                JOptionPane.showMessageDialog(null, "Perdiste we" + "\nSaldo: " + jv.getSaldo());
            }
            resp = JOptionPane.showConfirmDialog(null, "Deseas otro voladito?");
        } while (resp == JOptionPane.OK_OPTION && jv.getSaldo() > 0);
    }
}
