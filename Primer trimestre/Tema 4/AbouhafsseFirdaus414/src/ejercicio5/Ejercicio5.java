/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/11/2025
* Contenido: Pedir un valor entero en millas y muestre su equivalente en kilómetros.
* 
*/

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static double millas_a_kilometros(int millas) { // Devuelve la conversión de millas a kilómetros
		
		return millas* 1.60934;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int millas;
		
		System.out.print("Introduce las millas: ");
		millas=scanner.nextInt();

		

		System.out.println(millas+" millas = "+ millas_a_kilometros(millas) +" km");
		
	}

}
