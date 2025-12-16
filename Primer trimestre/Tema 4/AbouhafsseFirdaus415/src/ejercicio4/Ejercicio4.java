/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 21/11/2025
* Contenido: Crea un método llamado accesoBecaUsa. Este método recibe como parámetros: edad, nota académica, renta, nivel de Idioma (Boolean) y hará las debidas comprobaciones
*
*/


package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static String accesoBecaUsa(int edad, double nota, double renta, boolean idioma) { //Comprueba los parametros recibidos y devuelve la aptitud
		String aptitud="";
		
		if(idioma==false || edad>30 || nota<5 || (nota>5&&nota<9)&& renta>20000) {
			aptitud="No apto";
			
		}else{
			aptitud="Apto";
		}
		
		return aptitud;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int edad;
		double nota, renta;
		String idiomaStr;
		boolean idioma;
		
		System.out.print("Introduce tu edad: ");
		edad=scanner.nextInt();
		
		System.out.print("Introduce tu nota: ");
		nota=scanner.nextDouble();
		
		System.out.print("Introduce tu renta: ");
		renta=scanner.nextDouble();
		
		scanner.nextLine();
		System.out.print("Introduce si o no, si tu nivel de idioma es superior a B2: ");
		idiomaStr=scanner.nextLine();
		
		switch(idiomaStr) {
			case "si", "Si":{
				idioma=true;
				break;
			}
			case "no", "No":{
				idioma=false;
				break;
			}
			default: {
				System.out.println("Error en la respuesta de edad");
				idioma=false;
			}
		}
		
		System.out.println(accesoBecaUsa(edad, nota, renta, idioma));
	}

}
