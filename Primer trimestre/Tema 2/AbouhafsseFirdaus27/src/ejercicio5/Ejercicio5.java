/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:08/10/2025
 * Descripción: Crear una calculadora
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);
		
		//Creamos las variables
		double valor1 ,valor2;
		int operacion;
		
		//Pedimos los datos al usuario
		System.out.print("Introduce el primer valor: ");
		valor1= scanner.nextDouble();
		
		System.out.print("Introduce el segundo valor: ");
		valor2= scanner.nextDouble();
		
		System.out.println("\nINDIQUE LA OPERACIÓN QUE DESEA REALIZAR");
		System.out.println("(1)Suma\n(2)Resta\n(3)Multiplicación\n(4)División");
		System.out.print("Introduce el número de operación: ");
		operacion=scanner.nextInt();
		
		System.out.println("\nRESULTADO");
		System.out.println("---------");
		switch(operacion) {
			case 1:{
				System.out.println(valor1+valor2);
				break;
			}
			case 2:{
				System.out.println(valor1-valor2);
				break;
			}
			case 3:{
				System.out.println(valor1*valor2);
				break;
			}
			case 4:{
				System.out.println(valor1/valor2);
				break;
			}
			default:{
				System.out.println("Operación no válida");
			}
		}
	}
}
