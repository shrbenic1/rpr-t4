package ba.unsa.etf.rpr.tutorijal04;

import java.util.List;
import java.util.Map;

public class PlanStudija {
    private Map<Integer, List<Predmet>> planStudija;

    public PlanStudija(Map<Integer, List<Predmet>> planStudija) {
        this.planStudija = planStudija;
    }

    public Map<Integer, List<Predmet>> getPlanStudija() {
        return planStudija;
    }
}
