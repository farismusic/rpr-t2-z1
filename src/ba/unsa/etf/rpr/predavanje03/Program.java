package ba.unsa.etf.rpr.predavanje03;

public class Program {

    public static void main(String[] args) {
        /*Predmet matematika = new Predmet("Matematika", 4, 50);
        Student s1 = new Student("Faris", "Music", 18296);
        matematika.upisi(s1);
        Student s2 = new Student("Sulejman", "Tutnjevic", 18290);
        matematika.upisi(s2);
        Student s3 = new Student("Haris", "Hodzic", 12345);
        matematika.upisi(s3);
        Student s4 = new Student("Esad", "Salihagic", 11111);
        matematika.upisi(s4);
        Student s5 = new Student("Almir", "Becirevic", 12090);
        matematika.upisi(s5);
        matematika.ispisi(s2);
        matematika.upisi(new Student("Seudin", "Music", 99999));
        matematika.ispisiSve();
        System.out.println("\nIme predmeta: "+ matematika.getNazivPredmeta() +"\n"+ "Sifra predmeta: "+ matematika.getSifraPredmeta()+ "\n");*/
        Predmet matematika = new Predmet("Matematika", 1234, 100);
        Student faris = new Student("Faris", "Music", 18296);
        matematika.upisi(faris);
        System.out.println(matematika.getNizStudenata()[0].getIme());
    }
}