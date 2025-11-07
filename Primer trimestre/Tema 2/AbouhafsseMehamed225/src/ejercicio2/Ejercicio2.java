/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora.
 */
	

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int hora;
		
		System.out.print("Introduce la hora: ");
		hora=scanner.nextInt();
		
		if( hora>5 && hora<13){
			System.out.print("Buenos dias");
		
		}else if( hora>12 && hora<21){
			System.out.print("Buenas tardes");
	
		}else{
			System.out.print("Buenas noches");
		}
		
	}

}