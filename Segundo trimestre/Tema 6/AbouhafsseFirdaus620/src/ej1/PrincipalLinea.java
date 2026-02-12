package ej1;

import ejA1.Punto;

public class PrincipalLinea {

	public static void main(String[] args) {

		try {
			// Uso del constructor por defecto
			Linea l1 = new Linea();
			System.out.print("Línea 1 inicial: "+l1.escribirLinea());
			System.out.println();

			// Movimientos de la línea creada con constructor por defecto
			l1.mueveDerecha(5);
			l1.mueveArriba(3);
			System.out.print("Línea 1 tras mover: "+l1.escribirLinea());
			System.out.println("\n");

			// Creación de puntos
			Punto p1 = new Punto(1, 1);
			Punto p2 = new Punto(4, 4);

			// Uso del constructor con parámetros
			Linea l2 = new Linea(p1, p2);
			System.out.print("Línea 2 inicial: "+l2.escribirLinea());
			l2.escribirLinea();
			System.out.println();

			// Uso de todos los métodos de movimiento
			l2.mueveIzquierda(2);
			l2.mueveAbajo(1);
			System.out.print("Línea 2 tras mover: "+l2.escribirLinea());
			System.out.println();

		} catch (Exception e) {
			System.out.println("Se ha producido un error: " + e.getMessage());
		}
	}
}