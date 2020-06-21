package przyklad2;

public class Main {
    public static void main(String[] args) {
    /*    Osoba osoba = new Pracownik("Jan ",
                "Kowalski",
                50,
                5000);
        osoba.opisz();

        Osoba osoba1 = new Student(" Basia", "Ogorek", 20, " Mechanika");
        osoba1.opisz();

        Pracownik menadzer = new Menager("Jan ",
                "Kowalski",
                50,
                5000);
// tu poprawic
       Menager menago= (Menager)menadzer;
        menadzer.opisz();

     */
    Pracownik pracownik1=new Programista(" Natalia","Wolska", 39,1650);
    Pracownik pracownik2=new ProgramistaSenior(" Wojtek","Wolski", 39,1950,6);
    Pracownik pracownik3=new Programista(" Marysia","Gorzka", 29,1450);
    Pracownik pracownik4=new ProgramistaSenior(" Magda","Rasmus", 33,2250,7);
    Pracownik pracownik5=new Programista(" Magda","Rasmus", 33,2250,new String[]{"Java","C#","C++"});


    Menager menager= new Menager("Mendosa", "Menda",43,4400,
            new Pracownik[]{pracownik1,pracownik2,pracownik3,pracownik4,pracownik5});
    menager.opisz();
        System.out.println();
        menager.wypiszPracownikow();

    }

}
