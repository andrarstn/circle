package app;

public class TemberengDuaD extends Lingkaran {
    private double derajat;

    public double getDerajat() {
        return derajat;
    }

    public void setDerajat(double derajat) {
        this.derajat = derajat;
    }

    private double hitungBusur() {
        return (getDerajat() * super.getKeliling()) / 360;
    }

    private double hitungTaliBusur() {
        // 2r sin (teta/2)
        return 2 * super.getRadius() * Math.sin(Math.toRadians(derajat) / 2);
    }

    private double hitungKeliling() {
        return hitungBusur() + hitungTaliBusur();
    }

    private double hitungLuas() {
        return derajat / 360 * super.getLuas()
                - 1 / 2.0 * Math.pow(super.getRadius(), 2) * Math.sin(Math.toRadians(derajat));
    }

    public double getLuas() {
        return hitungLuas();
    }

    public double getKeliling() {
        return hitungKeliling();
    }

    public double getTaliBusur() {
        return hitungTaliBusur();
    }
}