package problema03;

import java.util.*;

public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double gradosC = 1;
        double gradosF = 1;
        String tabla = "Tabla De converciones\n";
        gradosF = entrada.nextDouble();
        int columnas = 0 ;
        
        for (int i = 20; columnas <= 20; i++) {
            
            gradosC = (i - 32) * 5 / 9;
            
            tabla = String.format("%s\n%s",tabla, gradosC) ;
        }
        System.out.printf("s", tabla);

    }

}
