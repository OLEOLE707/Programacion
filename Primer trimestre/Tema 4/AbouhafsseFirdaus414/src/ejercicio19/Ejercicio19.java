/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 21/11/2025
* Contenido: Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta a la ecuación de Pitágoras x ² + y ² = z ²
*	
*/

package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
	
	public static boolean comprobacionPitagoras(int x, int y, int z) {
		
		boolean cumple=false;
		
		if(Math.pow(x, 2)+Math.pow(y, 2)==Math.pow(z, 2)) {
			cumple=true;
		}
		
		return cumple;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x,y,z;
		
		System.out.println("ECUACIÓN DE PITÁGORAS: x ² + y ² = z ²\n");
		
		System.out.print("Introduce x: ");
		x=scanner.nextInt();
		
		System.out.print("Introduce y: ");
		y=scanner.nextInt();
		
		System.out.print("Introduce z: ");
		z=scanner.nextInt();
		
		
		if(comprobacionPitagoras(x,y,z)==true) {
			System.out.println("La ecuación es correcta");
		}else {
			System.out.println("La ecuación no es correcta");
		}

	}

}
