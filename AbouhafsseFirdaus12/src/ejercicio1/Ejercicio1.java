package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int edad;
		double altura, peso;
		String direccion, nombre, apellidos;
		
		System.out.print("Introduce tu nombre: ");
		nombre = scanner.nextLine();
		
		System.out.print("Introduce tus apellidos: ");
		apellidos = scanner.nextLine();
		
		System.out.print("Introduce tu direccion: ");
		direccion = scanner.nextLine();
		
		System.out.print("Introduce tu edad: ");
		edad = scanner.nextInt();
		
		System.out.print("Introduce tu altura: ");
		altura = scanner.nextDouble();
		
		System.out.print("Introduce tu peso: ");
		peso = scanner.nextDouble();
		
		
		System.out.println("\nNombre: "+nombre+"\nApellidos: "+apellidos+"\nEdad: "+edad+"\nDireccion: "+direccion+"\nAltura: "+altura+"\nPeso: "+peso);
		
		
	}

}