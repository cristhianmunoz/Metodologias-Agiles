import Registro.*;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        //System.out.println("Hola mundo");
        Persona secretaria = new Secretaria("Maria","Dolores",123);

        System.out.println("==========  BIENVENIDA AL SISTEMA  ===========\n");
        /*System.out.println("Registrese Secretari@\n");
        System.out.println("Nombre: ");
        /*try (Scanner scanner = new Scanner(System.in)) {
            String nombre= scanner.nextLine();
        }*/

        //System.out.println("Bienvenida" );

        Estudiante alumno= new Estudiante("Cristhian","Muñoz Aulestia", 12);
        Estudiante alumno2= new Estudiante("David","Suarez Vanegas", 13);
        Estudiante alumno3= new Estudiante("Andrea","Cachipuendo Catucuamba", 14);

        Profesor profesor= new Profesor("Cristhian","Muñoz Aulestia", 100);
        Profesor profesor2= new Profesor("Josue","Muñoz Aulestia", 101);
        profesor2.setEstado("No disponible");
        Profesor profesor3= new Profesor("Ibeth","Lopez Fernandez", 102);
        profesor3.setEstado("Disponible");


        ListaEstudiantes lista1= new ListaEstudiantes();
        ListaProfesores lista2= new ListaProfesores();

        lista1.agregarEstudiante(alumno);
        lista1.agregarEstudiante(alumno2);
        //lista1.agregarEstudiante(alumno3);

        lista2.agregarProfesor(profesor);
        lista2.agregarProfesor(profesor2);
        lista2.agregarProfesor(profesor3);

        Curso curso1 = new Curso("1", "Inglès","Academico 1","4pm-6pm");
        Curso curso2 = new Curso("2", "Frances","Academico 2","2pm-4pm");

        Matricula matricula = new Matricula(alumno3);
        matricula.asignarCurso("1","Inglès","Academico 1","4pm-6pm");


    }
}
