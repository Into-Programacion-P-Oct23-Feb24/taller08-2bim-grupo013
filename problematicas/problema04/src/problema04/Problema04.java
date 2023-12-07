/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        for (int a = n - 1; a >= 1; a--) {
            for (int e = 1; e <= a; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
