package app;

public class Bola extends Lingkaran {
    
    //  rumus luas bola
    private double hitungLuas(){
        return 4*PHI*Math.pow(super.getRadius(),2);
    }
    //  rumus volume bola
    private double hitungVolume(){
        return 4.0/3.0*Math.pow(super.getRadius(),3);
    }
    //  get luas
    public double getLuas(){    //  overriding
        return this.hitungLuas();
    }
    //  get volume
    public double getVolume(){
        return this.hitungVolume();
    }
    
}
