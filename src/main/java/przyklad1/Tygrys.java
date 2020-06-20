package przyklad1;

public class Tygrys extends Zwierze{
    private int iloscPaskow;

    public int getIloscPaskow() {
        return iloscPaskow;
    }

    public void setIloscPaskow(int iloscPaskow) {
        this.iloscPaskow = iloscPaskow;
    }

    public Tygrys(int iloscPaskow) {
        this.iloscPaskow = iloscPaskow;
    }

    public Tygrys(String nazwa, int iloscLap, int iloscPaskow) {
        super(nazwa,iloscLap);
        this.iloscPaskow=iloscPaskow;

    }
}
