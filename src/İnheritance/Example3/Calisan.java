package İnheritance.Example3;

public class Calisan {
    String isim;
    String soyisim;
    String ehliyet;
    int yas;

    public Calisan(String isim, String soyisim, String ehliyet, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.ehliyet = ehliyet;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEhliyet() {
        return ehliyet;
    }

    public void setEhliyet(String ehliyet) {
        this.ehliyet = ehliyet;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Adı: " + getIsim() + "\n" + "Soyadı: " + getSoyisim() + "\n" + "Ehliyet: " + getEhliyet() + "\n" + "Yaşı: " + getYas() ;
    }
}
