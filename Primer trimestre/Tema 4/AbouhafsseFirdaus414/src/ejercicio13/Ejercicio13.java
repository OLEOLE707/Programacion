/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 18/11/2025
* Contenido: Calcular el porcentaje de descuento que nos han hecho al comprar algo solicitando la cantidad sin descuento y la cantidad con el descuento aplicado
*/

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	
	public static double porcentajeDescuento(double precioBase, double precioDescuento){ //Nos devolvera el porcentaje de descuento aplicado
		double porcentaje, cantidadDescuento;
		
		cantidadDescuento=precioBase-precioDescuento;
		
		porcentaje=(cantidadDescuento/precioBase)*100;
		
		return porcentaje;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double precioDescuento, precioBase;
		
		System.out.print("Introduce el precio con descuento: ");
		precioDescuento=scanner.nextDouble();
		
		System.out.print("Introduce el precio base: ");
		precioBase=scanner.nextDouble();
		
		System.out.println("El porcentaje de descuento que nos han aplicado es de: "+porcentajeDescuento(precioBase,precioDescuento)+"%");

	}

}
