package Algorithms;

public class AlgorithmExample2 {
    public static void main(String[] args) {
        //pi= 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 +...+
        String s;
        int i;
        double pi=0;
        int artieksi=-1;
        for (i=1;i<100000;i++) {
            artieksi*=-1;
            pi+=4/(2.0*i-1.0)*artieksi;
        }
        s="pi = "+pi;
        System.out.println(s);
    }
}
