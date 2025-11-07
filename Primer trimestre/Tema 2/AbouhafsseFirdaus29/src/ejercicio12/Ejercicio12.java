/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Elevar un numero a otro sin el math
 */


package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		//Escaner
		Scanner scanner= new Scanner(System.in);
		
		int base,exp,solucion=1;
		
		System.out.print("Introduce la base: ");
		base= scanner.nextInt();
		
		System.out.print("Introduce el exponente: ");
		exp= scanner.nextInt();
		
		for(int i=0;i<exp;i++) {
			solucion=solucion*base;
		}
		
		System.out.println("\nEl resultado es: "+solucion);
	}

}
