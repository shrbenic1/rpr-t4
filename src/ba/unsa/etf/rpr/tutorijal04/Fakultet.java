package ba.unsa.etf.rpr.tutorijal04;

import java.util.HashSet;
import java.util.Set;

public class Fakultet {
    private Set<Student> spisakStudenata = new HashSet<>();
    private Set<Predmet> spisakPredmeta = new HashSet<>();
    private Set<Upis> spisakUpisa = new HashSet<>();

    public void dodajStudenta(Student s) {
        spisakStudenata.add(s);
    }

    public void dodajPredmet(Predmet p) {
        spisakPredmeta.add(p);
    }

    public void upisiStudenta(Upis upis) {
        spisakUpisa.add(upis);
    }

    public void upisiStudenta(Student s, PlanStudija planStudija, Predmet p) {
        spisakUpisa.add(new Upis(planStudija, p, s));
    }

    public String dajSpisak(Predmet p) {
        String spisak = "";
        String trazeniPredmet = p.getIme();
        for (Upis upis : spisakUpisa) {
            String predmet = upis.getPredmet().getIme();
            if (predmet.equals(trazeniPredmet)) {
                spisak += upis.getStudent().getIme() + " " + upis.getStudent().getPrezime() + " " + upis.getStudent().getBrojIndeksa() + "\n";
            }
        }
        return spisak;
    }
}


