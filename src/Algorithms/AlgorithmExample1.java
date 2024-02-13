package Algorithms;

import java.util.Scanner;

public class AlgorithmExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayıyı al
        System.out.print("Lütfen iki sayı giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // Hesaplamayı gerçekleştir ve sonucu ekrana yazdır
        hesaplamaYap(sayi1, sayi2);

        // Scanner'ı kapat
        scanner.close();
    }

    private static void hesaplamaYap(int sayi1, int sayi2) {
        System.out.print("Hesaplanan İfade: ");
        double toplam = 0;

        // İşlemi gerçekleştir ve sonucu ekrana yazdır
        for (int i = 1; i <= sayi2-(sayi1-1); i++) {
            long faktoriyel = faktoriyelHesapla(i);
            int payda = i + sayi1 - 1;

            System.out.print(i + "!/" + payda);
            double terim = (double) faktoriyel / payda;
            toplam += terim;

            if (i < sayi2 - (sayi1 - 1)) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        System.out.println("Matematiksel Sonuç: " + toplam);
    }

    private static long faktoriyelHesapla(int n) {
        long faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
