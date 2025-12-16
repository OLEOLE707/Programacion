/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 12/12/2025
* Contenido: Pedir dos enteros A , B dividirlos y comprobar sus excepciones
*
*/

package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static int validar() {
		//Importamos escaner
		Scanner scanner= new Scanner(System.in);
		
		int dato;
		
		//Manejo de excepcion InputMismatchException
		try {
			dato=scanner.nextInt();

		}catch(InputMismatchException ex1){
			
			System.out.println("Error: Valor introducido: Incorrecto. Predeterminado a 0");
			
			System.out.print("Pila de llamadas: ");
			ex1.printStackTrace();

			dato=0;	
		}
		
		
		
		return dato;
	}

	public static void main(String[] args) {
		
		//Variables
		int a,b;
		
		//Pedimos variables
		System.out.print("Introduce A: ");
		a=validar();
				
		System.out.print("Introduce B: ");
		b=validar();
		
		//Manejo de excepción ArithmeticException
		
		System.out.print("Division a/b: ");
		try {
			System.out.print(a/b);
		}catch(ArithmeticException ex1) {
			
			System.out.println("Error: "+ex1.getMessage());
			
			System.out.print("Pila de llamadas: ");
			ex1.printStackTrace();

		}
		

	}

}
