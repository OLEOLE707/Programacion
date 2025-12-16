/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/11/2025
* Contenido: Pedir la edad y mostrar si es mayor de edad
*/

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static boolean esMayorEdad(int edad) {// Devuelve verdadero si a>=18, falso en caso contrario
		
		return edad>=18;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int edad;
		
		System.out.print("Introduce la edad: ");
		edad=scanner.nextInt();

		
		if(esMayorEdad(edad)==true) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("No eres mayor de edad");
		}
		
	}

}
