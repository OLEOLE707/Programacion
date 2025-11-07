/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 24/10/2025
 * Contenido: Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0, pedir al usuario un valor real R, y muestra cuantos valores array son iguales o superiores
 */


package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int resultado=0;
		double r;
		double[] array= new double[100];
		
		System.out.print("Introduce el valor : ");
		r=scanner.nextDouble();
	
		
		//Para guardarlo y mostrarlo
		for(int i=0;i<100;i++) {
			array[i]=Math.random()*1;
				
			if(r<=array[i]) {
				resultado++;
			}
		}
		
		System.out.println("\nHay "+resultado+" números mayores o iguales que "+r);

	}

}
