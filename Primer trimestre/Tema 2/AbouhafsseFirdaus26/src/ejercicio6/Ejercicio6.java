/*
 * Descripción: Añadir mas opciones al ejercicio anterior
 * Autor: Firdaus Abouhafsse
 * Fecha:03/10/2025
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nombre, apellidos,cicloFormativo; 
		int nota;
		
		//Pedida de datos
		System.out.print("Introduce tu nombre: ");
		nombre=scanner.nextLine();

		System.out.print("Introduce tus apellidos: ");
		apellidos=scanner.nextLine();
		
		System.out.print("Introduce tu Ciclo Formativo: ");
		cicloFormativo=scanner.nextLine();

		System.out.print("Introduce tu nota académica: ");
		nota=scanner.nextInt();
		
		
		//Salida de datos
		if(nota<0||nota>10) {
			System.out.print("\nEROR DATOS INCORRECTOS");

		}else if(nota<5) {
			System.out.println("\nNombre: "+nombre);
			System.out.println("Apellidos: "+apellidos);
			System.out.println("Ciclo Formativo: "+cicloFormativo);
			System.out.println("Nota académica: "+nota+ " (Insuficiente)");

		}else if (nota==5) {
			System.out.println("\nNombre: "+nombre);
			System.out.println("Apellidos: "+apellidos);
			System.out.println("Ciclo Formativo: "+cicloFormativo);
			System.out.println("Nota académica: "+nota+ " (Aprobado)");
			
		}else if(nota==6) {
			System.out.println("\nNombre: "+nombre);
			System.out.println("Apellidos: "+apellidos);
			System.out.println("Ciclo Formativo: "+cicloFormativo);
			System.out.println("Nota académica: "+nota+ " (Bien)");
			
		}else if (nota>6 && nota<9) {
			System.out.println("\nNombre: "+nombre);
			System.out.println("Apellidos: "+apellidos);
			System.out.println("Ciclo Formativo: "+cicloFormativo);
			System.out.println("Nota académica: "+nota+ " (Notable)");
			
		}else if(nota==10) {
			System.out.println("\nNombre: "+nombre);
			System.out.println("Apellidos: "+apellidos);
			System.out.println("Ciclo Formativo: "+cicloFormativo);
			System.out.println("Nota académica: "+nota+ " (Matrícula de honor)");
			
		}else {
			System.out.println("\nNombre: "+nombre);
			System.out.println("Apellidos: "+apellidos);
			System.out.println("Ciclo Formativo: "+cicloFormativo);
			System.out.println("Nota académica: "+nota+ " (Sobresaliente)");
				
			
		}
	}
}


