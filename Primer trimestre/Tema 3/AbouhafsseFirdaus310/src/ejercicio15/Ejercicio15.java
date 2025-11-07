/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 31/10/2025
 * Contenido:Crea un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N que contenga M en todas sus posiciones. Luego muestra el array por pantalla.
 */


package ejercicio15;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int[] array;
		int n, m;
		
		System.out.print("Introduce el tamaño: ");
		n=scanner.nextInt();
		
		System.out.print("Introduce el valor: ");
		m=scanner.nextInt();
		
		array= new int [n];
		
		Arrays.fill(array, m);
		
		System.out.print(Arrays.toString(array));
	}

}
