/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 02/12/2025
* Contenido: Cumplir con los diferentes apartados del ejercicio usando la libreria LocalTime
*
*/
package ejercicio3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static int validar(int parametro) {
		Scanner scanner = new Scanner(System.in);
		
		boolean error= false;
		int dato; 
		
		do {
			
			try {
				
				dato=scanner.nextInt();
				error=false;
			
			}catch(InputMismatchException ex2){
				
				System.out.print("Error de lectura: no es número entero válido. Vuelve a intentarlo: ");
				dato=-1;
				error=true;
				
				scanner.nextLine();
			}
			
		}while(error==true||dato<0||dato>parametro);
		
		return dato;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hora, minuto;
		boolean error=false;

		String clase;
		
		
		System.out.println("HORARIO DE CLASES");
		System.out.println("------------------");
		System.out.println("Introducción del horario que desea comprobar");
		
	//Apartado 1
		LocalTime inicioClases= LocalTime.of(8, 0);
		
	//Apartado 2
		
		//1. Pedimos la hora
		System.out.print("Introduce la hora (00-23): ");
		hora=validar(23);
		
		
		//2. Pedimos los minutos
		System.out.print("Introduce los minutos (00-59): ");
		minuto=validar(59);
	
				
	//Apartado 3
		LocalTime horaLeida = LocalTime.of(hora, minuto);
		
		
	//Apartado 4 y 5
		System.out.println("Hora introducida "+horaLeida.toString());
		
		System.out.print("Clase correspondiente: ");
		
		if(horaLeida.isBefore(inicioClases)==true) {
			System.out.printf("\nAún no ha comenzado la jornada: Faltan %s minutos para comenzar", horaLeida.until(inicioClases, ChronoUnit.MINUTES));
		
		}else if(horaLeida.isAfter(inicioClases.plusHours(6))==true || horaLeida.equals(inicioClases.plusHours(6))==true) {
			System.out.printf("La jornada ya ha finalizado: Han pasado %s minutos desde el fin", (inicioClases.plusHours(6)).until(horaLeida, ChronoUnit.MINUTES));
		
		}else {
			if(horaLeida.isBefore(inicioClases.plusHours(2))==true) {
				System.out.println("Programación");
			}else if(horaLeida.isBefore(inicioClases.plusHours(4))==true){
				System.out.println("Sistemas informáticos");
			}else if(horaLeida.isBefore(inicioClases.plusHours(6))){
				System.out.println("Entornos de desarrollo");
			}
		}
		

	}

}
