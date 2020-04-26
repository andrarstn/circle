package app;

public class Tembereng2D extends Lingkaran{
    private double sudut;
    private double radius;

    //  ambil radius dan sudut dari lingkaran
    Tembereng2D(){
        this.radius = super.getRadius();
        this.sudut  = super.getSudut();

    }
    //  rumus keliling (tali busur + buusur)
    private double hitungKeliling(){
        return 2*this.radius*(Math.sin(Math.toRadians(sudut/2)) + sudut/360*PHI);
    }
    //  rumus luas (luas jurung - luas segitiga)
    private double hitungLuas(){
        return sudut/360 * super.getLuas() - 1.0/2*Math.pow(this.radius,2)*Math.sin(Math.toRadians(sudut));
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