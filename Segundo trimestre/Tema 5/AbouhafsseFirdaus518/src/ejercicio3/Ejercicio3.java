/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/12/2025
* Contenido: Crear un contador de domingos
*
*/


package ejercicio3;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import libtarea3.Bombo;

public class Ejercicio3 {
	public static int validar(int min, int max) { //Validamos un valor segun los parametros en los que se encuentra
		//Escaner
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		boolean error= false;
		int dato; 
		
		do {
			try {	
				dato=scanner.nextInt();
				error=false;
			
			}catch(InputMismatchException ex2){
				System.out.println("Error de lectura: no es número entero válido.");
				dato=-1;
				error=true;
				scanner.nextLine();
			}
			if(dato<min||dato>max) {
				System.out.print("El valor tiene que encontrarse entre ("+min+"-"+max+") vuelve a intentarlo: ");
			}
			
		}while(error==true||dato<min||dato>max);
		
		return dato;
	}
	
	
	public static LocalDate validarFecha(int año, int mes, int dia) { //Validamos que la fecha sea correcta (años bisiestos, nº dias en un mes, etc..)
		//Escaner
		Scanner scanner = new Scanner(System.in);		
		
		//variable
		LocalDate fecha;
		
		try {
			fecha = LocalDate.of(año, mes, dia);
			
		}catch(DateTimeException ex2){		
			System.out.println("Error de lectura. Devuelta fecha: 01/01/"+año);
			fecha = LocalDate.of(año, 1, 1);
		}				
		return fecha;
	}
	

	public static void main(String[] args) {

		//Variables
		int año, domingosMes, domingosTotal=0;;
		LocalDate fecha;

		
		//Enunciado
		System.out.println("CONTADOR DE DOMINGOS");
		System.out.println("---------------------");
		
		//Pedimos el año y lo validamos
		System.out.print("Introduzca el año (1900-2100): ");
		año=validar(1900,2100);
		
		
		
		//Empezamos los cálculos
		System.out.printf("\nCANTIDAD DE DOMINGOS DEL AÑO %d\n",año);
		System.out.println("-----------------------------------");
		
		//Bucle i=meses, j=dias
		for(int mes=1; mes<=12; mes++) {
			
			//Para que cada mes vuelva a contar desde cero
			domingosMes=0;
			
			//Validamos la fecha
			fecha=validarFecha(año,mes,1);
			
			
			for(int dia=1; dia<=fecha.lengthOfMonth(); dia++) {
				
				fecha=validarFecha(año,mes,dia);	
			
				if(fecha.getDayOfWeek()==DayOfWeek.SUNDAY) {
					domingosMes++;
				}
								
			}
			
			
			//Calculamos los domingos totales de todo el año
			domingosTotal+=domingosMes;

			//Mostramos los domingos de cada mes en español
			System.out.printf("%s     \t:%d\n",fecha.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES")),domingosMes);
			
		}
		
		//Mostramos todos los domingos del año
		System.out.printf("Número total de domingos: %d.",domingosTotal);
		

	}

}
