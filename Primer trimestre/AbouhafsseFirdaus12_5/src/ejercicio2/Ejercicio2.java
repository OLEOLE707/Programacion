/*
 * Descripción: Crear una ficha con tu información pedida
 * Autor: Firdaus Abouhafsse
 * Fecha:30/09/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		
		//VARIABLES
		String nombre,direccion;
		int telefono;
		
		
		//PEDIDA DE DATOS
		System.out.print("Introduce tu nombre: ");
		nombre=scanner.nextLine();
		
		System.out.print("Introduce tu direción: ");
		direccion=scanner.nextLine();
		
		System.out.print("Introduce tu teléfono: ");
		telefono=scanner.nextInt();
		
		
		System.out.println("\nDATOS DEL USUARIO");
		System.out.println("-------------------");
		
		System.out.println("Nombre: "+nombre+"\nDirección: "+direccion+"\nNúmero de telefono: "+telefono);

	}

}
