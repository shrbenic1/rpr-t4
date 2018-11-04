package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Student {
    private String ime;
    private String prezime;
    private Integer brojIndeksa;
    private Integer opterecenje;
    private Semestar semestar;
    private ArrayList<Predmet> predmeti;
    private final Integer brojIzbornih = null;
    private final Integer brojObaveznih = null;

    public Student(String ime, String prezime, Integer brojIndeksa, Semestar semestar) {

    }
    public String dajIme() {
        return ime;
    }

    public String dajPrezime() {
        return prezime;
    }

    public Integer dajBrIndeksa() {
        return brojIndeksa;
    }

    public Integer dajOpterecenje() {
        return opterecenje;
    }

    public Semestar dajSemestar() {
        return semestar;
    }

    public final Integer dajBrojIzbornih() {
        return brojIzbornih;
    }

    public final Integer dajBrojObaveznih() {
        return brojObaveznih;
    }

    public ArrayList<Predmet> dajPredmete() {
        return predmeti;
    }

    public void dodajPredmet(Predmet predmet) {

    }
}
