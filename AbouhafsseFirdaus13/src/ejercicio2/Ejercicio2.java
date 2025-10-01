/*
 * Descripción: Pasar de euros a pesetas y de pesetas a euros
 * Autor: Firdaus Abouhafsse
 * Fecha:30/09/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		double euros, pesetas; 
		
		
		System.out.println("EUROS-PESETAS");
		System.out.print("Introduzca la cantidad de euros que quiera transformar en pesetas: ");
		euros=scanner.nextDouble();
		
		System.out.println(euros +" euros son "+(euros*166.386)+" pesetas");
		
		System.out.println("\nPESETAS-EUROS");
		System.out.print("Introduzca la cantidad de pesetas que quiera transformar en euros: ");
		pesetas=scanner.nextDouble();
		
		System.out.println(pesetas +" pesetas son "+(pesetas/166.386)+" euros");
		
			

	}

}
