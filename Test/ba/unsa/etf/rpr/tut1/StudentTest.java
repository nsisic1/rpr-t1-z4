package ba.unsa.etf.rpr.tut1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testKonstruktor() {
        Student s = new Student("Novi", "Clan", 12345);
        assertAll("konstruktor",
                () -> assertEquals("Novi", s.getIme()),
                () -> assertEquals("Clan", s.getPrezime()),
                () -> assertEquals(12345, s.getBrojIndeksa())
        );
    }

    @Test
    void testNepravilnoIme() {
        Student s = new Student("", "", 0);
        assertThrows(IllegalArgumentException.class, () -> s.setIme("9a"));
    }

    @Test
    void testNepravilnoPrezime() {
        Student s = new Student("", "", 0);
        assertThrows(IllegalArgumentException.class, () -> s.setPrezime("9a"));
    }

    @Test
    void testSetBrojIndeksa() {
        Student student = new Student("Novi", "Clan", 0);
        student.setBrojIndeksa(54321);
        assertEquals(54321, student.getBrojIndeksa());
    }

    @Test
    void testNegativanBrojIndeksa() {
        Student student = new Student("Novi", "Clan", 0);
        assertThrows(IllegalArgumentException.class, () -> student.setBrojIndeksa(-10));
    }

    @Test
    void testToString() {
        Student student = new Student("Novi", "Clan", 54321);
        assertEquals("Clan Novi (54321)", student.toString());
    }
}