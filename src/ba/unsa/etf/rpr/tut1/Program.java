package ba.unsa.etf.rpr.tut1;

public class Program {

    public static void main(String[] args) {
        Predmet predmet = new Predmet("RPR", "R", 100);
        Student prviStudent = new Student("Hakan", "Sukur", 90001);
        predmet.upisi(prviStudent);

        Student drugiStudent = new Student("Bosko", "Buha", 90002);
        predmet.upisi(drugiStudent);
        predmet.ispisi(drugiStudent);

        // kreiranje novog predmeta, novog studenta, upis studenta na predmet, ispis studenta sa predmeta,
        // brisanje studenta, brisanje predmeta, te ispis spiska studenata na predmetu.
    }

}
