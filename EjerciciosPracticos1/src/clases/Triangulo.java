/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lira
 */
public class Triangulo {
    private float lado1;
    private float lado2;
    private float lado3;
    private double area;
    private float perimetro;
    private String tipo;
    private boolean banTriangulo;
    
    
     public void setLado1(float lado1){
        this.lado1=lado1;
    }
    public void setLado2(float lado2){
        this.lado2=lado2;
    }
      public void setLado3(float lado3){
        this.lado3=lado3;
    }
      public float getPerimetro(){
        return perimetro;
    }
    public String getTipo(){
        return tipo;
    }
    
    
    public float getLado1(){
        return lado1;
        
    }
     public float getLado2(){
        return lado2;
        
    }
      public float getLado3(){
        return lado3;
        
    }
    public boolean calcularFormaTriangulo(){
            
       if(lado1+lado2>lado3 || lado2+lado3>lado1 || lado1+lado3>lado2){
           banTriangulo=true;
       }else{
           banTriangulo=false;
       }
       return banTriangulo;
    }
    
    public String calcularTipoTriangulo(){
        if(lado1==lado2 && lado1==lado3){
            tipo="Es equilatero";
        }else if(lado1==lado2 || lado1==lado3 || lado2==lado3){
            tipo="Es isoscéles";
        }else {
            tipo="Es escaleno";
        }
        return tipo;
    }
    public float calcularPerimetro(){
        if(banTriangulo){
            perimetro=lado1+lado2+lado3;
        }else{
            perimetro=0;
        }
        return perimetro;
    }
    public float calcularArea(){
        double semi=calcularPerimetro()/2;
        if(banTriangulo){
            area=Math.sqrt(semi*(semi-lado1)*(semi-lado2)*(semi-lado3));
                    
        }else {
            area=0;
        }
        return (float) area;
    }
}
