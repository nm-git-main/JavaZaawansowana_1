package przyklad4;

public class Main {
    public static void main(String[] args) {
Postac mag= new Mag();
Postac wojownik= new Wojownik();

        System.out.println(Postac.LOKACJA_STARTOWA);
        mag.walcz();
        wojownik.walcz();

        System.out.println("Mag metoda default: "+ mag.nazwaInterfejsu());
        System.out.println("Wojownik metoda default: "+ wojownik.nazwaInterfejsu());

        System.out.println(mag.iloscPunktoZycia());
        ZywyObiekt zywyObiekt=new Mag();

        Postac zywaPostac= (Postac) zywyObiekt;
        zywyObiekt.umrzyj();

        zywaPostac.walcz();
    }
}
