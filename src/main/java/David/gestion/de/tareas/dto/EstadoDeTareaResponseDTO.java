package David.gestion.de.tareas.dto;

public class EstadoDeTareaResponseDTO {
    private String estado;
    private String descripcion;
    private String prioridad;
    private int IdTarea;


    public EstadoDeTareaResponseDTO(){}
    public String getestado(){
    return estado;
   }

   public void setestado(String estado){
    this.estado = estado;
   }

   public String getprioridad(){
    return prioridad;
   }
   public void setprioridad(String prioridad){
    this.prioridad = prioridad;
   }

   public int getIdTarea(){
    return IdTarea;
   }
   public void setIdTarea(int IdTarea){
    this.IdTarea = IdTarea;
   }

   public String getdescripcion(){
    return descripcion;
   }
   public void setdescripcion(String descripcion){
    this.descripcion = descripcion;
   }
}

