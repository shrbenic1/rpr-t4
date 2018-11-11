package ba.unsa.etf.rpr.tutorijal04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        Fakultet fakultet = new Fakultet();
        int opcija, brojIndeksa, ects, semestar;
        String ime, prezime, izborni, ime1, b;
        PlanStudija bologna = new PlanStudija();
        PlanStudija anteBologna = new PlanStudija();
        while (true) {
            System.out.print("Za upis novog studenta na fakultet unesite 1, \nza unos novog predmeta na fakultet unesite 2, \nza upis studenta na neki plan studija i predmet unesite 3, \nza listing svih studenata s nekog predmeta unesite 4, \na za prekid unesite 5:");
            opcija = ulaz.nextInt();
            if (opcija == 5) break;
            else if (opcija == 1) {
                System.out.println("Unesite ime studenta: ");
                ulaz.nextLine();
                ime = ulaz.nextLine();
                System.out.println("Unesite prezime studenta: ");
                prezime = ulaz.nextLine();
                System.out.println("Unesite broj indeksa: ");
                brojIndeksa = ulaz.nextInt();
                fakultet.dodajStudenta(new Student(ime, prezime, brojIndeksa));
                System.out.println("\n");
            } else if (opcija == 2) {
                System.out.println("Unesite ime predmeta: ");
                ulaz.nextLine();
                ime = ulaz.nextLine();
                System.out.println("Unesite broj ECTS kredita: ");
                ects = ulaz.nextInt();
                System.out.println("Ako je predmet izborni unesite DA, ako nije unesite NE: ");
                ulaz.nextLine();
                izborni = ulaz.nextLine();
                if (izborni.equals("DA")) {
                    fakultet.dodajPredmet(new Predmet(ime, ects, true));
                } else fakultet.dodajPredmet(new Predmet(ime, ects, false));
                System.out.println("\n");
            } else if (opcija == 3) {
                System.out.println("Unesite ime studenta: ");
                ulaz.nextLine();
                ime = ulaz.nextLine();
                System.out.println("Unesite prezime studenta: ");
                prezime = ulaz.nextLine();
                System.out.println("Unesite broj indeksa: ");
                brojIndeksa = ulaz.nextInt();
                System.out.println("Unesite ime predmeta: ");
                ulaz.nextLine();
                ime1 = ulaz.nextLine();
                System.out.println("Unesite broj ECTS kredita: ");
                ects = ulaz.nextInt();
                System.out.println("Ako je predmet izborni unesite DA, ako nije unesite NE: ");
                ulaz.nextLine();
                izborni = ulaz.nextLine();
                System.out.println("Unesite broj semestra kojem pripada predmet: ");
                semestar = ulaz.nextInt();
                System.out.println("Unesite B ako je predmet dio bolognskog plana studija, a AB ukoliko je dio ante bologna plana :");
                ulaz.nextLine();
                b = ulaz.nextLine();
                if (b.equals("B")) {
                    if (izborni.equals("DA")) {
                        bologna.dodajPredmet(semestar, new Predmet(ime1, ects, true));
                        fakultet.upisiStudenta(new Student(ime, prezime, brojIndeksa), bologna, new Predmet(ime1, ects, true));
                    } else {
                        bologna.dodajPredmet(semestar, new Predmet(ime1, ects, false));
                        fakultet.upisiStudenta(new Student(ime, prezime, brojIndeksa), bologna, new Predmet(ime1, ects, false));
                    }
                } else {
                    if (izborni.equals("DA")) {
                        anteBologna.dodajPredmet(semestar, new Predmet(ime1, ects, true));
                        fakultet.upisiStudenta(new Student(ime, prezime, brojIndeksa), new PlanStudija(), new Predmet(ime1, ects, true));
                    } else {
                        anteBologna.dodajPredmet(semestar, new Predmet(ime1, ects, false));
                        fakultet.upisiStudenta(new Student(ime, prezime, brojIndeksa), new PlanStudija(), new Predmet(ime1, ects, false));
                    }
                }
            } else if (opcija == 4) {
                System.out.println("Unesite ime predmeta: ");
                ulaz.nextLine();
                ime = ulaz.nextLine();
                System.out.println("Unesite broj ECTS kredita: ");
                ects = ulaz.nextInt();
                System.out.println("Ako je predmet izborni unesite DA, ako nije unesite NE: ");
                ulaz.nextLine();
                izborni = ulaz.nextLine();
                if (izborni.equals("DA")) {
                    System.out.print(fakultet.dajSpisak(new Predmet(ime, ects, true)));
                } else System.out.print(fakultet.dajSpisak(new Predmet(ime, ects, false)));
                System.out.println("\n");
            } else {
                System.out.println("Niste unijeli ispravan broj! Pokušajte ponovo!");
                System.out.println("\n");
            }
        }
    }
}
