/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 24/10/2025
 * Contenido: Solicitar 10 números y guardarlos en un array y buscar el minimo y maximo
 */


package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int[] array= new int[10];
		
		int min, max;
		
		//Para guardarlo
		for(int i=0;i<10;i++) {
			System.out.print("Introduce el número para la posicion "+(i+1)+" : ");
			array[i]=scanner.nextInt();

		}
		
		//Inicializamos con el primer num del array
		min=array[0];
		max=array[0];
		
		//Recorremos
		for(int i=0;i<10;i++) {
			
			if(max<array[i]) {
				max=array[i];
				
			}else if (min>array[i]) {
				min=array[i];
			}

		}
		
		System.out.println("El minimo es: "+min);
		System.out.println("El maximo es: "+max);

	}

}