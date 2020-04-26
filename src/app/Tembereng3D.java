package app;

public class Tembereng3D extends Busur{
    private double tinggi;
    private double radius;
    private double tali_b;

    //  ambil tali busur, tinggi dari busur dan radius dari lingkaran
    Tembereng3D(){
        this.tali_b=super.getTali_B();
        this.radius=super.getRadius();
        this.tinggi=super.getTinggi_B();
    }
    //  rumus luas (selimut tembereng + lingkaran dengan radius tali busur)
    private double hitungLuas(){
        return PHI*(2*this.radius*this.tinggi+Math.pow(this.tali_b,2));
    }
    //  get luas
    public double getLuas(){
        return this.hitungLuas();
    }
    //  rumus volume (manut mbah gugel)
    private double hitungVolume(){
        return 1.0/3.0*PHI*(Math.pow(this.tinggi,2)*(3*this.radius-this.tinggi));
    }
    //  get volume
    public double getVolume(){
        return this.hitungVolume();
    }

}