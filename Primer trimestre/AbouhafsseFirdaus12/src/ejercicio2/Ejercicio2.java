/*
 * Descripción: Imprimir por pantalla diferentes datos string
 * Autor: Firdaus Abouuhafsse
 * Fecha:23/09/2025
 */


package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int anyo;
		String nombreEstadio, nombreEquipo, nombreCap;
		
		System.out.print("Introduce el nombre del equipo: ");
		nombreEquipo = scanner.nextLine();
		
		System.out.print("Introduce el nombre del capitán: ");
		nombreCap = scanner.nextLine();
		
		System.out.print("Introduce el nombre del estadio: ");
		nombreEstadio = scanner.nextLine();
		
		System.out.print("Introduce el año de fundación: ");
		anyo = scanner.nextInt();

		
		
		System.out.println("\nNombre del Equipo: "+nombreEquipo+"\nFundado en: "+anyo+"\nEstadio: "+nombreEstadio+"\nCapitán: "+nombreCap);
	}
	
}