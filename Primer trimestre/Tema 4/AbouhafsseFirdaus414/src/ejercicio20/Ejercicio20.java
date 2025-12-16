/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 21/11/2025
* Contenido: Escribe un programa que imprima las tablas de multiplicar del 1 al 10. 
*
*/

package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void imprimirTablas(int n) { //Mostrara la tabla de multiplicar del numero recibido
		System.out.println("\t------------");
		for(int i=1; i<=10; i++) {
			System.out.println("\t "+n+"x"+i+":\t"+i*n+"\n");
			System.out.println("\t------------");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
				
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("|\t "+j+"x"+i+":\t"+i*j+"\t|");
			}
			
			System.out.println("");
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		System.out.print("Introduce n: ");
		n=scanner.nextInt();
		
		
		imprimirTablas(n);
	}

}
