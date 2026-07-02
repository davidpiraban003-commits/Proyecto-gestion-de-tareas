package David.gestion.de.tareas.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;


public enum Prioridad {
    Baja,
    Media,
    Alta,
    Urgente;


public class Tarea {
    private String nombreTarea;
    private Prioridad prioridad;
    private EstadoDeTarea estado;
    private int IdTarea;

    public Tarea(String nombreTarea, Prioridad prioridad, EstadoDeTarea estado, int IdTarea){
        this.nombreTarea = nombreTarea;
        this.prioridad = prioridad;
        this.estado = estado;
        this.IdTarea = IdTarea;
    }

    public String getNombreTarea(){
        return nombreTarea;
    }
    public void setNombreTarea(String nombreTarea){
        this.nombreTarea= nombreTarea;
    }

    public  Prioridad getPrioridad(){
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
    public int getIdTarea(){
        return IdTarea;
    }
    public void setIdTarea(int IdTarea){
        this.IdTarea = IdTarea;
    }
}
}