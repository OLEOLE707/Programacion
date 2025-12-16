/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/11/2025
* Contenido: Pedir dos numeros reales y devolverlos multiplicados con una funcion
*/


package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static double multiplica(double a, double b) { // Devuelve la multiplicación de dos números

		
		return a*b;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a,b;
		
		System.out.print("Introduce a: ");
		a=scanner.nextDouble();
		
		System.out.print("Introduce b: ");
		b=scanner.nextDouble();
		
		
		System.out.println("La multiplicación de a y b es: "+multiplica(a,b));
		
	}

}
