package Zadanie1;

import javax.swing.text.MutableAttributeSet;

public class Koło implements Figura {
    private double promien;

    public Koło(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    @Override
    public double obwod() {
        return Math.PI*Math.pow(promien,2);
    }

    @Override
    public double pole() {
        return promien*2*Math.PI;
    }
}
