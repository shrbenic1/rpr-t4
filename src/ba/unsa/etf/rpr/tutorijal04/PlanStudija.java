package ba.unsa.etf.rpr.tutorijal04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanStudija {
    private Map<Integer, List<Predmet>> planStudija = new HashMap<>();

    public PlanStudija(Map<Integer, List<Predmet>> planStudija) {
        this.planStudija = planStudija;
    }

    public void dodajPredmet(Integer semestar, Predmet p) {

    }
}
