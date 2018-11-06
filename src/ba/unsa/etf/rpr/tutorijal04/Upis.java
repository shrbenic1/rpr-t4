package ba.unsa.etf.rpr.tutorijal04;

public class Upis {
    private PlanStudija planStudija;
    private Predmet predmet;
    private Student student;

    public Upis(PlanStudija planStudija, Predmet predmet, Student student) {
        this.planStudija = planStudija;
        this.predmet = predmet;
        this.student = student;
    }

    public PlanStudija getPlanStudija() {
        return planStudija;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public Student getStudent() {
        return student;
    }
}
