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
@Table (name="unidad")

public class Unidad {

    public static Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, length = 100, name = "nombre")
    private String nombre;
    @Column(nullable = false, name = "descripcion")
    private String descripcion;
    @Column(nullable = false, name = "objetivo")
    private String objetivo;
    @Column(nullable = false, name = "horas_teoricas")
    private int hrsTeoricas;
    @Column(nullable = false, name = "horas_practicas")
    private int hrsPracticas;
    @ManyToOne //clave foranea
    @JoinColumn(name = "materia_id")
    private Materia materiaId;    
    @Column(nullable = false, length = 4, name = "activo")
    private int activo;
    
    

    public Unidad() {
        
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getHrsTeoricas() {
        return hrsTeoricas;
    }

    public void setHrsTeoricas(int hrsTeoricas) {
        this.hrsTeoricas = hrsTeoricas;
    }

    public int getHrsPracticas() {
        return hrsPracticas;
    }

    public void setHrsPracticas(int hrsPracticas) {
        this.hrsPracticas = hrsPracticas;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public Materia getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Materia materiaId) {
        this.materiaId = materiaId;
    }

    @Override
    public String toString() {
        return "Unidad{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", objetivo=" + objetivo + ", hrsTeoricas=" + hrsTeoricas + ", hrsPracticas=" + hrsPracticas + ", activo=" + activo + ", materiaId=" + materiaId + '}';
    }           
    
}
