package lab2;

public class Punkt3D extends Punkt2D {
    private double z;
    private String nazwa;

    public Punkt3D(double x1, double y1, double z1) {
        super(x1, y1);
        z=z1;
    }

    public double getZ(){
        return z;
    }

    public void setZ(double z1){
        z=z1;
    }

    public double distance(Punkt3D pkt){
        return Math.sqrt((getX()-pkt.getX())*(getY()-pkt.getX())+(getY()-pkt.getY())*(getY()-pkt.getY())+(z - pkt.z)*(z-pkt.z));
    }
}
