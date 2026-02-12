/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Main de la clase Punto
*
*/
package ejA1;

import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args) {
		
		Punto a = new Punto(0,0);
		Punto b = new Punto(2,7);
		Punto c = new Punto(6,5);
		
		a.setX(5);
		a.setY(3);

		b.setX(10);
		b.setY(10);
		
		c.setX(-3);
		c.setY(7);
		
		System.out.println("PUNTO A\n------------ \nx="+a.getX()+", "+a.getY());
		System.out.println("\nPUNTO B\n------------ \nx="+b.getX()+", "+b.getY());
		System.out.println("\nPUNTO C\n------------ \nx="+c.getX()+", "+c.getY());
		
	}

}
