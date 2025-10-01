/*
 * Descripción: Cambiar de valor entre dos variables
 * Autor: Firdaus Abouhafsse
 * Fecha:30/09/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double num1,num2,cambio;

		System.out.print("Introduce el primer valor: ");
		num1=scanner.nextDouble();
		
		System.out.print("Introduce el segundo valor valor: ");
		num2=scanner.nextDouble();
		
		cambio=num1;
		num1=num2;
		num2=cambio;
		
	
		System.out.println("El valor de num1 ahora es: "+num1+" y el valor de num2 ahora es: "+num2);

	}

}
