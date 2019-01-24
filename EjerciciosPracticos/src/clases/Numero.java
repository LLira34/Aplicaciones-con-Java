/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lab2
 */
public class Numero {
    public static String convertirATexto(int num){
        int m=0; //Miles
        int c=0; //Centenas
        int d=0; //Decenas
        int u=0; //Unidades
        int resto=0;
        String texto="";
        boolean ban=false;
        
        m= num/1000;
        resto= num%1000;
        c= resto/100;
        resto= resto%100;
        d= resto/10;
        u= resto%10;
        
        switch(m){
            case 1:
                texto= "MIL ";
                break;
            case 2:
                texto= "DOS MIL ";
                break;
            case 3:
                texto= "TRES MIL ";
                break;
            case 4:
                texto= "CUATRO MIL ";
                break;
            case 5:
                texto= "CINCO MIL ";
                break;
            case 6:
                texto= "SEIS MIL ";
                break;
            case 7:
                texto= "SIETE MIL ";
                break;
            case 8:
                texto= "OCHO MIL ";
                break;
            case 9:
                texto= "NUEVE MIL ";
                break;
        }
        switch(c){
            case 1:
                texto+= "CIEN";
                if(d==0){
                    texto+="TO ";
                }
                break;
            case 2:
                texto+= "DOSCIENTOS ";
                break;
            case 3:
                texto+= "TRESCIENTOS ";
                break;
            case 4:
                texto+= "CUATROCIENTOS ";
                break;
            case 5:
                texto+= "QUINIENTOS ";
                break;
            case 6:
                texto+= "SEISCIENTOS ";
                break;
            case 7:
                texto+= "SETECIENTOS ";
                break;
            case 8:
                texto+= "OCHOCIENTOS ";
                break;
            case 9:
                texto+= "NOVECIENTOS ";
                break;
        }
        switch(d){
            case 1:
                switch (u){
                    case 0:
                        texto+= "DIEZ";
                        break;
                    case 1:
                        texto+= "ONCE";
                        break;
                    case 2 :
                        texto+= "DOCE";
                        break;
                    case 3:
                        texto+= "TRECE";
                        break;
                    case 4:
                        texto+= "CATORCE";
                        break;
                    case 5:
                        texto+= "QUINCE";
                        break;
                    case 6:
                        texto+= "DIECISEIS";
                        break;
                    case 7:
                        texto+= "DIECISIETE";
                        break;
                    case 8:
                        texto+= "DIECIOCHO";
                        break;
                    case 9:
                        texto+= "DIECINUEVE";
                        break;
                }
                
            case 2:
                if(u==0){
                    texto+= "VEINTE";
                }else{
                    texto+="VEINTI";
                }
                break;
            case 3:
                texto+= "TREINTA ";
                ban=true;
                break;
            case 4:
                texto+= "CUARENTA ";
                ban=true;
                break;
            case 5:
                texto+= "CINCUENTA ";
                ban=true;
                break;
            case 6:
                texto+= "SESENTA ";
                ban=true;
                break;
            case 7:
                texto+= "SETENTA ";
                ban=true;
                break;
            case 8:
                texto+= "OCHENTA ";
                ban=true;
                break;
            case 9:
                texto+= "NOVENTA ";
                ban=true;
                break;
        }
        if(d!=1){
            if(ban&&u!=0){
                texto+="Y ";
            }
            switch (u){
                case 1:
                    texto+= "UNO";
                    break;
                case 2:
                    texto+= "DOS";
                    break;  
                case 3:
                    texto+= "TRES";
                    break;
                case 4:
                    texto+= "CUATRO";
                    break;
                case 5:
                    texto+= "CINCO";
                    break;
                case 6:
                    texto+= "SEIS";
                    break;
                case 7:
                    texto+= "SIETE";
                    break;
                case 8:
                    texto+= "OCHO";
                    break;
                case 9:
                    texto+= "NUEVE";
                    break;
            }
            
        }
        return texto;
    }
      
}//Fin de la clase
