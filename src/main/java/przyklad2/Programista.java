package przyklad2;

public class Programista extends Pracownik {

    private String[] znaneJezyki;

    public Programista(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek, pensja);

    }

    public Programista(String imie, String nazwisko, int wiek, int pensja, String[] znaneJezyki) {
        super(imie, nazwisko, wiek, pensja);
        this.znaneJezyki = znaneJezyki;
    }

    private void wypiszJezyki() {
        for(String jezyk:znaneJezyki){
            System.out.print(jezyk+" ");
        }
    }

    @Override
    public void opisz() {
        super.opisz();
        System.out.print("Jestem także programistą.");
        if(znaneJezyki!= null){
            System.out.print(" Znam te jezyki: \n");
            wypiszJezyki();

        }
    }

    public String[] getZnaneJezyki() {
        return znaneJezyki;
    }

    public void setZnaneJezyki(String[] znaneJezyki) {
        this.znaneJezyki = znaneJezyki;
    }
}
