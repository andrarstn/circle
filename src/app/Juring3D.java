package app;

public class Juring3D extends Busur{
    private double t_kerucut;

    //  tinggi kerucut = radius - tinggi busur
    Juring3D(){
        this.t_kerucut=super.getRadius()-super.getTinggi_B();
    }
    //  rumus luas juring3d (selimut kerucut + selimut tembereng)
    private double hitungLuas(){
        return PHI*(2*super.getRadius()*super.getTinggi_B()+super.getTali_B()*super.getRadius());
    }
    //  get luas
    public double getLuas(){
        return this.hitungLuas();
    }
    //  rumus volume (volume juring + volume kerucut)
    private double hitungVolume(){
        return 1.0/3.0*PHI*(Math.pow(super.getTali_B(),2)*this.t_kerucut+Math.pow(super.getTinggi_B(),2)*(3*super.getRadius()-super.getTinggi_B()));
    }
    //  get volume
    public double getVolume(){
        return this.hitungVolume();
    }

}