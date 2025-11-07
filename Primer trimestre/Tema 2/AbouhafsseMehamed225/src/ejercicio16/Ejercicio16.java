/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:23/10/2025
 * Descripción: Sumar las cifras de un número
 */


package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int num,suma=0;
		
		System.out.print("Introduce un numero: ");
		num = scanner.nextInt();
		
		while(num>0) {
			//Vamos dividiendo digitos y sumando
			suma=suma+(num%10);
			num/=10;
			
		}
		
		System.out.println("La suma de sus dígitos es: "+suma);
		

	}

}
