/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 31/10/2025
 * Contenido: Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
 * a. Mostrar valores.
 * b. Introducir valor.
 * c. Salir.
 */


package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int[] array=new int[10];
		String opcion;
		
		int valor, posicion,opcionNum=0;
		
		
		do {
			System.out.println("\nMENU DE OPCIONES");
			System.out.println("----------------");
			System.out.println("a. Mostrar valores\nb. Introducir valor\nc. Salir");
			
			System.out.print("Introduce la opcion: ");
			opcion=scanner.next();
			
			System.out.println("\n");
			
			switch (opcion) {
				case "A", "a"->{
					System.out.print("Array: ");
					for(int i=0;i<10;i++) {
						System.out.print(array[i]+" ");
					}
					System.out.println("\n");
					opcionNum=1;
				}
				
				case "B", "b"->{
					System.out.print("Introduce el valor que quieras insertar: ");
					valor=scanner.nextInt();
					
					System.out.print("Introduce la posicion del valor que quieras insertar: ");
					posicion=scanner.nextInt();
					
					array[posicion]=valor;
					opcionNum=2;
					
				}
				case "C","c"->{
					opcionNum=3;
				}
			}
		
			} while(opcionNum!= 3 );
		
		System.out.println("\nSaliendo del programa...");

	}

}
