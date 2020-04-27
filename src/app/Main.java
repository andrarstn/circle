package app;

public class Main {
    public static void main(String[] args) throws Exception {
        Lingkaran satu = new Lingkaran();
        satu.setRadius(7);
        System.out.printf("Luas lingkaran %f cm2", satu.getLuas());
        System.out.printf("\nKeliling lingkaran %f cm2", satu.getKeliling());

        Tabung dua = new Tabung();
        dua.setTinggi(56);
        dua.setRadius(20);
        System.out.printf("\n\nLuas tabung %f cm2", dua.getLuas());
        System.out.printf("\nVolume tabung %f cm3", dua.getVolume());

        Busur tiga = new Busur();
        tiga.setRadius(28);
        tiga.setSudut(36);
        System.out.printf("\n\nPanjang busur %f cm", tiga.getPanjang());

        JuringDuaD empat = new JuringDuaD();
        empat.setDerajat(60);
        empat.setRadius(14);
        System.out.printf("\n\nKeliling juring %f cm", empat.getKeliling());
        System.out.printf("\nLuas juring %f cm", empat.getLuas());

        JuringTigaD lima = new JuringTigaD();
        lima.setDerajat(60);
        lima.setRadius(9);
        System.out.printf("\n\nLuas Juring 3D %f", lima.getLuas());

        TemberengDuaD enam = new TemberengDuaD();
        enam.setDerajat(60);
        enam.setRadius(7);
        System.out.printf("\n\nKeliling Tembereng 2D %f", enam.getKeliling());
        System.out.printf("\nLuas Tembereng 2D %f", enam.getLuas());
        System.out.printf("\nPanjang Tali Busur Tembereng 2D %f", enam.getTaliBusur());

        TemberengTigaD tujuh = new TemberengTigaD();
        tujuh.setDerajat(60);
        tujuh.setRadius(9);
        tujuh.setTinggi(6);
        System.out.printf("\n\nLuas Tembereng 3D %f", tujuh.getLuas());
        System.out.printf("\n\nVolume Tembereng 3D %f", tujuh.getVolume());
        System.out.printf("\ntinggi Tembereng 3D %f", tujuh.getTinggi());
        System.out.printf("\nradius Tembereng 3D %f", tujuh.getRadius());

        System.out.println();
        int a = 4;
        int b = 0;
        dividedByZero(a, b);
    }

    private static int dividedByZero(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.printf("\nPembagian %d dengan %d error", a, b);
            System.out.println("\nJangan bagi 0 woy");
            System.out.println("Errornya :" + e.getMessage());
        }

        return result;
    }
}