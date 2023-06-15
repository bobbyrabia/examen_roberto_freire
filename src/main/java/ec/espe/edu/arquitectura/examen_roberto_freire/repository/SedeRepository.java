package ec.espe.edu.arquitectura.examen_roberto_freire.repository;

import ec.espe.edu.arquitectura.examen_roberto_freire.model.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SedeRepository extends JpaRepository<Sede, String> {
    List<Sede> findSedeByInstitucionId(Integer insitucionId);
    List<Sede> findSedeByInstitucionIdAndAndEsPrincipal(Integer insitucionId,Boolean esPrincipal);

}
