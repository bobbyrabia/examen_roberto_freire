package ec.espe.edu.arquitectura.examen_roberto_freire.service;

import ec.espe.edu.arquitectura.examen_roberto_freire.model.Edificio;
import ec.espe.edu.arquitectura.examen_roberto_freire.model.EdificioPk;
import ec.espe.edu.arquitectura.examen_roberto_freire.repository.EdificioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {
    private final EdificioRepository edificioRepository;


    public EdificioService(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }

    public List<Edificio> listarEdificiosPorSedeSuperficie(String sedeId){
        return this.edificioRepository.findEdificioBySedeSedeIdOrderBySuperficieAsc(sedeId);
    }





}
