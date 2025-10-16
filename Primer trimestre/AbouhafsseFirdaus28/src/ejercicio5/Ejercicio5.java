/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:14/10/2025
 * Descripción: Pedir 10 valores y mostrar la media de numeros positivos y la media de numeros negativos y la cantidad de ceros
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Scanner
		Scanner scanner=new Scanner(System.in);
		
		//Variables
		double num, sumaPos=0,sumaNeg=0;
		int ceros=0,contadorPos=0,contadorNeg=0;
		
		
		for(int i=0;i<10;i++) {
			System.out.print("Introduce el valor: ");
			num=scanner.nextDouble();
			
			if(num>0) {
				sumaPos=num+sumaPos;
				contadorPos++;
				
			}else if(num<0) {
				sumaNeg=num+sumaNeg;
				contadorNeg++;
				
			}else {
				ceros++;
			}
		}
		
		System.out.println("\nLa media de positivos es:"+(sumaPos/contadorPos)+"\nLa media de negativos es: "+(sumaNeg/contadorNeg)+"\nEl número de ceros es: "+ceros);

	}

}
