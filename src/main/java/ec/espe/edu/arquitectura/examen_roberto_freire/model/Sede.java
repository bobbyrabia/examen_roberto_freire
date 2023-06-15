package ec.espe.edu.arquitectura.examen_roberto_freire.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "SEDE")
public class Sede {
    @Id
    @Column(name = "COD_SEDE",length = 8, nullable = false)
    private String sedeId;
    @Column(name = "COD_INSTITUCION", nullable = false)
    private Integer institucionId;
    @Column(name = "NOMBRE",length = 128, nullable = false)
    private String nombre;
    @Column(name = "DIRECCION",length = 128, nullable = false)
    private String direccion;
    @Column(name = "ES_PRINCIPAL", nullable = false)
    private Boolean esPrincipal;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date createdDate;
    @Version
    @Column(name = "VERSION",length = 128, nullable = false)
    private Long version;
    @ManyToOne
    @JoinColumn(name = "COD_INSTITUCION", referencedColumnName = "COD_INSTITUCION", insertable = false, updatable = false, nullable = false)
    private Institucion institucion;
    @PrePersist
    public void generateId() {
        sedeId = UUID.randomUUID().toString().substring(0, 8);
    }

    public Sede() {
    }

    public Sede(String sedeId) {
        this.sedeId = sedeId;
    }

    public String getSedeId() {
        return sedeId;
    }

    public void setSedeId(String sedeId) {
        this.sedeId = sedeId;
    }

    public Integer getInstitucionId() {
        return institucionId;
    }

    public void setInstitucionId(Integer institucionId) {
        this.institucionId = institucionId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "sedeId='" + sedeId + '\'' +
                ", institucionId=" + institucionId +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", esPrincipal=" + esPrincipal +
                ", createdDate=" + createdDate +
                ", version=" + version +
                ", institucion=" + institucion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sede sede = (Sede) o;
        return Objects.equals(sedeId, sede.sedeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sedeId);
    }
}
