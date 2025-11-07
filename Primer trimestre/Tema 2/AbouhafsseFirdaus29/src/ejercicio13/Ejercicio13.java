/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: frio, caliente del 1 al 100 pero el ordenador intenta adivinarlo
 */


package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		//Escaner
		Scanner scanner= new Scanner(System.in);
		
		//Variables, solucion puesta como contante porque no cambia
		final int Solucion;
		
		//Introduzco los maximos i mínimos
		int intento,max=101,min=0;
		String solucion;
		
		System.out.print("Introduce el número a adivinar: ");
		Solucion= scanner.nextInt();
		
		intento=(int) (Math.random()*max);
		
		do {
			System.out.print(intento+" ¿Es Mayor o Menor?: ");
			solucion= scanner.next();
			
			switch (solucion) {
				case "Mayor","mayor"->{
					max=intento;
					intento= (int) Math.floor(Math.random() * (max - min)) + min;
					
					}
				
				case "menor", "Menor"->{
					min=intento;
					intento= (int) Math.floor(Math.random() * (max - min)) + min;
					
				}
			}
			

			
		}while(Solucion!=intento);
		
		System.out.print("¡¡¡Es: "+intento+" lo he adivinado!!!!");
		
		
		

	}

}
