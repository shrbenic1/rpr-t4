package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanStudija {
    private Map<Integer, List<Predmet>> planStudija = new HashMap<>();

    public PlanStudija(Map<Integer, List<Predmet>> planStudija) {
        this.planStudija = planStudija;
    }

    public void dodajPredmet(Integer semestar, Predmet p) {
        for(Map.Entry<Integer, List<Predmet>> entry : planStudija.entrySet()) {
            if(entry.getKey().equals(semestar)){
                entry.getValue().add(p);
            }
            else{
                List<Predmet> novaLista = new ArrayList<>();
                novaLista.add(p);
                planStudija.put(semestar, novaLista);
            }
        }
    }
}
