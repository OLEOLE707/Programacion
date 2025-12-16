/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 18/11/2025
* Contenido: Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado implementando una función que muestre por pantalla dicha tabla
*/


package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void tablaMultiplicar(int n) { //Muestra la tabla de multiplicar
		
		System.out.println("\t------------");
		for(int i=1; i<=10; i++) {
			System.out.println("\t "+n+"x"+i+":\t"+i*n+"\n");
			System.out.println("\t------------");
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Introduce n: ");
		n=scanner.nextInt();
		
		tablaMultiplicar(n);

	}

}
