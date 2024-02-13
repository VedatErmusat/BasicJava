package İnheritance.Example3;

public class idariGorevli extends Calisan {
    String pozisyon;

    public idariGorevli(String isim, String soyisim, String ehliyet, int yas, String pozisyon) {
        super(isim, soyisim, ehliyet, yas);
        this.pozisyon = pozisyon;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "İdari Görevli Pozisyonu: " + getPozisyon();
    }
}
