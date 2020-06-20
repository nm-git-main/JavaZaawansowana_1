package Zadanie1;

public class Main {
    public static void main(String[] args) {
        Figura kwadrat= new Kwadrat(6.7);
        Figura prostokat= new Prostokat(4,8.1);
        Figura kolo= new Koło(5);
        System.out.println(kwadrat.pole());
    }
}
