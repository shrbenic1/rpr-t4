package ba.unsa.etf.rpr.tutorijal04;


public class Predmet {
    private String ime;
    private Integer ects;
    private Boolean izborni;

    public Predmet(String ime, Integer ects, Boolean izborni) {
        this.ime = ime;
        this.ects = ects;
        this.izborni = izborni;
    }

    public String getIme() {
        return ime;
    }

    public Integer getEcts() {
        return ects;
    }

    public Boolean getIzborni() {
        return izborni;
    }
}
