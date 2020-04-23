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

}
