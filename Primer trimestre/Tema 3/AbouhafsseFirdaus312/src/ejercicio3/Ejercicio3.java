/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 07/11/2025
* Contenido: Pedir tres cadenas de texto por teclado y luego juntar klas tres primeras letras
*/


package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nombre, apellido1, apellido2,resultado;
		
		System.out.print("Introduce el nombre: ");
		nombre=scanner.nextLine();
		
		System.out.print("Introduce el primer apellido: ");
		apellido1=scanner.nextLine();
		
		System.out.print("Introduce el segundo apellido: ");
		apellido2=scanner.nextLine();
		
		resultado=nombre.substring(0, 3)+apellido1.substring(0, 3)+apellido2.substring(0, 3);
		
		resultado=resultado.toUpperCase();
		
		
		System.out.println("Resultado: "+resultado);


	}

}
