package app;

public class Busur extends Lingkaran {
    private static double sudut;
    private static double radius;
    
    //  ambil radius dari lingkaran
    Busur(){
        radius=super.getRadius();
    }
    //  get susut
    public double getSudut() {
        return sudut;
    }
    //  set sudut
    public void setSudut(double newsudut) {
        sudut = newsudut;
        super.setSudut(newsudut);   //  mengirim sudut ke lingkaran
    }
    //  rumus panjang busur
    private double hitungPanjang_B(){
        return (sudut/360)*2*PHI*radius;
    }
    //  get panjang busur
    public double getPanjang_B(){
        return this.hitungPanjang_B();
    }
    //  rumus setengah tali busur / radius busur
    private double hitungTali_B(){
        return radius*Math.sin(Math.toRadians(sudut/2));
    }
    //  get setengah tali busur
    public double getTali_B(){
        return this.hitungTali_B();
    }
    //  get panjang tali busur
    public double getTali_Busur(){
        return this.hitungTali_B()*2;
    }
    //  rumus tinggi busur (radius dikurangi jarak pusat lingkaran dengan tali busur)
    private double hitungTinggi_B(){
        return radius-(radius*Math.cos(Math.toRadians(sudut/2)));
    }
    //  get tinggi busur
    public double getTinggi_B(){
        return this.hitungTinggi_B();
    }
}