package ba.unsa.etf.rpr.tut1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void testKonstruktor(){
        Predmet p = new Predmet("Fizika", "FIZ", 60);
        assertAll("konstruktor",
                () -> assertEquals("Fizika", p.getNazivPredmeta()),
                () -> assertEquals("FIZ", p.getSifraPredmeta())
        );
    }

    @Test
    void testUpis() {
        Predmet p = new Predmet("Fizika", "FIZ", 60);
        Student s1 = new Student("Prvi", "Clan", 54321);
        p.upisi(s1);
        assertEquals("1. Clan Prvi (54321)\n", p.toString());
    }

    @Test
    void testIspis() {
        Predmet p = new Predmet("Fizika", "FIZ", 60);
        Student s1 = new Student("Prvi", "Clan", 54321);
        p.upisi(s1);
        p.ispisi(s1);
        assertEquals("", p.toString());
    }

    @Test
    void testToString() {
        Predmet p = new Predmet("Fizika", "FIZ", 60);
        Student s1 = new Student("Prvi", "Clan", 54321);
        Student s2 = new Student("Drugi", "Clan2", 98760);
        p.upisi(s1);
        p.upisi(s2);
        assertEquals("1. Clan Prvi (54321)\n" + "2. Clan2 Drugi (98760)\n", p.toString());
    }
}