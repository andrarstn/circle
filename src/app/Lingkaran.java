package app;

public class Lingkaran {
    public final double PHI = 22/7.0;
    private static double radius;
    private static double tinggi;
    private static double sudut;
    
    //  set radius
    public void setRadius(double newradius) {
        radius = newradius;
    }
    //  get radius
    public double getRadius() {
        return radius;
    }
    //  set tinggi dari tabung
    public void setTinggi(double newtinggi) {
        tinggi = newtinggi;
    }
    //  set sudut dari busur
    public void setSudut(double newsudut) {
        sudut = newsudut;
    }
    //  get tinggi
    public double getTinggi(){
        return tinggi;
    }
    //  get sudut
    public double getSudut(){
        return sudut;
    }
    //  rumus luas lingkaran 
    private double hitungLuas() {
        return PHI * Math.pow(radius, 2);
    }
    //  rumus keliling lingkaran
    private double hitungKeliling() {
        return PHI * 2 * radius;
    }
    //  get luas
    public double getLuas() {
        return hitungLuas();
    }
    //  get keliling
    public double getKeliling() {
        return hitungKeliling();
    }

}
