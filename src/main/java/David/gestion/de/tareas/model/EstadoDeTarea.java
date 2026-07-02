package David.gestion.de.tareas.model;


public enum EstadoDeTarea {
    PENDIENTE,
    EN_PROGRESO,
    COMPLETADA;


    public class Tarea {
        private int numeroDeTarea;
        private String descripcion;
        private EstadoDeTarea estado;

        public Tarea(int numeroDeTarea, String descripcion, EstadoDeTarea estado) {
            this.numeroDeTarea = numeroDeTarea;
            this.descripcion = descripcion;
            this.estado = estado;
        }


    }
}


