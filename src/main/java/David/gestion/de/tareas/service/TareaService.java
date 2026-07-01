package David.gestion.de.tareas.service;

import org.springframework.stereotype.Service;
import java.util.List;
import David.gestion.de.tareas.model.*;
import David.gestion.de.tareas.repository.EstudianteRepository;


@Service
public class TareaService {
    private final EstudianteRepository estudianteRepository;

    public TareaService(EstudianteRepository estudianteRepository){
        this.estudianteRepository = estudianteRepository;
    }


    public void crearTarea(Tarea nuevaTarea){
        this.estudianteRepository.save(nuevaTarea);
    }

    public List<Tarea> obtenerTareas(){
        return this.estudianteRepository.findAll();
    }

    public void eliminarTarea(Tarea eliminaTarea){
        this.estudianteRepository.delete(eliminaTarea);
    }
}
