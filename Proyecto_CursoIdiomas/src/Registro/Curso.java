package Registro;

import javax.swing.*;
import java.io.*;
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

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

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

    public void añadirListaEstudiante(Estudiante estudiante){
        this.listaEstudiantes.agregarEstudiante(estudiante);
    }
    /*public void asignarProfesor (Profesor profesor){
        //Instanciar la Lista de Profesores
        ListaProfesores profesores = new ListaProfesores();
    }*/
    public boolean verificarCupos(){

        Matricula generarMatriula = new Matricula();

        String sCadena="";
        long numeroEstudiantes = 0;

        try{
            FileReader fr = new FileReader("ListaEstudiantes.txt");
            BufferedReader bf = new BufferedReader(fr);

            while ((sCadena = bf.readLine())!=null) {
                numeroEstudiantes++;
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        if(numeroEstudiantes < 25){
            System.out.println("Cupos Disponibles: "+numeroEstudiantes);
            //generarMatriula.asignarCurso();
            return true;
        }else{
            return false;
        }
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
