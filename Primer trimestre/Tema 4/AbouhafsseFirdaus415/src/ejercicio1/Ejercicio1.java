/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 21/11/2025
* Contenido: Crea un método que devolverá el booleano true en el caso de que dos nombres introducidos como parámetros sean iguales y false en caso contrario.
*
*/

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	//Compara dos nombres t devuelve true si son iguales
	public static boolean comparaNombres(String nombre1, String nombre2){
		return nombre1.equals(nombre2);
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		String nombre1, nombre2;
		
		System.out.print("Introduce el primer nombre: ");
		nombre1=scanner.nextLine();
		
		System.out.print("Introduce el segundo nombre: ");
		nombre2=scanner.nextLine();
		
		
		if(comparaNombres(nombre1, nombre2)==true) {
			System.out.println("Las dos cadenas son iguales");
			
		}else {
			System.out.println("Las dos cadenas no son iguales");
		}

	}

}
