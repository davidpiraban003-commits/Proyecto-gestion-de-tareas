package David.gestion.de.tareas.dto;

public class UsuarioResponseDTO {
        private String NombreEstudiante;
    private int EdadEstudiante;
    private int DocumentoEstudiante;
    

    public UsuarioResponseDTO(){}

    public String getNombreEstudiante (){
        return NombreEstudiante;
    }
    public void setNombreEstudiante(String NombreEstudiante){
        this.NombreEstudiante = NombreEstudiante;
    }
    public int getEdadEstudiante(){
        return EdadEstudiante;
    }
    public void setEdadEstudiante(int EdadEstudiante){
        this.EdadEstudiante = EdadEstudiante;
    }
    public int getDocumentoEstudiante(){
        return DocumentoEstudiante;
    }
    public void setDocumentoEstudiante(int DocumentoEstudiante){
        this.DocumentoEstudiante = DocumentoEstudiante;
    }
}
