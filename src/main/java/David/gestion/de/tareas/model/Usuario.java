package David.gestion.de.tareas.model;

import java.util.List;

public class Usuario {
    private String NombreEstudiante;
    private int EdadEstudiante;
    private int DocumentoEstudiante;
    private List<Tarea> tarea;

    public Usuario(String NombreEstudiante, int EdadEstudiante, int DocumentoEstudiante, List<Tarea> tarea){
        this.DocumentoEstudiante = DocumentoEstudiante;
        this.NombreEstudiante = NombreEstudiante;
        this.EdadEstudiante = EdadEstudiante;
        this.tarea = tarea;

    }

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


    public List<Tarea> getTarea(){
        return tarea;
    }

    public void setTarea(List<Tarea> tarea){
        this.tarea = tarea;
    }



}
