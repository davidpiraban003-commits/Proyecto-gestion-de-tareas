package David.gestion.de.tareas.model;

public class Tarea {
    private String nombreTarea;
    private int prioridad;
    private EstadoDeTarea estado;


    public Tarea(String nombreTarea, int prioridad, EstadoDeTarea estado){
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

    public int getPrioridad(){
        return prioridad;
    }
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }

    public EstadoDeTarea getEstado(){
        return estado;
    }
    public void setEstado(EstadoDeTarea estado){
        this.estado = estado;
    }
}
