package app;

public class Bola extends Lingkaran {
    private double hitungVolume(){
        //Volume Bole = 4 * Luas alas * Tinggi
        // 4 * 1/3 * phi * r^2 * r
        return 4/3.0 * super.getLuas() * super.getRadius();
    }

    public double getVolume(){
        return hitungVolume();
    }
}
