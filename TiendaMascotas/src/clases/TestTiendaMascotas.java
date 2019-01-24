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
public class TestTiendaMascotas {

    public static void main(String[] args) {
        Tienda t1 = new Tienda("El Gato Volador");//<<---
        int op;
        String tipo = "";
        String raza = "";
        int edad = 0;
        double precio = 0.0;
        char sexo = ' ';

        do {
            Mascota[] mascotas = null;

            op = Integer.parseInt(JOptionPane.showInputDialog("Menu" + "\n1] Agregar mascota" + "\n2] Buscar mascota por " + "\n3] Buscar mascotas por precio" + "\n4] Salir"));
            switch (op) {
                case 1:
                    tipo = JOptionPane.showInputDialog("Tipo?");
                    raza = JOptionPane.showInputDialog("Raza:");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Edad?"));
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Precio:"));
                    sexo = JOptionPane.showInputDialog("Sexo").charAt(0);
                    t1.agregarMascota(tipo, raza, edad, precio, sexo);
                    break;
                case 2:
                    raza = JOptionPane.showInputDialog("Raza?");
                    mascotas = t1.buscarRaza(raza);
                    if (mascotas != null) {
                        for (int i = 0; i < mascotas.length; i++) {
                            JOptionPane.showMessageDialog(null, mascotas[i].toString());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No existen mascotas de esa raza");
                    }

            }
        } while (op != 4);

    }

}//End
