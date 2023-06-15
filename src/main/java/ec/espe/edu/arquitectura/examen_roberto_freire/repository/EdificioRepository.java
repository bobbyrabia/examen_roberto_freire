package ec.espe.edu.arquitectura.examen_roberto_freire.repository;

import ec.espe.edu.arquitectura.examen_roberto_freire.model.Edificio;
import ec.espe.edu.arquitectura.examen_roberto_freire.model.EdificioPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, EdificioPk> {
    List<Edificio> findEdificioBySedeSedeIdOrderBySuperficieAsc(String sedeId);

}
