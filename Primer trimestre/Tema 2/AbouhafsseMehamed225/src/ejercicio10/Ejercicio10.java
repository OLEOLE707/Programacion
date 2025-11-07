/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:21/10/2025
 * Descripción: Comprobar si un número introducido por teclado es par y/o divisible entre 5.
 */



package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num;
		
		System.out.print("Numero: ");
		num=scanner.nextDouble();
		
		if(num%2==0) {
			System.out.print("El número "+num+" es par ");
			
			if(num%5==0) {
				System.out.println("y divisible entre 5");
			}else {
				System.out.println("y no es divisible entre 5");
			}
		}else {
			System.out.print("El número "+num+" no es par ");
			
			if(num%5==0) {
				System.out.println("pero es divisible entre 5");
			}else {
				System.out.println("y no es divisible entre 5");
			}
		}

	}


}

