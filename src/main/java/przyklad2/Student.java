package przyklad2;

public class Student extends Osoba {

    private String nazwaStudiow;

    public Student(String imie, String nazwisko, int wiek, String nazwaStudiow) {
        super(imie, nazwisko, wiek);
        this.nazwaStudiow=nazwaStudiow;
    }


    @Override
    public void opisz() {
        System.out.println("Jestem studentem"+getImie()+ " "+ getNazwisko()+ " na kierunku studiów"+ nazwaStudiow);
    }


}
