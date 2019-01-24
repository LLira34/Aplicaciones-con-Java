/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Lira
 */
public class TestTriangulo {
    public static void main(String[] args) {
         Triangulo l1=new Triangulo();
         float a=0f;
         float b=0f;
         float c=0f;
         
         l1.setLado1(a=Float.parseFloat(JOptionPane.showInputDialog("Dame el primer lado: ")));
         l1.setLado2(b=Float.parseFloat(JOptionPane.showInputDialog("Dame el segundo lado: ")));
         l1.setLado3(c=Float.parseFloat(JOptionPane.showInputDialog("Dame el tercer lado: ")));
         
        
        //l1.calcularFormaTriangulo();
         
            if(l1.calcularFormaTriangulo()){
            JOptionPane.showMessageDialog(null, "Es un triangulo" +"\n"+ l1.calcularTipoTriangulo() + "\nEl area es: " + l1.calcularArea()+ "\nEl perimetro es: "+l1.calcularPerimetro());
            
            }else{
                JOptionPane.showMessageDialog(null, "No es un triangulo");
            }
         
            
    }
}
