/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 02/12/2025
* Contenido: Programa en Java que solicite una fecha de cumpleaños mediante la petición de tres números enteros: día, mes, año.  
* A partir de estos datos, el programa debe mostrar el número de veces que esa fecha ha caído en el mismo día de la semana. Además, también 
* tiene que indicar los años en los que ha ocurrido.
*
*/

package ejercicio2;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
	
	
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
	
	
	
	
	
	
	public static int validarFecha(int año, int mes, int dia) { //Validamos que la fecha sea correcta (años bisiestos, nº dias en un mes, etc..)
		//Escaner
		Scanner scanner = new Scanner(System.in);		
		
		//variable
		boolean error= false; 
		
		do {
			
			try {
				LocalDate fecha= LocalDate.of(año, mes, dia);
				error=false;
			
			}catch(DateTimeException ex2){
				
				System.out.println("Error de lectura");
				System.out.print("Introduzca un día valido: ");
				error=true;
				dia=scanner.nextInt();
				scanner.nextLine();
			}
						
		}while(error==true);
		
		return dia;
	}
	
	
	
	
	
	public static void comprobarAnyos(LocalDate fecha, int dia, int mes, int año, String nombreDia) {//Muestra en que años ha caido el mismo dia de tu cumpleaños
		//Variables
		int contador=0;
		
		//Formato para mostrar la fecha
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//Si es año bisiesto calculamos de 4 en 4
		if(fecha.isLeapYear()) {
			
			for(int i=año+4; i<=2025; i+=4) {

				LocalDate fechaVariable= LocalDate.of(i, mes, dia);
				
				//Si los dias son iguales mostramos la fecha formateada
				if(fecha.getDayOfWeek()==fechaVariable.getDayOfWeek()) {
					System.out.print((contador+1)+". "+fechaVariable.format(formatoFecha)+"\n");
					contador++;
				}
			}
			
		
		//Si no cada año
		}else {
			
			for(int i=año+1; i<2025; i++ ) {
				
				LocalDate fechaVariable= LocalDate.of(i, mes, dia);

				//Si los dias son iguales mostramos la fecha formateada
				if(fecha.getDayOfWeek()==fechaVariable.getDayOfWeek()) {
					
					System.out.print((contador+1)+". "+fechaVariable.format(formatoFecha)+"\n");
					contador++;
				}
			}		
		}
		
		
		//Mostramos el numero de coincidencias si hay
		if(contador==0){
			System.out.println("Ninguna\n\nTu cumpleaños todavía no ha vuelto a caer en "+nombreDia);
		}else {
			System.out.println("\nNúmero de concidencias: "+contador);
		}
	}
	
	

	public static void main(String[] args) {
		
		//Variables
		int año, mes, dia;
		
	//1. Pedimos el año
		System.out.print("Introduce el año (1900-2025): ");
		año=validar(1900,2025);
		
	//2. Pedimos el mes
		System.out.print("Introduce el mes (1-12): ");
		mes=validar(1,12);
		
	//3. Pedimos el dia
		System.out.print("Introduce el dia (1-31): ");
		dia=validar(1,31);
		
		//Validamos la fecha
		validarFecha(año, mes, dia);
		
		LocalDate fecha = LocalDate.of(año,mes,dia);

	
	//4. Dia que corresponde
		String nombreDia= fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));	
		
		System.out.println("El dia que naciste fue "+nombreDia);
		
		System.out.println("\n¿Cuantas veces tu cumpleaños a caido en "+nombreDia+"?");
		System.out.println("-----------------------------------------------------");
				
		comprobarAnyos(fecha, dia, mes, año, nombreDia);
	
	}
	

}
