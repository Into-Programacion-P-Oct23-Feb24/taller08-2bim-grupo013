/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 10;
        for (int a = 30; a >= contador; a--) {//comenzamos con la cantidad que 
                                              //nesecitamos 30 >= 10
            int b = a * 2;//colocar otra variable y a esta la multiplicamos *2
            int c = a * 3;//colocar otra variable y a esta la multiplicamos *3
            int d = a *4; //colocar otra variable y a esta la multiplicamos *4
            System.out.printf("%d-%d-%d-%d\n", a, b,c,d);        
        }
    }
}






