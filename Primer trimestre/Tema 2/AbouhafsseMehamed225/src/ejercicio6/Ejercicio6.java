/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		double a,b,c,x,x2;
		
		System.out.println("Vmos a resolver una ecuacion de segundo grado del tipo ax2 + bx + c = 0");
		
		System.out.print("Introduce a: ");
		a=scanner.nextDouble();
		
		System.out.print("Introduce b: ");
		b=scanner.nextDouble();
		
		System.out.print("Introduce c: ");
		c=scanner.nextDouble();
		
		x=(-b + (Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
		x2=(-b - (Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
		
		System.out.println("x1 = "+x+"\nx2 = "+x2);

	}


}
