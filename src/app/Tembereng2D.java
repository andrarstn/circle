package app;

public class Tembereng2D extends Lingkaran{
    private double sudut;

    //  ambil sudut dari busur
    Tembereng2D(){
        Busur bus = new Busur();
        this.sudut = bus.getSudut();
    }
    //  rumus keliling (tali busur + buusur)
    private double hitungKeliling(){
        return 2*super.getRadius()*(Math.sin(Math.toRadians(sudut/2)) + sudut/360*PHI);
    }
    //  rumus luas (luas jurung - luas segitiga)
    private double hitungLuas(){
        return sudut/360 * super.getLuas() - 1.0/2*Math.pow(super.getRadius(),2)*Math.sin(Math.toRadians(sudut));
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