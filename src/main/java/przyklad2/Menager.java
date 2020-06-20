package przyklad2;

public class Menager extends Pracownik {

    private Pracownik[] podlegliPracownicy;

    public Menager(String imie,
                   String nazwisko,
                   int wiek, int pensja) {
        super(imie, nazwisko, wiek, pensja);}

    public Menager(String imie,
                String nazwisko,
        int wiek, int pensja,
        Pracownik[] podlegliPracownicy)
        {
            super(imie, nazwisko, wiek, pensja);
            this.podlegliPracownicy = podlegliPracownicy;
        }
        public void wypiszPracownikow (){
            System.out.println("To sa podlegli Menagerowi procaownicy \n");
            for (Pracownik pracownik: podlegliPracownicy ){
                pracownik.opisz();
                System.out.println("\n-----------------------");

            }

        }

        @Override
        public void opisz () {
            super.opisz();
            System.out.println("Ale tez menadzerem");
        }

    }
