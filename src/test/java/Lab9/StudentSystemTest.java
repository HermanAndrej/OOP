package Lab9;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class StudentSystemTest {

    StudentSystem studentSystem;

    {
        try {
            studentSystem = new StudentSystem("students.csv");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testifStudentisPresent(){
        assertFalse(studentSystem.students.isEmpty());

    }

    @Test
    void testStudentWithId100(){
        assertFalse(studentSystem.getStudentById(100).isPresent());
    }

    @Test
    void testStudentNull(){
        assertThrows(StudentNotFoundException.class, () -> studentSystem.getStudentById(100));
    }

    @Test
    void testHighestGPAStudent(){
        assertNotNull(studentSystem.getHighestGpaStudent());
    }

    @Test
    void testExceptionForEmptyStudentList(){
        assertThrows(EmptyStudentListException.class,
                () -> {StudentSystem std = new StudentSystem("empty.csv");});
    }

    //@Test
    //void testNamesArray()

    @Test
    void testSize(){
        assertEquals(70, studentSystem.readStudents("students.csv").size());
    }

    @Test
    void testLargestName(){
        assertNotEquals("Ava White", studentSystem.getLongestNameStudent());
    }

    @Test
    void testStudents(){
        assertNotEquals(studentSystem.getHighestGpaStudent(), studentSystem.getLongestNameStudent());
    }

    @Test
    void testSameStudent(){
        assertEquals(studentSystem.getHighestGpaStudent(), studentSystem.getStudentById(12));
    }
}