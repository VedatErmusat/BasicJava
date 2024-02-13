package ArrayExample;

import java.util.Random;

public class ArrayExample5 {
    // Belirtilen boyutta rastgele elemanlar içeren bir dizi oluştur
    private static int[] rastgeleDiziOlustur(int boyut) {
        int[] dizi = new int[boyut];
        Random rand = new Random();

        for (int i = 0; i < boyut; i++) {
            dizi[i] = rand.nextInt(10); // 0 ile 9 arasında rastgele bir sayı üret
        }

        return dizi;
    }

    // Diziyi ekrana yazdıran yardımcı metot
    private static void diziYazdir(String isim, int[] dizi) {
        System.out.println(isim + ":");
        for (int eleman : dizi) {
            System.out.println("  " + eleman);
        }
    }

    // İki boyutlu diziyi ekrana yazdıran yardımcı metot
    private static void diziYazdir(String isim, int[][] dizi) {
        System.out.println(isim + ":");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print("  " + dizi[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Rastgele elemanlar içeren 3x1'lik bir dizi oluştur
        int[] dizi1 = rastgeleDiziOlustur(3);

        // Rastgele elemanlar içeren 3x1'lik bir diğer dizi oluştur
        int[] dizi2 = rastgeleDiziOlustur(3);

        // Yeni diziyi oluştur ve değerleri doldur
        int[][] yeniDizi = new int[3][3];
        for (int i = 0; i < 3; i++) {
            yeniDizi[i][0] = dizi1[i];
            yeniDizi[i][1] = dizi2[i];
            yeniDizi[i][2] = dizi1[i] * dizi2[i];
        }

        // Dizileri ekrana yazdır
        System.out.println("3x1'lik bir dizi oluşturuldu.");
        diziYazdir("1.dizi", dizi1);
        diziYazdir("2.dizi", dizi2);

        // Yeni diziyi ekrana yazdır
        diziYazdir("Yeni dizi", yeniDizi);
    }
}
