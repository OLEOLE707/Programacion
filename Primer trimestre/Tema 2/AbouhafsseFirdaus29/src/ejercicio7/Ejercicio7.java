/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: leer 100 números no nulos y luego muestre un mensaje de cuantos positivos y cuantos negativos
 */


package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Escaner
		Scanner scanner= new Scanner(System.in);
		
		int n, negativos=0, positivos=0;
		
		for(int i=0; i<100; i++) {
			System.out.print("Introduce n: ");
			n= scanner.nextInt();
			
			while(n==0) {
				System.out.println("Número incorrecto intente otra vez");
				System.out.print("Introduce n: ");
				n= scanner.nextInt();
			}
			
			if(n<0) {
				negativos++;
			}else {
				positivos++;
			}
		}
		
		System.out.println("Positivos: "+positivos+"\nNegativos: "+negativos);
	}
}


