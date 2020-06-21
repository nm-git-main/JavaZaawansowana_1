package ZadaniaRozne.Zad1;

public class Main {
    public static void main(String[] args) {
        Point2D punkt1 = new Point2D();

        Point2D punkt2 = new Point2D(4f, 4f);

        float[] xy = punkt2.getXY();

        System.out.println("Punkt 1: " + punkt1.toString());
        System.out.println("Punkt 2: " + punkt2.toString());

        punkt1.setX(3.4f);
        System.out.println("Punkt 1 nowy to: " + punkt1.toString());

        Point3D point3D=new Point3D();

        Point3D punkt4= new Point3D(3.0f,4.0f,5.0f);

        float [] xyz= punkt4.getXYZ();
        System.out.println( " Punkt3: "+point3D.toString());
        System.out.println("Punkt4: "+punkt4.toString());

        point3D.setY(69.0f);

        System.out.println("Point3D: "+point3D.toString());

    }
}
