package ba.unsa.etf.rpr.tutorijal04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultetTest {
    @Test
    void fakultetTest() {
        Fakultet fakultet = new Fakultet();
        Student student = new Student("Sven", "Hrbenić", 17901);
        Student student1 = new Student("Meho", "Mehić", 17000);
        Predmet predmet = new Predmet("RPR", 5, true);
        Predmet predmet1 = new Predmet("DM", 5, false);
        PlanStudija planStudija = new PlanStudija();
        planStudija.dodajPredmet(3, predmet);
        planStudija.dodajPredmet(3, predmet1);
        fakultet.dodajStudenta(student);
        fakultet.dodajPredmet(predmet);
        fakultet.dodajPredmet(predmet1);
        fakultet.upisiStudenta(new Upis(planStudija, predmet1, student1));
        fakultet.upisiStudenta(student, planStudija, predmet1);
        assertEquals("Sven Hrbenić 17901\nMeho Mehić 17000\n", fakultet.dajSpisak(predmet1));
    }
}