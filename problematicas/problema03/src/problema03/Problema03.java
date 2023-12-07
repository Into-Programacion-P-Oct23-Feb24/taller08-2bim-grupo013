package problema03;

import java.util.*;

public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double gradosC = 1;
        double gradosF = 20;
        String tabla = "       Tabla De converciones\nGrados Fahrenheit  |  "
                + "Grados Celsius\n";
        int i;
        int e = 20;
        for (i = 1; i <= 20; i++) {
            gradosC = (e - 32.0) * 5 / 9;
            tabla = String.format("%s      %s                "
                    + "%.2f\n", tabla, e, gradosC);
            e += 4;
        }
        System.out.print(tabla);

    }

}


