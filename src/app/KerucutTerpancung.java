package app;

public class KerucutTerpancung extends Kerucut{
    private double radius;
    private double tinggi;
    private double tinggi_k;
    private double radius_k;

    //  ambil radius dan tinggi dari lingkaran
    KerucutTerpancung(){
        this.radius=super.getRadius();
        this.tinggi=super.getTinggi();
    }
    //  set tinggi kerucut kecil dan hitung radius kerucut kecil
    public void setTinggi_K(double newtinggik){
        this.tinggi_k = newtinggik;
        this.radius_k = (this.radius*this.tinggi_k)/this.tinggi;
    }
    //  hitung volume kerucut kecil
    private double hitungVolume_K(){
        return 1.0/3.0*PHI*Math.pow(this.radius_k,2)*this.tinggi_k;
    }
    //  hitung volume (volume awal-kerucut kecil)
    private double hitungVolume(){
        return super.getVolume()-this.hitungVolume_K();
    }
    //  hitung selimut kerucut kecil
    private double hitungSelimut_K(){
        return PHI*this.radius_k*Math.sqrt(Math.pow(this.radius_k,2)+Math.pow(this.tinggi_k,2));
    }
    //  hitung luas (luas kerucut awal - selimut kerucut kecil + lingkaran kecil)
    private double hitungLuas(){
        return super.getLuas() - this.hitungSelimut_K() + PHI*Math.pow(this.radius_k,2);
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
