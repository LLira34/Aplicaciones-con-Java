package modelo;

import java.sql.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author migue
 */

@Entity
@Table(name = "curso")
public class Curso {
    
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;
    @Column(name = "nombre", nullable=false, length = 150)
    private String nombre;
    @Column(name = "descripcion", nullable=true)
    private String descripcion;
    @Column(name = "nivel_curso", nullable=false, length = 10)
    private String nivel_curso;
    @Column(name = "duracion", nullable=false)
    private int duracion;
    @Column(name = "requerimientos", nullable=true)
    private String requerimientos;
    @Column(name = "fecha_inicio", nullable=false)
    private Date fecha_inicio;
    @Column(name = "fecha_fin", nullable=false)
    private Date fecha_fin;
    @Column(name = "codigo", nullable=true, length = 15)
    private String codigo;
    @Column(name =  "activo", nullable=false)
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name = "materia_id")
    private Materia materia;
    
    @ManyToOne
    @JoinColumn(name = "participante_id")
    private Participante participante;
    
    @Column(name = "bienvenida", nullable=true)
    private String bienvenida;

    
    public Curso() {
    }

    public Curso(int id, String nombre, String descripcion, String nivel_curso, int duracion, String requerimientos, Date fecha_inicio, Date fecha_fin, String codigo, boolean activo,Materia materia, Participante participante, String bienvenida) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivel_curso = nivel_curso;
        this.duracion = duracion;
        this.requerimientos = requerimientos;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.codigo = codigo;
        this.activo = activo;
        this.materia = materia;
        this.participante = participante;
        this.bienvenida = bienvenida;
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

    public String getNivel_curso() {
        return nivel_curso;
    }

    public void setNivel_curso(String nivel_curso) {
        this.nivel_curso = nivel_curso;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
      public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }
  
    public String getBienvenida() {
        return bienvenida;
    }

    public void setBienvenida(String bienvenida) {
        this.bienvenida = bienvenida;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.materia);
        hash = 59 * hash + Objects.hashCode(this.participante);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.materia, other.materia)) {
            return false;
        }
        if (!Objects.equals(this.participante, other.participante)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", nivel_curso=" + nivel_curso + ", duracion=" + duracion + ", requerimientos=" + requerimientos + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", codigo=" + codigo + ", activo=" + activo + ", materia=" + materia + ", participante=" + participante + ", bienvenida=" + bienvenida + '}';
    }

   

 
    
    
}
