package ba.unsa.etf.rpr.tutorijal04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanStudijaTest {
    @Test
    void planStudijaTest() {
        Student student = new Student("Sven", "Hrbenić", 17901);
        PlanStudija planStudija = new PlanStudija();
        Predmet razvojProgramskihRjesenja = new Predmet("RPR", 5, true);
        Predmet digitalniSistemiUpravljanja = new Predmet("DSU", 5, false);
        Predmet osnoveRacunarstva = new Predmet("OR", 6, false);
        Predmet inzenjerskaMatematika1 = new Predmet("IM1", 7, false);
        planStudija.dodajPredmet(3, razvojProgramskihRjesenja);
        planStudija.dodajPredmet(5, digitalniSistemiUpravljanja);
        planStudija.dodajPredmet(1, osnoveRacunarstva);
        planStudija.dodajPredmet(1, inzenjerskaMatematika1);
        Upis upis = new Upis(planStudija, razvojProgramskihRjesenja, student);
        assertEquals(planStudija, upis.getPlanStudija());
        assertEquals(razvojProgramskihRjesenja, upis.getPredmet());
        assertEquals(student, upis.getStudent());
    }

}