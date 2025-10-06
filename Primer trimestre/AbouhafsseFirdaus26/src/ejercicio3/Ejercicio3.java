/*
 * Descripción: Pedir un dato y según la condicion pedir mas datos o no 
 * Autor: Firdaus Abouhafsse
 * Fecha:03/10/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nombre, apellidos; 
		int edad;
				
		System.out.print("Introduce tu edad: ");
		edad=scanner.nextInt();
		
		//Si es mayor pedimos los demas datos
		if(edad>=18) {
			
			//Ponemos esto para que lea los datos bien
			scanner.nextLine();
			
			System.out.print("Introduce tu nombre: ");
			nombre=scanner.nextLine();

			System.out.print("Introduce tus apellidos: ");
			apellidos=scanner.nextLine();
			
			
			System.out.println("\nNombre: "+nombre);
			System.out.println("Apellidos: "+apellidos);
			System.out.println("Edad: "+edad);
			System.out.println("\nUsted ha sido admitido");
			
			
			

		}else{
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
		}

	}

}
