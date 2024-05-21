package AdSoyadCagirma;
public class Student {
    private String ad;
    private String soyad;

    public Student(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public void adYaz() {
        System.out.println("Ad: " + this.ad);
    }

    public void soyadYaz() {
        System.out.println("Soyad: " + this.soyad);
    }

    public void adBelirle(String yeniAd) {
        this.ad = yeniAd;
    }
}