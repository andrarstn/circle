package app;

public class Tabung extends Lingkaran {
    private static double tinggi;

    //  set tinggi
    public void setTinggi(double newtinggi) {
        tinggi = newtinggi;
          //  mengirim tinggi ke lingkaran
    }
    //  rumus luas
    private double hitungLuas() {
        return 2*super.getLuas()+super.getKeliling()*tinggi;
    }
    //  rumus volume
    private double hitungVolume() {
        return super.getLuas() * tinggi;
    }
    //  get luas
    public double getTinggi() {
        return tinggi;
    }
    //  get luas
    public double getLuas() {
        return hitungLuas();
    }
    //  get volume
    public double getVolume() {
        return hitungVolume();
    }
}