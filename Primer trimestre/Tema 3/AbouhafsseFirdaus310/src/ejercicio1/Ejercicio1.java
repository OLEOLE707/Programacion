/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 23/10/2025
 * Contenido: Solicitar 10 números y guardarlos en un array
 */


package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int[] array= new int[10];
		
		//Para guardarlo
		for(int i=0;i<10;i++) {
			System.out.print("Introduce el número para la posicion "+(i+1)+" :");
			array[i]=scanner.nextInt();
			
		}
		
		//Para mostrarlo
		for(int i=0;i<10;i++) {
			System.out.print(array[i]+" ");
			
		}
		

	}

}
