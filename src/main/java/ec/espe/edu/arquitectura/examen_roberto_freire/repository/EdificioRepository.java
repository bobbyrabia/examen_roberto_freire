package ec.espe.edu.arquitectura.examen_roberto_freire.repository;

import ec.espe.edu.arquitectura.examen_roberto_freire.model.Edificio;
import ec.espe.edu.arquitectura.examen_roberto_freire.model.EdificioPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, EdificioPk> {
}
