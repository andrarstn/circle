package app;

public class KerucutTerpancung extends Kerucut{
    private double radius2;

    public double getR2(){
        return radius2;
    }

    public void setR2(double radius2){
        this.radius2 = radius2;
    }

    private double hitungTinggi2(){
        if(super.getRadius() > this.radius2){
            return (super.getTinggi()*this.radius2)/(super.getRadius()-this.radius2);
        }
        else{
            return (super.getTinggi()*super.getRadius())/(this.radius2-super.getRadius());
        }
    }

    public double getTinggi2(){
        return hitungTinggi2();
    }

    private double hitungVolumeKecil(){
        if(super.getRadius() > this.radius2){
            Kerucut k1 = new Kerucut(this.getTinggi2(),this.radius2);
            return k1.getVolume();
        }
        else{
            Kerucut k1 = new Kerucut(this.getTinggi2(),super.getRadius());
            return k1.getVolume();
        }
    }

    public double getVolumeKecil(){
        return hitungVolumeKecil();
    }

    private double hitungVolumeBesar(){
        if(super.getRadius() > this.radius2){
            Kerucut k2 = new Kerucut(super.getTinggi()+this.getTinggi2(),super.getRadius());
            return k2.getVolume();
        }
        else{
            Kerucut k2 = new Kerucut(super.getTinggi()+this.getTinggi2(),this.radius2);
            return k2.getVolume();
        }
    }

    public double getVolumeBesar(){
        return hitungVolumeBesar();
    }

    private double hitungVolume(){
        return getVolumeBesar()-getVolumeKecil();
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
