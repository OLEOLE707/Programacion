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
		
		Punto a = new Punto();
		Punto b = new Punto();
		Punto c = new Punto();
		
		a.x=5;
		a.y=0;
		
		b.x=10;
		b.y=10;
		
		c.x=-3;
		c.y=7;
		
		System.out.println("PUNTO A\n------------ \nx="+a.x+"\ny="+a.y);
		System.out.println("\nPUNTO B\n------------ \nx="+b.x+"\ny="+b.y);
		System.out.println("\nPUNTO C\n------------ \nx="+c.x+"\ny="+c.y);
		
		a.x+=7;
		a.y+=9;
		
		b.x-=6;
		b.y/=2;
		
		c.x*=3;
		c.y%=3;
		
		System.out.println("\nCAMBIOS\n---------------\nPUNTO A\n------------ \nx="+a.x+"\ny="+a.y);
		System.out.println("\nPUNTO B\n------------ \nx="+b.x+"\ny="+b.y);
		System.out.println("\nPUNTO C\n------------ \nx="+c.x+"\ny="+c.y);
		
	}

}
