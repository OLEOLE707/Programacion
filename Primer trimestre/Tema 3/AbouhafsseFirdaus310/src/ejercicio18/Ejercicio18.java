/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 31/10/2025
 * Contenido: Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0 y 9 y ordenar los valores
 */


package ejercicio18;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		int array[]=new int [30];
		
		for(int i=0 ;i<array.length; i++) {
			array[i]=(int)(Math.random()*10);
		}
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));

	}

}
