package app;

public class Juring2D extends Lingkaran{
    private double sudut;
    private double radius;

    //  ambil radius dan sudut dari lingkaran
    Juring2D(){
        this.radius = super.getRadius();
        this.sudut  = super.getSudut();
    }
    //  rumus keliling juring2d (diameter + panjang busur)
    private double hitungKeliling(){
        return 2*this.radius*(1 + sudut/360*PHI);
    }
    //  rumus luas juring2d
    private double hitungLuas(){
        return sudut/360 * super.getLuas();
    }
    //  get keliling
    public double getKeliling(){
        return this.hitungKeliling();
    }
    //  get luas
    public double getLuas(){
        return this.hitungLuas();
    }


}