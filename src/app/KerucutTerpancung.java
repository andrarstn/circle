package app;

public class KerucutTerpancung extends Kerucut{
    private double radius2;

    public double getR2(){
        return radius2;
    }

    public void setR2(double radius2){
        this.radius2 = radius2;
    }

    private double hitungVolume(){
        //pakai rumus yang dishare di grup
        return 1/3.0 * phi * super.getTinggi() * (Math.pow(super.getRadius(), 2)+Math.pow(this.radius2, 2)+(super.getRadius()*this.radius2));
    }

    public double getVolume(){
        return hitungVolume();
    }

    private double hitungA(){
        //A = sqrt(t^2 + (r1-r2)^2)
        return Math.sqrt(Math.pow(super.getTinggi(), 2) + Math.pow((Math.abs(super.getRadius()-this.radius2)),2));
    }

    private double hitungLuasSelimut(){
        //hanya luas selimut
        // L = phi * A (r1 + r2)
        return phi * hitungA() * (super.getRadius()+this.radius2);
    }

    public double getLuasSelimut(){
        return hitungLuasSelimut();
    }

    private double hitungLuas(){
        //luas permukaan atau luas seluruhnya
        // L = Luas selimut + luas lingkaran (besar + kecil)
        return getLuasSelimut() + phi * (Math.pow(super.getRadius(), 2) + Math.pow(this.radius2, 2));
    }

    public double getLuas(){
        return hitungLuas();
    }
}
