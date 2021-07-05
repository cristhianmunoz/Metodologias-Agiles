package Registro;

import java.time.temporal.JulianFields;
import java.util.Date;

public class Matricula {

    private Estudiante estudiante;
    private Curso cursoMatriculado;

    public Matricula(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        if (asignarCurso(curso)){
            System.out.println("Estudiante matriculado con èxito");
        } else System.out.println("Curso no Disponible");

    }

    public void generarComprobante(){
        Comprobante generaCom = new Comprobante();
        generaCom.imprimirComprobante();
        generaCom.guardarComporbante();
    }
    public boolean asignarCurso(Curso curso) {

        if(curso.verificarCupos()){
            curso.añadirListaEstudiante(estudiante);
            generarComprobante();
            return true;
        }else{
            return false;
        }

    }

    public Curso getCursoMatriculado() {
        return cursoMatriculado;
    }

}
