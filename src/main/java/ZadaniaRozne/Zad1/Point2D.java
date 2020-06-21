package ZadaniaRozne.Zad1;

public class Point2D {
    private float x,y;
    public Point2D(){
        x= 0.0f;
        y=0.0f;
    }
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public float [] getXY(){
        return new float[]{x,y};
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY (float[] xy){
        x= xy[0];
        y= xy[1];
    }
    public void setXY (float x, float y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return"("+x+","+y+")";
    }
}
