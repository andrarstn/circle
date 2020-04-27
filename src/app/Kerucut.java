package app;

public class Kerucut extends Lingkaran{
    private static double tinggi;
    
    //  ambil tinggi daari tabung
    Kerucut(){
        Tabung tab = new Tabung();
        tinggi=tab.getTinggi();
    }
    //  rumus garis pelukis kerucut
    private double hitungG_pelukis(){
        return Math.sqrt(Math.pow(super.getRadius(),2)+Math.pow(tinggi,2));
    }
    //  rumus luas (luas lingkaran + selimut kerucut)
    private double hitungLuas(){
        return super.getLuas() + PHI*super.getRadius()*this.hitungG_pelukis();
    }
    //  rumus volume 
    private double hitungVolume(){
        return 1.0/3.0*super.getLuas()*tinggi;
    }
    //  get luas
    public double getLuas(){
        return this.hitungLuas();
    }
    //  get luas
    public double getTinggi(){
        return tinggi;
    }
    //  get volume
    public double getVolume(){
        return this.hitungVolume();
    }
}
