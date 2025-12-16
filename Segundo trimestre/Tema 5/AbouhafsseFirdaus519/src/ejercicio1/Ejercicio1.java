/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 12/12/2025
* Contenido: Pedir un entero A y comprobar sus excepciones
*
*/

package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Importamos escaner
		Scanner scanner= new Scanner(System.in);
		
		//Variables
		int a;
		
		//Pedimos variables
		System.out.print("Introduce un valor entero: ");
		
		//Manejo de excepciones
		try {
			a=scanner.nextInt();

		}catch(InputMismatchException ex1){
			
			System.out.println("Error: Valor introducido: Incorrecto. Predeterminado a 0");
			
			System.out.print("Pila de llamadas: ");
			ex1.printStackTrace();

			a=0;	
		}
		
		
		System.out.print("Valor introducido: "+a);
					
		
	}

}
