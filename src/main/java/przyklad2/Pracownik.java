package przyklad2;

public class Pracownik extends Osoba {
    int pensja;

    public Pracownik(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek);
        this.pensja=pensja;
    }


    @Override
    public void opisz() {
        System.out.println("Jestem pracownikiem, mam na imie"+ getImie()+ ", a na nazwisko: "+ getNazwisko()+ ".");
    }
}
