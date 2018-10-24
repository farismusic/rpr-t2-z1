package ba.unsa.etf.rpr.predavanje03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getIme() {
        Student faris = new Student("Faris", "Music", 18296);
        assertEquals("Faris", faris.getIme());
    }

    @Test
    void setIme() {
        Student faris = new Student("Faris", "Music", 18296);
        faris.setIme("Sadzid");
        assertEquals("Sadzid", faris.getIme());
    }

    @Test
    void getPrezime() {
        Student faris = new Student("Faris", "Music", 18296);
        assertEquals("Music", faris.getPrezime());
    }

    @Test
    void setPrezime() {
        Student faris = new Student("Faris", "Music", 18296);
        faris.setPrezime("Musanovic");
        assertEquals("Musanovic", faris.getPrezime());
    }

    @Test
    void getBrojIndeksa() {
        Student faris = new Student("Faris", "Music", 18296);
        assertEquals(18296, faris.getBrojIndeksa());
    }

    @Test
    void setBrojIndeksa() {
        Student faris = new Student("Faris", "Music", 18296);
        faris.setBrojIndeksa(18290);
        assertEquals(18290, faris.getBrojIndeksa());
    }

    @Test
    void ispisi() {
    }
}