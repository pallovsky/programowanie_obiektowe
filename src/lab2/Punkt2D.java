package lab2;

public class Punkt2D {
    private double x;
    private double y;

    public Punkt2D(double x1, double y1){
        x=x1;
        y=y1;
    }
    public double getX(){ return x;}
    public double getY(){return y;}
    public void setX(double x1){
        x=x1;
    }
    public void setY(double y1){
        y=y1;
    }

    public double distance(Punkt2D pkt){
        return Math.sqrt((x - pkt.x)*(x - pkt.x) + (y - pkt.y)*(y - pkt.y));
    }
}
