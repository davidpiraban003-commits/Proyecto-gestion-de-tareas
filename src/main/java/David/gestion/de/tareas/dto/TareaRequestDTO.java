package David.gestion.de.tareas.dto;

public class TareaRequestDTO {
    private String titulo;
    private String descripcion;
    private String EstadoTarea;
    private String Prioridad;


    public TareaRequestDTO(){

    }

    public String gettitulo(){
        return titulo;
    }

    public void settitulo(String titulo){
        this.titulo = titulo;
    }
    public String getdescripcion(){
        return descripcion;
    }

    public void setdescripcion(String descripcion){
        this.descripcion = descripcion; 

    }

    public String getEstadoTarea(){
        return EstadoTarea;
    }
    public void setEstadoTarea(String EstadoTarea){
        this.EstadoTarea = EstadoTarea;
    }

    public String getPrioridad(){
        return Prioridad;
    }

    public void setPrioridad(String Prioridad){
        this.Prioridad = Prioridad;
    }

}
