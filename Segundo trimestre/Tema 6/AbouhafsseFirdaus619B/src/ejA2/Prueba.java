/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Main de la clase Persona
*
*/

package ejA2;

import java.util.Scanner;

public class Prueba {

	public static void pedirDatos(Persona persona) {
		Scanner scanner = new Scanner(System.in);
		
		//Nombre
		System.out.print("Introduce el nombre: ");
		persona.nombre=scanner.nextLine();
		
		System.out.print("Introduce los apellidos: ");
		persona.apellidos=scanner.nextLine();
		
		System.out.print("Introduce el DNI: ");
		persona.dni=scanner.nextLine();
		
		System.out.print("Introduce la edad: ");
		persona.edad=scanner.nextByte();
	}
	
	
	public static void main(String[] args) {
		
		//Creamos los objetos
		Persona p1 = new Persona("Firdaus", "Abouhafsse","25740856S",20);
		Persona p2 = new Persona("Pepito", "Pepon", "00000000A", 57);
		
		//Damos valores
		System.out.println("\nPRIMERA PERSONA\n------------");
		pedirDatos(p1);
		System.out.println("\nSEGUNDA PERSONA\n------------");
		pedirDatos(p2);	
		
		System.out.print(p1.nombre+" "+p1.apellidos+" con DNI: "+p1.dni+", ");
		
		if(p1.edad>=18) {
			System.out.println("es mayor de edad.");
		}else {
			System.out.println("no es mayor de edad.");
		}
		
		
		System.out.print(p2.nombre+" "+p2.apellidos+" con DNI: "+p2.dni+", ");
		if(p2.edad>=18) {
			System.out.println("es mayor de edad.");
		}else {
			System.out.println("no es mayor de edad.");
		}
		
		
		
		
		

	}

}
