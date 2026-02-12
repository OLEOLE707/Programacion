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
			System.out.print("Error: "+ex1.getMessage()+"Nombre predeterminado a Pepe");
			persona.setNombre("Pepe");
		}
		
		//Apellidos
		try {
		System.out.print("Introduce los apellidos: ");
		persona.setApellidos(scanner.nextLine());
		
		}catch(IllegalArgumentException ex1) {
			System.out.print("Error: "+ex1.getMessage()+"Apellido predeterminado a Pepe");
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
		
		//Creamos los objetos
		Persona p1 = new Persona("a", "e", "76137898D", 12);
		Persona p2 = new Persona("a", "e", "25740856S", 12);
		
		
		//Damos valores
		System.out.println("\nPRIMERA PERSONA\n------------");
		llenarDatos(p1);
		System.out.println("\nSEGUNDA PERSONA\n------------");
		llenarDatos(p2);	
		
		
		//Resultados
		System.out.print(p1.getNombre()+" "+p1.getApellidos()+" con DNI: "+p1.getDni()+", ");
		
		if(p1.getEdad()>=18) {
			System.out.println("es mayor de edad.");
		}else {
			System.out.println("no es mayor de edad.");
		}
		
		
		System.out.print(p2.getNombre()+" "+p2.getApellidos()+" con DNI: "+p2.getDni()+", ");
		if(p2.getEdad()>=18) {
			System.out.println("es mayor de edad.");
		}else {
			System.out.println("no es mayor de edad.");
		}
		
		
		
		
		

	}

}
