/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 24/10/2025
 * Contenido: Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.
 */


package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int n,m;
		
		System.out.print("Introduce el tamaño deseado del array : ");
		n=scanner.nextInt();
		
		System.out.print("Introduce el contenido deseado del array : ");
		m=scanner.nextInt();
		
		int[] array= new int[n];
		
		int suma=0;
		
		//Para guardarlo
		for(int i=0;i<n;i++) {
			array[i]=m;
		}
		
		//Para mostrar
		for(int i=0; i<n;i++) {
			
			if(i==(n-1)) {
				System.out.print(array[i]+")");
			}else if(i==0) {
				System.out.print("("+array[i]+", ");
			}else {
				System.out.print(array[i]+", ");
			}
			

		}

	}

}

