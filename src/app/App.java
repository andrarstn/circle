package app;

public class App {
    public static void main(String[] args) throws Exception {
        Lingkaran satu = new Lingkaran();
        satu.setR(7);
        System.out.printf("Luas lingkaran %f cm2", satu.getLuas());
        System.out.printf("\nKeliling lingkaran %f cm2", satu.getKeliling());
        Tabung dua = new Tabung();
        dua.setTinggi(56);
        dua.setR(20);
        System.out.printf("\n\nLuas tabung %f cm2", dua.getLuas());
        System.out.printf("\nVolume tabung %f cm3", dua.getVolume());
    }
}