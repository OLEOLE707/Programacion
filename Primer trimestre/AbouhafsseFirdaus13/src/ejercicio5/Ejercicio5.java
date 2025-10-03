/*
 * Descripción: Realizar diferetes calculos y comparaciones con dos números pedidos
 * Autor: Firdaus Abouhafsse
 * Fecha:01/10/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double num1,num2,menor;

		System.out.print("Introduce el primer valor: ");
		num1=scanner.nextDouble();
		
		System.out.print("Introduce el segundo valor valor: ");
		num2=scanner.nextDouble();
		
		
		System.out.println("El número menor es: "+Math.min(num1, num2));
		System.out.println("El resultado de "+num1+" elevado a "+num2+" es: "+Math.pow(num1, num2));
		System.out.println("El resultado de la raíz cuadrada de "+num1+" es: "+Math.sqrt(num1));
		System.out.println("Un valor random de "+num2+" sería: "+(Math.random()*num2));
		
		
		

	}

}
