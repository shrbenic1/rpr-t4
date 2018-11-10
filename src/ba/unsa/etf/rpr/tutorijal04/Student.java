package ba.unsa.etf.rpr.tutorijal04;

public class Student {
    private String ime;
    private String prezime;
    private Integer brojIndeksa;

    public Student(String ime, String prezime, Integer brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Integer getBrojIndeksa() {
        return brojIndeksa;
    }
}
