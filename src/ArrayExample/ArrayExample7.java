package ArrayExample;

import java.util.Arrays;

public class ArrayExample7 {
    public static void main(String[] args) {
        // Sabit sayı ve rastgele seçilen sayılar
        int sabit = 1;
        int[] sayilar = {1, 3, 5, 7, 9};

        // Çarpım tablosunu oluştur
        int[][] carpimTablosu = new int[sayilar.length][sayilar.length];
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar.length; j++) {
                carpimTablosu[i][j] = sabit * sayilar[i] * sayilar[j];
            }
        }

        // Çıktıyı ekrana yazdır
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar.length; j++) {
                System.out.print(sabit + "x" + sayilar[i] + "=" + carpimTablosu[i][j] + "\t");
            }
            System.out.println();
        }

        // İkinci çarpım için en küçük değeri bul ve kullan
        int minDeger = carpimTablosu[0][0];
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar.length; j++) {
                minDeger = Math.min(minDeger, carpimTablosu[i][j]);
            }
        }

        int ikinciSabit = minDeger / sayilar[0];

        // İkinci çarpımı hesapla
        int[][] ikinciCarpimTablosu = new int[sayilar.length][sayilar.length];
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar.length; j++) {
                ikinciCarpimTablosu[i][j] = ikinciSabit * sayilar[i] * sayilar[j];
            }
        }

        // İkinci çarpım çıktısını ekrana yazdır
        System.out.println();
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar.length; j++) {
                System.out.print(ikinciSabit + "x" + sayilar[i] + "=" + ikinciCarpimTablosu[i][j] + "\t");
            }
            System.out.println();
        }

        // Elde edilen sonuçları sırala ve en küçük, en büyük değeri bul
        int[] sonuclar = new int[sayilar.length * sayilar.length * 2];
        int index = 0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar.length; j++) {
                sonuclar[index] = carpimTablosu[i][j];
                sonuclar[index + 1] = ikinciCarpimTablosu[i][j];
                index += 2;
            }
        }

        Arrays.sort(sonuclar);

        // Sonuçları ekrana yazdır
        System.out.println("Sayılarımız: " + Arrays.toString(sonuclar));
        System.out.println("En küçük değer: " + sonuclar[0]);
        System.out.println("En büyük değer: " + sonuclar[sonuclar.length - 1]);
    }
}
