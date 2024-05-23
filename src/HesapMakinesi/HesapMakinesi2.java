package HesapMakinesi;
import java.util.Scanner;

public class HesapMakinesi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("Yapmak istediğiniz işlemi giriniz (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        double sonuc = 0;
        boolean gecerliIslem = true;

        switch (islem) {
            case '+':
                sonuc = toplama(sayi1, sayi2);
                break;
            case '-':
                sonuc = cikarma(sayi1, sayi2);
                break;
            case '*':
                sonuc = carpma(sayi1, sayi2);
                break;
            case '/':
                sonuc = bolme(sayi1, sayi2);
                break;
            default:
                System.out.println("Geçersiz işlem!");
                gecerliIslem = false;
                break;
        }

        if (gecerliIslem) {
            System.out.println("İşlem sonucu: " + sonuc);
        }

        scanner.close();
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