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
    /*public void asignarCurso(){
        Curso cuposDisponibles = new Curso("1", "Inglès", "Academico", 2021/08/03/7:00);
        cuposDisponibles.verificarCupos();
        //Si hay cupos disponibles se genera el comprobante es decir si se matricula
    }*/
}
