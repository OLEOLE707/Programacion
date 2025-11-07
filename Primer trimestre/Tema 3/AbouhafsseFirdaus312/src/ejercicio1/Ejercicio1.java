/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 07/11/2025
* Contenido: Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra de la cadena en una línea distinta.
*/

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String texto;
		char caracter;
		
		
		System.out.print("Introduce un texto: ");
		texto=scanner.nextLine();
		
		
		
		for(int i=0; i<texto.length();i++) {
			//Leemos cada caracter
			caracter=texto.charAt(i);
			
			//Si es un espacio cambiamos de linea
			if(caracter == ' ') {
				System.out.println("\n");
			}else {
				System.out.print(caracter);
			}
		}

	}

}
