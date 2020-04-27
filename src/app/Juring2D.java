package app;

public class Juring2D extends Lingkaran{
    private double sudut;

    //  ambil sudut dari busur
    Juring2D(){
        Busur bus = new Busur();
        this.sudut = bus.getSudut();
    }
    //  rumus keliling juring2d (diameter + panjang busur)
    private double hitungKeliling(){
        return 2*super.getRadius()*(1 + sudut/360*PHI);
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