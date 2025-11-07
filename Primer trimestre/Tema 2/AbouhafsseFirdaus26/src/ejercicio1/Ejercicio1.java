/*
 * Descripción: Comparar dos números y mostrar diferentes mensajes
 * Autor: Firdaus Abouhafsse
 * Fecha:03/10/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Introduce el primer numero: ");
		num1=scanner.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		num2=scanner.nextInt();
		
		if(num1>num2) {
			System.out.println("El primer número ("+num1+") es mayor que el segundo ("+num2+").");
		}else if (num1<num2) {
			System.out.println("El segundo número ("+num2+") es mayor que el primero ("+num1+").");
		}else {
			System.out.println("Los dos números son iguales ("+num1+") = ("+num2+") ");
		}

	}

}
