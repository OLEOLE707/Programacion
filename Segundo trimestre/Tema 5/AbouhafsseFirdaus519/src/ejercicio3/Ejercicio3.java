/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 12/12/2025
* Contenido:  Crear un vector tipo double de tamaño 5 y llenarlo por teclado. Manejando las posibles excepciones
*
*/

package ejercicio3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	
	
	public static double validar(int i) { //Validamos los datos
		Scanner scanner= new Scanner(System.in);
		
		double dato;
		boolean error=false;
		
		System.out.print("Introduce el dato de la posicion "+(i+1)+": ");
		
		do {
			
			try {
				dato=scanner.nextInt();
				error=false;
				
			}catch(InputMismatchException ex1){
				
				System.out.println("Error: Valor introducido: Incorrecto.");
				
				System.out.print("Pila de llamadas: ");
				ex1.printStackTrace();
				error=true;
				dato=0;
				
				System.out.print("Intentalo otra vez: ");
				
				scanner.nextLine();	
			}
			
		}while (error==true);
		
		return dato;
	}
	

	public static void main(String[] args) {
		double[] vector= new double[5];
		
		for(int i=0; i<vector.length; i++) {
			vector[i]=validar(i);
		}
		
		System.out.println("Vector rellenado: "+Arrays.toString(vector));
		
	}

}
