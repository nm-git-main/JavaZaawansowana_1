package przyklad4;

public class Wojownik implements Postac {
    @Override
    public void walcz() {
        uzyjMiecza();

    }
    public void uzyjMiecza(){
        System.out.println("Zadales 20 obrazen");
    }

    @Override
    public void umrzyj() {
        System.out.println("Ja nie umieram");
    }
}
