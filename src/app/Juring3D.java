package app;

public class Juring3D extends Busur{
    private double tinggi;
    private double t_kerucut;
    private double radius;
    private double tali_b;

    //  ambil tali busur, tinggi busur dari busur dan radius dari lingkaran
    Juring3D(){
        this.tali_b=super.getTali_B();
        this.radius=super.getRadius();
        this.tinggi=super.getTinggi_B();
        this.t_kerucut=this.radius-this.tinggi;
    }
    //  rumus luas juring3d (selimut kerucut + selimut tembereng)
    private double hitungLuas(){
        return PHI*(2*this.radius*this.tinggi+this.tali_b*this.radius);
    }
    //  get luas
    public double getLuas(){
        return this.hitungLuas();
    }
    //  rumus volume (volume juring + volume kerucut)
    private double hitungVolume(){
        return 1.0/3.0*PHI*(Math.pow(this.tali_b,2)*this.t_kerucut+Math.pow(this.tinggi,2)*(3*this.radius-this.tinggi));
    }
    //  get volume
    public double getVolume(){
        return this.hitungVolume();
    }

}