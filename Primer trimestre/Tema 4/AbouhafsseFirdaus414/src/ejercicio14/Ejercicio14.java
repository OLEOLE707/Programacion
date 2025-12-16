/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 19/11/2025
* Contenido: Escribe una función que muestre por pantalla un triángulo centralizado. Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
*/

package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void piramide(char a, int n) { //Crea y muestra una piramide
		int contador=1, contadorEspacios=n+3;
		
		//Las filas
		for(int i=0; i<n; i++) {
			
			//Espacios para centralizar la piramide
			for (int j=contadorEspacios; j>0; j--) {
				System.out.print(" ");
			}
			contadorEspacios-=1;
			
			//Relleno de la pirámide
			for (int j=0; j<contador; j++) {
				
				System.out.print(a);
			}
			contador+=2;
			
			System.out.println("\n");
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char a;
		int n;
		
		System.out.print("Introduce el carácter que quieres que se imprima: ");
		a=scanner.nextLine().charAt(0);
		
		System.out.print("Introduce el numero de lineas que deseas imprimir: ");
		n=scanner.nextInt();
		
		
		
		piramide(a,n);

	}

}
