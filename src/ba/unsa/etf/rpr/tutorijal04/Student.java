package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Student {
    private String ime;
    private String prezime;
    private Integer brojIndeksa;
    private Integer brojKredita;
    private Integer brojIzbornihTrenutno;
    private Integer brojObaveznihTrenutno;
    private Integer semestarStudenta;
    private final Integer ukupanBrojKredita = 30;
    private final Integer brojIzbornih = 0;
    private final Integer brojObaveznih = 0;

    public Student(String ime, String prezime, Integer brojIndeksa, Integer semestarStudenta) {

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

    public Integer dajBrojKredita() {
        return brojKredita;
    }

    public Integer dajBrojIzbornih() {
        return brojIzbornih;
    }

    public Integer dajBrojObaveznih() {
        return brojObaveznih;
    }

    public void postaviBrojKredita(Integer brojKredita) {
        this.brojKredita = brojKredita;
    }

    public void postaviBrojIzbornihTrenutno(Integer brojIzbornihTrenutno) {
        this.brojIzbornihTrenutno = brojIzbornihTrenutno;
    }

    public void postaviBrojObaveznihTrenutno(Integer brojObaveznihTrenutno) {
        this.brojObaveznihTrenutno = brojObaveznihTrenutno;
    }
}
