package Zadanie1;

public class Prostokat extends Kwadrat{

    private double bokB;
    public Prostokat(double bokA,double bokB){
        super(bokA);
        this.bokB=bokB;
    }
    public double getBokB() {
        return bokB;
    }
    public void setBokB(double bokB) {
        this.bokB = bokB;
    }
    @Override
    public double pole(){
        return bokB*getBokA();
    }

    @Override
    public double obwod() {
        return (getBokA()*2)+(bokB*2);
    }
}
