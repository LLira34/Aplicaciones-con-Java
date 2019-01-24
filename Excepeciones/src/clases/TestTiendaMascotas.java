/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author ATrejo
 */
public class TestTiendaMascotas {

    public static void main(String[] args) {
        Tienda t1 = new Tienda("El Gato Volador");//<---
        int op = 0;
        String tipo = "";
        String raza = "";
        int edad = 0;
        double precio = 0.0;
        char sexo = ' ';
        boolean flagCont = false; // New variable

        do {
            Mascota[] mascotas = null;

            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("MENU" 
                        + "\n1] Agregar mascota"
                        + "\n2] Buscar mascota por raza"
                        + "\n3] Buscar mascota por precio"
                        + "\n4] Salir"));
                switch (op) {
                    case 1:
                        tipo = JOptionPane.showInputDialog("Tipo?");

                        raza = JOptionPane.showInputDialog("Raza:").toUpperCase();

                        do {
                            try {
                                edad = Integer.parseInt(JOptionPane.showInputDialog("Edad?")); 
                                flagCont = true;
                            } catch (java.lang.NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Error, debe de ser un valor númerico entero");
                                flagCont = false;
                            } catch (java.lang.NullPointerException a) {
                                JOptionPane.showMessageDialog(null, "Por favor instrodusca un dato");
                                flagCont = false;
                            }
                        } while (!flagCont);
                        do {
                            try {
                                precio = Double.parseDouble(JOptionPane.showInputDialog("Precio?")); 
                                flagCont = true;
                            } catch (java.lang.NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Error, debe de ser un valor númerico");
                                flagCont = false;
                            } catch (java.lang.NullPointerException a) {
                                JOptionPane.showMessageDialog(null, "Por favor instrodusca un dato");
                                flagCont = false;
                            }
                        } while (!flagCont);
                        sexo = JOptionPane.showInputDialog("Sexo").charAt(0);
                        t1.agregarMascota(tipo, raza, edad, precio, sexo);
                        break;
                    case 2:
                        raza = JOptionPane.showInputDialog("Raza?").toUpperCase();
                        mascotas = t1.buscarRaza(raza);
                        if (mascotas != null) {
                            for (int i = 0; i < mascotas.length; i++) {
                                JOptionPane.showMessageDialog(null, mascotas[i].toString());
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No existen mascotas de esa Raza!!");
                        }
                        break;
                    case 3:

                        do {
                            try {
                                precio = Double.parseDouble(JOptionPane.showInputDialog("Precio límite?"));                                 flagCont = true;
                            } catch (java.lang.NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Error, debe de ser un valor númerico");
                                flagCont = false;
                            } catch (java.lang.NullPointerException a) {
                                JOptionPane.showMessageDialog(null, "Por favor instrodusca un dato");
                                flagCont = false;
                            }
                        } while (!flagCont);

                        mascotas = t1.buscarPrecio(precio);
                        if (mascotas != null) {
                            for (int i = 0; i < mascotas.length; i++) {
                                JOptionPane.showMessageDialog(null, mascotas[i].toString());
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No existen mascotas con ese límite de precio!!");
                        }
                        break;
                }
            } catch (java.lang.NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, debe de ser un valor númerico entero");
            } catch (java.lang.NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Por favor instrodusca un dato");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while (op != 4);
    }
}
