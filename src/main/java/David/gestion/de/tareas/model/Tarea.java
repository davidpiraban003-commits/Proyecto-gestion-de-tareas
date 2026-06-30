package David.gestion.de.tareas.model;

public enum Prioridad {
    Baja,
    Media,
    Alta,
    Urgente;
}

public class Tarea {
    private String nombreTarea;
    private Prioridad prioridad;
    private EstadoDeTarea estado;

    public Tarea(String nombreTarea, Prioridad prioridad, EstadoDeTarea estado){
        this.nombreTarea = nombreTarea;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    public String getNombreTarea(){
        return nombreTarea;
    }
    public void setNombreTarea(String nombreTarea){
        this.nombreTarea= nombreTarea;
    }

    public Prioridad getPrioridad(){
        return prioridad;
    }
    public void setPrioridad(Prioridad prioridad){
        this.prioridad = prioridad;
    }

    public EstadoDeTarea getEstado(){
        return estado;
    }
    public void setEstado(EstadoDeTarea estado){
        this.estado = estado;
    }
}