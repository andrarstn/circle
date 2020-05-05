package app;

public class Lingkaran {
    public final double PHI = 22/7.0;
    private static double radius;
 
    
    //  set radius
    public void setRadius(double newradius) {
        radius = newradius;
    }
    //  overloading
    public void setRadius(int newradius) {
        radius = newradius;
    }
    //  get radius
    public double getRadius() {
        return radius;
    }
    //  rumus luas lingkaran 
    private double hitungLuas() {
        return PHI * Math.pow(radius, 2);
    }
    //  rumus keliling lingkaran
    private double hitungKeliling() {
        return PHI * 2 * radius;
    }
    //  get luas
    public double getLuas() {
        return hitungLuas();
    }
    //  get keliling
    public double getKeliling() {
        return hitungKeliling();
    }

}
