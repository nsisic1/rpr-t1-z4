package ba.unsa.etf.rpr.tut1;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;

    public Student(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
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
