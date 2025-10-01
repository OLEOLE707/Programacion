/*
 * Descripción: Escribir un programa que te salude por tu nombre
 * Autor: Firdaus Abouhafsse
 * Fecha:30/09/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//ESCANER
		Scanner scanner=new Scanner(System.in); 
		
		//VARIABLES
		String nombre;
		
		//PEDIDA DE DATOS
		System.out.print("¿Cómo te llamas?: ");
		nombre=scanner.nextLine();
		
		System.out.println("Hola, "+nombre);
		
	}

}
