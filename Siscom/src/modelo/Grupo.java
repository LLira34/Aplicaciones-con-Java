
package modelo;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Daniel Aguilar
 */
@Entity
@Table (name= "grupo")
public class Grupo {
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column (name="nombre", nullable=false,length=15)
    private String nombre;
    
    @Column(name="descripcion", nullable=true, length=180)
    private String descripcion;
    
    @Column(name="activo", nullable=false)
    private Boolean activo;
    
    @Column(name="codigo", nullable=false, length=15)
    private String codigo;
    
    @Column(name="turno", nullable=false, length=10)
    private String turno;
    
    public Grupo(){
    }

       /**
     * 
     * @param id
     * @param nombre
     * @param descripcion
     * @param activo
     * @param codigo
     * @param turno
     */
    
    
    public Grupo(Integer id, String nombre, String descripcion, Boolean activo, String codigo, String turno) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activo = activo;
        this.codigo = codigo;
        this.turno = turno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", activo=" + activo + ", codigo=" + codigo + ", turno=" + turno + '}';
    }
    
}
