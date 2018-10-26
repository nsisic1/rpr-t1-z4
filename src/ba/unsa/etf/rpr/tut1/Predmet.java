package ba.unsa.etf.rpr.tut1;

public class Predmet {
    private String nazivPredmeta;
    private String sifraPredmeta;
    private int maxBrojStudenata;

    private Student[] studenti;

    Predmet(String naziv, String sifra, int maxBroj) {
        nazivPredmeta = naziv;
        sifraPredmeta = sifra;
        maxBrojStudenata = maxBroj;

        studenti = new Student[maxBrojStudenata];
    }

    void upisi(Student student) {
        // Provjeravamo da li je student vec upisan
        boolean popunjen = true;
        int prviSlobodan = 0;
        for(int i = 0; i < maxBrojStudenata; i++) {
            if (studenti[i] != null) {
                if (studenti[i] == student) {
                    throw new IllegalArgumentException("Student vec upisan!");
                }
            } else
            {
                if (popunjen) // Da bi odrzali redoslijed
                    prviSlobodan = i;
                popunjen = false;
            }
        }

        if (!popunjen) {
            studenti[prviSlobodan] = student;
        } else {
            throw new IllegalArgumentException("Predmet je vec pun!");
        }
    }

    void ispisi(Student student) {
        for(int i = 0; i < maxBrojStudenata; i++) {
            if (studenti[i] == student) {
                studenti[i] = null;
                return;
            }
        }
        // Ako nije bio upisan
        throw new IllegalArgumentException("Student nije bio upisan u ovaj kurs!");
    }

    String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    String getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(String sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    @Override
    public String toString() {
        String ispis = "";
        int redniBroj = 0;
        for (int i = 0; i < maxBrojStudenata; i++) {
            if(studenti[i] != null) {
                redniBroj++;
                ispis = ispis.concat(redniBroj + ". ");
                ispis = ispis.concat(studenti[i].toString());
                ispis = ispis.concat("\n");
            }
        }
        return ispis;
    }
}
