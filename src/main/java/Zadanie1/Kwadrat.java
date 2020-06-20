package Zadanie1;

public class Kwadrat implements Figura{
    private double bokA;

    public Kwadrat(double bokA) {
        this.bokA = bokA;
    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    @Override
    public double obwod() {

        return bokA*4;
    }

    @Override
    public double pole() {
        return bokA*bokA;
    }
}
