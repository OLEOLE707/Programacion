/*
 * Descripción: Solicitar diferentes datos y condicionar la respuesta a la edaad y nota académica 
 * Autor: Firdaus Abouhafsse
 * Fecha:03/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nombre; 
		int edad;
		double nota;
		
		System.out.print("Introduce tu nombre: ");
		nombre=scanner.nextLine();
		
		System.out.print("Introduce tu edad: ");
		edad=scanner.nextInt();
		
		System.out.print("Introduce tu nota académica: ");
		nota=scanner.nextDouble();
		
		if((nota>7.0)&&(edad>18)) {
			System.out.println(nombre+", usted ha sido admitido en el curso, cumple las condiciones requeridas");
		}else {
			System.out.println(nombre+", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
		}

	}

}
