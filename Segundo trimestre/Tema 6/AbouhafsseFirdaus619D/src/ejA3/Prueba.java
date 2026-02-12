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

	    // Creamos los objetos
	    Rectangulo a = null;
	    Rectangulo b = null;

	    // Rellenamos los datos
	    System.out.println("RECTÁNGULO A");
	    a = llenarRectangulo(a, sc);

	    System.out.println("\nRECTÁNGULO B");
	    b = llenarRectangulo(b, sc);

	    // Mostramos coordenadas usando métodos
	    System.out.println("\nRECTÁNGULO A");
	    a.imprimir();

	    System.out.println("\nRECTÁNGULO B");
	    b.imprimir();

	    // Mostramos área y perímetro usando métodos
	    System.out.println("\nDATOS RECTÁNGULO A");
	    System.out.println("Perímetro A: " + a.getPerimetro());
	    System.out.println("Área A: " + a.getArea());

	    // Modificamos el rectángulo A usando setters
	    System.out.println("\nMODIFICAMOS RECTÁNGULO A");
	    try {
	        a.setX1Y1(a.getX1() + 2, a.getY1() + 3);
	        a.setX2Y2(a.getX2() + 5, a.getY2() + 10);
	    } catch (IllegalArgumentException e) {
	        System.out.println(e.getMessage());
	    }

	    // Mostramos el resultado final
	    System.out.println("\nRECTÁNGULO A MODIFICADO");
	    a.imprimir();
	    System.out.println("Perímetro A: " + a.getPerimetro());
	    System.out.println("Área A: " + a.getArea());
	}
}