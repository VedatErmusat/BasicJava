package Algorithms;

public class AlgorithmExample3 {
    public static void main(String[] args) {
        // Tablonun başlıklarını yazdır
        System.out.println("N\t10*N\t100*N\t1000*N");

        // Tabloyu oluştur ve yazdır
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "\t");

            for (int j = 1; j <= 3; j++) {
                System.out.print(i * Math.pow(10, j) + "\t");
            }

            System.out.println();
        }
    }
}
