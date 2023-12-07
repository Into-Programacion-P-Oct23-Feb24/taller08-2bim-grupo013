package problema03;

import java.util.*;

public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double gradosC = 1;
        double gradosF = 1;
        String tabla = "Tabla De converciones\n";
        System.out.print("Grados F: ");
        gradosF = entrada.nextDouble();
        
        for (int i = 0; i <= 20; i++) {
            gradosC = (i - 32.0) * 5 / 9;
            tabla = String.format("", tabla);
            
        }

    }

}
