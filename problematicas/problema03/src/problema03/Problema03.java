package problema03;

import java.util.*;

public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double gradosC = 1;
        double gradosF = 20;
        String tabla = "Tabla De converciones\n";
        int i;
        System.out.print("Grados F: ");
        gradosF = entrada.nextDouble();

        for (i = 1; i < 20; i++) {
            int e = 1;
            e++;
            gradosC = (i - 32.0) * 5 / 9;
            tabla = String.format("%s%s %s\n", tabla, i, gradosC);
        }
        System.out.print(tabla);

    }

}
