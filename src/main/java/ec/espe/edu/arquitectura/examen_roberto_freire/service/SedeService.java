package ec.espe.edu.arquitectura.examen_roberto_freire.service;

import ec.espe.edu.arquitectura.examen_roberto_freire.model.Sede;
import ec.espe.edu.arquitectura.examen_roberto_freire.repository.SedeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedeService {
    private final SedeRepository sedeRepository;

    public SedeService(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }
    @Transactional
    public Sede createSede(Sede sedeParam){
        List<Sede> sedeList=this.sedeRepository.findSedeByInstitucionIdAndAndEsPrincipal(sedeParam.getInstitucionId(),sedeParam.getEsPrincipal());
        if(sedeList.isEmpty()){
            return this.sedeRepository.save(sedeParam);
        }else{
            throw new RuntimeException("Sede principal ya existe en esa institucion");
        }
    }

    public List<Sede> encontrarSedesPorInstitucion(Integer institucionId){
        return this.sedeRepository.findSedeByInstitucionId(institucionId);
    }
}
