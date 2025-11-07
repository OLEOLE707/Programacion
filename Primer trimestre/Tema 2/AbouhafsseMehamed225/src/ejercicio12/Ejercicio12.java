/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:23/10/2025
 * Descripción: Secuencia fibonacci
 */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int n, num, sumador1=0, sumador2=1;

		System.out.print("Introduce cuantos digitos quieres que se muestren: ");
		n=scanner.nextInt();
		
		System.out.print("1 ");
		for(int i=0; i<(n-1); i++) {
			
			num=sumador1+sumador2;
			
			System.out.print(num+" ");
			
			sumador1=sumador2;
			sumador2=num;
	

		}
		
	}

}
