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
public class Media {
    private float num1=0;
    private float num2=0;
    private float num3=0;
    private float num4=0;
    private float media=0;
    
     public void setNum1(float num1){
        this.num1=num1;
    }
     public void setNum2(float num2){
         this.num2=num2;
         
     }
     public void setNum3(float num3){
         this.num3=num3;
     }
     public void setNum4(float num4){
         this.num4=num4;
     }
     
     public float getMedia(){
         return media;
     }
     public float calcularMedia(){
      media=((num1+num2+num3+num4)/4);
	return media;		 
     }
     
}
