/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana
 */


package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int dia;
		
		System.out.print("Introduce el dia: ");
		dia=scanner.nextInt();
		
		switch(dia) {
			case 1->{
				System.out.print("Lunes");
			}
			case 2->{
				System.out.print("Martes");
			}
			case 3->{
				System.out.print("Miércoles");
			}
			case 4->{
				System.out.print("Jueves");
			}
			case 5->{
				System.out.print("Viernes");
			}
			case 6->{
				System.out.print("Sábado");
			}
			case 7->{
				System.out.print("Domingo");
			}
			default->{
				System.out.print("Día no válido");
			}
		}
		
		
		

	}

}