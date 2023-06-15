package ec.espe.edu.arquitectura.examen_roberto_freire.controller;

import ec.espe.edu.arquitectura.examen_roberto_freire.model.Sede;
import ec.espe.edu.arquitectura.examen_roberto_freire.service.SedeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sede")
public class SedeController {
    private final SedeService sedeService;

    public SedeController(SedeService sedeService) {
        this.sedeService = sedeService;
    }

    @GetMapping("/list-sede/{institucionId}")
    public ResponseEntity<List<Sede>> encontrarSedesPorInstitucion(
            @PathVariable(name = "institucionId") Integer institucionId
    ) {
        List<Sede> sedeList = this.sedeService.encontrarSedesPorInstitucion(institucionId);
        return ResponseEntity.ok(sedeList);
    }

    @PostMapping(value = "/create-sede")
    public ResponseEntity<Sede> createSede(@RequestBody Sede sede) {
        try {
            Sede sedeTemp=this.sedeService.createSede(sede);
            return ResponseEntity.ok(sedeTemp);
        } catch (RuntimeException rte) {
            return ResponseEntity.badRequest().build();
        }


    }
}
