/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:16/10/2025
 * Descripción:mostrar el cuadrado de numeros hasta introducir un cero
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Scanner
		Scanner scanner=new Scanner(System.in);
		
		//Variables
		int num;
		
		System.out.print("Introduce el valor (introducir 0 para finalizar): ");
		num=scanner.nextInt();
		
		
		while(num!=0) {
			
			System.out.println("El cuadrado de "+num+" es: "+Math.powExact(num,2));
			
			System.out.print("\nIntroduce el valor (introducir 0 para finalizar): ");
			num=scanner.nextInt();

		}
	}
}