/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 19/11/2025
* Contenido: Crear un array de tamaño 50 con los números naturales comprendidos entre 50 y 99, Mostrar la suma total y la media.
*/


package ejercicio15;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] array=new double [50];
		double suma;
		
		for(int i=0; i<array.length; i++) {
			array[i]=Math.random() * (99 - 50) + 50;
		}
		
		suma=sumaArray(array);
		
		System.out.println("El array es: "+Arrays.toString(array));
		
		System.out.println("La suma total del array es: "+suma);
		
		System.out.println("La media del array es: "+mediaArray(array,suma));

	}
	
	
	
	public static double sumaArray(double[] array) { //Calcula la suma de todos os valores del array
		
		int suma=0;
		
		for(int i=0; i<array.length; i++) {
			suma+=array[i];
		}
		
		return suma;
	}
	
	public static double mediaArray(double[] array, double suma) { //Devuelve el valor medio de ese array
		
		return suma/array.length;
	}
	

}
