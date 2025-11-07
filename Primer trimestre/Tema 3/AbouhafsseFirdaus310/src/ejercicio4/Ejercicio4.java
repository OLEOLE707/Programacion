/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 24/10/2025
 * Contenido: Solicitar 20 números y guardarlos en un array y mostrar por separado la suma de negativos y positivos
 */


package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int[] array= new int[20];
		
		int sumaNeg=0, sumaPos=0;
		
		//Para guardarlo
		for(int i=0;i<20;i++) {
			System.out.print("Introduce el número para la posicion "+(i+1)+" :");
			array[i]=scanner.nextInt();
			
			if(array[i]<0) {
				sumaNeg=sumaNeg+array[i];
			}else if(array[i]>0){
				sumaPos=sumaPos+array[i];
			}
			
		}
		
		System.out.println("\n");
		System.out.println("La suma de negativos es: "+sumaNeg);
		System.out.println("La suma de positivos es: "+sumaPos);

	}

}