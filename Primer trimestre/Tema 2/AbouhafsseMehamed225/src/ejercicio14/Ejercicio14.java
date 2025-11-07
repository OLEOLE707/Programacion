/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:23/10/2025
 * Descripción: Escribe un programa que pregunte un número X al usuario y diga si es primo o no.
 */

package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		double n,divisor;
		boolean primo=true;

		System.out.print("Introduce n: ");
		n=scanner.nextInt();
		
		divisor=2;
		
		while(divisor<(n-1) && primo==true) {
			
			if(n % divisor==0) {
				primo=false;
			}
			
			divisor++;
			
		}
			
		
		if(primo==true) {
			System.out.println("\nEl número "+n+" es primo");
		
		}else {
			System.out.println("\nEl número "+n+" no es primo");
		}
		
	}

}
