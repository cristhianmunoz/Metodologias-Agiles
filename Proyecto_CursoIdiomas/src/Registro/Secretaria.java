package Registro;



public class Secretaria extends Persona {

    public Secretaria(String nombre, String apellidos, int id) {
        super(nombre, apellidos, id);

    }

    public Estudiante inscribirEstudiante(String nombres, String apellidos, int id) {
        Estudiante alumno = new Estudiante(nombres, apellidos, id);
        System.out.println("El estudiante fue registrado con èxito en el sistema\n" + "Datos personales del alumno son:");
        System.out.println(alumno.toString());

        return alumno;
    }

    public Profesor registrarProfesor(String nombres, String apellidos, int id) {
        Profesor profesor = new Profesor(nombres, apellidos, id);
        System.out.println("El profesor fue registrado con èxito en el sistema\n" + "Datos personales del profesor son:");
            ListaProfesores lp = new ListaProfesores();
            lp.agregarProfesor(profesor);
        System.out.println(profesor.toString());

        return profesor;
    }

    public void asignarProfesorACurso(Profesor profesor, Curso curso) {

        if (profesor.getEstado() == true && curso.getProfesor() == null) {
            curso.setProfesor(profesor);
            System.out.println("Porfesor Asignado con exito");
        }
        if (curso.getProfesor() != null) {
            System.out.println("Ya existe profesor asignado a este curso");
        } else {
            System.out.println("Profesor no disponible");
        }

    }
}
