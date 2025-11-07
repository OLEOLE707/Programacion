/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 31/10/2025
 * Contenido: Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
 * aleatorios entre 0 y 99. Luego pedirá por teclado un valor N y mostrar si existe y cuantas veces
 * 
 */

package ejercicio20;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int n, contador=0,longitud=0;
		int[] array=new int[1000];

		
		System.out.print("Introduce el número que quieres buscar: ");
		n=scanner.nextInt();
		
		
		for(int i=0 ;i<array.length; i++) {
			array[i]=(int)(1+Math.random()*100);
			if(array[i]==n) {
				longitud++;	
			}
		}

		if(longitud>0) {
			int[] puestos=new int[longitud];
			
			for(int i=0; i<array.length; i++) {
				if(array[i]==n) {
					puestos[contador]=i;
					contador++;
				}
			}
			
			System.out.println("Posiciones: "+Arrays.toString(puestos));
		}else {
			System.out.println("Ese numero no se encuentra");
		}		
		
	}

}
