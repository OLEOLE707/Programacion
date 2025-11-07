/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 31/10/2025
 * Contenido: Pedir puntuaciones y ordenarlas
 */


package ejercicio19;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int[] array=new int[8];
		
		for(int i=0; i<array.length; i++) {
			System.out.print("Introduce la puntuación del jugador "+(i+1)+" : ");
			array[i]=scanner.nextInt();
		}
		
		Arrays.sort(array);
		
		System.out.println("\n"+Arrays.toString(array));

	}

}
