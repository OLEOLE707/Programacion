/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Mostrar los números pares comprendidos entre el 1 y el 200 utilizando un contador sumando de 1 en 1. 
 */


package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num=1 ;
		
		while(num<=200) {
			
			if(num%2==0) {
				System.out.print(num+" ");
			}
			
			num++;
			
		}

	}

}
