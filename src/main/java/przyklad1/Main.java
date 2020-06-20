package przyklad1;

public class Main {
    public static void main (String [] args){
        Zwierze zwierze= new Zwierze("mysz",4);

        Zwierze zwierze1=new Zwierze("Pies",4);

        Zwierze zwierze2= new Zwierze("Pies",4);

        Zwierze zwierze3=new Zwierze();

        Tygrys tygrys= new Tygrys("Tygrys",4,200);
        System.out.println(tygrys);

        // polimorfizm
        Zwierze tigerKing=new Tygrys(400);
        System.out.println(tigerKing);
    }
}
