package İnheritance.Example3;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();

        // Akademisyen nesneleri oluşturulması
        Akademisyen prof = new Akademisyen("Vedat", "Ermuşat", "B", 40, "Profesör", 0);
        Akademisyen docent1 = new Akademisyen("Ömer", "İşleyen", "A", 35, "Doçent", 0);
        Akademisyen docent2 = new Akademisyen("Eray", "Duruk", "B", 30, "Doçent", 0);
        Akademisyen doktor1 = new Akademisyen("Adnan", "Kart", "C", 28, "Doktor Öğretim Üyesi", 0);
        Akademisyen doktor2 = new Akademisyen("Eren", "Süngü", "A", 21, "Doktor Öğretim Üyesi", 0);
        Akademisyen arastirma = new Akademisyen("Alperen", "Kas", "B", 25, "Araştırma Görevlisi", 0);
        Akademisyen arastirma2 = new Akademisyen("Emir", "Şimşek", "C", 32, "Araştırma Görevlisi", 0);

        // IdariGorevli nesneleri oluşturulması
        idariGorevli guvenlikGorevlisi = new idariGorevli("Seyithan", "Tanış", "C", 35, "Güvenlik Görevlisi");
        idariGorevli sekreter = new idariGorevli("Azat", "Bülbül", "B", 28, "Sekreter");

        // Araç nesneleri oluşturulması
        Arac scooter = new Arac("Scooter", "ModelX", "Elektrik", 2, 50);
        Arac bisiklet = new Arac("Bisiklet", "ModelY", "Yok", 2, 0);
        Arac motosiklet = new Arac("Motosiklet", "ModelZ", "Elektrik ve Benzin", 4, 150);
        Arac otomobil = new Arac("Otomobil", "ModelA", "Motorin", 4, 200);
        Arac otomobil2 = new Arac("Otomobil", "ModelB", "LPG", 4, 250);
        Arac otomobil3 = new Arac("Otomobil", "ModelC", "Benzin", 4, 300);

        // Her akademisyene rastgele araç sahiplendirilmesi
        Akademisyen[] akademisyenler = {prof, docent1, docent2, doktor1, doktor2, arastirma, arastirma2};
        for (Akademisyen akademisyen : akademisyenler) {
            Arac rastgeleArac = random.nextInt(2) == 0 ? scooter : random.nextInt(2) == 0 ? bisiklet : random.nextInt(2) == 0 ? motosiklet : random.nextInt(2) == 0 ? otomobil : random.nextInt(2) == 0 ? otomobil2 : otomobil3;
            akademisyen.sahiplendirArac(rastgeleArac);
        }

        // Idari görevlilere rastgele araç sahiplendirilmesi
        idariGorevli[] idariGorevliler = {guvenlikGorevlisi, sekreter};
        for (idariGorevli idariGorevli : idariGorevliler) {
            Arac rastgeleArac = random.nextInt(2) == 0 ? scooter : random.nextInt(2) == 0 ? bisiklet : random.nextInt(2) == 0 ? motosiklet : random.nextInt(2) == 0 ? otomobil : random.nextInt(2) == 0 ? otomobil2 : otomobil3;
            System.out.println(idariGorevli.toString());
            System.out.println("Rastgele Araç Sahiplendirildi: " + rastgeleArac.toString() + "\n");
        }

        // Kullanıcıdan alınan asgari ücret ile her akademisyenin maaşının hesaplanması
        double asgariUcret = 5000; // Örnek asgari ücret
        for (Akademisyen akademisyen : akademisyenler) {
            akademisyen.maas = akademisyen.hesaplaMaas(asgariUcret);
        }

        // Maaş artışı
        for (Akademisyen akademisyen : akademisyenler) {
            System.out.println(akademisyen.toString() + ", Eski Maaş: " + akademisyen.maas);
            akademisyen.maas *= 1.1; // %10 maaş artışı
            System.out.println("Yeni Maaş: " + akademisyen.maas + "\n");
        }
    }
}
