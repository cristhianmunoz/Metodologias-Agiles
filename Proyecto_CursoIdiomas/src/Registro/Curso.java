package Registro;

import javax.swing.*;
import java.io.*;
import java.util.Date;

public class Curso {
    private String id;
    private Profesor profesor;
    private String idioma;
    private String nivel;
    private String horario;
    private ListaEstudiantes listaEstudiantes=new ListaEstudiantes();

    public Curso(String id, String idioma, String nivel, String horario ) {
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

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getId() {
        return id;
    }

    public void añadirListaEstudiante(Estudiante estudiante){
        this.listaEstudiantes.agregarEstudiante(estudiante);
    }

    public void asignarProfesor (String profesor){
        //Instanciar la Lista de Profesores
        //ListaProfesores profesores = new ListaProfesores();
        String estado = "Disponible";
        String sCadena = "";
        int contador=0;
        try {
            FileReader fr = new FileReader("ListaProfesores.txt");
            BufferedReader bf = new BufferedReader(fr);

            while ((sCadena = bf.readLine()) != null) {
                contador++;
                if (this.profesor.getNombre().equalsIgnoreCase(profesor)) {
                    if (sCadena.equalsIgnoreCase(estado)) {
                        //Reescribe la lista con estado=ocupado

                        //
                        getProfesor().getNombre();
                        //return this.profesor;
                    } else {
                        System.out.println("Profesor no disponible");
                    }
                }else{
                    System.out.println("No existen registro del profesor");
                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //return this.profesor;
    }

    public boolean verificarCupos(){

        //Matricula generarMatriula = new Matricula();
        String sCadena="";
        int cuposDisponibles = 0;
        int numeroEstudiantes = 0;

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
            cuposDisponibles = 25-numeroEstudiantes;
            System.out.println("Cupos Disponibles: "+cuposDisponibles);
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
                ", horario='" + horario + '\'' +
                '}';
    }
}
