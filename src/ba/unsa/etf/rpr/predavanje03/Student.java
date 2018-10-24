package ba.unsa.etf.rpr.predavanje03;

public class Student{
    private String ime;
    private String prezime;
    private int brojIndeksa;

    public Student(String ime, String prezime, int indeks){ this.setIme(ime); this.setPrezime(prezime); this.setBrojIndeksa(indeks);};

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

    public void ispisi(){
        System.out.println(getPrezime()+" "+getIme()+"(" +getBrojIndeksa()+")");
    }
}