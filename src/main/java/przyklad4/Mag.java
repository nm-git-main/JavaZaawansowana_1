package przyklad4;

public class Mag implements Postac, ZywyObiekt {
    @Override
    public void walcz() {
        uzyjMagii();
    }

    private void uzyjMagii() {
        System.out.println("Zadano 8 obrazen");
    }

    @Override
    public void umrzyj() {
        System.out.println("Umarlem");

    }
}
