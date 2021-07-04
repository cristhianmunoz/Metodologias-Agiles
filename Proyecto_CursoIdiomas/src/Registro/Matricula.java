package Registro;

import java.time.temporal.JulianFields;
import java.util.Date;

public class Matricula {

    private Estudiante estudiante;
    private String cursoMatriculado;

    public void generarComprobante(){
        Comprobante generaCom = new Comprobante();
        generaCom.imprimirComprobante();
        generaCom.guardarComporbante();
    }
    public void asignarCurso(String id, String idioma, String nivel, Date horario) {
        Curso cursos = new Curso(id, idioma, nivel, horario);

        if(cursos.verificarCupos() == true){
            //SE LE ASIGNA A UN ESTUDIANTE UN CURSO//
            cursos.añadirListaEstudiante(estudiante);
            generarComprobante();
        }else{
            System.out.println("Curso no Disponible");
        }
        //Si hay cupos disponibles se genera el comprobante es decir si se matricula
    }
}
