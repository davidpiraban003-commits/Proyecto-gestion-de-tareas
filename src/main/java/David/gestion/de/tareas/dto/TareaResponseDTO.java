package David.gestion.de.tareas.dto;


public class TareaResponseDTO {
    private int Id;
    private String titulo;
    private String descripcion; 
    private String EstadoTarea;
    private String Prioridad;

    public TareaResponseDTO(){

}

   public int getId(){
    return Id;
   }

   public void setId(int Id){
    this.Id = Id;
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


