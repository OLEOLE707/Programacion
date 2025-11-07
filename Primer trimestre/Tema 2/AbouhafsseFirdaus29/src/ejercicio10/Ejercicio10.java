/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Programa que lee una secuencia de notas (con valores que van de 0 a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Escaner
		Scanner scanner= new Scanner(System.in);
		
		int n, negativos=0, positivos=0;
		boolean matricula=false;
		
		do {
			System.out.print("Introduce una nota entre (0-10): ");
			n= scanner.nextInt();
			
			while((n!=-1 && n<0)||n>10) {
				System.out.println("\nNOTA INCORRECTA INTENTA OTRA VEZ");
				
				System.out.print("Introduce una nota entre (0-10): ");
				n= scanner.nextInt();
			}
	
			if(n==10) {
				matricula=true;
			}
			
		}while(n!=-1);
		
		System.out.println("\n");
		
		if(matricula==true) {
			System.out.println("10 encontrado");

		}else {
			System.out.println("10 no encontrado");
		}
	}
}
