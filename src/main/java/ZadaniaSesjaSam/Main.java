package ZadaniaSesjaSam;

public class Main {
    public static void main(String[] args) {
        Samolot anonim1= new Samolot() {
            @Override
            public String getNazwa() {
                return "F16";
            }
        };

        Samolot anonim2= new Samolot() {
            @Override
            public String getNazwa() {
                return "TU-150";
            }
        };

        Samolot anonim3= new Samolot() {
            @Override
            public String getNazwa() {
                return "F35";
            }
        };


        System.out.println(anonim1.getNazwa());
        System.out.println(anonim2.getNazwa());
        System.out.println(anonim3.getNazwa());
    }
}

