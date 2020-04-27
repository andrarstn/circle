package app;



public class Main {
    public static void main(String[] args) throws Exception {
        Lingkaran satu = new Lingkaran();
        satu.setRadius(7);   //    Hanya bilangan lebih sama dengan 0
        Busur dua = new Busur();
        dua.setSudut(60);    //    Hanya boleh lebih dari 0 dan kurang dari sama dengan 180
        Bola tiga = new Bola();
        Tabung empat = new Tabung();
        empat.setTinggi(10);    //  Hanya bilangan lebih sama dengan 0
        Kerucut lima = new Kerucut();
        Juring2D enam = new Juring2D();
        Tembereng2D tujuh = new Tembereng2D();
        KerucutTerpancung delapan = new KerucutTerpancung();
        delapan.setTinggi_K(5);  //    Harus lebih kecil dari dua.setTinggi()
        Tembereng3D sembilan = new Tembereng3D();
        Juring3D sepuluh = new Juring3D();
        
        System.out.printf("\n-Luas Lingkaran       = %f cm2", satu.getLuas());
        System.out.printf("\n-Keliling Lingkaran   = %f cm", satu.getKeliling());
        System.out.printf("\n-Panjang Busur        = %f cm", dua.getPanjang_B());
        System.out.printf("\n-Panjang Tali Busur   = %f cm", dua.getTali_Busur());
        System.out.printf("\n-Luas Bola            = %f cm2", tiga.getLuas());
        System.out.printf("\n-Volume Bola          = %f cm3", tiga.getVolume());
        System.out.printf("\n-Luas Tabung          = %f cm2", empat.getLuas());
        System.out.printf("\n-Volume Tabung        = %f cm3", empat.getVolume());
        System.out.printf("\n-Luas Kerucut         = %f cm2", lima.getLuas());
        System.out.printf("\n-Volume Kerucut       = %f cm3", lima.getVolume());
        System.out.printf("\n-Luas Juring2D        = %f cm2", enam.getLuas());
        System.out.printf("\n-Keliling Juring2D    = %f cm", enam.getKeliling());
        System.out.printf("\n-Luas Tembereng2D     = %f cm2", tujuh.getLuas());
        System.out.printf("\n-Keliling Tembereng2D = %f cm", tujuh.getKeliling());
        System.out.printf("\n-Luas Kerucut Terpa   = %f cm2", delapan.getLuas());
        System.out.printf("\n-Volume Kerucut Terpa = %f cm3", delapan.getVolume());
        System.out.printf("\n-Luas Tembereng3D     = %f cm2", sembilan.getLuas());
        System.out.printf("\n-Volume Tembereng3D   = %f cm3", sembilan.getVolume());
        System.out.printf("\n-Luas Juring3D        = %f cm2", sepuluh.getLuas());
        System.out.printf("\n-Volume Juring3D      = %f cm3", sepuluh.getVolume());
    }
        

}