package ArrayExample;

public class ArrayExample8 {
    public static void main(String[] args) {
        // Verilen matrisleri tanımla
        int[][] matris1 = {{1, 2}};
        int[][] matris2 = {{3, 5}};

        // Matrisleri yazdır
        System.out.println("Matris 1: ");
        matrisiYazdir(matris1);

        System.out.println("Matris 2: ");
        matrisiYazdir(matris2);

        // Matris transpozunu al ve yazdır
        System.out.println("\nMatris 1 Transpozu: ");
        int[][] matris1Transpozu = transpozAl(matris1);
        matrisiYazdir(matris1Transpozu);

        System.out.println("Matris 2 Transpozu: ");
        int[][] matris2Transpozu = transpozAl(matris2);
        matrisiYazdir(matris2Transpozu);

        // Matrislerin toplamını al ve yazdır
        System.out.println("\nMatrislerin Toplamı: ");
        int[][] toplamMatris = matrisToplama(matris1, matris2);
        matrisiYazdir(toplamMatris);

        // Matrislerin çıkarmasını al ve yazdır
        System.out.println("Matrislerin Çıkarımı: ");
        int[][] cikarmaMatris = matrisCikarma(matris1, matris2);
        matrisiYazdir(cikarmaMatris);
    }

    // Matrisi ekrana yazdıran metod
    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print("["+matris[i][j]+ "]");
            }
            System.out.println();
        }
    }

    // Matrisin transpozunu alan metod
    public static int[][] transpozAl(int[][] matris) {
        int[][] transpozMatris = new int[matris[0].length][matris.length];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        return transpozMatris;
    }

    // İki matrisi toplayan metod
    public static int[][] matrisToplama(int[][] matris1, int[][] matris2) {
        int satirSayisi = matris1.length;
        int sutunSayisi = matris1[0].length;

        int[][] toplamMatris = new int[satirSayisi][sutunSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                toplamMatris[i][j] = matris1[i][j] + matris2[i][j];
            }
        }

        return toplamMatris;
    }

    // İki matrisi çıkaran metod
    public static int[][] matrisCikarma(int[][] matris1, int[][] matris2) {
        int satirSayisi = matris1.length;
        int sutunSayisi = matris1[0].length;

        int[][] cikarmaMatris = new int[satirSayisi][sutunSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                cikarmaMatris[i][j] = matris1[i][j] - matris2[i][j];
            }
        }

        return cikarmaMatris;
    }
}
