package ec.edu.epn.tdd.courses_Lenguagues;

import org.junit.Test;

import java.rmi.AccessException;

import static org.junit.Assert.*;

public class List_TeachersTest {

    @Test
    public void given_teacher_when_checkRegisterTeacher_then_true() {
        List_Teachers lt = new List_Teachers();
        boolean expected = true;
        boolean actual = lt.checkRegisterTeacher(new Teacher("Andrea","s Catucuamba", 103));
        assertEquals(expected,actual);
    }


    /*public void given_teacher_course_when_darDeBja_then_ok() {
        List_Teachers lt = new List_Teachers();
        Teacher t = new Teacher("Sofia","Alvarez Torres",104);
        lt.agregarProfesor(t);
        Course c[] = new Course[1];
        c[0] = new Course("1", "Inglès","Academico 1","4pm-6pm");
        Secretary s = new Secretary("Maria","Dolores",123);
        s.asignarProfesorACurso(t,c[0]);

        boolean expected = true;
        boolean actual = lt.darDeBaja(t,c);
        assertEquals(expected,actual);
    }*/
    @Test
    public void given_teacher_course_when_darDeBja_then_ok() {
        List_Teachers lt = new List_Teachers();
        Teacher t = new Teacher("Sofia","Alvarez Torres",104);
        lt.agregarProfesor(t);
        Course c[] = new Course[1];
        c[0] = new Course("1", "Inglès","Academico 1","4pm-6pm");
        Secretary s = new Secretary("Maria","Dolores",123);
        s.asignarProfesorACurso(t,c[0]);

        boolean expected = true;
        boolean actual = lt.darDeBaja(t,c);
        assertEquals(expected,actual);
    }


}