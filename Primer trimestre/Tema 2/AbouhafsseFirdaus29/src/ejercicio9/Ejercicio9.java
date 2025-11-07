/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Programa que calcula y escribe la suma y el producto de los 10 primeros números naturales
 */

package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		int suma=0,producto=1;
		
		for(int i=1;i<=10;i++) {
			suma+=i;
			producto*=i;
		}
		
		System.out.println("Suma: "+suma+"\nProducto: "+producto);

	}

}
