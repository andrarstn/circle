package app;

public class Kerucut extends Lingkaran {
    private double tinggi;

    Kerucut() {

    }

    Kerucut(double tinggi, double radius) {
        this.tinggi = tinggi;
        super.setRadius(radius);
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    private double hitungGarisPelukis() {
        // Garis Pelukis = s
        // s = pitagoras radius & tinggi
        return Math.sqrt(Math.pow(super.getRadius(), 2) + Math.pow(this.tinggi, 2));
    }

    public double getGarisPelukis() {
        return hitungGarisPelukis();
    }

    private double hitungVolume() {
        // Volume Keurcut = 1/3 * Luas alas * Tinggi
        // 1/3 * phi * r^2 * r
        return 1 / 3.0 * super.getLuas() * this.tinggi;
    }

    public double getVolume() {
        return hitungVolume();
    }

    private double hitungLuas() {
        return phi * super.getRadius() * (super.getRadius() + this.getGarisPelukis());
    }

    public double getLuas() {
        return this.hitungLuas();
    }
}
