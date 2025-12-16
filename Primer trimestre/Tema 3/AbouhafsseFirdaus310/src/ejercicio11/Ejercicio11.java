/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 31/10/2025
 * Contenido: Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
 */


package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int[] normal=new int[100], inverso=new int[100];
		
		int contador=0;
		
		
		//Introducimos los valores en el primer array
		System.out.print("Normal: ");
		for(int i=0;i<100;i++) {
			normal[i]=(i+1);
			System.out.print(normal[i]+" ");
		}
		
		System.out.print("\nInverso: ");
		for(int i=99;i>=0;i--){
			inverso[i]=normal[contador];
			contador++;
		}
		
		for(int i=0; i<100;i++) {
			System.out.print(inverso[i]+" ");
			
		}
		
	}

}
