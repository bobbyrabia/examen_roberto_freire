package ec.espe.edu.arquitectura.examen_roberto_freire.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "EDIFICIO")
public class Edificio {
    @EmbeddedId
    private EdificioPk edificioId ;
    @Column(name = "NOMBRE",length = 128, nullable = false)
    private String nombre;
    @Column(name = "PISOS",precision = 2, nullable = false)
    private Integer pisos;
    @Column(name = "SUPERFICIE", precision =7, scale = 2, nullable = false)
    private BigDecimal superficie;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;
    @ManyToOne
    @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE", insertable = false, updatable = false, nullable = false)
    private Sede sede;

    public Edificio() {
    }

    public Edificio(EdificioPk edificioId) {
        this.edificioId = edificioId;

    }

    public EdificioPk getEdificioId() {
        return edificioId;
    }

    public void setEdificioId(EdificioPk edificioId) {
        this.edificioId = edificioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public BigDecimal getSuperficie() {
        return superficie;
    }

    public void setSuperficie(BigDecimal superficie) {
        this.superficie = superficie;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "edificioId=" + edificioId +
                ", nombre='" + nombre + '\'' +
                ", pisos=" + pisos +
                ", superficie=" + superficie +
                ", version=" + version +
                ", sede=" + sede +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edificio edificio = (Edificio) o;
        return Objects.equals(edificioId, edificio.edificioId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edificioId);
    }
}
