package app;

public class Main {
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
        Busur tiga = new Busur();
        tiga.setR(28);
        tiga.setSudut(36);
        System.out.printf("\n\nPanjang busur %f cm", tiga.getPanjang());
        JuringDuaD empat = new JuringDuaD();
        empat.setDerajat(60);
        empat.setR(14);
        System.out.printf("\n\nKeliling juring %f cm", empat.getKeliling());
        System.out.printf("\nLuas juring %f cm", empat.getLuas());

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