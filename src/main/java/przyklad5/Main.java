package przyklad5;

public class Main {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous() {
            // jednorazowa instancja klasy anonimous
            @Override
            public void display() {
                System.out.println("Wyswietlam teskt w klasie anonimowej");
            }
        };
        anonymous.display();

        class LocalClass {
            private int i=2;
            public void dzialaj(){
                System.out.println("Wyswietlam zawartosc klasy lokalnej");
            }
            public int getI(){
                return i;
            }
        }
        LocalClass localClass=new LocalClass();
        localClass.dzialaj();
        System.out.println(localClass.getI());

    }
}
