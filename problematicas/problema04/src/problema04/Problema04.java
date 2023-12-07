
package problema04;

/**
 *
 * @author LAB.ELECT
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 7;
        for (int a = 1; a < n; a++) {
            for (int e = 1; e < a; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 5; a >= 1; a--) {
            for (int e = 1; e <= a; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
