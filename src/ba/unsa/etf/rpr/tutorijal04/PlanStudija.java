package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanStudija {
    private Map<Integer, List<Predmet>> planStudija = new HashMap<>();

    public void dodajPredmet(Integer semestar, Predmet p) {
        List<Predmet> novaLista = new ArrayList<>();
        if(planStudija.isEmpty()) {
            novaLista.add(p);
            planStudija.put(semestar, novaLista);
            return;
        }
        for (Map.Entry<Integer, List<Predmet>> entry : planStudija.entrySet()) {
            if (entry.getKey().equals(semestar)) {
                entry.getValue().add(p);
                return;
            }
        }
        novaLista.add(p);
        planStudija.put(semestar, novaLista);
    }
}
