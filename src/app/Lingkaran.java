package app;

public class Lingkaran {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setR(double radius) {
        this.radius = radius;
    }

    private double hitungLuas() {
        return Math.PI * Math.pow(radius, 2);
    }

    private double hitungKeliling() {
        return Math.PI * 2 * radius;
    }

    public double getLuas() {
        return hitungLuas();
    }

    public double getKeliling() {
        return hitungKeliling();
    }

}