/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:08/10/2025
 * Descripción: Crear un programa que solicite unos datos y crear condiciones según ellos, 1ªcondición segun edad y salario deseado y 2ªcondición segun experiencia y numeros de proyectos 
 */



package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

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
				
				System.out.println("\nEnhorabuena. Ha sido contratado");
				
			}else {
				
				System.out.println("\nLo sentimos pero no cumple nuestro perfil");					
				
			}
			
		}

	}

}
