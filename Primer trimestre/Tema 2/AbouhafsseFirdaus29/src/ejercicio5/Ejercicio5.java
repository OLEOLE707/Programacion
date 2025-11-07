/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Calcular factorial de un núimero introducido por teclado
 */


package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Escaner
		Scanner scanner= new Scanner(System.in);
		
		int n,solucion=1,multiplo;
		
		System.out.print("Introduce n: ");
		n= scanner.nextInt();
		
		multiplo=n;
		
		for(int i=0; i<n; i++) {
			solucion=solucion*multiplo;
			
			multiplo--;
			
		}
		
		System.out.println(n+"! = "+solucion);

	}

}
