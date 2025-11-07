/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int horas,salario;
		
		System.out.print("Introduce las horas semanales: ");
		horas=scanner.nextInt();
		
		if(horas>40) {
			salario= (40*12)+((horas-40)*16);
		}else {
			salario= horas*12;
		}
		
		System.out.println("Tu salario es de: "+salario);
	}

}
