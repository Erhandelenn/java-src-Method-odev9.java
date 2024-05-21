package AdSoyadCagirma;

public class School {
    public static void main(String[] args) {
        Student ogrenci = new Student("Erhan", "Delen");

        ogrenci.adYaz();

        ogrenci.soyadYaz();

        ogrenci.adBelirle("Yeni Ad Bilal");

        ogrenci.adYaz();
    }
}