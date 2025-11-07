/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 31/10/2025
 * Contenido:Crea una secuencia aritmética que es una serie de números que comienza por un valor inicial V, y continúa con incrementos de I. 
 */

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int valor, incremento, longitud;
		int[] array;
		
		
		System.out.print("Introduce el valor inicial: ");
		valor=scanner.nextInt();
		
		System.out.print("Introduce el incremento: ");
		incremento=scanner.nextInt();
		
		System.out.print("Introduce la cantidad de valores a crear: ");
		longitud=scanner.nextInt();
		
		array=new int[longitud];
		
		for(int i=0; i<longitud;i++) {
			array[i]=valor;
			
			valor=valor+incremento;
			
			System.out.print(array[i]+" ");
		}
	}

}
