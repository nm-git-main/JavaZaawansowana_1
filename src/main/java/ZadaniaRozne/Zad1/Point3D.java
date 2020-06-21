package ZadaniaRozne.Zad1;

public class Point3D extends Point2D {
    private float z;

    //zeby defaultowo ustawic wszystkie punkty na 0.0f
    public Point3D() {
        super();
        z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float[] xyz) {
        setX(xyz[0]);
        setY(xyz[1]);
        z = xyz[2];
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    @Override
    public String toString() {

        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
