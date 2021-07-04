import Registro.*;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        //System.out.println("Hola mundo");
        Persona secretaria = new Secretaria("Maria","Dolores",123);

        System.out.println("Bienvenida al Sistema\n");
        System.out.println("Registrese Secretari@\n");
        System.out.println("Nombre: ");
        /*try (Scanner scanner = new Scanner(System.in)) {
            String nombre= scanner.nextLine();
        }*/

        System.out.println("Bienvenida" );

        Estudiante alumno= new Estudiante("Cristhian","Muñoz Aulestia", 12);
        Estudiante alumno2= new Estudiante("David","Suarez Vanegas", 13);

        Profesor profesor= new Profesor("Cristhian","Muñoz Aulestia", 100);
        Profesor profesor2= new Profesor("Josue","Muñoz Aulestia", 101);
        profesor2.setEstado("No disponible");

        ListaEstudiantes lista1= new ListaEstudiantes();
        ListaProfesores lista2= new ListaProfesores();

        lista1.agregarEstudiante(alumno);
        lista1.agregarEstudiante(alumno2);

        lista2.agregarProfesor(profesor);
        lista2.agregarProfesor(profesor2);





    }
}
