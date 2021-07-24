package ec.edu.epn.tdd.courses_Lenguagues;

import org.junit.BeforeClass;
import org.junit.Test;

import java.rmi.AccessException;

import static org.junit.Assert.*;

public class List_TeachersTest {
    public List_Teachers lt;
    public Teacher t,t1;
    public Secretary s;
    public Course c[];

    @BeforeClass
    public void beforeClass() {
        t = new Teacher("Sofia","Alvarez Torres",104);
        t1 = new Teacher("Axel","Lopez Torres",105);
        lt = new List_Teachers();
         s = new Secretary("Maria","Dolores",123);
        c = new Course[1];
        c[0] = new Course("1", "Inglès","Academico 1","4pm-6pm");
    }

    @Test
    public void given_teacher_when_checkRegisterTeacher_then_true() {
        boolean expected = true;
        boolean actual = lt.checkRegisterTeacher(new Teacher("Andrea","Cachipuendo Catucuamba", 103));
        assertEquals(expected,actual);
    }

    @Test
    public void given_teacher_when_checkRegisterTeacher_then_false() {
        boolean expected = true;
        boolean actual = lt.checkRegisterTeacher(new Teacher("Rosa","Perugachi Amaguaña", 103));
        assertEquals(expected,actual);
    }
    @Test
    public void given_teacher_course_when_darDeBja_then_error() {

        lt.agregarProfesor(t);
        t.setEstado(false);
        Course c[] = new Course[1];
        c[0] = new Course("2", "Fraces","Academico 1","6pm-8pm");


        s.asignarProfesorACurso(t1,c[0]);
        boolean expected = true;
        boolean actual = lt.darDeBaja(t,c);
        assertEquals(expected,actual);
    }
    @Test
    public void given_teacher_course_when_darDeBja_then_ok() {
        lt.agregarProfesor(t);
        s.asignarProfesorACurso(t,c[0]);

        boolean expected = true;
        boolean actual = lt.darDeBaja(t,c);
        assertEquals(expected,actual);
    }


}