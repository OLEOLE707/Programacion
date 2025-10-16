/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:08/10/2025
 * Descripción: Añadir al ejercicio anterior una 3ª condicion segun los años de exp y numero de proyectos para dictaminar el sueldo 
 */


package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		
		//VARIABLES
		String nombre, apellidos;
		double salarioDeseado;
		int edad;
		
		
		//PEDIDA DE DATOS
		System.out.print("Introduzca su nombre: ");
		nombre=scanner.nextLine();
		
		System.out.print("Introduzca sus apellidos: ");
		apellidos=scanner.nextLine();
		
		System.out.print("Introduzca su edad: ");
		edad=scanner.nextInt();
		
		System.out.print("Introduzca su salario deseado: ");
		salarioDeseado=scanner.nextDouble();
		
		
		//Si no cumple las condiciones no solicita más datos
		if( edad>45 || salarioDeseado>30000 ) {
			
			System.out.println("\nLo sentimos pero no cumple nuestro perfil");
		
		}else {
			//Crea los datos que vamos a solicitar si cumple las condiciones
			int numProyectos, anosExp;
			
			System.out.print("Introduzca su número de años de experiencia: ");
			anosExp=scanner.nextInt();
			
			System.out.print("Introduzca el número de proyectos en los que ha trabajado anteriormente: ");
			numProyectos=scanner.nextInt();
			
			
			//Condicion final
			if(anosExp>2 && numProyectos>3) {
				
				//Ej 2 mostramos otra condicion para determinar el salario que va a recibir
				
				System.out.println("\nEnhorabuena. Ha sido contratado");
				
				if(anosExp>5 || numProyectos>5 ) {
					System.out.println("Su salario será de: 30.000€");
				}else {
					System.out.println("Su salario será de: 25.000€");
				}
				
			}else {
				
				System.out.println("\nLo sentimos pero no cumple nuestro perfil");					
				
			}
			
		}

	}

}
