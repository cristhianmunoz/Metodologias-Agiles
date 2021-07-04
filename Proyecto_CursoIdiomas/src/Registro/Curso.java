package Registro;

import java.util.Date;

public class Curso {
    private String id;
    private Profesor profesor;
    private String idioma;
    private String nivel;
    private Date horario;
    private ListaEstudiantes listaEstudiantes;

    public Curso(String id, String idioma, String nivel, Date horario ) {
        this.id=id;
        this.idioma=idioma;
        this.nivel=nivel;
        this.horario=horario;
    }

    /*public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }*/

    public Profesor getProfesor() {
        return profesor;
    }

    public String getIdioma() {
        return idioma;
    }

    public Date getHorario() {
        return horario;
    }
    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getId() {
        return id;
    }

    /*public void añadirListaEstudiante(Estudiante estudiante){
        this.listaEstudiantes.agregar(estudiante);
    }*/
    public void asignarProfesor (Profesor profesor){
        //Instanciar la Lista de Profesores


    }
    public void verificarCupos(){

    }

    @Override
    public String toString() {
        return "Curso{" +
                "id='" + id + '\'' +
                ", profesor=" + profesor +
                ", idioma='" + idioma + '\'' +
                ", nivel='" + nivel + '\'' +
                ", horario=" + horario +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
