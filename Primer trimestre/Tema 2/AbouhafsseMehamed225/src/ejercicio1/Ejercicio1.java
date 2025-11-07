/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
 */


package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		String dia;
		
		System.out.print("Introduce el dia: ");
		dia=scanner.nextLine();
		
		switch(dia) {
			case "Lunes","lunes"->{
				System.out.print("Ha primera hora hay: Sistemas infomáticos");
			}
			case "Martes","martes"->{
				System.out.print("Ha primera hora hay: Digitalización");
			}
			case "Miercoles","miercoles","Miércoles","miércoles"->{
				System.out.print("Ha primera hora hay: Base de datos");
			}
			case "Jueves","jueves"->{
				System.out.print("Ha primera hora hay: Sistemas informáticos");
			}
			case "Viernes","viernes"->{
				System.out.print("Ha primera hora hay: IPE");
			}
			default->{
				System.out.print("Día no válido");
			}
		}
		
		
		

	}

}
