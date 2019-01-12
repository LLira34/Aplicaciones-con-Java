/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author LLira
 */
public class Comanda {
    public static int total;
    private int folio;
    private String comida;
    private String bebida;
    private String postre;
    private int mesa;

    //Generate constructor
    public Comanda(int folio, String comida, String bebida, String postre, int mesa) {
        this.folio = folio;
        this.comida = comida;
        this.bebida = bebida;
        this.postre = postre;
        this.mesa = mesa;
    }
    
    //GEnerate constructor empty
    public Comanda(){
        this(0,"","","",0);
    }
    
    /**
     * Metodo para generar e incrementar el folio
     */
    public void generarFolio(){
        folio = ++total;
    }
    
    //Generate getters and setters
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Comanda{" + "folio=" + folio + ", comida=" + comida + ", bebida=" + bebida + ", postre=" + postre + ", mesa=" + mesa + '}';
    }
    
    
}//End
