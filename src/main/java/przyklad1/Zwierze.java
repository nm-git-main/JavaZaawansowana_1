package przyklad1;

public class Zwierze {
    private String nazwa;
    private int iloscLap;


    public Zwierze() {

    }

    public Zwierze(String nazwa, int iloscLap) {
        this.nazwa = nazwa;
        this.iloscLap = iloscLap;
    }
    public String getNazwa(){
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIloscLap() {
        return iloscLap;
    }

    public void setIloscLap(int iloscLap) {
        this.iloscLap = iloscLap;
    }
}