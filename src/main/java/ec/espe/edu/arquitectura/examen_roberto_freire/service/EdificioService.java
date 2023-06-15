package ec.espe.edu.arquitectura.examen_roberto_freire.service;

import ec.espe.edu.arquitectura.examen_roberto_freire.repository.EdificioRepository;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
    private final EdificioRepository edificioRepository;

    public EdificioService(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }




}
