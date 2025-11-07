/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 07/11/2025
* Contenido: Indicar si la frase es un palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas)
*/

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String texto, textoAlreves="";
		
		System.out.print("Introduce la frase: ");
		texto=scanner.nextLine();
		
		texto=texto.replaceAll(" ", "");
		
		for(int i=texto.length()-1; i>=0;i--) {
			
			textoAlreves=textoAlreves+texto.charAt(i);
			

		}
		
		if(texto.compareToIgnoreCase(textoAlreves)==0) {
			System.out.println("\nEl texto es un palíndromo");
		
		}else {
			System.out.println("\nEl texto no es un palíndromo");
		}
		

	}

}
