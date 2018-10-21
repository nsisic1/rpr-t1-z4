package ba.unsa.etf.rpr.tut1;

public class Program {

    public static void main(String[] args) {
        Predmet predmet = new Predmet("RPR", "R", 100);
        Student prviStudent = new Student("Hakan", "Sukur", 90001);
        predmet.upisi(prviStudent);
        System.out.println(predmet);

        Student drugiStudent = new Student("Bosko", "Buha", 90002);
        predmet.upisi(drugiStudent);
        System.out.println(predmet);
        
        predmet.ispisi(drugiStudent);
        System.out.println(predmet);

        //System.out.println(prviStudent);
        //System.out.println(drugiStudent);
    }

}
