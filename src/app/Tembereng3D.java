package app;

public class Tembereng3D extends Busur{

    //  rumus luas (selimut tembereng + lingkaran dengan radius tali busur)
    private double hitungLuas(){
        return PHI*(2*super.getRadius()*super.getTinggi_B()+Math.pow(super.getTali_B(),2));
    }
    //  get luas
    public double getLuas(){
        return this.hitungLuas();
    }
    //  rumus volume (manut mbah gugel)
    private double hitungVolume(){
        return 1.0/3.0*PHI*(Math.pow(super.getTinggi_B(),2)*(3*super.getRadius()-super.getTinggi_B()));
    }
    //  get volume
    public double getVolume(){
        return this.hitungVolume();
    }

}