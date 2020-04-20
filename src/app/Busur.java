package app;

public class Busur extends Lingkaran {
    private double sudut;

    public double getSudut() {
        return sudut;
    }

    public void setSudut(double sudut) {
        this.sudut = sudut;
    }

    private double hitungPanjang() {
        return (getSudut() * super.getKeliling()) / 360;
    }

    public double getPanjang() {
        return hitungPanjang();
    }
}