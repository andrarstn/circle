package app;

public class TemberengTigaD extends TemberengDuaD {
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    private double hitungLuas() {
        return phi * (2 * super.getRadius() * this.tinggi + Math.pow(super.getTaliBusur(), 2));
    }

    public double getLuas() {
        return hitungLuas();
    }

    private double hitungVolume() {
        return phi / 3 * (Math.pow(this.tinggi, 2) * (3 * super.getRadius() - this.tinggi));
    }

    public double getVolume() {
        return hitungVolume();
    }
}