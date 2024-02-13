package İnheritance.Example3;

public class Akademisyen extends Calisan{
    String unvan;
    Arac sahipOlduguArac;
    double maas;
    public Akademisyen(String isim, String soyisim, String ehliyet, int yas, String unvan, double maas) {
        super(isim, soyisim, ehliyet, yas);
        this.maas = maas;
        this.unvan = unvan;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public Arac getSahipOlduguArac() {
        return sahipOlduguArac;
    }

    public void setSahipOlduguArac(Arac sahipOlduguArac) {
        this.sahipOlduguArac = sahipOlduguArac;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return super.toString() + " Unvan: " + getUnvan() + ", Maaş: " + getMaas() + (getSahipOlduguArac() != null ? ", Sahip Olduğu Araç: " + getSahipOlduguArac() : "Aracı yok");
    }
    public double hesaplaMaas(double asgariUcret) {
        if (unvan.equals("Araştırma Görevlisi"))
            return asgariUcret * 1.5;
        else if (unvan.equals("Doktor Öğretim Üyesi"))
            return asgariUcret * 2;
        else if (unvan.equals("Doçent"))
            return asgariUcret * 3;
        else if (unvan.equals("Profesör"))
            return asgariUcret * 5;
        else
            return 0;
    }

    public void sahiplendirArac(Arac araci) {
        if (sahipOlduguArac != null) {
            System.out.println("Dikkat! " + getUnvan() + " " + getIsim() + " " + getSoyisim() + ", zaten bir araca sahip. Yeni araç sahiplendirilemez.");
        } else {
            sahipOlduguArac = araci;
            System.out.println(getIsim() + " " + getSoyisim() + ", " + getUnvan() + " olarak " + araci.toString() + " sahiplendi.");

            if (unvan.equals("Doktor Öğretim Üyesi") && araci.yakitTuru.equals("Motorin")) {
                System.out.println("Doktor Öğretim Üyesi " + isim + " " + soyisim + ", Profesör olunca otomobil alabilirsin 😊");
            } else if (unvan.equals("Doçent") && araci.marka.equals("Scooter")) {
                System.out.println("Doçent " + isim + " " + soyisim + ", Profesör olunca otomobil alabilirsin 😊");
            } else if (unvan.equals("Profesör")) {
                System.out.println("Profesör " + isim + " " + soyisim + ", artık akademik kariyerinde en üst seviyede! 😊");
            }
            System.out.println();
        }
    }
}
