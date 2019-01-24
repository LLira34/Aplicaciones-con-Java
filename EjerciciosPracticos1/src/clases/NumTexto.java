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
public class NumTexto {

    private int num = 0;
    private String texto = "";
    private int mil = 0;
    private int cien = 0;
    private int diez = 0;
    private int uno = 0;
    private int resto = 0;

    public void setNum(int num) {
        this.num = num;
    }

    public String getTexto() {
        return texto;
    }

    public void calcularTexto() {
        mil = num / 1000;
        resto = num % 1000;
        cien = resto / 100;
        resto = resto % 100;
        diez = resto / 10;
        resto = resto % 10;
        uno = resto;

        switch (mil) {
            case 1:
                texto = "Mil";
                break;
            case 2:
                texto = "Dos mil";
                break;
            case 3:
                texto = "Tres mil";
                break;
            case 4:
                texto = "Cuatro mil";
                break;
            case 5:
                texto = "Cinco mil";
                break;
            case 6:
                texto = "Seis mil";
                break;
            case 7:
                texto = "Siete mil";
                break;
            case 8:
                texto = "Ocho mil";
                break;
            case 9:
                texto = "Nueve mil";
                break;
            case 10:
                texto = "Dies mil";
                break;
        }
        switch (cien) {
            case 1:
                texto = texto + " ciento";
                break;
            case 2:
                texto = texto + " doscientos";
                break;
            case 3:
                texto = texto + " trescientos";
                break;
            case 4:
                texto = texto + " cuatrocientos";
                break;
            case 5:
                texto = texto + " quinientos";
                break;
            case 6:
                texto = texto + " seiscientos";
                ;
                break;
            case 7:
                texto = texto + " setecientos";
                break;
            case 8:
                texto = texto + " ochocientos";
                break;
            case 9:
                texto = texto + " novecientos";
                break;
        }
        switch (diez) {
            case 1:
                texto = texto + " diez";
                break;
            case 2:
                texto = texto + " veinte";
                break;
            case 3:
                texto = texto + " treinta";
                break;
            case 4:
                texto = texto + " cuarenta";
                break;
            case 5:
                texto = texto + " cincuenta";
                break;
            case 6:
                texto = texto + " sesenta";
                break;
            case 7:
                texto = texto + " setenta";
                break;
            case 8:
                texto = texto + " ochenta";
                break;
            case 9:
                texto = texto + " noventa";
                break;
        }
        switch (uno) {
            case 1:
                texto = texto + " y uno";
                break;
            case 2:
                texto = texto + " y dos";
                break;
            case 3:
                texto = texto + " y tres";
                break;
            case 4:
                texto = texto + " y cuatro";
                break;
            case 5:
                texto = texto + " y cinco";
                break;
            case 6:
                texto = texto + " y seis";
                break;
            case 7:
                texto = texto + " y siete";
                break;
            case 8:
                texto = texto + " y ocho";
                break;
            case 9:
                texto = texto + " y nueve";
                break;
        }
    }
}
