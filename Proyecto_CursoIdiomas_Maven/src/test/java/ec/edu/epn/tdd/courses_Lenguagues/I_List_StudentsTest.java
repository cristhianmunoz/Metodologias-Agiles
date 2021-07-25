package ec.edu.epn.tdd.courses_Lenguagues;

import ec.edu.epn.tdd.courses_Languagues.Course;
import ec.edu.epn.tdd.courses_Languagues.I_List_Students;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class I_List_StudentsTest {

    @Test
    public void give_Course_when_finishPeriod_then_ok(){
        Course curso_1 = new Course("1", "Inglès","Academico 1","4pm-6pm");
        //During 30 days, this course is active. After its astribute "list" should be eliminate
        curso_1.getNameFile();

        I_List_Students instance= Mockito.mock(I_List_Students.class);
        Mockito.when(instance.Eliminar_Lista_Curso(curso_1.getNameFile())).thenReturn(true);

        assertTrue( instance.Eliminar_Lista_Curso(curso_1.getNameFile()));
    }

}