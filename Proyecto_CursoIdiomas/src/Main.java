import Registro.*;

public class Main {
    public static void main (String [] args){

        //Se tiene creado los cursos que se van a ofertar
        /*Curso curso1 = new Curso("1", "Inglès","Academico 1","4pm-6pm");
        Curso curso2 = new Curso("2", "Frances","Academico 2","2pm-4pm");*/

        //CAMBIE AQUI
        Curso cursos[] = new Curso[2];
        cursos[0] = new Curso("1", "Inglès","Academico 1","4pm-6pm");
        cursos[1] = new Curso("2", "Frances","Academico 2","2pm-4pm");
        //-----------------------------------------------------------------

        //Un usuario Secretaria debe ser instanciado antes de la ejecución del programa
        Secretaria secretaria = new Secretaria("Maria","Dolores",123);

        System.out.println("==========  BIENVENIDA AL SISTEMA  ===========\n");

        //se pueden pasar por parametros los datos de los Estudiantes
        Estudiante estudiante[]=new Estudiante[3];
        estudiante[0]= secretaria.inscribirEstudiante("Cristhian","Muñoz Aulestia", 12);
        estudiante[1]=secretaria.inscribirEstudiante("David","Suarez Vanegas", 13);
        estudiante[2]=secretaria.inscribirEstudiante("Andrea","Cachipuendo Catucuamba", 14);

        //la secretaria verifica si existe disponibilidad de cupos
        //curso1.verificarCupos();
        //curso2.verificarCupos();

        //VOY AUMENTAR ESTO
        for(int i=0;i< cursos.length;i++){
            cursos[i].verificarCupos();
        }


        //Intento de matricular a un Estudiante
        System.out.println("\nMATRICULACIÒN DEL ESTUDIANTE\n");

        /*if (curso1.verificarCupos()) {
            for(int i=0;i<estudiante.length;i++){
                Matricula matricula = new Matricula(estudiante[i], curso1);
            }
        }*/

        //AUMENTE AQUI TAMBIEN
        if (cursos[0].verificarCupos()) {
            for(int i=0;i<estudiante.length;i++){
                Matricula matricula = new Matricula(estudiante[i], cursos[0]);
            }
        }

        //Se registran a los Profesores
        Profesor profesor[]=new Profesor[3];
        profesor[0]=secretaria.registrarProfesor("Josue","Muñoz Rodriguez", 101);
        //profesor[0].setEstado(false);
        profesor[1]=secretaria.registrarProfesor("Ibeth","Lopez Fernandez", 102);
        profesor[2]=secretaria.registrarProfesor("Andrea","Cachipuendo Catucuamba", 103);

        //La secretaria asigna un profesor a un curso
        //secretaria.asignarProfesorACurso(profesor[1], curso1);

        secretaria.asignarProfesorACurso(profesor[0], cursos[1]);
        //secretaria.asignarProfesorACurso(profesor[1], cursos[0]);

        ListaProfesores lp = new ListaProfesores();
        lp.agregarProfesor(profesor[0]);
        lp.agregarProfesor(profesor[1]);
        lp.agregarProfesor(profesor[2]);

        /*DAR DE BAJA PROFESOR*/
        System.out.println("__________    DAR DE BAJA PROFESOR     ________\n");
        lp.darDeBaja(profesor[0],cursos);


    }
}
