/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Alondra
 */
public class CuentaBancaria {
    private static int nCuentas;//Una variable estatica, para saber el numero de cuentas
    private int numCuenta;
    private int dni;
    private double saldo;
    private double interesAnual;
    
    public CuentaBancaria(){//No los va a  autogenerar con el constructor, 
        nCuentas++;//Pirmero la va a incrementar
        numCuenta=nCuentas;// Luego la va a incrementar
        saldo=1000.00;
    }
    
    public CuentaBancaria(int dni, double saldo, double interesAnual){
        nCuentas++;
        numCuenta=nCuentas;
        this.dni=dni;
        this.saldo=saldo;
        this.interesAnual=interesAnual;
    }
    
    public void setDni(int dni){
        this.dni=dni;
    }
    public void setInteresAnual(double interesAnual){
        this.interesAnual=interesAnual;
    }
    
    public void ingresar(double monto){
        saldo+=monto;
    }
    
    public String restirar(double monto){
        if(monto<=saldo){
           saldo-=monto;
           return "el nuevo saldo es de:"+ saldo;
        }else{
        } 
        return "Saldo insuficientes";
        }
       public void actualizarSaldo(){
           saldo+=+interesAnual/365*saldo;
    }
       public String mostrarInfo(){
           return "Número de cuenta: "+ numCuenta+
                   "\nSaldo: "+ saldo;
       }
}
