/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 24/10/2025
 * Contenido: Solicitar 20 números y guardarlos en un array y recorrerlo para calcular la media
 */



package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int[] array= new int[20];
		
		int suma=0;
		
		//Para guardarlo
		for(int i=0;i<20;i++) {
			System.out.print("Introduce el número para la posicion "+(i+1)+" : ");
			array[i]=scanner.nextInt();
			
			suma=suma+array[i];
		}
		
		System.out.println("\n");
		System.out.println("La media es: "+suma/20);


	}

}