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
    void testDupliUpis() {
        Predmet p = new Predmet("Fizika", "FIZ", 60);
        Student s = new Student("Prvi", "Clan", 54321);
        p.upisi(s);
        assertThrows(IllegalArgumentException.class, () -> p.upisi(s) );
    }

    @Test
    void testPopunjenPredmet() {
        Predmet p = new Predmet("Fizika", "FIZ", 0);
        Student s = new Student("Prvi", "Clan", 54321);
        assertThrows(IllegalArgumentException.class, () -> p.upisi(s));
    }

    @Test
    void testPopunjenPredmet2() {
        Predmet p = new Predmet("Fizika", "FIZ", 1);
        Student s1 = new Student("Prvi", "Clan", 54321);
        Student s2 = new Student("Drugi", "ClanDva", 12345);
        p.upisi(s1);
        assertThrows(IllegalArgumentException.class, () -> p.upisi(s2));
    }

    @Test
    void testIspis() {
        Predmet p = new Predmet("Fizika", "FIZ", 60);
        Student s = new Student("Prvi", "Clan", 54321);
        p.upisi(s);
        p.ispisi(s);
        assertEquals("", p.toString());
    }

    @Test
    void testPogresanIspis() {
        Predmet p = new Predmet("Fizika", "FIZ", 60);
        Student s = new Student("Prvi", "Clan", 54321);
        assertThrows(IllegalArgumentException.class, () -> p.ispisi(s));
    }

    @Test
    void testPogresanIspis2() {
        Predmet p = new Predmet("Fizika", "FIZ", 60);
        Student s1 = new Student("Prvi", "Clan", 54321);
        Student s2 = new Student("Drugi", "ClanDva", 12345);
        p.upisi(s1);
        assertThrows(IllegalArgumentException.class, () -> p.ispisi(s2));
    }

    @Test
    void testToString() {
        Predmet p = new Predmet("Fizika", "FIZ", 60);
        Student s1 = new Student("Prvi", "Clan", 54321);
        Student s2 = new Student("Drugi", "ClanDva", 98760);
        p.upisi(s1);
        p.upisi(s2);
        assertEquals("1. Clan Prvi (54321)\n" + "2. ClanDva Drugi (98760)\n", p.toString());
    }
}