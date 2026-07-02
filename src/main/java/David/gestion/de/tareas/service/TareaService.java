package David.gestion.de.tareas.service;


import David.gestion.de.tareas.model.*;
import David.gestion.de.tareas.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {
    
    private final EstudianteRepository repositorio;

    public TareaService(EstudianteRepository repositorio) {
        this.repositorio = repositorio;
    }


    
    public void agregarTarea(Tarea tarea) {
        this.repositorio.save(tarea);
    }

    
    public List<Tarea> obtenerTareas() {
        return this.repositorio.findAll();
    }

    public Tarea obtenerTareaPorId(int id) {
        return this.repositorio.findById(id); 
    }

    public void actualizarTarea(int id, Tarea nuevaTarea) {
        Tarea tareaExistente = this.repositorio.findById(id);
        
        if (tareaExistente != null) {
            tareaExistente.setEstado(nuevaTarea.getEstado());
            tareaExistente.setPrioridad(nuevaTarea.getPrioridad());

        }
    }

    public void eliminarTarea(int id) {
        this.repositorio.deleteById(id);
    }
}