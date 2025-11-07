/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 07/11/2025
* Contenido: Pedir dos cadenas de texto por teclado y luego indicar si son iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
*/

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String texto1, texto2;

		
		System.out.print("Introduce la primera cadena: ");
		texto1=scanner.nextLine();
		
		System.out.print("Introduce la segunda cadena: ");
		texto2=scanner.nextLine();
		
		
		if(texto1.compareToIgnoreCase(texto2)==0) {
			
			System.out.println("\nLas cádenas son iguales");
			
		}else {
			
			System.out.println("\nLas cádenas no son iguales");
		}
		

	}

}
