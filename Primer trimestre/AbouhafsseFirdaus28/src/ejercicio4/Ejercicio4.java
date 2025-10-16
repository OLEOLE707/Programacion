/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:14/10/2025
 * Descripción: Con un while introducir valores positivos y almacenarlos así como el numero de valores introducidos
 */


package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Scanner
		Scanner scanner=new Scanner(System.in);
		
		//Variables
		double num, suma=0;
		int numVariables=1;
		
		System.out.print("Introduce el valor (introducir 0 para finalizar): ");
		num=scanner.nextDouble();
		
		
		while(num!=0) {
			
			if(num>=0) {
				suma=num+suma;
				
				System.out.print("Introduce el valor (introducir 0 para finalizar): ");
				num=scanner.nextDouble();
	
				numVariables++;
				
			}else {
				System.out.println("Los valores deben ser positivos");
				System.out.print("Introduce el valor (introducir 0 para finalizar): ");
				num=scanner.nextDouble();
			}
		}
		
		System.out.println("\nLa suma es: "+suma);
		System.out.println("El numero de variables: "+ (numVariables-1));
		

	}

}
