/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 12/12/2025
* Contenido: Crear un vector de enteros de tamaño N (número aleatorio entre 1 y 100) con valores aleatorios entre 1 y 10. Luego se le preguntará al usuario qué
* posición del vector quiere mostrar por pantalla hasta introducir un valor negativo.
*
*/

package ejercicio4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        //Variables
        int n = rand.nextInt(100) + 1; //Número aleatorio entre 1 y 100
        int pos=0;
        boolean error;
        
        int[] vector = new int[n];

        //Rellenar el vector con valores entre 1 y 10
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(10) + 1;
        }
        
        //Mostramos el largo del vector
        System.out.println("Vector generado (tamaño " + n + ")\n");

        
        // El bucle continúa mientras pos sea >= 0 (sin utilizar break)
        while (pos >= 0) {
            try {
                System.out.print("Introduce una posición (negativa para salir): ");
                pos = scanner.nextInt();

                if (pos >= 0) {
                    if (pos >= n) {
                        System.out.println("Error: posición fuera de rango.");
                    } else {
                        System.out.println("Valor en la posición " + pos + ": " + vector[pos]);
                    }
                }

            } catch (Exception e) {
                System.out.println("Error: debes introducir un número entero.");
                scanner.nextLine();
            }
        }

        System.out.println("Programa finalizado.");
    }
}
