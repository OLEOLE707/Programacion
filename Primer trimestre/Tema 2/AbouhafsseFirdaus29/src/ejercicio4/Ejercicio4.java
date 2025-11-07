/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Mostrar los números desde el 1 hasta un número N que seintroducirá por teclado
 */


package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Escaner
		Scanner scanner= new Scanner(System.in);
		
		int n;
		
		System.out.print("Introduce n: ");
		n= scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
	}

}
