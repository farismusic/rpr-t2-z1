package ba.unsa.etf.rpr.predavanje03;

public class Predmet {
    private Student[] nizStudenata = new Student[50];
    private String nazivPredmeta;
    private int sifraPredmeta;
    private static int trenutno = 0;
    private static int maxStudenata;

    public Predmet(String ime, int sifra, int max){
        this.nazivPredmeta=ime;
        this.sifraPredmeta=sifra;
        this.maxStudenata=max;
    }

    public void upisi(Student s) {
        getNizStudenata()[trenutno++] = s;
    }

    public void ispisi(Student s) {
        for(int i=0; i<trenutno; i++){
            if(s.getIme().equals(getNizStudenata()[i].getIme()) && s.getPrezime().equals(getNizStudenata()[i].getPrezime())){
                getNizStudenata()[i]= getNizStudenata()[trenutno-1];
                trenutno--;
            }
        }
    }

    public void ispisiSve() {
        for (int i = 0; i < trenutno; i++) {
            System.out.print(i + 1 + ". ");
            getNizStudenata()[i].ispisi();
        }
    }

    public Student[] getNizStudenata() {
        return nizStudenata;
    }

    public void setNizStudenata(Student[] nizStudenata) {
        this.nizStudenata = nizStudenata;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }
}
