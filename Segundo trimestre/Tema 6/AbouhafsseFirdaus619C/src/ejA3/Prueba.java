/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Main de la clase Rectángulo
*
*/

package ejA3;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejA1.Punto;

public class Prueba {
	
	public static Rectangulo llenarRectangulo(Rectangulo x, Scanner sc){
		while (x==null) {
			try {
				System.out.print("Introduce x1: ");
				int x1 = sc.nextInt();

				System.out.print("Introduce y1: ");
				int y1 = sc.nextInt();

				System.out.print("Introduce x2: ");
				int x2 = sc.nextInt();

				System.out.print("Introduce y2: ");
				int y2 = sc.nextInt();

				x = new Rectangulo(x1, y1, x2, y2);

			} catch (InputMismatchException e) {
				System.out.println("ERROR: debes introducir números enteros.");
				sc.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		return x;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int baseA, alturaA;

		// Creamos los objetos
		Rectangulo a = null;
		Rectangulo b = null;

		// Rellenamos los datos
		// A
		System.out.println("RECTÁNGULO A");
		a = llenarRectangulo(a, sc);
		
		// B
		System.out.println("\nRECTÁNGULO B");
		b = llenarRectangulo(b,sc);


		
		//Mostramos coordenadas
		System.out.println("RECTÁNGULO A");
		System.out.println("(" + a.getX1() + "," + a.getY1() + ") (" + a.getX2() + "," + a.getY2() + ")");

		System.out.println("\nRECTÁNGULO B");
		System.out.println("(" + b.getX1() + "," + b.getY1() + ") (" + b.getX2() + "," + b.getY2() + ")");

		//Mostramos Áreas y perímetros
		baseA = a.getX2() - a.getX1();
		alturaA = a.getY2() - a.getY1();
		
		System.out.println("\nPerímetro A: " + 2 * (baseA + alturaA));
		System.out.println("Área A: " + baseA * alturaA);

		
		//Usamos guetters para modificar
		System.out.println("\nMODIFICAMOS RECTÁNGULO A");

		try {
			a.setX1(a.getX1() + 2);
			a.setX2(a.getX2() + 5);
			a.setY1(a.getY1() + 3);
			a.setY2(a.getY2() + 10);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		//Mostramos el resultado final
		System.out.println("\nRECTÁNGULO A MODIFICADO");
		System.out.println("(" + a.getX1() + "," + a.getY1() + ") (" + a.getX2() + "," + a.getY2() + ")");

		baseA = a.getX2() - a.getX1();
		alturaA = a.getY2() - a.getY1();
		System.out.println("Área A: " + baseA * alturaA);
	}
}