package ba.unsa.etf.rpr.predavanje03;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Disabled
    void upisi() {
        Predmet matematika = new Predmet("Matematika", 1234, 100);
        Student faris = new Student("Faris", "Music", 18296);
        matematika.upisi(faris);
        assertEquals("Faris", matematika.getNizStudenata()[0].getIme());
    }

    @Test
    void ispisi() {
        int brojStudenata=0;
        Predmet matematika = new Predmet("Matematika", 1234, 100);
        Student faris = new Student("Faris", "Music", 18296);
        Student sule = new Student ("Sulejman", "Tutnjevic", 1555);
        matematika.upisi(faris);
        brojStudenata++;
        matematika.upisi(sule);
        brojStudenata++;
        assertEquals(2, brojStudenata);
        matematika.ispisi(sule);
        brojStudenata--;
        assertEquals(50, matematika.getNizStudenata().length);
    }

    @Test
    void ispisiSve() {
    }

    @Disabled
    void getNizStudenata() {
        Predmet matematika = new Predmet("Matematika", 1234, 100);
        Student faris = new Student("Faris", "Music", 18296);
        Student sule = new Student ("Sulejman", "Tutnjevic", 1555);
        matematika.upisi(faris);
        matematika.upisi(sule);
        Predmet hemija = new Predmet("Hemija", 1555, 100);
        Student adnan = new Student("Faris", "Music", 18296);
        Student emir = new Student ("Sulejman", "Tutnjevic", 1555);
        hemija.upisi(adnan);
        hemija.upisi(emir);
        assertArrayEquals(hemija.getNizStudenata(), matematika.getNizStudenata());
    }

    @Test
    void setNizStudenata() {
    }

    @Test
    void getNazivPredmeta() {
        Predmet hemija = new Predmet("Hemija", 1555, 100);
        assertEquals("Hemija", hemija.getNazivPredmeta());
    }

    @Test
    void setNazivPredmeta() {
        Predmet hemija = new Predmet("Hemija", 1555, 100);
        hemija.setNazivPredmeta("Vjeronauka");
        assertEquals("Vjeronauka", hemija.getNazivPredmeta());
    }

    @Test
    void getSifraPredmeta() {
        Predmet hemija = new Predmet("Hemija", 1555, 100);
        assertEquals(1555, hemija.getSifraPredmeta());
    }

    @Test
    void setSifraPredmeta() {
        Predmet hemija = new Predmet("Hemija", 1555, 100);
        hemija.setSifraPredmeta(0);
        assertEquals(0, hemija.getSifraPredmeta());
    }
}