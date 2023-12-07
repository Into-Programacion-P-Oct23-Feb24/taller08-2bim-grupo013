package problema03;

public class Problema03 {

    public static void main(String[] args) {
        int n=10;
        for (int a = 1; a < n; a++) {
            for (int e = 1; e < a; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
           for (int a = n-1; a >= 1; a--) {
            for (int e = 1; e <= a; e++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
