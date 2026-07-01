package David.gestion.de.tareas.repository;
import org.springframework.stereotype.Repository;
import David.gestion.de.tareas.model.*; 
import java.util.ArrayList;
import java.util.List;

@Repository
public class EstudianteRepository {
    
    private final List<Tarea> tareas = new ArrayList<>(); 

    public void save(Tarea tarea){
        this.tareas.add(tarea); 
    }
    
    public List<Tarea> findAll(){
        
        return this.tareas; 
    }

    public void delete(Tarea tarea){
       this.tareas.remove(tarea);
    }

    public void update(Tarea tarea, Tarea nuevaTarea){
        int index = this.tareas.indexOf(tarea);
        if (index != -1) {
            this.tareas.set(index, nuevaTarea);
        }
    }
}