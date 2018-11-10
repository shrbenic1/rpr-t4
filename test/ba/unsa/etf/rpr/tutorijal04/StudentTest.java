package ba.unsa.etf.rpr.tutorijal04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void studentTest() {
        Student student = new Student("Sven", "Hrbenić", 17901);
        assertAll(
                () -> assertEquals("Sven", student.getIme()),
                () -> assertEquals("Hrbenić", student.getPrezime()),
                () -> assertEquals((Integer)17901, student.getBrojIndeksa())
        );
    }
}