/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String posicion;
        int edad = 0;
        double estatura;
        int limite = 0;
        String reporte = "Listado de jugadores\n";
        String edades = "";
        String promEdad = "";
        String promEstat = "";
        String listedades = "";
        double promedio = 0 ;
        double promedio2 = 0 ;

        System.out.println("Ingrese el numero de jugadores a ingresar");
        limite = entrada.nextInt();
        for (int i = 1; i <= limite; i++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre y apellido del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura");
            estatura = entrada.nextDouble();

            edad = edad + 1;
            
            promedio = edad / limite ;
            
            promedio2 = estatura / limite ;
            
            reporte = String.format("%s%d. %s -%s-,edad: %d,estatura %s\n",
                    reporte, i, nombre,
                    posicion, edad, estatura);

        }
        entrada.nextLine();
        edades = String.format("%sListado de Edades %s", edades, edad);
        
        promEdad = String.format("%sPromedio de edades: %s", promEdad, promedio);
        
        promEstat = String.format("%sPromedio de estaturas: %s", promEstat, promedio2);

        System.out.printf("%s\n%s\n\n%s\n\n%s\n\n", reporte, edades, promEdad, promEstat);

    }

}
