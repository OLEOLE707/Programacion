/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:08/10/2025
 * Descripción: Haciendo uso de un switch solicitar una nota en int. Indicar la calificación desde 0 hasta 10, en caso opuesto, en el default indicar que la nota introducida ha sido incorrecta 
 */


package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);
		
		//Creamos las variables
		int nota;
		
		//Pedimos los datos al usuario
		System.out.print("Introduce tu nota: ");
		nota= scanner.nextInt();
		
		//Creamos la condición con un switch
		switch(nota) {
			case 0,1,2,3,4:{
				System.out.println("Tu nota es: Insuficiente");
				break;
			}
			case 5:{
				System.out.println("Tu nota es: Suficiente");
				break;
			}
			case 6:{
				System.out.println("Tu nota es: Bien");
				break;
			}
			case 7,8:{
				System.out.println("Tu nota es: Notable");
				break;
			}
			case 9:{
				System.out.println("Tu nota es: Sobresaliente");
				break;
			}
			case 10:{
				System.out.println("Tu nota es: Matrícula de honor");
				break;
			}
			default:{
				System.out.println("Datos erroneos");
				break;
			}
			
		}
		
	}

}
