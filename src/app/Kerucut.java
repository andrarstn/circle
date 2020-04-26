package app;

public class Kerucut extends Lingkaran{
    private static double radius;
    private static double tinggi;
    
    //  ambil radius dan tinggi dari lingkaran
    Kerucut(){
        radius=super.getRadius();
        tinggi=super.getTinggi();
    }
    //  rumus garis pelukis kerucut
    private double hitungG_pelukis(){
        return Math.sqrt(Math.pow(radius,2)+Math.pow(tinggi,2));
    }
    //  rumus luas (luas lingkaran + selimut kerucut)
    private double hitungLuas(){
        return super.getLuas() + PHI*radius*this.hitungG_pelukis();
    }
    //  rumus volume 
    private double hitungVolume(){
        return 1.0/3.0*super.getLuas()*tinggi;
    }
    //  get luas
    public double getLuas(){
        return this.hitungLuas();
    }
    //  get volume
    public double getVolume(){
        return this.hitungVolume();
    }
}
