package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Predmet {
    private ArrayList<Student> spisak;
    private String naziv;
    private Integer ectsKrediti;
    private Boolean izborni;
    private Semestar semestar;

    public Predmet(String naziv, Integer ectsKrediti, Boolean izborni) {

    }

    public String dajNaziv() {
        return naziv;
    }

    public Boolean jeLiIzborni() {
        return izborni;
    }

    public Integer dajEctsKredite() {
        return ectsKrediti;
    }

    public Semestar dajSemestar() {
        return semestar;
    }

    public void upisi(Student student) {

    }

    public void ispisi(Student student) {

    }

    public ArrayList<Student> dajSpisak() {
        return spisak;
    }
}
