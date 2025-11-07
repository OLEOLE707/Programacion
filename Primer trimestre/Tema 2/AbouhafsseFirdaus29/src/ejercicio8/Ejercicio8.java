/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: leer una secuencia de números no nulos hasta que se introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos.
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Escaner
		Scanner scanner= new Scanner(System.in);
		
		int n, negativos=0, positivos=0;
		boolean negativosBol=false;
		
		System.out.print("Introduce n: ");
		n= scanner.nextInt();
		
		while(n!=0) {
			System.out.print("Introduce n: ");
			n= scanner.nextInt();
			
			if(n<0) {
				negativosBol=true;
				negativos++;
			}else {
				positivos++;
			}
		}
		
		System.out.println("\n");
		
		if(negativosBol==true) {
			System.out.println("Números negativos encontrados");

		}else {
			System.out.println("Números negativos no encontrados");
		}
		
		System.out.println("Positivos: "+positivos+"\nNegativos: "+negativos);
	}
}