/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 19/11/2025
* Contenido: Crear un array del tamaño indicado por teclado y luego lo rellene con valores aleatorios
*/


package ejercicio16;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {

	public static double[] llenarArray(double[] array) { //llena un array con valores aleatorios
		for(int i=0; i<array.length; i++) {
			array[i]=Math.random();
		}
		
		return array;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Introduce el tamaño del array: ");
		n=scanner.nextInt();
		
		double[] array=new double [n];
		
		
		System.out.println(Arrays.toString(llenarArray(array)));


	}

}
