package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Semestar {
    private ArrayList<Predmet> spisakPredmeta;
    private Integer redniBrojSemestra;
    private Integer brojIzbornih;
    private Integer brojObaveznih;

    public Semestar(ArrayList<Predmet> spisakPredmeta, Integer redniBrojSemestra, Integer brojIzbornih, Integer brojObaveznih) {

    }

    public ArrayList<Predmet> dajSpisakPredmeta() {
        return spisakPredmeta;
    }

    public Integer dajRedniBrojSemestra() {
        return redniBrojSemestra;
    }

    public Integer dajBrojIzbornih() {
        return dajBrojIzbornih();
    }

    public Integer dajBrojObaveznih() {
        return dajBrojObaveznih();
    }

    public void dodajPredmet(Predmet predmet) {

    }
}
