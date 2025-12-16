/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/11/2025
* Contenido: Mostrar el mínimo entre dos números
*/


package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static int minimo(int a, int b) { // Devuelve el menor entre a y b
		int menor;

		if(a<b) {
			menor=a;
		}else {
			menor=b;
		}

		return menor;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int a,b;
		
		System.out.print("Introduce a: ");
		a=scanner.nextInt();
		
		System.out.print("Introduce b: ");
		b=scanner.nextInt();
		
		while(b==a) {
			System.out.println("a y b no pueden ser iguales");
			
			System.out.print("Introduce b: ");
			b=scanner.nextInt();
		}

		System.out.println("El menor es: "+minimo(a,b));
	}

}
