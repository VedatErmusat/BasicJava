package ArrayExample;

import java.util.Scanner;

public class ArrayExample6 {
    public static void main(String[] args) {
        // 3 ayrı dizi tanımla
        int[] dizi1 = new int[3];
        int[] dizi2 = new int[3];
        int[] dizi3 = new int[3];

        Scanner scanner = new Scanner(System.in);

        // Her bir dizinin elemanlarını kullanıcının girmesini sağla
        diziGir(dizi1, "1. dizi");
        diziGir(dizi2, "2. dizi");
        diziGir(dizi3, "3. dizi");

        // Dizileri birleştirerek 3x3'lük bir matris oluştur
        int[][] matris = birlestirMatris(dizi1, dizi2, dizi3);

        // Matrisi yazdır
        System.out.println("Oluşturulan Matris:");
        matrisiYazdir(matris);

        // Sağ ve sol köşegenlerin 2. kuvvetini hesapla
        int[][] degisenMatris = kosegenleriKuvvetAl(matris);

        // Matrisi yazdır
        System.out.println("Değişmiş Matris:");
        matrisiYazdir(degisenMatris);

        // Scanner'ı kapat
        scanner.close();
    }

    // Her bir dizinin elemanlarını kullanıcıdan al
    private static void diziGir(int[] dizi, String diziAdi) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen " + diziAdi + " için 3 elemanı girin:");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + ". eleman: ");
            dizi[i] = scanner.nextInt();
        }
    }

    // Dizileri birleştirerek 3x3'lük bir matris oluştur
    private static int[][] birlestirMatris(int[] dizi1, int[] dizi2, int[] dizi3) {
        int[][] matris = new int[3][3];
        for (int i = 0; i < 3; i++) {
            matris[0][i] = dizi1[i];
            matris[1][i] = dizi2[i];
            matris[2][i] = dizi3[i];
        }
        return matris;
    }

    // Matrisi ekrana yazdır
    private static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Sağ ve sol köşegenlerin 2. kuvvetini al
    private static int[][] kosegenleriKuvvetAl(int[][] matris) {
        int[][] degisenMatris = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                degisenMatris[i][j] = (int) Math.pow(matris[i][j], 2);
            }
        }

        return degisenMatris;
    }
}
