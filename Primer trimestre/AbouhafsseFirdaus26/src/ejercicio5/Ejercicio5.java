/*
 * Descripción: Pedir unos datos y deolver la nota en formato palabra
 * Autor: Firdaus Abouhafsse
 * Fecha:03/10/2025
 */


package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

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
		System.out.println("\nNombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Ciclo Formativo: "+cicloFormativo);
		
		
		
		if(nota<0||nota>10) {
			System.out.print("\nEROR DATOS INCORRECTOS");

		}else if(nota<5) {
			System.out.println("Nota académica: "+nota+ " (Insuficiente)");

		}else if (nota==5) {
			System.out.println("Nota académica: "+nota+ " (Aprobado)");
			
		}else if(nota==6) {
			System.out.println("Nota académica: "+nota+ " (Bien)");
			
		}else if (nota>6 && nota<9) {
			System.out.println("Nota académica: "+nota+ " (Notable)");
			
		}else {
			System.out.println("Nota académica: "+nota+ " (Sobresaliente)");
		}
		

	}

}
