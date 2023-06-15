package ec.espe.edu.arquitectura.examen_roberto_freire.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.PrePersist;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
public class EdificioPk implements Serializable {
    @Column(name = "COD_EDIFICIO",length = 8, nullable = false)
    private String edificioId;
    @Column(name = "COD_SEDE", length = 10, nullable = false)
    private String sedeId;

    public EdificioPk() {
    }

    public EdificioPk(String edificioId, String sedeId) {
        this.edificioId = edificioId;
        this.sedeId = sedeId;
    }

    public String getEdificioId() {
        return edificioId;
    }


    public void setEdificioId(String edificioId) {
        this.edificioId = edificioId;
    }

    public String getSedeId() {
        return sedeId;
    }

    public void setSedeId(String sedeId) {
        this.sedeId = sedeId;
    }

    @Override
    public String toString() {
        return "EdificioPk{" +
                "edificioId='" + edificioId + '\'' +
                ", sedeId='" + sedeId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EdificioPk that = (EdificioPk) o;
        return Objects.equals(edificioId, that.edificioId) && Objects.equals(sedeId, that.sedeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edificioId, sedeId);
    }

    @PrePersist
    public void generateId() {
        edificioId = UUID.randomUUID().toString().substring(0, 8);
    }

}
