/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 24/10/2025
 * Contenido: Solicitar 10 números y guardarlos en un array y mostrar la suma de todos ellos
 */


package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int[] array= new int[10];
		
		int suma=0;
		
		//Para guardarlo
		for(int i=0;i<10;i++) {
			System.out.print("Introduce el número para la posicion "+(i+1)+" :");
			array[i]=scanner.nextInt();
			
			suma=suma+array[i];
		}
		
		System.out.println("La suma es: "+suma);		

	}

}