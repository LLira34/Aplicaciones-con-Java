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
public class NumRomano {

    private int num = 0;
    private String romano = "";
    private int mil = 0;
    private int cien = 0;
    private int diez = 0;
    private int uno = 0;
    private int resto = 0;

    public void setNum(int num) {
        this.num = num;
    }

    public String getRomano() {
        return romano;
    }

    public void calcularRomano() {

        mil = num / 1000;
        resto = num % 1000;
        cien = resto / 100;
        resto = resto % 100;
        diez = resto / 10;
        uno = resto % 10;

        switch (mil) {
            case 1:
                romano = "M";
                break;
            case 2:
                romano = "MM";
                break;
            case 3:
                romano = "MMM";
                break;
        }
        switch (cien) {
            case 1:
                romano = romano + "C";
                break;
            case 2:
                romano = romano + "CC";
                break;
            case 3:
                romano = romano + "CCC";
                break;
            case 4:
                romano = romano + "CD";
                break;
            case 5:
                romano = romano + "D";
                break;
            case 6:
                romano = romano + "DC";
                break;
            case 7:
                romano = romano + "DCC";
                break;
            case 8:
                romano = romano + "DCCC";
                break;
            case 9:
                romano = romano + "CM";
                break;
        }
        switch (diez) {
            case 1:
                romano = romano + "X";
                break;
            case 2:
                romano = romano + "XX";
                break;
            case 3:
                romano = romano + "XXX";
                break;
            case 4:
                romano = romano + "XL";
                break;
            case 5:
                romano = romano + "L";
                break;
            case 6:
                romano = romano + "LX";
                break;
            case 7:
                romano = romano + "LXX";
                break;
            case 8:
                romano = romano + "LXXX";
                break;
            case 9:
                romano = romano + "XC";
                break;
        }
        switch (uno) {
            case 1:
                romano = romano + "I";
                break;
            case 2:
                romano = romano + "II";
                break;
            case 3:
                romano = romano + "III";
                break;
            case 4:
                romano = romano + "IV";
                break;
            case 5:
                romano = romano + "V";
                break;
            case 6:
                romano = romano + "VI";
                break;
            case 7:
                romano = romano + "VII";
                break;
            case 8:
                romano = romano + "VIII";
                break;
            case 9:
                romano = romano + "LX";
                break;
        }
       

    }
}
