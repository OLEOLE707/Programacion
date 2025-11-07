/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: leer 100 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no.
 */


package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Escaner
		Scanner scanner= new Scanner(System.in);
		
		int n;
		boolean negativos=false;
		
		for(int i=0; i<100; i++) {
			System.out.print("Introduce n: ");
			n= scanner.nextInt();
			
			while(n==0) {
				System.out.println("Número incorrecto intente otra vez");
				System.out.print("Introduce n: ");
				n= scanner.nextInt();
			}
			
			if(n<0) {
				negativos=true;
			}
		}
		
		if(negativos==true) {
			System.out.println("Números negativos encontrados");

		}else {
			System.out.println("Números negativos no encontrados");
		}
	}
}
