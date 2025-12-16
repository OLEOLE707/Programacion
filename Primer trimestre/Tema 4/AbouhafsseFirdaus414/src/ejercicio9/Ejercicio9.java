/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 18/11/2025
* Contenido: Pedir 3 valores enteros y devolver el mas pequeño creando únicamente una función a la que le pasemos dos valores y nos devuelva el mínimo de los dos valores.
*/


package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static int menor(int num1, int num2) { //Devuelve el menor valor
		if(num1<num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Introduce a: ");
		a=scanner.nextInt();
		
		System.out.print("Introduce b: ");
		b=scanner.nextInt();
		
		System.out.print("Introduce c: ");
		c=scanner.nextInt();
		
		while(a==b||a==c||b==c){
			System.out.println("No puede haber numeros iguales");
			
			System.out.print("Introduce a: ");
			a=scanner.nextInt();
			
			System.out.print("Introduce b: ");
			b=scanner.nextInt();
			
			System.out.print("Introduce c: ");
			c=scanner.nextInt();
		}
		
		
		if(a<b && c<b) {
			System.out.println("El menor de los tres dígitos es: "+menor(a,c));
		}else if(a<c && b<c) {
			System.out.println("El menor de los tres dígitos es: "+menor(a,b));
		}else if(b<a && c<a) {
			System.out.println("El menor de los tres dígitos es: "+menor(b,c));
		}
	}

}
