package Registro;

import java.time.temporal.JulianFields;
import java.util.Date;

public class Matricula {

    private Estudiante estudiante;
    private Curso cursoMatriculado;

    public Matricula(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void generarComprobante(){
        Comprobante generaCom = new Comprobante();
        generaCom.imprimirComprobante();
        generaCom.guardarComporbante();
    }
    public void asignarCurso(Curso curso) {
        Curso cursos = curso;

        if(cursos.verificarCupos() == true){
            //SE LE ASIGNA A UN ESTUDIANTE UN CURSO//
            //cursos.añadirListaEstudiante(estudiante);
            ListaEstudiantes nuevoEstudiante = new ListaEstudiantes();
            nuevoEstudiante.agregarEstudiante(estudiante);
            System.out.println("Estudiante matriculado con èxito");
            generarComprobante();
        }else{
            System.out.println("Curso no Disponible");
        }
        //Si hay cupos disponibles se genera el comprobante es decir si se matricula
    }

    public Curso getCursoMatriculado() {
        return cursoMatriculado;
    }

}
