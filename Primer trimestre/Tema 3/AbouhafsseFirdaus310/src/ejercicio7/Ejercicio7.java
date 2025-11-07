/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 24/10/2025
 * Contenido: Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
 */


package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int p,q,posicion=0;
		
		System.out.print("Introduce el primer valor entero : ");
		p=scanner.nextInt();
		
		System.out.print("Introduce el segundo valor entero: ");
		q=scanner.nextInt();
		
		int longitud=(q-p)+1;
		
		int[] array= new int[longitud];
			
		System.out.println("\n");
			//Para guardarlo y mostrarlo
			for(int i=p;i<(q+1);i++) {
				array[posicion]=i;
				
				if(i==p) {
					System.out.print("("+array[posicion]+", ");
				}else if(i==q){
					System.out.print(array[posicion]+")");
				}else {
					System.out.print(array[posicion]+", ");
				}
				
				posicion++;
			}
		


	}

}
