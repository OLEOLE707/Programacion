/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 21/11/2025
* Contenido: Crear un metodo que calculará el precio a pagar, multiplicando la cantidad de productos por el precio, y
* aplicando el descuento (en porcentaje) correspondiente.
*
*/

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	//Devuelve el precio a pagar aplicando un descuento
	public static double productosDescuentos (double precio, int cantidad, int descuento) {
		
		double precioDescontado=(descuento*(precio*cantidad)/100);
		double pago=(precio*cantidad)-precioDescontado;
			
		return pago;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double precio;
		int cantidad, descuento;
		
		System.out.print("Introduce el precio del producto: ");
		precio=scanner.nextDouble();
		
		System.out.print("Introduce la cantidad de productos: ");
		cantidad=scanner.nextInt();
		
		System.out.print("Introduce el descuento aplicado: ");
		descuento=scanner.nextInt();
		
		System.out.println("\nUsted ha adquirido "+cantidad+" de productos, a un precio de "+precio+" euros la unidad.");
		
		System.out.println("El precio a pagar es de "+precio*cantidad+", pero al aplicarle el descuento del "+descuento+"% el precio final a pagar es: "+productosDescuentos(precio,cantidad,descuento));	

	}

}
