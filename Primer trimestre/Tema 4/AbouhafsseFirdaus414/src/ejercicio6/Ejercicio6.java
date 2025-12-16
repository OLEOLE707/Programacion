/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/11/2025
* Contenido: Crear una función que devuelve el precio tras sumarle un 21% de IVA
*/


package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static double precioConIVA(double precio) { // Devuelve el precio tras sumarle un 21% de IVA
		final int IVA=21;
		
		double precioIva=((precio*IVA)/100)+precio;
		
		return precioIva;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double p1, p2, p3, p4, p5;
		
		System.out.print("Introduce el primer precio: ");
		p1=scanner.nextDouble();
		
		System.out.print("Introduce el segundo precio: ");
		p2=scanner.nextDouble();
		
		System.out.print("Introduce el tercer precio: ");
		p3=scanner.nextDouble();
		
		System.out.print("Introduce el cuarto precio: ");
		p4=scanner.nextDouble();
		
		System.out.print("Introduce el quinto precio: ");
		p5=scanner.nextDouble();

		

		System.out.println("Primer precio "+p1+" con el IVA aplicado = "+precioConIVA(p1));
		System.out.println("Segundo precio "+p2+" con el IVA aplicado = "+precioConIVA(p2));
		System.out.println("Tercer precio "+p3+" con el IVA aplicado = "+precioConIVA(p3));
		System.out.println("Cuarto precio "+p4+" con el IVA aplicado = "+precioConIVA(p4));
		System.out.println("Quinto precio "+p5+" con el IVA aplicado = "+precioConIVA(p5));
		
		
	}

}
