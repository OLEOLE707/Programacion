/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:16/10/2025
 * Descripción: Juego frio, caliente pero con números
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Scanner
		Scanner scanner=new Scanner(System.in);
		
		//Variables
		int ACIERTO=(int)(Math.random()*51);
		int intento;
		
		//Enunciado
		System.out.print("Adivina el número secreto");
		
		do {
			System.out.print("\nInténtalo: ");
			intento=scanner.nextInt();
			
			if(intento>ACIERTO){
				System.out.println("\nMayor");
			}else if(intento<ACIERTO) {
				System.out.println("\nMenor");
			}else {
				System.out.println("\n¡¡FELICIDADES!!");
			}
			
			
		}while(intento!=ACIERTO);

		
		

	}

}
