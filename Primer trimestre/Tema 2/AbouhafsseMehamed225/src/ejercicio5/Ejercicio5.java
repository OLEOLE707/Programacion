/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+ b = 0).
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		double a,b,x;
		
		System.out.println("Vmos a resolver una ecuacion de primer grado del tipo ax+ b = 0");
		
		System.out.print("Introduce a: ");
		a=scanner.nextDouble();
		
		System.out.print("Introduce b: ");
		b=scanner.nextDouble();
		
		x=(-b)/a;
		
		System.out.println("x = "+x);

	}

}
