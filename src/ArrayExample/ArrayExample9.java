package ArrayExample;

public class ArrayExample9 {
    public static void main(String[] args) {
        int[][] matris = {{2,3,4},{1,2,5}};
        int[][] z = a(matris);
        list(z);
        int[][] r = m(z);
        list(r);
    }
    public static int[][] a(int[][] matris){
        int[][] r = new int[matris[0].length-1][matris[0].length-1];
        for(int i=0;i< matris.length;i++){
            for (int j=0; j<matris[0].length-1;j++){
                r[i][j] = matris[i][j];
            }
        }
        return r;
    }
    public static int[][] m(int[][] matris){

        int[][] r = new int[matris.length][matris[0].length];
        for(int i=0;i< r.length;i++){
            r[i][0] = matris[i][0];
        }
        return r;
    }
    public static void list(int[][] matris){
        for(int i=0;i< matris.length;i++){
            for (int j=0; j<matris[0].length;j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
