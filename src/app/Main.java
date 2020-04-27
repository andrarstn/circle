package app;



public class Main {
    public static void main(String[] args) throws Exception {
        Lingkaran satu = new Lingkaran();
        satu.setRadius(7);   //    Hanya bilangan lebih sama dengan 0
        satu.setRadius(7.5);
        Busur dua = new Busur();
        dua.setSudut(60);    //    Hanya boleh lebih dari 0 dan kurang dari sama dengan 180
        dua.setSudut(60.5);
        Bola tiga = new Bola();
        Tabung empat = new Tabung();
        empat.setTinggi(10);    //  Hanya bilangan lebih sama dengan 0
        empat.setTinggi(10.5);
        Kerucut lima = new Kerucut();
        Juring2D enam = new Juring2D();
        Tembereng2D tujuh = new Tembereng2D();
        KerucutTerpancung delapan = new KerucutTerpancung();
        delapan.setTinggi_K(5);  //    Harus lebih kecil dari dua.setTinggi()
        delapan.setTinggi_K(5.5);
        Tembereng3D sembilan = new Tembereng3D();
        Juring3D sepuluh = new Juring3D();

        // Polymorphism
        Lingkaran L1 = new Juring2D();
        Lingkaran L2 = new Tembereng2D();
        Lingkaran L3 = new Bola();
        Lingkaran L4 = new Kerucut();
        Lingkaran L5 = new Tabung();

        
        System.out.printf("\n-Luas Lingkaran       = %f cm2", satu.getLuas());
        System.out.printf("\n-Luas Juring  2D     = %f cm2", L1.getLuas());
        System.out.printf("\n-Luas Tembereng2D       = %f cm2", L2.getLuas());
        System.out.printf("\n-Luas Bola       = %f cm2", L3.getLuas());
        System.out.printf("\n-Luas Kerucut       = %f cm2", L4.getLuas());
        System.out.printf("\n-Luas Tabung       = %f cm2", L5.getLuas());
    

        
        // System.out.printf("\n-Luas Lingkaran       = %f cm2", satu.getLuas());
        // System.out.printf("\n-Keliling Lingkaran   = %f cm", satu.getKeliling());
        // System.out.printf("\n-Panjang Busur        = %f cm", dua.getPanjang_B());
        // System.out.printf("\n-Panjang Tali Busur   = %f cm", dua.getTali_Busur());
        // System.out.printf("\n-Luas Bola            = %f cm2", tiga.getLuas());
        // System.out.printf("\n-Volume Bola          = %f cm3", tiga.getVolume());
        // System.out.printf("\n-Luas Tabung          = %f cm2", empat.getLuas());
        // System.out.printf("\n-Volume Tabung        = %f cm3", empat.getVolume());
        // System.out.printf("\n-Luas Kerucut         = %f cm2", lima.getLuas());
        // System.out.printf("\n-Volume Kerucut       = %f cm3", lima.getVolume());
        // System.out.printf("\n-Luas Juring2D        = %f cm2", enam.getLuas());
        // System.out.printf("\n-Keliling Juring2D    = %f cm", enam.getKeliling());
        // System.out.printf("\n-Luas Tembereng2D     = %f cm2", tujuh.getLuas());
        // System.out.printf("\n-Keliling Tembereng2D = %f cm", tujuh.getKeliling());
        // System.out.printf("\n-Luas Kerucut Terpa   = %f cm2", delapan.getLuas());
        // System.out.printf("\n-Volume Kerucut Terpa = %f cm3", delapan.getVolume());
        // System.out.printf("\n-Luas Tembereng3D     = %f cm2", sembilan.getLuas());
        // System.out.printf("\n-Volume Tembereng3D   = %f cm3", sembilan.getVolume());
        // System.out.printf("\n-Luas Juring3D        = %f cm2", sepuluh.getLuas());
        // System.out.printf("\n-Volume Juring3D      = %f cm3", sepuluh.getVolume());
    }
        

}