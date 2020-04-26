package app;

public class Tabung extends Lingkaran {
    private double tinggi;

    //  set tinggi
    public void setTinggi(double newtinggi) {
        this.tinggi = newtinggi;
        super.setTinggi(newtinggi);     //  mengirim tinggi ke lingkaran
    }
    //  rumus luas
    private double hitungLuas() {
        return 2*super.getLuas()+super.getKeliling()*this.tinggi;
    }
    //  rumus volume
    private double hitungVolume() {
        return super.getLuas() * this.tinggi;
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