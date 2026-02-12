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
		
		a.setXY(-4, 0);

		b.setXY(5,0);
		
		c.setX(-3);
		c.setY(7);
		
		System.out.println("PUNTO A\n------------ ");
		a.imprime();
		
		System.out.println("\nPUNTO B\n------------");
		b.imprime();
		
		System.out.println("\nLa distancia de entre a y b es de "+ a.distancia(b)+"unidades");
		
		System.out.println("\nPUNTO C\n------------ ");
		c.imprime();
		
		System.out.print("\nSi desplazamos c 5 en x y -2 en y queda:");
		c.desplaza(5, -2);
		c.imprime();
		
	}

}
