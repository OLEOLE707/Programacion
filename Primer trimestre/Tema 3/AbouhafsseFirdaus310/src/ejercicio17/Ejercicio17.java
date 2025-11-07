/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 31/10/2025
 * Contenido:Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario
 * si son iguales o no.
 */

package ejercicio17;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int[] array1=new int[10], array2=new int[10];
		boolean comparacion;
		
		for(int i=0;i<10;i++) {
			System.out.print("Introduce el dígito "+(i+1)+" : ");
			array1[i]=scanner.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			System.out.print("Introduce el dígito "+(i+1+10)+" : ");
			array2[i]=scanner.nextInt();
		}
		
		
		comparacion=Arrays.equals(array1, array2);
		
		if(comparacion==false) {
			System.out.println("\nLos dos arrays no son iguales");
		}else {
			System.out.println("\nLos dos arrays son iguales");
		}

	}

}
