package ba.unsa.etf.rpr.tut1;

public class Predmet {
    private String nazivPredmeta;
    private String sifraPredmeta;
    private int maxBrojStudenata;

    private Student[] studenti;

    public Predmet(String naziv, String sifra, int maxBroj) {
        nazivPredmeta = naziv;
        sifraPredmeta = sifra;
        maxBrojStudenata = maxBroj;

        studenti = new Student[maxBrojStudenata];
    }

    public void upisi(Student student) {
        boolean vecUpisan = false;
        // Provjeravamo da li je student vec upisan
        for(int i = 0; i < maxBrojStudenata; i++) {
            if (studenti[i] == student) {
                vecUpisan = true;
                return;
            }
        }

        // Upisujemo studenta ako nije upisan i ima mjesta
        for (int i = 0; i < maxBrojStudenata; i++) {
            if (studenti[i] == null) {
                studenti[i] = student;
                break;
            }
        }
        //
    }

    public void ispisi(Student student) {
        for(int i = 0; i < maxBrojStudenata; i++) {
            if (studenti[i] == student) {
                studenti[i] = null;
                break;
            }
        }
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getSifraPredmeta() {
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
                ispis += redniBroj + ". ";
                ispis = ispis.concat(studenti[i].toString());
                ispis = ispis.concat("\n");
            }
        }
        return ispis;
    }
}
