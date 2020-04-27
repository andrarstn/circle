package app;

public class Lingkaran {
    public final double phi = 22 / 7.0;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double hitungLuas() {
        return phi * Math.pow(radius, 2);
    }

    private double hitungKeliling() {
        return phi * 2 * radius;
    }

    public double getLuas() {
        return hitungLuas();
    }

    public double getKeliling() {
        return hitungKeliling();
    }

}
