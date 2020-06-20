package przyklad5;

public class OuterClass {
    private String poleTestowe= " Pole testowe";

    public class InnerClass{
        public void display(){
            System.out.println();
            System.out.println(poleTestowe);
            test();
        }
    }
    public void displayInner(){
        InnerClass innerClass=new InnerClass();
        innerClass.display();
    }
    public void test(){
        System.out.println("test");
    }

}
