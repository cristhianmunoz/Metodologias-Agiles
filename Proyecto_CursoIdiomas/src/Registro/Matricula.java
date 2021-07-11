package Registro;

public class Matricula {

    private Estudiante estudiante;
    private Curso cursoMatriculado;

    public Matricula(Estudiante estudiante, Curso curso) {
            this.estudiante = estudiante;

        if (curso.asignarCurso(this)){
            System.out.println("Estudiante matriculado con èxito");
        } else System.out.println("Curso no Disponible");

    }

    public void generarComprobante(Estudiante estudiante, Curso curso){
            Comprobante generaCom = new Comprobante(estudiante, curso);
            generaCom.imprimirComprobante();
            generaCom.guardarComporbante();

    }

    public Curso getCursoMatriculado() {
        return cursoMatriculado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}
