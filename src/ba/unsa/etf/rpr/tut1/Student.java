package ba.unsa.etf.rpr.tut1;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;

    Student(String ime, String prezime, int brojIndeksa) {
        setIme(ime);
        setPrezime(prezime);
        setBrojIndeksa(brojIndeksa);
    }

    String getIme() {
        return ime;
    }

    void setIme(String ime) {
        if (!ime.matches(".*\\d+.*")) {
            this.ime = ime;
        } else
        {
            throw new IllegalArgumentException("Ime sadrzi cifru/e.");
        }
    }

    String getPrezime() {
        return prezime;
    }

    void setPrezime(String prezime) {
        if (!prezime.matches(".*\\d+.*")) {
            this.prezime = prezime;
        } else
        {
            throw new IllegalArgumentException("Prezime sadrzi cifru/e.");
        }
    }

    int getBrojIndeksa() {
        return brojIndeksa;
    }

    void setBrojIndeksa(int brojIndeksa) {
        if (brojIndeksa >= 0) {
            this.brojIndeksa = brojIndeksa;
        } else
        {
            throw new IllegalArgumentException("Negativan broj");
        }
    }

    @Override
    public String toString() {
        // When you print out instance of A, value of its foo
        // field will be printed out
        return prezime + " " + ime + " (" + String.valueOf(brojIndeksa) + ")";
    }

    protected void finalize()
    {
        System.out.println( "Student izbrisan.");
    }
}
