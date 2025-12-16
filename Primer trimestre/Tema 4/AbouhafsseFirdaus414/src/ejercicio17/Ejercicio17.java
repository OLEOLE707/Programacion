/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 20/11/2025
* Contenido:Pedir números enteros hasta que se introduzca el 0, diciéndo  si es primo o no. 
*	
*/


package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
	
	
	public static boolean esPrimo(int n) { //devuelve si el número es primo
		boolean primo=true;
		int contador=n-1;
		
		if(n==1) {
			primo=false;
		}
		
		
		while(contador>0) {
			
			if(n%contador==0 && contador!=1) {
				primo=false;
				
				contador=0;
			}
			
			contador--;
		}
		
		return primo;
	}

	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Introduce n: ");
		n=scanner.nextInt();
		
		if (esPrimo(n)==true) {
			System.out.println("El numero "+n+" es primo");
		}else if(esPrimo(n)==false) {
			System.out.println("El numero "+n+" no es primo");
		}

	}

}
