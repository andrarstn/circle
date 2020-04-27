package app;

public class JuringTigaD extends JuringDuaD {
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    private double hitungTaliBusur() {
        return super.getRadius() * Math.sin(Math.toRadians(super.getDerajat() / 2));
    }

    public double getTaliBusur() {
        return hitungTaliBusur();
    }

    private double hitungLuas() {
        return phi * ((2 * super.getRadius() * this.tinggi) + (this.getTaliBusur() * super.getRadius()));
    }

    public double getLuas() {
        return hitungLuas();
    }
}