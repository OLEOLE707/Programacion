/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 18/11/2025
* Contenido:Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. 
*/

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static double km_a_millas(double km) { // Devuelve la conversión de millas a kilómetros
		
		return km/1.60934;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double km;
		
		System.out.print("Introduce los kilometros: ");
		km=scanner.nextDouble();

		

		System.out.println(km+" kilometros = "+ km_a_millas(km) +" millas");
		
	}

}
