/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Paola
 */

@Entity
@Table (name="tema")

public class Tema {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, length = 100, name = "nombre")
    private String nombre;
    @Column(nullable = false, name = "saber")
    private String saber;
    @Column(nullable = false, name = "saber_hacer")
    private String saberHacer;
    @Column(nullable = false, name = "ser")
    private String ser;
    @ManyToOne //clave foranea
    @JoinColumn(name = "unidad_id")
    private Unidad unidadId;
    @ManyToOne //clave foranea
    @JoinColumn(name = "tema_id")
    private Tema temaId;
    

    public Tema() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSaber() {
        return saber;
    }

    public void setSaber(String saber) {
        this.saber = saber;
    }

    public String getSaberHacer() {
        return saberHacer;
    }

    public void setSaberHacer(String saberHacer) {
        this.saberHacer = saberHacer;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public Unidad getUnidadId() {
        return unidadId;
    }

    public void setUnidadId(Unidad unidadId) {
        this.unidadId = unidadId;
    }

    public Tema getTemaId() {
        return temaId;
    }

    public void setTemaId(Tema temaId) {
        this.temaId = temaId;
    }

    @Override
    public String toString() {
        return "Tema{" + "id=" + id + ", nombre=" + nombre + ", saber=" + saber + ", saberHacer=" + saberHacer + ", ser=" + ser + ", unidadId=" + unidadId + ", temaId=" + temaId + '}';
    }

    
    
   
   
        
    
    
    
}
