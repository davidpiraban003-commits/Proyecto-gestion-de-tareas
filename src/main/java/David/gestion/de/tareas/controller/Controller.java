
package David.gestion.de.tareas.controller;

import David.gestion.de.tareas.model.*;
import David.gestion.de.tareas.service.TareaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class Controller {

    private final TareaService servicio;

    public Controller(TareaService servicio) {
        this.servicio = servicio;
    }

    
    @PostMapping
    public void crearTarea(@RequestBody Tarea nuevaTarea) {
        this.servicio.agregarTarea(nuevaTarea);
    }

    
    @GetMapping
    public List<Tarea> obtenerTodas() {
        return this.servicio.obtenerTareas();
    }

    @GetMapping("/{id}")
    public Tarea obtenerPorId(@PathVariable int id) {
        return this.servicio.obtenerTareaPorId(id);
    }

    @PutMapping("/{id}")
    public void actualizarTarea(@PathVariable int id, @RequestBody Tarea tareaActualizada) {
        this.servicio.actualizarTarea(id, tareaActualizada);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable int id) {
        this.servicio.eliminarTarea(id);
    }
}

