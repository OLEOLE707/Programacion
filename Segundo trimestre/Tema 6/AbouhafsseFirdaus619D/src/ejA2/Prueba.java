/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Main de la clase Persona
*
*/

package ejA2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {

	public static void llenarDatos(Persona persona) {
		Scanner scanner = new Scanner(System.in);
		boolean error=false;
		
		//Nombre
		try {
		System.out.print("Introduce el nombre: ");
		persona.setNombre(scanner.nextLine());
		
		}catch(IllegalArgumentException ex1) {
			System.out.println("Error: "+ex1.getMessage()+"Nombre predeterminado a Pepe");
			persona.setNombre("Pepe");
		}
		
		//Apellidos
		try {
		System.out.print("Introduce los apellidos: ");
		persona.setApellidos(scanner.nextLine());
		
		}catch(IllegalArgumentException ex1) {
			System.out.println("Error: "+ex1.getMessage()+"Apellido predeterminado a Pepe");
			persona.setApellidos("Pepe");
		}

		
		//Dni
		do {
			try {
				System.out.print("Introduce el dni: ");
				persona.setDni(scanner.nextLine());
				error=false;
			
			}catch(IllegalStateException ex1) {
				error=true;
				System.out.println("Error: "+ex1.getMessage()+" Vuelva a intentarlo:");
			}
		}while(error==true);
		
		
		
		//Edad
		try {
			System.out.print("Introduce tu edad: ");
			persona.setEdad(scanner.nextInt());
			
		}catch(IllegalArgumentException ex1) {
			System.out.println("Error: "+ex1.getMessage()+" edad predeterminada a 18");
			persona.setEdad(18);
		
		}catch(InputMismatchException ex2) {
			System.out.println("Error: "+ex2.getMessage()+" edad predeterminada a 18");
			persona.setEdad(18);
		}

	}
	
	
	
	public static void main(String[] args) {

	    // Creamos los objetos
	    Persona p1 = new Persona("a", "e", "76137898D", 12);
	    Persona p2 = new Persona("a", "e", "25740856S", 12);

	    // Damos valores
	    System.out.println("\nPRIMERA PERSONA\n------------");
	    llenarDatos(p1);

	    System.out.println("\nSEGUNDA PERSONA\n------------");
	    llenarDatos(p2);

	    // Resultados usando métodos de la clase Persona
	    System.out.println("\nRESULTADOS\n------------");

	    p1.imprime();
	    if (p1.esMayorEdad()) {
	        System.out.println("Es mayor de edad.");
	    } else {
	        System.out.println("No es mayor de edad.");
	    }

	    System.out.println();

	    p2.imprime();
	    if (p2.esMayorEdad()) {
	        System.out.println("Es mayor de edad.");
	    } else {
	        System.out.println("No es mayor de edad.");
	    }
	    
	    
	    System.out.println("La diferencia de edad entre ambas personas es: "+ p1.diferenciaEdad(p2) + " años.");

	}

}
