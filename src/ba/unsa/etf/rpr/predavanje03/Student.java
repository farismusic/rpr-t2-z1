package ba.unsa.etf.rpr.predavanje03;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return brojIndeksa == student.brojIndeksa &&
                Objects.equals(ime, student.ime) &&
                Objects.equals(prezime, student.prezime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime, brojIndeksa);
    }
}