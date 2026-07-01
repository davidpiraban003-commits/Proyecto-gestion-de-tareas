package David.gestion.de.tareas.model;

public class Tarea {
    private String nombreTarea;
    private int prioridad;
    private EstadoDeTarea estado;
    private int idTarea;


    public Tarea(String nombreTarea, int prioridad, EstadoDeTarea estado, int idTarea){
        this.nombreTarea = nombreTarea;
        this.prioridad = prioridad;
        this.estado = estado;
        this.idTarea = idTarea;
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
    public int getidTarea(){
        return idTarea;
    }
    public void setidTarea(int idTarea){
        this.idTarea = idTarea;
    }
}
