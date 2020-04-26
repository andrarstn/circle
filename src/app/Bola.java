package app;

public class Bola extends Lingkaran {
    public double radius;
    
    //  ambil radius dari lingkaran
    Bola(){
        this.radius = super.getRadius();
    }
    //  rumus luas bola
    private double hitungLuas(){
        return 4*PHI*Math.pow(this.radius,2);
    }
    //  rumus volume bola
    private double hitungVolume(){
        return 4.0/3.0*Math.pow(this.radius,3);
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
