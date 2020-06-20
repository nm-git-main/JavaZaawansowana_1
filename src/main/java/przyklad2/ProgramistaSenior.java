package przyklad2;

public class ProgramistaSenior extends Programista{
    private int lataDoswiadczenia;

    public ProgramistaSenior(String imie, String nazwisko, int wiek, int pensja, int lataDoswiadczenia) {
        super(imie, nazwisko, wiek, pensja);
        this.lataDoswiadczenia=lataDoswiadczenia;
    }

    @Override
    public void opisz() {
        super.opisz();
        System.out.print(" Jestem też seniorem programistą, mam już "+lataDoswiadczenia+" lat doświadczenia jako programista.");

    }
}
