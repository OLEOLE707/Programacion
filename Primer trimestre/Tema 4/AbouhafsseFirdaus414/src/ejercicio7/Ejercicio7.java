/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/11/2025
* Contenido: Pedir el ancho y alto de un rectángulo y mostrar por pantalla su área y su perímetro
*/

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static double perimetroRectangulo(double ancho, double alto) { // Devuelve el perímetro
		double perimetro=(double)(2*ancho)+(2*alto);
		return perimetro;
	}
	
	public static double areaRectangulo(double ancho, double alto) { // Devuelve el área
		double area=ancho*alto;
		return area;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double ancho, alto;
		
		System.out.print("Introduce el ancho: ");
		ancho=scanner.nextDouble();
		
		System.out.print("Introduce el alto: ");
		alto=scanner.nextDouble();
		
		
		System.out.println("El área es: "+areaRectangulo(ancho, alto));
		System.out.println("El perimetro es: "+perimetroRectangulo(ancho, alto));

	}

}
