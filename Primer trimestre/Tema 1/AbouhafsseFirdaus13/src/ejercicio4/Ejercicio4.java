/*
 * Descripción: Cambiar una variable double con la clase math
 * Autor: Firdaus Abouhafsse
 * Fecha:01/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num1;

		System.out.print("Introduce un valor: ");
		num1=scanner.nextDouble();
		
		
		System.out.println("\nMath.ceil");
		System.out.println("---------");
		System.out.println("La función de Math ceil hace que nuestro número: "+num1+" \npase a ser el menor de los enteros que sigue siendo mayor o igual a el\nResultado: "+(int)Math.ceil(num1));
		
		System.out.println("\nMath.floor");
		System.out.println("---------");
		System.out.println("La función de Math floor hace que nuestro número: "+num1+" \npase a ser el mayor de los enteros que sigue siendo inferior o igual a numero.\nResultado: "+(int)Math.floor(num1));
		
		System.out.println("\nMath.ceil");
		System.out.println("---------");
		System.out.println("La función de Math round hace que nuestro número: "+num1+" \nse redonder al siguiente número entero.\nResultado: "+Math.round(num1));

	}

}
