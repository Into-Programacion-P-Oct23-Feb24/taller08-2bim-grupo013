package problema03;

import java.util.*;

public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double gradosC = 1;
<<<<<<< HEAD
        double gradosF = 1;
        String tabla = "Tabla De converciones\n";
        gradosF = entrada.nextDouble();
        int columnas = 0 ;
        
        for (int i = 20; columnas <= 20; i++) {
            
            gradosC = (i - 32) * 5 / 9;
            
            tabla = String.format("%s\n%s",tabla, gradosC) ;
        }
        System.out.printf("s", tabla);
=======
        double gradosF = 20;
        String tabla = "       Tabla De converciones\nGrados Fahrenheit  |  "
                + "Grados Celsius\n";
        int i;
        int e = 20;
        for (i = 1; i < 20; i++) {
            e+=4;
            gradosC = (e - 32.0) * 5 / 9;
            tabla = String.format("%s      %s                "
                    + "%.2f\n", tabla, e, gradosC);
        }
<<<<<<< HEAD
        System.out.print(tabla); 
=======
        System.out.print(tabla);
>>>>>>> ef4d670e63ac9d20577c51c912979eb7b296c6c7
>>>>>>> 8d015fc3a806bcd038ed7a7e622d260f1678a6f1

    }

}
