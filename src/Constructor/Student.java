package Constructor;
public class Student {
    private String ad;
    private String soyad;
    private String kimlikNo;

    public Student(String ad, String soyad, String kimlikNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
    }

    public Student(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getKimlikNo() {
        return kimlikNo;
    }
    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }
}