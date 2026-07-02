package David.gestion.de.tareas.dto;

public class EstadoDeTareaRequestDTO {
    private String estado;
    private String prioridad;
    private int IdTarea;


   public EstadoDeTareaRequestDTO(){}


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
}
