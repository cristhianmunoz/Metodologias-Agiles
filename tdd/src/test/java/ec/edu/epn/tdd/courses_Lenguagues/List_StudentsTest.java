package ec.edu.epn.tdd.courses_Lenguagues;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class List_StudentsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void given_Student_when_unsubscribe_then_okay() {
        List_Students lista= new List_Students();
        Student expect= new Student ("Cristhian", "Muñoz", 1707996318);
        Student result= lista.unsubscribe_Student("1707996318","1_List_Students.txt");
        System.out.println(result.toString());

        //assertEquals(expect.getNombre(),result.getNombre());

    }

    @Test
    public void darDeBaja() {
    }

    @Test
    public void getEstudiantesMatriculados() {
    }
}