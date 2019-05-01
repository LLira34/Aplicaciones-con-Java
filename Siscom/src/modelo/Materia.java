package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Paola
 */
@Entity
@Table (name="materia")

public class Materia {

    public static void add(ItemMateria itemMateria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, length = 100, name = "nombre")
    private String nombre;
    @Column(nullable = false, length = 20, name = "nivel_educativo")
    private String nivelEducativo;
    @Column(nullable = false, length = 4, name = "grado")
    private int grado;
    @Column(nullable = false, length = 4, name = "horas_semana")
    private int horasSemana;
    @Column(nullable = false, name = "objetivo")
    private String objetivo;
    @Column(nullable = false, name = "competencia")
    private  String competencia;
    @Column(nullable = false, name = "descripcion")
    private  String descripcion;
    @Column(nullable = false, length = 4, name = "duracion")
    private String duracion;
    @Column(nullable = false, length = 1, name = "activo")
    private int activo;

    public Materia() {
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

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", nombre=" + nombre + ", nivelEducativo=" + nivelEducativo + ", grado=" + grado + ", horasSemana=" + horasSemana + ", objetivo=" + objetivo + ", competencia=" + competencia + ", descripcion=" + descripcion + ", duracion=" + duracion + ", activo=" + activo + '}';
    } 
    
}