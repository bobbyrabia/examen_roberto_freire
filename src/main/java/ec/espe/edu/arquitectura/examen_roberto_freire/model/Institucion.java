package ec.espe.edu.arquitectura.examen_roberto_freire.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "INSTITUCION")
public class Institucion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_INSTITUCION",precision = 3, nullable = false)
    private Integer institucionId;
    @Column(name = "RUC", length = 13, nullable = false)
    private String ruc;
    @Column(name = "RAZON_SOCIAL", length = 100, nullable = false)
    private String razonSocial;
    @Version
    @Column(name = "VERSION",  nullable = false)
    private Long version;

    public Institucion() {
    }

    public Institucion(Integer institucionId) {
        this.institucionId = institucionId;
    }

    public Integer getInstitucionId() {
        return institucionId;
    }

    public void setInstitucionId(Integer institucionId) {
        this.institucionId = institucionId;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Institucion that = (Institucion) o;
        return Objects.equals(institucionId, that.institucionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(institucionId);
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "institucionId=" + institucionId +
                ", ruc='" + ruc + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", version=" + version +
                '}';
    }
}
