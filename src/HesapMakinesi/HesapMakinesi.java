package HesapMakinesi;
public class HesapMakinesi {
    public static void main(String[] args) {

        double donenCevap = toplama(125, 61);
        System.out.println("Toplama işlemi sonucu: " + donenCevap);

        double donenCevap2 = cikarma(12.5, 5.2);
        System.out.println("Çıkarma işlemi sonucu: " + donenCevap2);

        double donenCevap3 = carpma(22.6, 18.2);
        System.out.println("Çarpma işlemi sonucu: " + donenCevap3);

        double donenCevap4 = bolme(128, 18);
        System.out.println("Bölme işlemi sonucu: " + donenCevap4);
    }
    public static double toplama(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }
    public static double cikarma(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }
    public static double carpma(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }
    public static double bolme(double sayi1, double sayi2) {
        if (sayi2 == 0) {
            System.out.println("Bölen 0 olamaz.");
            return 0;
        }
        return sayi1 / sayi2;
    }
}