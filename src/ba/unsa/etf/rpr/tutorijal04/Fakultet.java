package ba.unsa.etf.rpr.tutorijal04;

import java.util.Set;

public class Fakultet {
    private Set<Student> spisakStudenata;
    private Set<Predmet> spisakPredmeta;
    private Set<Upis> spisakUpisa;

    public Fakultet(Set<Student> spisakStudenata, Set<Predmet> spisakPredmeta, Set<Upis> spisakUpisa) {
        this.spisakStudenata = spisakStudenata;
        this.spisakPredmeta = spisakPredmeta;
        this.spisakUpisa = spisakUpisa;
    }

    public Set<Student> getSpisakStudenata() {
        return spisakStudenata;
    }

    public Set<Predmet> getSpisakPredmeta() {
        return spisakPredmeta;
    }

    public Set<Upis> getSpisakUpisa() {
        return spisakUpisa;
    }

    public void dodajStudenta(Student s) {
        spisakStudenata.add(s);
    }

    public void dodajPredmet(Predmet p) {
        spisakPredmeta.add(p);
    }

    public void upisiStudenta(Upis upis) {
        spisakUpisa.add(upis);
    }

}

