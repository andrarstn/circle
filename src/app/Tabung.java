package app;

public class Tabung extends Lingkaran {
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    private double hitungLuas() {
        return super.getKeliling() * (super.getRadius() + tinggi);
    }

    private double hitungVolume() {
        return super.getLuas() * tinggi;
    }

    public double getLuas() {
        return this.hitungLuas();
    }

    public double getVolume() {
        return hitungVolume();
    }
}